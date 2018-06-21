/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.CategoriaDAO;
import DAO.ClienteDao;
import DAO.ClienteDaoImpl;
import Model.Categoria;
import Model.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dennis
 */
public class Navigation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String ac = request.getParameter("ac");

        switch (ac) {
            case "Cadastro_Cliente":
                {
                    RequestDispatcher rd = request.getRequestDispatcher("cadCli.jsp");
                    rd.forward(request, response);
                    break;
                }
            case "Cadastro_Produto":
                {
                    CategoriaDAO cDAO = new CategoriaDAO();
                    try {
                        ArrayList<Categoria> categorias = cDAO.listar();
                        request.setAttribute("listaCategoria", categorias);
                        RequestDispatcher rd = request.getRequestDispatcher("cadProd.jsp");
                        rd.forward(request, response);
                        
                    } catch (SQLException | ClassNotFoundException ex) {
                    }       break;
                }
            case "Cadastro_Fornecedor":
                {
                    CategoriaDAO cDAO = new CategoriaDAO();
                    try {
                        ArrayList<Categoria> categorias = cDAO.listar();
                        request.setAttribute("listaCategoria", categorias);
                        RequestDispatcher rd = request.getRequestDispatcher("cadForn.jsp");
                        rd.forward(request, response);
                    } catch (SQLException | ClassNotFoundException ex) {
                    }       break;
                }
            case "Cadastro_Pedido":
                {
                    CategoriaDAO cDAO = new CategoriaDAO();
                    RequestDispatcher rd = request.getRequestDispatcher("cadVen.jsp");
                    rd.forward(request, response);
                    break;
                }
            case "Gerencia_Cliente":
                {
                    CategoriaDAO cDAO = new CategoriaDAO();
                    ClienteDao cliDao = new ClienteDaoImpl();
                    List<Cliente> clientes = cliDao.listarTodosClientes();
                    request.setAttribute("listaCliente", clientes);
                    RequestDispatcher rd = request.getRequestDispatcher("gerCli.jsp");
                    rd.forward(request, response);
                    break;
                }
            case "Gerencia_Produto":
                {
                    RequestDispatcher rd = request.getRequestDispatcher("gerProd.jsp");
                    rd.forward(request, response);
                    break;
                }
            case "Gerencia_Fornecedor":
                {
                    RequestDispatcher rd = request.getRequestDispatcher("gerForn.jsp");
                    rd.forward(request, response);
                    break;
                }
            case "Gerencia_Pedidos":
                {
                    RequestDispatcher rd = request.getRequestDispatcher("gerVen.jsp");
                    rd.forward(request, response);
                    break;
                }
            case "Gerencia_Estoque":
                {
                    RequestDispatcher rd = request.getRequestDispatcher("gerEst.jsp");
                    rd.forward(request, response);
                    break;
                }
            case "Relatorios_MaisVendidos":
                {
                    RequestDispatcher rd = request.getRequestDispatcher("relMaisVend.jsp");
                    rd.forward(request, response);
                    break;
                }
            case "Relatorios_Estoque":
                {
                    RequestDispatcher rd = request.getRequestDispatcher("relEstoque.jsp");
                    rd.forward(request, response);
                    break;
                }
            default:
                  {
                    RequestDispatcher rd = request.getRequestDispatcher("404.jsp");
                    rd.forward(request, response);
                    break;
                }
               
        }

    }

}
