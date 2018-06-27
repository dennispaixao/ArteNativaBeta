package Control;

import DAO.ClienteDao;
import DAO.ClienteDaoImpl;
import Model.Cliente;
import java.io.IOException;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/login")
public class LoginControle extends HttpServlet {

	ClienteDao dao = new ClienteDaoImpl();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
                
                
                
		if (login == null || senha == null || login.isEmpty() || senha.isEmpty())  {
                    login = login.isEmpty() ? "Campo login obrigatório"  : "";
                    senha = senha.isEmpty() ? "Campo senha obrigatório" : "";
                    
                    request.setAttribute("senha", senha);
                    
                    request.setAttribute("login", login);
                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                    rd.forward(request, response);
                    return;
		}
		Cliente cliente = dao.efetuarLogin(login, senha);
		if (cliente.getIdCliente() == null) {
                    request.setAttribute("login", "Login ou senha Inválido");
                    request.setAttribute("senha", "");
                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                    rd.forward(request, response);
                    return;
		}
                request.setAttribute("pessoa", cliente);
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
	}

}
