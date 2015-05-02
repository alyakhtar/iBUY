package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<title>iBuy</title>\n");
      out.write("\t\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t<link href=\"css/custom1.css\" rel=\"stylesheet\">\t\n");
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
      out.write("\t\t}\n");
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
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li ><a href=\"index.html\">Logout</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"container\" style=\"padding-bottom:70px;\">\n");
      out.write("\t\t<div class=\"page-header\">\t\n");
      out.write("\t\t\t<h1 style=\"color: #000000;font-size:30px;font-weight:bold; font-family: Anothershabby\">Admin Panel</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"left:200px\" class=\"col-sm-8\">\t\t\t\t\t\n");
      out.write("\t\t\t<div style=\"color:black;\">\n");
      out.write("\t\t\t\t<h4>ADD NEW USER :  <a href=\"#register\" data-toggle=\"modal\" style=\"margin-left:225px;width:180px;\" class=\"btn btn-success btn1\">ADD USER »</a></h4>\n");
      out.write("\t\t\t\t<h4>DELETE USER :  <a href=\"#delete\" data-toggle=\"modal\" style=\"margin-left:240px;width:180px;\" class=\"btn btn-success btn1\">REMOVE USER »</a></h4>\n");
      out.write("\t\t    \t<!--<h4>VIEW USER DETAILS :  <a href=\"#view\" data-toggle=\"modal\" style=\"margin-left:182px;width:180px;\" class=\"btn btn-success btn1\">USER DETAILS »</a></h4>-->\n");
      out.write("\t\t    \t<h4>DELETE ORDER DETAILS :  <a href=\"#deleteorder\" data-toggle=\"modal\" style=\"margin-left:140px;width:180px;\" class=\"btn btn-success btn1\">DELETE ORDER »</a></h4>\n");
      out.write("\t\t    \t<h4>DELETE COMMENT :  <a href=\"#deletecomment\" data-toggle=\"modal\" style=\"margin-left:193px;width:180px;\" class=\"btn btn-success btn1\">DELETE COMMENT »</a></h4>\t\t  \n");
      out.write("\t\t    \t<h4>ADD ITEM :  <a href=\"#additem\" data-toggle=\"modal\" style=\"margin-left:280px;width:180px;\" class=\"btn btn-success btn1\">ADD ITEM »</a></h4>\t\t    \t  \t\n");
      out.write("\t\t    \t<hr align=\"left\" width=\"78%\">\n");
      out.write("\t\t    \t<br><br>\t    \t \n");
      out.write("                        </div>\t\t\t\t\t\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</div>\n");
      out.write("\n");
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
      out.write("\t\n");
      out.write("\t<div class=\"modal fade\" id=\"delete\" role=\"dialog\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" role=\"form\" method=\"POST\" action=\"admin\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">x</button>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<h4>Enter user name</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"deleteUser\" id=\"user\" placeholder=\"User Name\" value=\"\"></p>\t\t\t\n");
      out.write("          \t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("                                                <p><input type=\"submit\" class=\"btn btn-danger\" name=\"admin\" value=\"deleteuser\" style=\"margin-left:290px\"></p>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</form> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"modal fade\" id=\"deleteorder\" role=\"dialog\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" role=\"form\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">x</button>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<h4>Enter Order Number</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("            \t\t\t\t\t<form method=\"post\" action='' name=\"login_form\">\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"eid\" id=\"user\" placeholder=\"Order number\"></p>\t\t\t              \t\t\t\n");
      out.write("            \t\t\t\t\t</form>\n");
      out.write("          \t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-danger\">DELETE</a>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</form> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"modal fade\" id=\"deletecomment\" role=\"dialog\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" role=\"form\" method=\"POST\" action=\"admin\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">x</button>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<h4>Enter Comment Id and Item ID</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    \n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"cid\" id=\"user\" placeholder=\"Comment Number\"></p>\n");
      out.write("                                                        <p><input type=\"text\" class=\"span3\" name=\"iid\" id=\"user\" placeholder=\"Item Number\"></p>\n");
      out.write("          \t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("                                            <p><input type=\"submit\" class=\"btn btn-danger\" name=\"admin\" value=\"deletecomment\" style=\"margin-left:290px\"></p>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</form> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"modal fade\" id=\"additem\" role=\"dialog\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" role=\"form\" method=\"post\" action=\"admin\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">x</button>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<h4>Enter Item Details</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"name\" id=\"user\" placeholder=\"ITEM NAME\"></p>\t\t\t              \t\t\t\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"price\" id=\"user\" placeholder=\"PRICE\"></p>\t\t\t              \t\t\t\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"specs\" id=\"user\" placeholder=\"SPECIFICATIONS\"></p>\t\t\t              \t\t\t\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"acc\" id=\"user\" placeholder=\"ACCESSORIES\"></p>\t\t\t              \t\t\t\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"img\" id=\"user\" placeholder=\"IMAGE PATH\"></p>\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"avail\" id=\"user\" placeholder=\"AVAILABILITY\"></p>\t          \t\t\t\n");
      out.write("          \t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("                                            <p><input type=\"submit\" class=\"btn btn-danger\" name=\"admin\" value=\"additem\" style=\"margin-left:290px\"></p>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</form> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!--<div class=\"modal fade\" id=\"view\" role=\"dialog\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" role=\"form\" method=\"post\" action=\"admin\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">x</button>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<h4>Enter user name</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"uname\" id=\"user\" placeholder=\"User Name\"></p>\n");
      out.write("          \t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("                                            <p><input type=\"submit\" class=\"btn btn-danger\" name=\"admin\" value=\"View User\"> </p>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</form> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>-->\n");
      out.write("\t<div class=\"modal fade\" id=\"register\" role=\"dialog\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" role=\"form\" action=\"admin\" method=\"POST\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">x</button>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<h4>REGISTER</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"name\" placeholder=\"Name\"></p>\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"phone\" maxlength=\"10\" placeholder=\"Phone Number\"></p>\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"email\" id=\"email\" placeholder=\"Email Address\"></p>\n");
      out.write("\t\t\t    \t\t  \t\t\t<p><input type=\"password\" class=\"span3\" name=\"passwd\" placeholder=\"Password\"></p>\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"password\" class=\"span3\" name=\"cpasswd\" placeholder=\"Confirm Password\"></p>\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"add1\" placeholder=\"Address 1\"></p>\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"add2\" placeholder=\"Address 2\"></p>\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"city\" placeholder=\"City\"></p>\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"state\" placeholder=\"State\"></p>\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"pin\" placeholder=\"Pin Code\"></p>\n");
      out.write("                                                        <!--<p><input type=\"text\" class=\"span3\" name=\"amount\" placeholder=\"Amount\">-->\n");
      out.write("\t\t\t              \t\t\t<!-- <p><input type=\"text\" class=\"span3\" name=\"debname\" placeholder=\"Name On Card\"></p>\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"debno\" placeholder=\"Card Number\"></p>\t            \t\t\t\n");
      out.write("\t\t\t              \t\t\t<p>Expiry Date:</p>\t\t\t\t\t\t\t\t  \t   \t\t\t\t\t\t\t\t    \n");
      out.write("\t\t\t\t\t\t\t\t      \t<div class=\"form-group\">\t\t\t\t\t\t\t\t        \n");
      out.write("\t\t\t\t\t\t\t\t        <div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t\t\t\t\t          <div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t            <div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t              <select class=\"form-control\" name=\"expiry-month\" id=\"expiry-month\">\n");
      out.write("\t\t\t\t\t\t\t\t                <option>Month</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"01\">Jan (01)</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"02\">Feb (02)</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"03\">Mar (03)</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"04\">Apr (04)</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"05\">May (05)</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"06\">June (06)</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"07\">July (07)</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"08\">Aug (08)</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"09\">Sep (09)</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"10\">Oct (10)</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"11\">Nov (11)</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"12\">Dec (12)</option>\n");
      out.write("\t\t\t\t\t\t\t\t              </select>\n");
      out.write("\t\t\t\t\t\t\t\t            </div>\n");
      out.write("\t\t\t\t\t\t\t\t            <div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t              <select class=\"form-control\" name=\"expiry-year\">\n");
      out.write("\t\t\t\t\t\t\t\t              \t<option>Year</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"14\">2014</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"15\">2015</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"16\">2016</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"17\">2017</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"18\">2018</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"19\">2019</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"20\">2020</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"21\">2021</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"22\">2022</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"23\">2023</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"24\">2024</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"25\">2025</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"26\">2026</option>\n");
      out.write("\t\t\t\t\t\t\t\t                <option value=\"27\">2027</option>\n");
      out.write("\t\t\t\t\t\t\t\t              </select>\n");
      out.write("\t\t\t\t\t\t\t\t            </div>\n");
      out.write("\t\t\t\t\t\t\t\t          </div>\n");
      out.write("\t\t\t\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t\t\t\t      </div>\t\t\t\t\t\t\t\t    \n");
      out.write("\t\t\t\t\t\t\t\t\t<p><input type=\"password\" class=\"span3\" name=\"debcvv\" maxlength=\"4\" placeholder=\"CVV (4 Digits)\"></p> -->\n");
      out.write("\t\t\t              \t\t\t<p><input type=\"text\" class=\"span3\" name=\"amount\" placeholder=\"Amount\"></p>\t\t\t\t\t\t\t\n");
      out.write("              \t\t\t\t\t\t<p><input type=\"submit\" class=\"btn btn-primary\" name=\"admin\" value=\"Add user\"> </p>\n");
      out.write("          \t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">iBuy.com</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
