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
                <link rel="stylesheet" type="text/css" href="css/theme.css">
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
					<li ><a href="cart.html">icart</a></li>
					<li ><a href="#">Orders</a></li>
					<li ><a href="index.html" >Logout</a></li>
				</ul>
			</div>
		</div>
	</div>
	
    <% String name=(String)request.getAttribute("i_name");
       String img=(String)request.getAttribute("img");
       String specs=(String)request.getAttribute("specs");
       String access=(String)request.getAttribute("access");
       Integer price=(Integer)request.getAttribute("price");
       Integer avail=(Integer)request.getAttribute("avail");
       ResultSet r=(ResultSet)request.getAttribute("rates");
    %>
	
    <div class="container">
		<div class="page-header">	
			<h1 style="color: #000000;font-size:30px;font-weight:bold; font-family: Anothershabby">Product Specification</h1>
		</div>
		<div style="left:200px" class="col-sm-8">
                    <center><h1 style="color:black;"><%=name%></h1></center>
			<div class="thumbnail">
                            <img src="<%=img%>" alt="imac"></img>
			</div><br><br>			
			<!--<a href="#" style="margin-left:290px" class="btn btn-success btn1">Add to cart »</a>-->
			<form method="post" action="guestcheck" name="cart">
			        <p><input type="submit" class="btn btn-danger btn1" name="check" value="Add To Cart" style="margin-left:290px"></p>             			
                        </form>
			<br><br><br>
                    <div style="color:red;">					
				<p class="description"><em>Price</em> : <%=price%></p>
		    	<!--<P class="description"><em>Model Number</em> : imac100</p>-->
		    	<p class="description"><em>Specs </em> : <%=specs%> </p>
		    	<p class="description"><em>Available</em> : <%=avail%></p>
		    	<p class="description"><em>Accessories</em> : <%=access%></p>		    	
		    	<br><hr ><br>
		    	<!--<p class="description"><em>Rating</em> : 4.5 OUT OF 5</p>-->
		    	<!--<form name="input" action="" method="post">
		    		<p class="description"><em>Comments</em> : </p>
		    		<p>blah blah blah</p>
		    		<p>blah blah blah</p>
		    		<p>blah blah blah</p>
		    		<p class="description"><em>Add Comment</em></p>
		    		<textarea cols="73" rows="5" name="comment"></textarea>					
					<br><br>
		    		<!--<a href="#" style="margin-left:0px" class="btn btn-default btn1">Submit »</a>
		    		<form method="post" action='' name="comment">
			        <p><input type="submit" class="btn btn-info btn1" name="comment" value="Submit" style="margin-left:0px"></p>             			
                                </form>
		    		<br><br><br><br>
                        </form>	-->	    	
                            <div class="detailBox">
			    <div class="titleBox">
			      <label style="font:35px;color:black">Comment Box</label>
			        <button type="button" class="close" aria-hidden="true">&times;</button>
			    </div>			    
			    <div class="commentBox" style="color:black";>
			        
			       <!-- <p class="taskDescription">Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>-->
			    </div>
			    <div class="actionBox" style="color:black";>
                                <div class="commentText"><%
			                  
                                while(r.next()){%>
                                
                                <p class=""><%=r.getString(2)%></p> <span class="date sub-text">on <%=r.getString(1)%></span>
			        <br><br>        
                                <%}%></div>
                                <%r.close();%>
       			        <p class="description"><em>Add Comment</em></p>
			        <form class="form-inline" role="form" action="guestcheck" method="post">
			            <div class="form-group">
			                <!--<input class="form-control" type="text" placeholder="Your comments" />-->
			                <textarea cols="73" rows="5" name="comment"></textarea>
                                        <!--<input type="text" name="comment" value=""> -->
			            </div>
			            <div class="form-group">
			                <!--<button class="btn btn-default">Add</button>-->
                                        <p><input type="submit" class="btn btn-danger" name="check" value="Add"></p>
			            </div>
			        </form>
			    </div>
			</div>
		    </div>					
		</div>
	</div>
	<footer style="padding-bottom:55px; padding-top:40px; background-image:url(img/16.jpg);padding-left:-250px;">
			
		<a style="position:absolute; left:170px; font-weight:bold; font-size:15px; color:red;" href="#feedback" data-toggle="modal">Feedback</a>
		<a style="position:absolute;  left:440px; font-weight:bold; font-size:15px;" href="page7.html" >Terms & Conditions</a>
		<a style="position:absolute;  left:800px; font-weight:bold; font-size:15px;" href="page6.html" >About Us</a>
		<a style="position:absolute;  left:1100px; font-weight:bold; font-size:15px;" href="#about" data-toggle="modal">Contact Us</a><br><br><br>
		<p style="position:absolute;  left:440px; font-weight:bold; font-size:15px; color:#000000">Copyright © 2014</p>
		<a style="position:absolute;  left:800px; font-weight:bold; font-size:15px;"href="https://fb.com/aly.akhtar"><i class="fa fa-facebook-square fa-2x"></i></a>
		<a style="position:absolute;  left:830px; font-weight:bold; font-size:15px;"href="#"><i class="fa fa-twitter-square fa-2x"></i></a>
		<a style="position:absolute;  left:860px; font-weight:bold; font-size:15px;"href="#"><i class="fa fa-google-plus-square fa-2x"></i></a>	
		<a style="position:absolute;  left:890px; font-weight:bold; font-size:15px;"href="#"><i class="fa fa-rss-square fa-2x"></i></a>
	
  	</footer>

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
