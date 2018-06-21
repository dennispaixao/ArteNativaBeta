package DAO;

import Model.Cliente;
import Model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.ConectaBanco;


public class EnderecoDaoImpl implements EnderecoDao {

    @Override
    public void cadastrarEndereco(Endereco endereco, Integer id) {
        try {
            Connection con = ConectaBanco.getConexao(); 
            StringBuilder sql = new StringBuilder();
            sql.append(" INSERT INTO Endereco ");
            sql.append(" (id_endereco, pais, estado, cidade, bairro, rua, ");
            sql.append(" numero, cep, complemento, id_user) ");
            sql.append(" VALUES(nextval('endereco_seq'), ?,?,?,?,?,?,?,?, ?) ");

            PreparedStatement ps = con.prepareStatement(sql.toString());
            ps.setString(1, "Brasil");
            ps.setString(2, endereco.getEstado());
            ps.setString(3, endereco.getCidade());
            ps.setString(4, endereco.getBairro());
            ps.setString(5, endereco.getRua());
            ps.setInt(6, endereco.getNumero());
            ps.setString(7, endereco.getCep());
            ps.setString(8, endereco.getComplemento());
            ps.setInt(9, id);

            ps.execute();
            con.close();

        } catch (SQLException e) {
                e.printStackTrace();
        }

    }

    @Override
    public Endereco listarEnderecoPorPessoa(Cliente cliente) {

//		try {
//			Connection con = new ConexaoBancoDeDados().getConnection();
//			
//			Endereco endereco = new Endereco();
//
//			String sqlSelect = "SELECT * FROM Endereco where id_pessoa = ?";
//			PreparedStatement ps = con.prepareStatement(sqlSelect);
//			ps.setInt(1, pessoa.getId());
//
//			ResultSet rs = ps.executeQuery();
//
//			while (rs.next()) {
//				endereco.setIdEndereco(rs.getInt("id_endereco"));
//				endereco.setPais(rs.getString("pais"));
//				endereco.setEstado(rs.getString("estado"));
//				endereco.setCidade(rs.getString("cidade"));
//				endereco.setBairro(rs.getString("bairro"));
//				endereco.setLogadouro(rs.getString("logradouro"));
//				endereco.setCep(rs.getString("cep"));
//				endereco.setComplemento(rs.getString("complemento"));
//				endereco.setIdPessoa(pessoa.getId());
//
//			}
//			return endereco;
//
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
        return null;
    }

    @Override
    public void alterarEndereco(Endereco endereco) {

//            try {
//                    Connection con = new ConexaoBancoDeDados().getConnection();
//
//                    String sqlUpdate = "UPDATE Endereco SET pais =?, estado=?, cidade=?, bairro=?, logradouro=?, cep=?, complemento=? WHERE id_pessoa = ?";
//
//                    PreparedStatement ps = con.prepareStatement(sqlUpdate);
//                    ps.setString(1, endereco.getPais());
//                    ps.setString(2, endereco.getEstado());
//                    ps.setString(3, endereco.getCidade());
//                    ps.setString(4, endereco.getBairro());
//                    ps.setString(5, endereco.getLogadouro());
//                    ps.setString(6, endereco.getCep());
//                    ps.setString(7, endereco.getComplemento());
//                    ps.setInt(8, endereco.getIdPessoa());
//                    ps.executeUpdate();
//
//                    ps.close();
//                    con.close();
//
//            } catch (SQLException e) {
//                    e.printStackTrace();
//            }

    }

    @Override
    public void deleterEndereco(Endereco endereco) {
//            try {
//                    Connection con = new ConexaoBancoDeDados().getConnection();
//
//                    String sqlUpdate = "DELETE FROM Endereco id_endereco = ?";
//                    PreparedStatement ps = con.prepareStatement(sqlUpdate);
//                    ps.setInt(1, endereco.getIdEndereco());
//                    ps.executeUpdate();
//
//                    ps.close();
//                    con.close();
//
//            } catch (SQLException e) {
//                    e.printStackTrace();
//            }

    }

    @Override
    public Endereco listarUmEndereco(Cliente cliente) {

//            try {
//                    Connection con = new ConexaoBancoDeDados().getConnection();
//
//                    Endereco endereco = new Endereco();
//
//                    String sqlSelect = "SELECT * FROM Endereco where id_pessoa = ?";
//                    PreparedStatement ps = con.prepareStatement(sqlSelect);
//                    ps.setInt(1, pessoa.getId());
//
//                    ResultSet rs = ps.executeQuery();
//
//                    while (rs.next()) {
//
//                            endereco.setIdEndereco(rs.getInt("id_endereco"));
//                            endereco.setPais(rs.getString("pais"));
//                            endereco.setEstado(rs.getString("estado"));
//                            endereco.setCidade(rs.getString("cidade"));
//                            endereco.setBairro(rs.getString("bairro"));
//                            endereco.setLogadouro(rs.getString("logarouro"));
//                            endereco.setCep(rs.getString("cep"));
//                            endereco.setComplemento(rs.getString("complemento"));
//                            endereco.setIdPessoa(pessoa.getId());
//
//                    }
//                    return endereco;
//
//            } catch (SQLException e) {
//                    throw new RuntimeException(e);
//            }
        return null;
    }


}
