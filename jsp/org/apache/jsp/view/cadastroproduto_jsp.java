package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroproduto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "components/layouttopo.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<h1>Cadastro de Produto</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<form method=\"POST\" action=\"/cadastrarproduto\">\r\n");
      out.write("\t\t  <div class=\"mb-3\">\r\n");
      out.write("\t\t    <label for=\"descricao\" class=\"form-label\">Descri????o</label>\r\n");
      out.write("\t\t    <input type=\"text\" id=\"descricao\" name=\"descricao\" class=\"form-control\" />\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"mb-3\">\r\n");
      out.write("\t\t    <label for=\"valor\" class=\"form-label\">Valor</label>\r\n");
      out.write("\t\t    <input type=\"text\" id=\"valor\" name=\"valor\" class=\"form-control\" />\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <button type=\"submit\" class=\"btn btn-primary\">Cadastrar</button>\r\n");
      out.write("\t\t</form>\t\t\r\n");
      out.write("\t</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "components/layoutrodape.jsp", out, false);
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
