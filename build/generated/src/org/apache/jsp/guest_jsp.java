package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class guest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\t\t<div class=\"navbar navbar-fixed-top navbar1\" role=\"banner\" >\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#dropdown-thumbnail-preview\">\t\t\t\t\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\t\t\t\t\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand \" href=\"home.jsp\">ibuy</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"navbar-collapse collapse\" id=\"dropdown-thumbnail-preview\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-center\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown thumb-dropdown\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Products<b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"page1.html\">iMac\n");
      out.write("\t\t\t\t\t\t\t<div class=\"thumbnail\">\n");
      out.write("                        \t\t\t\t\t<img class=\"img-responsive\" src=\"img/8.jpg\">\n");
      out.write("                    \t\t\t\t\t</div>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"page2.html\">Macbook\n");
      out.write("\t\t\t\t\t\t\t<div class=\"thumbnail\">\n");
      out.write("                        \t\t\t\t\t<img class=\"img-responsive\" src=\"img/4.jpg\">\n");
      out.write("                    \t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"page3.html\">iPhone\n");
      out.write("\t\t\t\t\t\t\t<div class=\"thumbnail\">\n");
      out.write("                        \t\t\t\t\t<img class=\"img-responsive\" src=\"img/2.jpg\">\n");
      out.write("                    \t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"page4.html\">iPad\n");
      out.write("\t\t\t\t\t\t\t<div class=\"thumbnail\">\n");
      out.write("                        \t\t\t\t\t<img class=\"img-responsive\" src=\"img/7.jpg\">\n");
      out.write("                    \t\t\t\t\t</div>\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"page5.html\">iPod\n");
      out.write("\t\t\t\t\t\t\t<div class=\"thumbnail\">\n");
      out.write("                        \t\t\t\t\t<img class=\"img-responsive\" src=\"img/5.jpg\">\n");
      out.write("                    \t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Contact<b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown-header\">Admins</li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#aly\" data-toggle=\"modal\">@lY-o0p</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#manaf\" data-toggle=\"modal\">K@sa!</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#dhawal\" data-toggle=\"modal\">@wwAl</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<center><h1 style=\"color:#FFFFFF;padding-top:130px;\"> YOU ARE SIGNED IN AS A GUEST</h1></center>\n");
      out.write("\t\t<center><h1 style=\"color:#FFFFFF;\">PLEASE LOGIN TO PURCHASE A PRODUCT OR COMMENT!!!</h1></center>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"navbar navbar-fixed-bottom \" role=\"navigation\"> \n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"navbar-text pull-left\">\n");
      out.write("\t\t\t\t<p style=\"color:#ffffff;\">Copyright © 2014</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"navbar-text pull-right\">\n");
      out.write("\t\t\t\t<a href=\"https://fb.com/aly.akhtar\"><i class=\"fa fa-facebook-square fa-2x\"></i></a>\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-twitter-square fa-2x\"></i></a>\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-google-plus-square fa-2x\"></i></a>\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-rss-square fa-2x\"></i></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\t\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <!-- ===================================================== -->\t\n");
      out.write("\t<div class=\"modal fade\" id=\"aly\" role=\"dialog\">\t\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<h4> ALY AKHTAR</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t         <p>Email: samurai.aly@gmail.com</p>\n");
      out.write("\t\t\t\t\t<p>Fb: fb.com/aly.akhtar</p>\n");
      out.write("\t\t\t\t\t<p>Skype: aly.akhtar</p>\n");
      out.write("\t\t\t\t\t<p>gitHub: alyakhtar</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-primary\" data-dismiss=\"modal\">Close</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"modal fade\" id=\"manaf\" role=\"dialog\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<h4> MANAFF M. KHAN</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t         <p>Email: </p>\n");
      out.write("\t\t\t\t\t<p>Fb: </p>\n");
      out.write("\t\t\t\t\t<p>Skype: </p>\n");
      out.write("\t\t\t\t\t<p>gitHub:</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-primary\" data-dismiss=\"modal\">Close</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"modal fade\" id=\"dhawal\" role=\"dialog\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<h4> DHAWAL ARORA</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t         <p>Email: D.P.ARORA1@gmail.com</p>\n");
      out.write("\t\t\t\t\t<p>Fb: fb.com/</p>\n");
      out.write("\t\t\t\t\t<p>Skype: DhawalP</p>\n");
      out.write("\t\t\t\t\t<p>gitHub:</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-primary\" data-dismiss=\"modal\">Close</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
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
