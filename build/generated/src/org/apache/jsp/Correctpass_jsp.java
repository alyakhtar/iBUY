package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Correctpass_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<title>iBuy</title>\n");
      out.write("\t\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t<link href=\"css/custom.css\" rel=\"stylesheet\">\t\n");
      out.write("\t\t<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\"> \t \n");
      out.write("\t\t<style type=\"text/css\">\n");
      out.write("\t\t@font-face { font-family: Anothershabby; src: url('fonts/Anothershabby.ttf'); } \n");
      out.write("\t\t@font-face { font-family: Hallosans; src: url('fonts/Hallosans.otf');}\n");
      out.write("\t\t@font-face { font-family: orangejuice; src: url('fonts/orangejuice.ttf'); }\n");
      out.write("\t\t@font-face { font-family: ZOMBIFIED; src: url('fonts/ZOMBIFIED.ttf'); }\t\n");
      out.write("\t\t@font-face { font-family: BlackWidow; src: url('fonts/BlackWidow.ttf'); }\n");
      out.write("\t\t@font-face { font-family: Blazed; src: url('fonts/Blazed.ttf'); }\t\n");
      out.write("\t\t@font-face { font-family: WolfintheCity; src: url('fonts/Wolf in the City.ttf'); }\n");
      out.write("                body \n");
      out.write("\t\t{\n");
      out.write("\t\t\tbackground: #ffffff url(img/1.jpg) repeat-x fixed center top;\n");
      out.write("\t\t\tbackground-size:cover; \n");
      out.write("\t\t\tpadding-bottom:70px;\n");
      out.write("\t\t\tpadding-top:70px;\n");
      out.write("\t\t} \t\n");
      out.write("\t\t</style>   \t \n");
      out.write("\t</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <center><h1>Both Passwords Entered do not match.Please enter again.</h1></center>\n");
      out.write("        <center><a href=\"index.html\"><u>GO BACK</u></a></center>\n");
      out.write("    </div>  \n");
      out.write("\t\t\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
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
