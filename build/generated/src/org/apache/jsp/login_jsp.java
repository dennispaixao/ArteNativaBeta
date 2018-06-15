package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link rel=\"shortcut icon\" href=\"src/img/icones/logo-ico.ico\" type=\"image/x-icon\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Arte Nativa</title>\n");
      out.write("        <link href=\"src/css/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"src/scripts/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"src/scripts/placeholder.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"src/scripts/ctrl_login.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section id=\"container-geral\">\n");
      out.write("            \n");
      out.write("            <section id=\"container-login\">\n");
      out.write("                <div id=\"box-login\">\n");
      out.write("                    <form>\n");
      out.write("                        <div id=\"logo\">\n");
      out.write("                        \n");
      out.write("                        </div> \n");
      out.write("                        <div id=\"nome-usuario\"></div>\n");
      out.write("                        <span id=\"msg\"></span>\n");
      out.write("                      \n");
      out.write("                        \n");
      out.write("                        <input  type=\"text\" name=\"user\" id=\"user\" title=\"Insira aqui o usuário\" class=\"J_place\"> \n");
      out.write("                        <input type=\"password\" name=\"password\" id=\"senha\" title=\"senha\"  class=\"J_place\"> <br>\n");
      out.write("                        <div  id=\"links\">\n");
      out.write("                        <a href=\"#\"> cadastre-se </a> <br>\n");
      out.write("                        <a id=\"voltar\" href=\"login.jsp\"> voltar </a>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"button\" id=\"btn-proximo\" value=\"proximo\" >\n");
      out.write("                        <input type=\"button\" id=\"btn-logar\" value=\"logar\" >\n");
      out.write("                    </form>    \n");
      out.write("                </div>    \n");
      out.write("            </section>\n");
      out.write("            <section id=\"container-slogan\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </section>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
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
