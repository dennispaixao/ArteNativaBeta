
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
 * @author Dennis
 */
@WebServlet(name = "GerenciaCliente", urlPatterns = {"/GerenciaCliente"})
public class GerenciaCliente extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
              if(request.getParameter("ac").equals("AlterarCliente")){        
              RequestDispatcher rd = request.getRequestDispatcher("gerCli_Alt.jsp");
              rd.forward(request, response);  
              
              }else if(request.getParameter("ac").equals("VerCliente")){        
              RequestDispatcher rd = request.getRequestDispatcher("gerCli_Viz.jsp");
              rd.forward(request, response);  
              }   
    }
}
