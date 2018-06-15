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
@WebServlet(name = "FinalizarPedido", urlPatterns = {"/FinalizarPedido"})
public class FinalizarPedido extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              String forma = request.getParameter("pg");
                if("Dinheiro".equals(forma)){
                    RequestDispatcher rd = request.getRequestDispatcher("cadVen4_PD.jsp");
                    rd.forward(request, response);
                }else if("Cartão".equals(forma)){
                     RequestDispatcher rd = request.getRequestDispatcher("cadVen4_PC.jsp");
                     rd.forward(request, response);  
                }

    }


}
