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
@WebServlet(name = "GerenciaPedido", urlPatterns = {"/GerenciaPedido"})
public class GerenciaPedido extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
              if(request.getParameter("ac").equals("AlterarPedido")){        
              RequestDispatcher rd = request.getRequestDispatcher("gerVen_Alt.jsp");
              rd.forward(request, response);  

              }else if(request.getParameter("ac").equals("VerPedido")){        
              RequestDispatcher rd = request.getRequestDispatcher("gerVen_Viz.jsp");
              rd.forward(request, response);  
              
              }  
              
              }              
    
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

              if(request.getParameter("ac").equals("Pagar")){        
              RequestDispatcher rd = request.getRequestDispatcher("cadVen4_PD_Pagar.jsp");
              rd.forward(request, response);  
            }else if(request.getParameter("ac").equals("Dar Sinal")){        
              RequestDispatcher rd = request.getRequestDispatcher("cadVen4_PD_Sinal.jsp");
              rd.forward(request, response);  
            }
        
    }


}
