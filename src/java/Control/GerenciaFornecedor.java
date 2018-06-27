/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.FornecedorDao;
import DAO.FornecedorDaoImpl;
import DAO.DocumentoDao;
import DAO.DocumentoDaoImpl;
import DAO.EnderecoDao;
import DAO.EnderecoDaoImpl;
import Model.Fornecedor;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.FornecedorParse;

/**
 *
 * @author Dennis
 */
@WebServlet(name = "GerenciaFornecedor", urlPatterns = {"/GerenciaFornecedor"})
public class GerenciaFornecedor extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
              if(request.getParameter("ac").equals("AlterarFornecedor")){        
              RequestDispatcher rd = request.getRequestDispatcher("gerForn_Alt.jsp");
              rd.forward(request, response);  

              }else if(request.getParameter("ac").equals("VerFornecedor")){        
              RequestDispatcher rd = request.getRequestDispatcher("gerForn_Viz.jsp");
              rd.forward(request, response);  
              
              }              
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        Fornecedor fornecedor = FornecedorParse.realizaParse(request);
        FornecedorDao dao = new FornecedorDaoImpl();
        EnderecoDao daoEnd = new EnderecoDaoImpl();
        DocumentoDao documentoDao = new DocumentoDaoImpl();
        
        if(request.getParameter("acao").equals("Cadastrar")){   
             
            Integer id = dao.cadastrarFornecedor(fornecedor);
            
            daoEnd.cadastrarEndereco(fornecedor.getEndereco(), id);
            

            fornecedor.getDocumentos().forEach(doc -> 
                    documentoDao.cadastrarDocumento(doc, id) );

            List<Fornecedor> fornecedores = dao.listarTodosFornecedores();
            request.setAttribute("listaFornecedor", fornecedores);
            RequestDispatcher rd = request.getRequestDispatcher("gerForn.jsp");
            rd.forward(request, response);
         
        }else  if(request.getParameter("acao").equals("Alterar")){   
            Integer id = Integer.parseInt(request.getParameter("id"));
            fornecedor.setIdFornecedor(id);
            dao.alterarFornecedor(fornecedor);
            daoEnd.alterarEndereco(fornecedor.getEndereco(), id);
            
            fornecedor.getDocumentos().forEach(doc -> 
                    documentoDao.alterarDocumento(doc, id) );
             List<Fornecedor> fornecedores = dao.listarTodosFornecedores();
            request.setAttribute("listaFornecedor", fornecedores);
            RequestDispatcher rd = request.getRequestDispatcher("gerForn.jsp");
            rd.forward(request, response);
        }
    }


}
