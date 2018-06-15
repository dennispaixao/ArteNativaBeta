package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class relMaisVend_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"src/img/icones/logo-ico.ico\" type=\"image/x-icon\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"src/css/form.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"src/css/grafico.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"src/scripts/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"src/scripts/placeholder.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"src/scripts/preenche_endereco.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"src/scripts/chart.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <title>Mais Vendidos</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("                            <li><a href=\"\">Fornecedor </a></li>\n");
      out.write("                            <li><a href=\"\">Vendas </a></li>\n");
      out.write("                            <li><a href=\"\">Produtos abaixo do estoque </a></li>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("    <session id=\"formulario\">\n");
      out.write("    \n");
      out.write("        <div> <h1> Relatórios de desempenho nas vendas</h1> </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"container-graf\"  >\n");
      out.write("             <canvas  id=\"graf_numero_VendasPorPeriodo\"> </canvas>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div id=\"container-graf\"  >\n");
      out.write("             <canvas  id=\"graf_valor_VendasPorPeriodo\"> </canvas>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            var ctx = document.getElementById('graf_numero_VendasPorPeriodo').getContext('2d');\n");
      out.write("            var chart = new Chart(ctx, {\n");
      out.write("                // The type of chart we want to create\n");
      out.write("                type: 'line',\n");
      out.write("\n");
      out.write("                // The data for our dataset\n");
      out.write("                data: {\n");
      out.write("                    labels: [\"Janeiro\", \"Fevereiro\", \"Março\", \"Abril\", \"Maio\", \"Junho\", \"Julho\",\"Agosto\",\"Setembro\",\"Outubro\",\"Novembro\",\"Dezembro\"],\n");
      out.write("                    datasets: [{\n");
      out.write("                            label: \"Número de vendas por periodo\",\n");
      out.write("                            backgroundColor: 'rgb(50, 80, 120)',\n");
      out.write("                            borderColor: 'rgb(255, 100, 0)',\n");
      out.write("                            data: [0, 0, 0, 0, 0, 30, 45, 20, 10, 20, 30,20]\n");
      out.write("                        }]\n");
      out.write("                },\n");
      out.write("\n");
      out.write("                // Configuration options go here\n");
      out.write("                options: {}\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            var ctx = document.getElementById('graf_valor_VendasPorPeriodo').getContext('2d');\n");
      out.write("            var chart = new Chart(ctx, {\n");
      out.write("                // The type of chart we want to create\n");
      out.write("                type: 'line',\n");
      out.write("\n");
      out.write("                // The data for our dataset\n");
      out.write("                data: {\n");
      out.write("                    labels: [\"Janeiro\", \"Fevereiro\", \"Março\", \"Abril\", \"Maio\", \"Junho\", \"Julho\",\"Agosto\",\"Setembro\",\"Outubro\",\"Novembro\",\"Dezembro\"],\n");
      out.write("                    datasets: [{\n");
      out.write("                            label: \"Valor em vendas por periodo\",\n");
      out.write("                            backgroundColor: 'rgb(50, 220, 80)',\n");
      out.write("                            borderColor: 'rgb(255, 255, 0)',\n");
      out.write("                            data: [0, 0, 0, 0, 0, 150, 305, 200, 80, 60, 350,280]\n");
      out.write("                        }]\n");
      out.write("                },\n");
      out.write("\n");
      out.write("                // Configuration options go here\n");
      out.write("                options: {}\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </session>   \n");
      out.write("\n");
      out.write("    ");
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
      out.write("</body>\n");
      out.write("</html>\n");
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
