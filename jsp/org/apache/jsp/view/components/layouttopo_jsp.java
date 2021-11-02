package org.apache.jsp.view.components;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layouttopo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>SpringMVC</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"css/bootstrap5/css/bootstrap.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\" />\r\n");
      out.write("<script src=\"js/jquery-3.2.1.slim.min.js\"></script>\r\n");
      out.write("<script src=\"css/bootstrap5/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\">Desenvolvimento Para Servidores\r\n");
      out.write("\t\t\t\t\tII</a>\r\n");
      out.write("\t\t\t\t<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("\t\t\t\t\tdata-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\"\r\n");
      out.write("\t\t\t\t\taria-controls=\"navbarCollapse\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"navbar-nav me-auto mb-2 mb-md-0\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/index\">Home</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/empresa\">Empresa</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/mensagem\">Mensagem</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/lista\">Lista</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"navbarDropdownMenuLink\" role=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Produto </a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-labelledby=\"navbarDropdownMenuLink\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/cadastroproduto\">Cadastro</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/listarprodutos\">Listagem</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<form class=\"d-flex\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"form-control me-2\" type=\"search\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Procurar\" aria-label=\"Search\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-outline-success\" type=\"submit\">Procurar</button>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t<img src=\"imagens/spring.png\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<main>\r\n");
      out.write("\t<div class=\"container\">");
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
