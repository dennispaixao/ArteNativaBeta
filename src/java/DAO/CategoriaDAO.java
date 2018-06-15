/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Dennis
 */

import util.ConectaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Model.Categoria;

public class CategoriaDAO {

    private static final String SELECT_ALL = "SELECT * FROM categoria WHERE situacao<>3;";
  
    private Object pstm;

 
    public ArrayList<Categoria> listar() throws SQLException, ClassNotFoundException {
        //cria uma array de obJ Cliente
        ArrayList<Categoria> listaCategoria = new ArrayList<Categoria>();

        //Conexao
        Connection conexao = ConectaBanco.getConexao();
        //cria comando SQL
        PreparedStatement pstmt = conexao.prepareStatement(SELECT_ALL);
        //executa
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            //a cada loop
            Categoria novaCategoria = new Categoria();
            novaCategoria.setId(rs.getInt("id"));
            novaCategoria.setDescricao(rs.getString("descricao"));
           

            //add na lista
            listaCategoria.add(novaCategoria);
        }
        return listaCategoria;
    }

   
}
