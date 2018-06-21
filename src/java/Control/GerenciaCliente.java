
package Control;

import DAO.ClienteDao;
import DAO.ClienteDaoImpl;
import DAO.DocumentoDao;
import DAO.DocumentoDaoImpl;
import DAO.EnderecoDao;
import DAO.EnderecoDaoImpl;
import Model.Cliente;
import Model.Perfil;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.ClienteParse;

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
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        Cliente cliente = ClienteParse.realizaParse(request);

        Perfil perfil = new Perfil();
        perfil.setIdPerfil(1);
        ClienteDao dao = new ClienteDaoImpl();
        Integer id = dao.cadastrarCliente(cliente, perfil);
        EnderecoDao daoEnd = new EnderecoDaoImpl();
        daoEnd.cadastrarEndereco(cliente.getEndereco(), id);
        DocumentoDao documentoDao = new DocumentoDaoImpl();
        
        cliente.getDocumentos().forEach(doc -> 
                documentoDao.cadastrarDocumento(doc, id) );
        
        RequestDispatcher rd = request.getRequestDispatcher("gerCli.jsp");
        rd.forward(request, response);
    }

}
