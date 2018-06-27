
package Control;

import DAO.ClienteDao;
import DAO.ClienteDaoImpl;
import DAO.DocumentoDao;
import DAO.DocumentoDaoImpl;
import DAO.EnderecoDao;
import DAO.EnderecoDaoImpl;
import Model.Cliente;
import Model.Documento;
import Model.Endereco;
import Model.Perfil;
import java.io.IOException;
import java.util.List;
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
        Integer id = Integer.parseInt(request.getParameter("id"));
        ClienteDao dao = new ClienteDaoImpl();
        EnderecoDao daoEnd = new EnderecoDaoImpl(); 
        DocumentoDao documentoDao = new DocumentoDaoImpl();
        if(request.getParameter("ac").equals("AlterarCliente")){      
                                   
            Cliente cli = dao.listarUmCliente(id);
            
            List<Documento> documentos = documentoDao.listarDocumentoPorPessoa(id);
            cli.setDocumentos(documentos);
            
            Endereco endereco = daoEnd.listarUmEndereco(id);
            cli.setEndereco(endereco);
            
            request.setAttribute("cliente", cli);
            RequestDispatcher rd = request.getRequestDispatcher("gerCli_Alt.jsp");
            rd.forward(request, response);  
        
        }else if(request.getParameter("ac").equals("VerCliente")){    
            Cliente cli = dao.listarUmCliente(id);
          
            Endereco endereco = daoEnd.listarUmEndereco(id);
            cli.setEndereco(endereco);
            request.setAttribute("cliente", cli);
            RequestDispatcher rd = request.getRequestDispatcher("gerCli_Viz.jsp");
            rd.forward(request, response);  
        }else if(request.getParameter("ac").equals("ExcluirCliente")){ 
            dao.deleterCliente(id);
             List<Cliente> clientes = dao.listarTodosClientes();
            request.setAttribute("listaCliente", clientes);
            RequestDispatcher rd = request.getRequestDispatcher("gerCli.jsp");
            rd.forward(request, response);
        }   
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        Cliente cliente = ClienteParse.realizaParse(request);
        ClienteDao dao = new ClienteDaoImpl();
        EnderecoDao daoEnd = new EnderecoDaoImpl();
        DocumentoDao documentoDao = new DocumentoDaoImpl();
        
        if(request.getParameter("acao").equals("Cadastrar")){   
            Perfil perfil = new Perfil();
            perfil.setIdPerfil(1);
            
            Integer id = dao.cadastrarCliente(cliente, perfil);
            
            daoEnd.cadastrarEndereco(cliente.getEndereco(), id);
            

            cliente.getDocumentos().forEach(doc -> 
                    documentoDao.cadastrarDocumento(doc, id) );

            List<Cliente> clientes = dao.listarTodosClientes();
            request.setAttribute("listaCliente", clientes);
            RequestDispatcher rd = request.getRequestDispatcher("gerCli.jsp");
            rd.forward(request, response);
            
        }else  if(request.getParameter("acao").equals("Alterar")){   
            Integer id = Integer.parseInt(request.getParameter("id"));
            cliente.setIdCliente(id);
            dao.alterarCliente(cliente);
            daoEnd.alterarEndereco(cliente.getEndereco(), id);
            
            cliente.getDocumentos().forEach(doc -> 
                    documentoDao.alterarDocumento(doc, id) );
             List<Cliente> clientes = dao.listarTodosClientes();
            request.setAttribute("listaCliente", clientes);
            RequestDispatcher rd = request.getRequestDispatcher("gerCli.jsp");
            rd.forward(request, response);
        }
    }

}
