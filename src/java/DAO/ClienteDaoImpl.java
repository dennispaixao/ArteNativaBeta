package DAO;

import Model.Cliente;
import Model.Perfil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import util.ConectaBanco;



public class ClienteDaoImpl implements ClienteDao {
    
    @Override
    public Integer cadastrarCliente(Cliente cliente, Perfil perfil) {
        Connection con = ConectaBanco.getConexao(); 
   	Integer obj = null;
        String generatedColumns[] = { "id_cliente" };
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO CLIENTE ");
            sql.append(" (id_cliente, login, senha, data_cadastro, id_perfil, ");
            sql.append(" nome, email, telfixo, celular, status, data_nasc) ");
            sql.append(" VALUES (nextval('user_seq'), ?, ?, ?, ?, ?, ?, ?, ?, ");
            sql.append(" 'Ativo', ?) ");
            
            PreparedStatement ps = con.prepareStatement(sql.toString(), generatedColumns);            
            ps.setString(1, cliente.getLogin());
            ps.setString(2, cliente.getSenha());
            ps.setDate(3, new Date(System.currentTimeMillis()));
            ps.setInt(4, perfil.getIdPerfil());
            ps.setString(5, cliente.getNome());
            ps.setString(6, cliente.getEmail());
            ps.setString(7, cliente.getTlfixo());
            ps.setString(8, cliente.getCelular());
            ps.setDate(9, new Date(cliente.getDataNasc().getTime()));
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
             sql.append(" WHERE c.id_perfil = per.id_perfil  ");
            
            PreparedStatement ps = con.prepareStatement(sql.toString());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                try{  
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

                    cliente.setDataCadastro(format.parse(rs.getString("data_cadastro")));
                    cliente.setDataNasc(format.parse(rs.getString("data_nasc")));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setLogin(rs.getString("login"));
                cliente.setSenha(rs.getString("senha"));

                cliente.setNome(rs.getString("nome"));
                cliente.setTlfixo(rs.getString("telfixo"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setStatus(rs.getString("status"));

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
             sql.append("SELECT * FROM CLIENTE c ");
             sql.append(" Perfil per WHERE c.id_cliente = ?  ");
             sql.append(" and c.id_perfil = per.id_perfil ");
            
            PreparedStatement ps = con.prepareStatement(sql.toString());
            ps.setInt(1, idUser);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                try{  
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

                    cliente.setDataCadastro(format.parse(rs.getString("data_cadastro")));
                    cliente.setDataNasc(format.parse(rs.getString("data_nasc")));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setLogin(rs.getString("login"));
                cliente.setSenha(rs.getString("senha"));

                cliente.setNome(rs.getString("nome"));
                cliente.setTlfixo(rs.getString("telfixo"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setStatus(rs.getString("status"));

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void deleterCliente(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public Cliente efetuarLogin(String login, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private StringBuilder StringBuilder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  	
}
