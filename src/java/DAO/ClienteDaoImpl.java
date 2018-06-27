package DAO;

import Model.Cliente;
import Model.Perfil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import util.ConectaBanco;



public class ClienteDaoImpl implements ClienteDao {
    
    @Override
    public Integer cadastrarCliente(Cliente cliente, Perfil perfil) {
        Connection con = ConectaBanco.getConexao(); 
   	Integer obj = null;
        String generatedColumns[] = { "id_user" };
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO CLIENTE ");
            sql.append(" (id_user, login, senha, data_cadastro, id_perfil, ");
            sql.append(" nome, email, telfixo, celular, situacao, data_nasc) ");
            sql.append(" VALUES (nextval('user_seq'), ?, ?, ?, ?, ?, ?, ?, ?, ");
            sql.append(" 1, ?) ");
            
            PreparedStatement ps = con.prepareStatement(sql.toString(), generatedColumns);            
            ps.setString(1, cliente.getLogin());
            ps.setString(2, cliente.getSenha());
            ps.setDate(3, new Date(System.currentTimeMillis()));
            ps.setInt(4, perfil.getIdPerfil());
            ps.setString(5, cliente.getNome());
            ps.setString(6, cliente.getEmail());
            ps.setString(7, cliente.getTlfixo());
            ps.setString(8, cliente.getCelular());
            ps.setDate(9, java.sql.Date.valueOf(cliente.getDataNasc()));
            ps.execute();
           
            
            try (ResultSet rs = ps.getGeneratedKeys()) {

                if (rs.next()) {
                        obj = rs.getInt(1);
                }

            }
             ps.close();
            con.close();
        } catch (SQLException e) {
              
            e.printStackTrace();
        }

        return obj;
    }


    @Override
    public List<Cliente> listarTodosClientes() {
          List<Cliente> clientes = new ArrayList<>();
        try {
             Connection con = ConectaBanco.getConexao();
             StringBuilder sql = new StringBuilder();
             sql.append("SELECT * FROM CLIENTE c, Perfil per ");
             sql.append(" WHERE c.id_perfil = per.id_perfil and situacao<>3 ");
            
            PreparedStatement ps = con.prepareStatement(sql.toString());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setDataCadastro(LocalDate.parse(rs.getString("data_cadastro")));
                cliente.setDataNasc(LocalDate.parse(rs.getString("data_nasc")));

                cliente.setIdCliente(rs.getInt("id_user"));
                cliente.setLogin(rs.getString("login"));
                cliente.setSenha(rs.getString("senha"));

                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTlfixo(rs.getString("telfixo"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setStatus(rs.getString("situacao"));

                cliente.setIdPerfil(rs.getInt("id_perfil"));
                
                clientes.add(cliente);
            }

            ps.close();
            con.close();
            return clientes;
        } catch (SQLException e) {
                throw new RuntimeException(e);
        }
    
    }

    @Override
    public Cliente listarUmCliente(Integer idUser) {
        Cliente cliente = new Cliente();
        try {
             Connection con = ConectaBanco.getConexao();
             StringBuilder sql = new StringBuilder();
             sql.append("SELECT * FROM CLIENTE c, ");
             sql.append(" Perfil per WHERE c.id_user = ?  ");
             sql.append(" and c.id_perfil = per.id_perfil ");
            
            PreparedStatement ps = con.prepareStatement(sql.toString());
            ps.setInt(1, idUser);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                try{  
                    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

                    cliente.setDataCadastro(LocalDate.parse(rs.getString("data_cadastro")));
                    cliente.setDataNasc(LocalDate.parse(rs.getString("data_nasc")));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                cliente.setIdCliente(rs.getInt("id_user"));
                cliente.setLogin(rs.getString("login"));
                cliente.setSenha(rs.getString("senha"));
                cliente.setEmail(rs.getString("email"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTlfixo(rs.getString("telfixo"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setStatus(rs.getString("situacao"));

                cliente.setIdPerfil(rs.getInt("id_perfil"));

            }

            ps.close();
            con.close();
            return cliente;
        } catch (SQLException e) {
                throw new RuntimeException(e);
        }
    }

    public void alterarCliente(Cliente cliente) {
       	try {
            Connection con = ConectaBanco.getConexao();
            StringBuilder sql = new StringBuilder();
            sql.append(" UPDATE CLIENTE SET login = ?, nome = ?, email = ?, ");
            sql.append(" telfixo = ?, celular = ?, data_nasc = ? where id_user = ?");
            
            
            PreparedStatement ps = con.prepareStatement(sql.toString());
            ps.setString(1, cliente.getEmail());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getTlfixo());
            ps.setString(5, cliente.getCelular());
            ps.setDate(6, java.sql.Date.valueOf(cliente.getDataNasc()));
            ps.setInt(7, cliente.getIdCliente());
            ps.executeUpdate();

            ps.close();
            con.close();

        } catch (SQLException e) {
                e.printStackTrace();
        } 
    }


    public void deleterCliente(Integer idPessoa) {
        
        try {
            Connection con = ConectaBanco.getConexao();
            String sqlInsert = "UPDATE CLIENTE set situacao = 3 where id_user = ?  ";
            PreparedStatement ps = con.prepareStatement(sqlInsert);
            ps.setInt(1, idPessoa);
            ps.executeUpdate();

        } catch (SQLException e) {
                e.printStackTrace();
        }
    }


    public Cliente efetuarLogin(String login, String senha) {
        try {
            Connection con = ConectaBanco.getConexao();
            Cliente cliente = new Cliente();

            String sqlSelect = "SELECT * FROM CLIENTE c, Perfil per WHERE c.login = ? "
                                            + " and c.senha = ? and c.id_perfil = per.id_perfil ";
            PreparedStatement ps = con.prepareStatement(sqlSelect);
            ps.setString(1, login);
            ps.setString(2, senha);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                    Perfil perfil = new Perfil();
                    cliente.setIdCliente(rs.getInt("id_user"));
                    cliente.setLogin(rs.getString("login"));
                    cliente.setSenha(rs.getString("senha"));
                    cliente.setDataCadastro(LocalDate.parse("data_cadastro"));
                    cliente.setStatus(rs.getString("status"));
                    perfil.setIdPerfil(rs.getInt("id_perfil"));
                    perfil.setDescricao(rs.getString("descricao"));
                    cliente.setIdPerfil(rs.getInt("id_perfil"));
            }

            ps.close();
            con.close();
            return cliente;
        } catch (SQLException e) {
                throw new RuntimeException(e);
        }
    }
  	
}
