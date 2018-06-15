/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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


}
