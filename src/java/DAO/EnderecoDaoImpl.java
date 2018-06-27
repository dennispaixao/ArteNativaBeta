package DAO;

import Model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public void alterarEndereco(Endereco endereco, Integer id) {

        try {
            Connection con = ConectaBanco.getConexao();
            StringBuilder sql = new StringBuilder();
            sql.append(" UPDATE Endereco SET pais =?, estado=?, ");
            sql.append(" cidade=?, bairro=?, rua=?, numero=?, ");
            sql.append(" cep=?, complemento=? WHERE id_user = ?");
            
            String sqlUpdate = "UPDATE Endereco SET pais =?, estado=?, cidade=?, bairro=?,"
                    + " logradouro=?, cep=?, complemento=? WHERE id_pessoa = ?";

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
            ps.executeUpdate();

            ps.close();
            con.close();

        } catch (SQLException e) {
                e.printStackTrace();
        }

    }

    @Override
    public Endereco listarUmEndereco(Integer id) {

        try {
                Connection con = ConectaBanco.getConexao();

                Endereco endereco = new Endereco();

                String sqlSelect = "SELECT * FROM Endereco where id_user = ?";
                PreparedStatement ps = con.prepareStatement(sqlSelect);
                ps.setInt(1, id);

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {

                        endereco.setIdEndereco(rs.getInt("id_endereco"));
                        endereco.setPais(rs.getString("pais"));
                        endereco.setEstado(rs.getString("estado"));
                        endereco.setCidade(rs.getString("cidade"));
                        endereco.setBairro(rs.getString("bairro"));
                        endereco.setRua(rs.getString("rua"));
                        endereco.setNumero(Integer.parseInt(rs.getString("numero")));
                        endereco.setCep(rs.getString("cep"));
                        endereco.setComplemento(rs.getString("complemento"));
                        endereco.setIdUser(id);

                }
                return endereco;

        } catch (SQLException e) {
                throw new RuntimeException(e);
        }
       
    }


}
