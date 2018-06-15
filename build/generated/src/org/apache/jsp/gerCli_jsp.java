package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Categoria;
import java.util.ArrayList;

public final class gerCli_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link rel=\"shortcut icon\" href=\"src/img/icones/logo-ico.ico\" type=\"image/x-icon\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("      \n");
      out.write("        <link href=\"src/css/tabela.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("          <link href=\"src/css/form.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"src/scripts/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"src/scripts/placeholder.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <title>Clientes</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"src/css/menu.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script src=\"src/scripts/btnMenu.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"src/scripts/oculos_bold.js\" type=\"text/javascript\"></script>\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("        <div id=\"topo\">\n");
      out.write("              <div id=\"greetings\">\n");
      out.write("                  <p> Bom dia Dennis\n");
      out.write("                  <a href=\"\"> Sair </a></p>\n");
      out.write("              </div>    \n");
      out.write("              <div id=\"logo\"> \n");
      out.write("              </div>\n");
      out.write("              <div id=\"oculos\" title=\"negrito\" alt=\"negrito\">\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("        </div>\n");
      out.write("        <nav id=\"menu\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("            <ul>\n");
      out.write("                <li id=\"teste\">Inserir\n");
      out.write("                         <ul>\n");
      out.write("                            <li><a href=\"Navigation?ac=Cadastro_Cliente\">Cliente </a></li>\n");
      out.write("                            <li><a href=\"Navigation?ac=Cadastro_Produto\">Produto </a></li>\n");
      out.write("                            <li><a href=\"Navigation?ac=Cadastro_Fornecedor\">Fornecedor </a></li>\n");
      out.write("                            <li><a href=\"Navigation?ac=Cadastro_Pedido\">Venda </a></li>\n");
      out.write("                        </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>Gerenciar\n");
      out.write("                         <ul>\n");
      out.write("                            <li><a href=\"Navigation?ac=Gerencia_Cliente\">Cliente </a></li>\n");
      out.write("                            <li><a href=\"Navigation?ac=Gerencia_Produto\">Produto </a></li>\n");
      out.write("                            <li><a href=\"Navigation?ac=Gerencia_Fornecedor\">Fornecedor </a></li>\n");
      out.write("                            <li><a href=\"Navigation?ac=Gerencia_Pedidos\">Vendas </a></li>\n");
      out.write("                            <li><a href=\"Navigation?ac=Gerencia_Estoque\">Estoque </a></li>\n");
      out.write("                        </ul>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                 <li>Relatórios\n");
      out.write("                         <ul>\n");
      out.write("                            <li><a href=\"Navigation?ac=Relatorios_MaisVendidos\">Mais vendidos </a></li>\n");
      out.write("                            <li><a href=\"Navigation?ac=Relatorios_Estoque\">Estoque</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </nav>  \n");
      out.write("\n");
      out.write("        <div id=\"btn-menu\">\n");
      out.write("            <hr> <hr> <hr>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("        <div id=\"container-h1\"> <h1> Nossos Clientes </h1>\n");
      out.write("        </div>\n");
      out.write("         <div id=\"box-pesquisa\">   \n");
      out.write("                <input type=\"search\" name=\"Cliente\" title=\"Cliente\" class=\"J_place\">  \n");
      out.write("                <div id=\"lupa\"></div>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("        <div id=\"table\">\n");
      out.write("            <table border=\"1px\" >     \n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Nome</th>\n");
      out.write("                        <th>Data de Inclusão</th>\n");
      out.write("                        <th>Situação</th>\n");
      out.write("                        <th>Ferramentas</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
 for (int i = 0; i < 15; i++) { 
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>38684 ");
      out.print( i );
      out.write("</td>\n");
      out.write("                        <td>Pedro Álvares Cabral</td>  \n");
      out.write("                        <td>29/05/2018</td>\n");
      out.write("                        <td>Aguardando Pedido</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"GerenciaCliente?ac=VerCliente&id=");
      out.print(0 );
      out.write("\">\n");
      out.write("                                <img src=\"src/img/icones/lupa.png\" alt=\"vizualizar\" title=\"vizualizar\"/>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"ControleCliente?ac=ExcluirProduto&id=");
      out.print(0 );
      out.write("\">\n");
      out.write("                                <img src=\"src/img/excluir.png\" alt=\"excluir\" title=\"excluir\"/>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"GerenciaCliente?ac=AlterarCliente&id=");
      out.print(0);
      out.write("\">\n");
      out.write("                                <img src=\"src/img/editar.png\" alt=\"alterar\" title=\"alterar\"/>\n");
      out.write("                            </a>\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write(" \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link href=\"src/css/footer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <footer>\n");
      out.write("        <div id=\"logo\"  alt=\"Logo Arte Nativa design e tecnologia\" title=\"Arte Nativa design e tecnologia\">\n");
      out.write("            </div> \n");
      out.write("    </footer>    \n");
      out.write("    ");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
