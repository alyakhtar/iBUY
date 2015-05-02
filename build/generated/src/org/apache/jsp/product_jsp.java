package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<title>iBuy</title>\n");
      out.write("\t\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t<link href=\"css/custom.css\" rel=\"stylesheet\">\t\n");
      out.write("                <link rel=\"stylesheet\" type=\"text/css\" href=\"css/theme.css\">\n");
      out.write("\t\t<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\"> \t \n");
      out.write("\t\t<style type=\"text/css\">\n");
      out.write("\t\t@font-face { font-family: Anothershabby; src: url('fonts/Anothershabby.ttf'); } \n");
      out.write("\t\t@font-face { font-family: Hallosans; src: url('fonts/Hallosans.otf');}\n");
      out.write("\t\t@font-face { font-family: orangejuice; src: url('fonts/orangejuice.ttf'); }\n");
      out.write("\t\t@font-face { font-family: ZOMBIFIED; src: url('fonts/ZOMBIFIED.ttf'); }\t\n");
      out.write("\t\t@font-face { font-family: BlackWidow; src: url('fonts/BlackWidow.ttf'); }\n");
      out.write("\t\t@font-face { font-family: Blazed; src: url('fonts/Blazed.ttf'); }\t\n");
      out.write("\t\tbody \n");
      out.write("\t\t{\n");
      out.write("\t\t\tbackground: #ffffff url() repeat-x fixed center top;\n");
      out.write("\t\t\tbackground-size:cover; \n");
      out.write("\t\t\tpadding-bottom:70px;\n");
      out.write("\t\t\tpadding-top:50px;\n");
      out.write("\t\t} \t\n");
      out.write("\t\t</style>   \t \n");
      out.write("\t</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t\t<div style=\"background-color: #ffffff\" class=\"navbar navbar-fixed-top\" role=\"banner\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#dropdown-thumbnail-preview\">\t\t\t\t\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\t\t\t\t\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand \" href=\"#\">ibuy</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"navbar-collapse collapse\" id=\"dropdown-thumbnail-preview\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-center\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"#\">Home</a></li>\n");
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
      out.write("\t\t\t\t\t<li ><a href=\"cart.html\">icart</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"#\">Orders</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"index.html\" >Logout</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("    ");
 String name=(String)request.getAttribute("i_name");
       String img=(String)request.getAttribute("img");
       String specs=(String)request.getAttribute("specs");
       String access=(String)request.getAttribute("access");
       Integer price=(Integer)request.getAttribute("price");
       Integer avail=(Integer)request.getAttribute("avail");
       ResultSet r=(ResultSet)request.getAttribute("rates");
    
      out.write("\n");
      out.write("\t\n");
      out.write("    <div class=\"container\">\n");
      out.write("\t\t<div class=\"page-header\">\t\n");
      out.write("\t\t\t<h1 style=\"color: #000000;font-size:30px;font-weight:bold; font-family: Anothershabby\">Product Specification</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"left:200px\" class=\"col-sm-8\">\n");
      out.write("                    <center><h1 style=\"color:black;\">");
      out.print(name);
      out.write("</h1></center>\n");
      out.write("\t\t\t<div class=\"thumbnail\">\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(img);
      out.write("\" alt=\"imac\"></img>\n");
      out.write("\t\t\t</div><br><br>\t\t\t\n");
      out.write("\t\t\t<!--<a href=\"#\" style=\"margin-left:290px\" class=\"btn btn-success btn1\">Add to cart »</a>-->\n");
      out.write("\t\t\t<form method=\"post\" action=\"guestcheck\" name=\"cart\">\n");
      out.write("\t\t\t        <p><input type=\"submit\" class=\"btn btn-danger btn1\" name=\"check\" value=\"Add To Cart\" style=\"margin-left:290px\"></p>             \t\t\t\n");
      out.write("                        </form>\n");
      out.write("\t\t\t<br><br><br>\n");
      out.write("                    <div style=\"color:red;\">\t\t\t\t\t\n");
      out.write("\t\t\t\t<p class=\"description\"><em>Price</em> : ");
      out.print(price);
      out.write("</p>\n");
      out.write("\t\t    \t<!--<P class=\"description\"><em>Model Number</em> : imac100</p>-->\n");
      out.write("\t\t    \t<p class=\"description\"><em>Specs </em> : ");
      out.print(specs);
      out.write(" </p>\n");
      out.write("\t\t    \t<p class=\"description\"><em>Available</em> : ");
      out.print(avail);
      out.write("</p>\n");
      out.write("\t\t    \t<p class=\"description\"><em>Accessories</em> : ");
      out.print(access);
      out.write("</p>\t\t    \t\n");
      out.write("\t\t    \t<br><hr ><br>\n");
      out.write("\t\t    \t<!--<p class=\"description\"><em>Rating</em> : 4.5 OUT OF 5</p>-->\n");
      out.write("\t\t    \t<!--<form name=\"input\" action=\"\" method=\"post\">\n");
      out.write("\t\t    \t\t<p class=\"description\"><em>Comments</em> : </p>\n");
      out.write("\t\t    \t\t<p>blah blah blah</p>\n");
      out.write("\t\t    \t\t<p>blah blah blah</p>\n");
      out.write("\t\t    \t\t<p>blah blah blah</p>\n");
      out.write("\t\t    \t\t<p class=\"description\"><em>Add Comment</em></p>\n");
      out.write("\t\t    \t\t<textarea cols=\"73\" rows=\"5\" name=\"comment\"></textarea>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<br><br>\n");
      out.write("\t\t    \t\t<!--<a href=\"#\" style=\"margin-left:0px\" class=\"btn btn-default btn1\">Submit »</a>\n");
      out.write("\t\t    \t\t<form method=\"post\" action='' name=\"comment\">\n");
      out.write("\t\t\t        <p><input type=\"submit\" class=\"btn btn-info btn1\" name=\"comment\" value=\"Submit\" style=\"margin-left:0px\"></p>             \t\t\t\n");
      out.write("                                </form>\n");
      out.write("\t\t    \t\t<br><br><br><br>\n");
      out.write("                        </form>\t-->\t    \t\n");
      out.write("                            <div class=\"detailBox\">\n");
      out.write("\t\t\t    <div class=\"titleBox\">\n");
      out.write("\t\t\t      <label style=\"font:35px;color:black\">Comment Box</label>\n");
      out.write("\t\t\t        <button type=\"button\" class=\"close\" aria-hidden=\"true\">&times;</button>\n");
      out.write("\t\t\t    </div>\t\t\t    \n");
      out.write("\t\t\t    <div class=\"commentBox\" style=\"color:black\";>\n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t       <!-- <p class=\"taskDescription\">Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>-->\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t    <div class=\"actionBox\" style=\"color:black\";>\n");
      out.write("                                <div class=\"commentText\">");

			                  
                                while(r.next()){
      out.write("\n");
      out.write("                                \n");
      out.write("                                <p class=\"\">");
      out.print(r.getString(2));
      out.write("</p> <span class=\"date sub-text\">on ");
      out.print(r.getString(1));
      out.write("</span>\n");
      out.write("\t\t\t        <br><br>        \n");
      out.write("                                ");
}
      out.write("</div>\n");
      out.write("                                ");
r.close();
      out.write("\n");
      out.write("       \t\t\t        <p class=\"description\"><em>Add Comment</em></p>\n");
      out.write("\t\t\t        <form class=\"form-inline\" role=\"form\" action=\"guestcheck\" method=\"post\">\n");
      out.write("\t\t\t            <div class=\"form-group\">\n");
      out.write("\t\t\t                <!--<input class=\"form-control\" type=\"text\" placeholder=\"Your comments\" />-->\n");
      out.write("\t\t\t                <textarea cols=\"73\" rows=\"5\" name=\"comment\"></textarea>\n");
      out.write("                                        <!--<input type=\"text\" name=\"comment\" value=\"\"> -->\n");
      out.write("\t\t\t            </div>\n");
      out.write("\t\t\t            <div class=\"form-group\">\n");
      out.write("\t\t\t                <!--<button class=\"btn btn-default\">Add</button>-->\n");
      out.write("                                        <p><input type=\"submit\" class=\"btn btn-danger\" name=\"check\" value=\"Add\"></p>\n");
      out.write("\t\t\t            </div>\n");
      out.write("\t\t\t        </form>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t    </div>\t\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<footer style=\"padding-bottom:55px; padding-top:40px; background-image:url(img/16.jpg);padding-left:-250px;\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t<a style=\"position:absolute; left:170px; font-weight:bold; font-size:15px; color:red;\" href=\"#feedback\" data-toggle=\"modal\">Feedback</a>\n");
      out.write("\t\t<a style=\"position:absolute;  left:440px; font-weight:bold; font-size:15px;\" href=\"page7.html\" >Terms & Conditions</a>\n");
      out.write("\t\t<a style=\"position:absolute;  left:800px; font-weight:bold; font-size:15px;\" href=\"page6.html\" >About Us</a>\n");
      out.write("\t\t<a style=\"position:absolute;  left:1100px; font-weight:bold; font-size:15px;\" href=\"#about\" data-toggle=\"modal\">Contact Us</a><br><br><br>\n");
      out.write("\t\t<p style=\"position:absolute;  left:440px; font-weight:bold; font-size:15px; color:#000000\">Copyright © 2014</p>\n");
      out.write("\t\t<a style=\"position:absolute;  left:800px; font-weight:bold; font-size:15px;\"href=\"https://fb.com/aly.akhtar\"><i class=\"fa fa-facebook-square fa-2x\"></i></a>\n");
      out.write("\t\t<a style=\"position:absolute;  left:830px; font-weight:bold; font-size:15px;\"href=\"#\"><i class=\"fa fa-twitter-square fa-2x\"></i></a>\n");
      out.write("\t\t<a style=\"position:absolute;  left:860px; font-weight:bold; font-size:15px;\"href=\"#\"><i class=\"fa fa-google-plus-square fa-2x\"></i></a>\t\n");
      out.write("\t\t<a style=\"position:absolute;  left:890px; font-weight:bold; font-size:15px;\"href=\"#\"><i class=\"fa fa-rss-square fa-2x\"></i></a>\n");
      out.write("\t\n");
      out.write("  \t</footer>\n");
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
      out.write("\t<div class=\"modal fade\" id=\"feedback\" role=\"dialog\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" role=\"form\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t<h4>Feedback</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"contact-name\" class=\"col-sm-2 control-label\">Name</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"contact-name\" placeholder=\"First & Last Name\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"contact-email\" class=\"col-sm-2 control-label\">Email</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" id=\"contact-email\" placeholder=\"example@domain.com\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"contact-message\" class=\"col-sm-2 control-label\">Message</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<textarea class=\"form-control\" rows=\"4\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-default\" data-dismiss=\"modal\">Close</a>\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Send</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
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