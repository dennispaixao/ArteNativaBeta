package DAO;

import Model.Documento;
import Model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.ConectaBanco;


public class DocumentoDaoImpl implements DocumentoDao {

    @Override
    public void cadastrarDocumento(Documento documento, Integer id) {
        try {
           Connection con = ConectaBanco.getConexao(); 
           StringBuilder sql = new StringBuilder();
           sql.append(" INSERT INTO Documento ");
           sql.append("(id_documento, numero, descricao, id_user) ");
           sql.append(" VALUES(nextval('documento_seq'), ?,?,?)");
           
           PreparedStatement ps = con.prepareStatement(sql.toString());
           ps.setString(1, documento.getNumero());
           ps.setString(2, documento.getDescricao());
           ps.setInt(3, id);

           ps.execute();
           con.close();

        } catch (SQLException e) {
                e.printStackTrace();
        }

    }

	@Override
	public List<Documento> listarDocumentoPorPessoa(Integer id) {

            try {
                Connection con = ConectaBanco.getConexao(); 
                List<Documento> documentos = new ArrayList<>();

                String sqlSelect = "SELECT * FROM Documento where id_user = ?";
                PreparedStatement ps = con.prepareStatement(sqlSelect);
                ps.setInt(1, id);

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Documento documento = new Documento();
                    documento.setIdDocumento(rs.getInt("id_documento"));
                    documento.setNumero(rs.getString("numero"));
                    documento.setDescricao(rs.getString("descricao"));
                    documento.setIdUser(id);

                    documentos.add(documento);
                }
                return documentos;

            } catch (SQLException e) {
                    throw new RuntimeException(e);
            }
            
	}

	@Override
	public void alterarDocumento(Documento documento, Integer id) {   
            try {
                Connection con = ConectaBanco.getConexao(); 

                String sqlUpdate = "UPDATE Documento SET numero =? WHERE id_user = ? and descricao like ?";
                PreparedStatement ps = con.prepareStatement(sqlUpdate);
                ps.setString(1, documento.getNumero());
                ps.setInt(2, id);
                ps.setString(3, documento.getDescricao());
                ps.executeUpdate();

                ps.close();
                con.close();

            } catch (SQLException e) {
                    e.printStackTrace();
            }

	}

	@Override
	public void deleterDocumento(Documento documento) {
//		try {
//			Connection con = new ConexaoBancoDeDados().getConnection();
//
//			String sqlUpdate = "DELETE FROM Documento id_documento = ?";
//			PreparedStatement ps = con.prepareStatement(sqlUpdate);
//			ps.setInt(1, documento.getIdDocumento());
//			ps.executeUpdate();
//
//			ps.close();
//			con.close();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

	}

	@Override
	public Documento pegarUmDocumento(String login) {
		// TODO Auto-generated method stub
		return null;
	}

}
