package DAO;


import Model.Fornecedor;
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



public class FornecedorDaoImpl implements FornecedorDao {
    
    @Override
    public Integer cadastrarFornecedor(Fornecedor fornecedor) {
        Connection con = ConectaBanco.getConexao(); 
   	Integer obj = null;
        String generatedColumns[] = { "id_user" };
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO Fornecedor ");
            sql.append(" (id_user, data_cadastro, ");
            sql.append(" nome, email, telfixo, celular, situacao, data_nasc) ");
            sql.append(" VALUES (nextval('user_seq'), ?, ?, ?, ?, ?, 1, ? ) ");
            
            PreparedStatement ps = con.prepareStatement(sql.toString(), generatedColumns);            
            ps.setDate(1, new Date(System.currentTimeMillis()));            
            ps.setString(2, fornecedor.getNome());
            ps.setString(3, fornecedor.getEmail());
            ps.setString(4, fornecedor.getTlfixo());
            ps.setString(5, fornecedor.getCelular());
            ps.setDate(6, java.sql.Date.valueOf(fornecedor.getDataNasc()));
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
    public List<Fornecedor> listarTodosFornecedores() {
          List<Fornecedor> fornecedors = new ArrayList<>();
        try {
             Connection con = ConectaBanco.getConexao();
             StringBuilder sql = new StringBuilder();
             sql.append("SELECT * FROM Fornecedor ");
             sql.append(" WHERE  situacao<>3 ");
            
            PreparedStatement ps = con.prepareStatement(sql.toString());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setDataCadastro(LocalDate.parse(rs.getString("data_cadastro")));
                fornecedor.setDataNasc(LocalDate.parse(rs.getString("data_nasc")));

                fornecedor.setIdFornecedor(rs.getInt("id_user"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTlfixo(rs.getString("telfixo"));
                fornecedor.setCelular(rs.getString("celular"));
                fornecedor.setStatus(rs.getString("situacao"));                
                fornecedors.add(fornecedor);
            }

            ps.close();
            con.close();
            return fornecedors;
        } catch (SQLException e) {
                throw new RuntimeException(e);
        }
    
    }

    @Override
    public Fornecedor listarUmFornecedor(Integer idUser) {
        Fornecedor fornecedor = new Fornecedor();
        try {
             Connection con = ConectaBanco.getConexao();
             StringBuilder sql = new StringBuilder();
             sql.append("SELECT * FROM Fornecedor ");
             sql.append(" WHERE c.id_user = ?  ");
                         
            PreparedStatement ps = con.prepareStatement(sql.toString());
            ps.setInt(1, idUser);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                try{  
                 
                    fornecedor.setDataCadastro(LocalDate.parse(rs.getString("data_cadastro")));
                    fornecedor.setDataNasc(LocalDate.parse(rs.getString("data_nasc")));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                fornecedor.setIdFornecedor(rs.getInt("id_user"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setTlfixo(rs.getString("telfixo"));
                fornecedor.setCelular(rs.getString("celular"));
                fornecedor.setStatus(rs.getString("situacao"));
                
            }

            ps.close();
            con.close();
            return fornecedor;
        } catch (SQLException e) {
                throw new RuntimeException(e);
        }
    }

    public void alterarFornecedor(Fornecedor fornecedor) {
       	try {
            Connection con = ConectaBanco.getConexao();
            StringBuilder sql = new StringBuilder();
            sql.append(" UPDATE Fornecedor SET nome = ?, email = ?, ");
            sql.append(" telfixo = ?, celular = ?, data_nasc = ? where id_user = ?");
            
            
            PreparedStatement ps = con.prepareStatement(sql.toString());
            ps.setString(1, fornecedor.getNome());
            ps.setString(2, fornecedor.getEmail());
            ps.setString(3, fornecedor.getTlfixo());
            ps.setString(4, fornecedor.getCelular());
            ps.setDate(5, java.sql.Date.valueOf(fornecedor.getDataNasc()));
            ps.setInt(6, fornecedor.getIdFornecedor());
            ps.executeUpdate();

            ps.close();
            con.close();

        } catch (SQLException e) {
                e.printStackTrace();
        } 
    }


    public void deleterFornecedor(Integer idPessoa) {
        
        try {
            Connection con = ConectaBanco.getConexao();
            String sqlInsert = "UPDATE Fornecedor set situacao = 3 where id_user = ?  ";
            PreparedStatement ps = con.prepareStatement(sqlInsert);
            ps.setInt(1, idPessoa);
            ps.executeUpdate();

        } catch (SQLException e) {
                e.printStackTrace();
        }
    }

}
