<!DOCTYPE html>
<%@ page import="java.sql.*"%>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>iBuy</title>
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/custom.css" rel="stylesheet">	
		<link href="css/font-awesome.min.css" rel="stylesheet"> 	 
		<style type="text/css">
		@font-face { font-family: Anothershabby; src: url('fonts/Anothershabby.ttf'); } 
		@font-face { font-family: Hallosans; src: url('fonts/Hallosans.otf');}
		@font-face { font-family: orangejuice; src: url('fonts/orangejuice.ttf'); }
		@font-face { font-family: ZOMBIFIED; src: url('fonts/ZOMBIFIED.ttf'); }	
		@font-face { font-family: BlackWidow; src: url('fonts/BlackWidow.ttf'); }
		@font-face { font-family: Blazed; src: url('fonts/Blazed.ttf'); }	
		body 
		{
			background: #ffffff url() repeat-x fixed center top;
			background-size:cover; 
			padding-bottom:70px;
			padding-top:50px;
		} 	
		</style>   	 
	</head>
<body>

		<div style="background-color: #ffffff" class="navbar navbar-fixed-top" role="banner">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#dropdown-thumbnail-preview">				
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>				
				</button>
				<a class="navbar-brand " href="home.jsp">ibuy</a>
			</div>
			<div class="navbar-collapse collapse" id="dropdown-thumbnail-preview">
				<ul class="nav navbar-nav navbar-center">
					<li class="active"><a href="home.jsp">Home</a></li>
					<li class="dropdown thumb-dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Products<b class="caret"></b></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="page1.html">iMac
							<div class="thumbnail">
                        					<img class="img-responsive" src="img/8.jpg">
                    					</div>					
							</a></li>
							<li class="divider"></li>
							<li><a href="page2.html">Macbook
							<div class="thumbnail">
                        					<img class="img-responsive" src="img/4.jpg">
                    					</div>	
							</a></li>
							<li class="divider"></li>
							<li><a href="page3.html">iPhone
							<div class="thumbnail">
                        					<img class="img-responsive" src="img/2.jpg">
                    					</div>
							</a></li>
							<li class="divider"></li>
							<li><a href="page4.html">iPad
							<div class="thumbnail">
                        					<img class="img-responsive" src="img/7.jpg">
                    					</div>			
							</a></li>
							<li class="divider"></li>
							<li><a href="page5.html">iPod
							<div class="thumbnail">
                        					<img class="img-responsive" src="img/5.jpg">
                    					</div>
							</a></li>
						</ul>
					</li>				
				</ul>								
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Contact<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li class="dropdown-header">Admins</li>
							<li><a href="#aly" data-toggle="modal">@lY-o0p</a></li>
							<li><a href="#manaf" data-toggle="modal">K@sa!</a></li>
							<li><a href="#dhawal" data-toggle="modal">@wwAl</a></li>
						</ul>
					</li>
					<li ><a href="#cart" data-toggle="modal">icart</a></li>
					<li ><a href="index.html" >Logout</a></li>
				</ul>
			</div>
		</div>
	</div>
    <%
    Integer total=(Integer)request.getAttribute("total");
    String product=(String)request.getAttribute("product");
    Integer price=(Integer)request.getAttribute("price");
    Integer count=(Integer)request.getAttribute("count");
    //ResultSet r=(ResultSet)request.getAttribute("cart");
    %>
    <%--
    accessDB.connectDB();
    int it=accessDB.getItem();
    String user=accessDB.getUser();
    int ci=accessDB.getCustId(user);
    int total=accessDB.getTotal(it,ci);
    ResultSet r=accessDB.getCart(it,ci);
    r.next();
    String product=r.getString(1);
    Integer price=r.getInt(2);
    Integer count=r.getInt(3);
    --%>
	<div class="container" style="">
	<div align="center" id="mainWrapper">
		<div class="page-header">	
			<h1 style="color: #000000;font-size:30px;font-weight:bold; font-family: Anothershabby">iCart</h1>
                </div>  		
  	<div id="pageContent">
            <div style="margin:24px; text-align:left;"><br />
    		<table width="100%" border="2" cellspacing="0" id ="table1">
      		<tr>
        		<td width="15%" bgcolor="#000000" align="center"><strong>Product</strong></td>
        		<td width="10%" bgcolor="#000000" align="center"><strong>Price</strong></td>
        		<td width="12%" bgcolor="#000000" align="center"><strong>Quantity</strong></td>
        		<!--<td width="9%" bgcolor="#000000" align="center"><strong>Total</strong></td>-->
      		</tr>
                <%int i=2;while(i>0){%>
                <%--while(r.next()){--%>
                <tr class="spaceUnder">
                    <td width="15%" bgcolor="#FFFFFF" align="center"><font color="#000"> <%--=r.getString(1)--%> <%=product%></font></td>
                        <td width="10%" bgcolor="#FFFFFF" align="center"><font color="#000"> <%--=r.getInt(2)--%> <%=price%></font></td>
        		<td width="12%" bgcolor="#FFFFFF" align="center"><font color="#000"> <%--=r.getInt(3)--%> <%=count%></font></td>
        		<!--<td width="9%" bgcolor="#FFFFFF" align="center"><font color="#000"><strong></strong></font></td>-->
      		</tr><%--}--%>
                <%i--;}%>
                <%--r.close();
                accessDB.cn.close();
                accessDB.stmnt.close();
                --%>
                </table> 
                <div class="container">
		<left><h3 style="color:#FFFFF;padding-top:30px;"><font color="#000">Total: <%=total%> </font></h3></left>
                </div>
            </div>
  	</div>
	<div class="container" style="padding-top:70px;">
		<!--<a class="btn btn-danger ">Remove All</a>
		<a class="btn btn-success " style="left:120px;">Buy</a>-->
		<form method="post" action="cartoptions" name="cart">
			        <input type="submit" class="btn btn-danger" name="calloptions" value="Remove All" > 	<br>
			        <input type="submit" class="btn btn-success" name="calloptions" value="Buy" >
                </form>	

	</div>
	<div class="navbar navbar-fixed-bottom " role="navigation"> 
		<div class="container">
			<div class="navbar-text pull-left">
				<p style="color:#000000;">Copyright © 2014</p>
			</div>
			<div class="navbar-text pull-right">
				<a href="https://fb.com/aly.akhtar"><i class="fa fa-facebook-square fa-2x"></i></a>
				<a href="#"><i class="fa fa-twitter-square fa-2x"></i></a>
				<a href="#"><i class="fa fa-google-plus-square fa-2x"></i></a>
				<a href="#"><i class="fa fa-rss-square fa-2x"></i></a>
			</div>
		</div>
	</div>	

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <!-- ===================================================== -->	
	<div class="modal fade" id="aly" role="dialog">	
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4> ALY AKHTAR</h4>
				</div>
				<div class="modal-body">
				         <p>Email: samurai.aly@gmail.com</p>
					<p>Fb: fb.com/aly.akhtar</p>
					<p>Skype: aly.akhtar</p>
					<p>gitHub: alyakhtar</p>
				</div>
				<div class="modal-footer">
					<a class="btn btn-primary" data-dismiss="modal">Close</a>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="manaf" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4> MANAFF M. KHAN</h4>
				</div>
				<div class="modal-body">
				         <p>Email: </p>
					<p>Fb: </p>
					<p>Skype: </p>
					<p>gitHub:</p>
				</div>
				<div class="modal-footer">
					<a class="btn btn-primary" data-dismiss="modal">Close</a>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="dhawal" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4> DHAWAL ARORA</h4>
				</div>
				<div class="modal-body">
				         <p>Email: D.P.ARORA1@gmail.com</p>
					<p>Fb: fb.com/</p>
					<p>Skype: DhawalP</p>
					<p>gitHub:</p>
				</div>
				<div class="modal-footer">
					<a class="btn btn-primary" data-dismiss="modal">Close</a>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="feedback" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<form class="form-horizontal" role="form">
					<div class="modal-header">
						<h4>Feedback</h4>
					</div>
					<div class="modal-body">
						<div class="form-group">
							<label for="contact-name" class="col-sm-2 control-label">Name</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="contact-name" placeholder="First & Last Name">
							</div>
						</div>
						<div class="form-group">
							<label for="contact-email" class="col-sm-2 control-label">Email</label>
							<div class="col-sm-10">
								<input type="email" class="form-control" id="contact-email" placeholder="example@domain.com">
							</div>
						</div>
						<div class="form-group">
							<label for="contact-message" class="col-sm-2 control-label">Message</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="4"></textarea>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<a class="btn btn-default" data-dismiss="modal">Close</a>
						<button type="submit" class="btn btn-primary">Send</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
</body>
</html>
