<%@ page import="java.util.*"%>
<!DOCTYPE html>
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

		<!--<div style="background-color: #ffffff" class="navbar navbar-fixed-top" role="banner">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#dropdown-thumbnail-preview">				
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>				
				</button>
				<a class="navbar-brand " href="home.html">ibuy</a>
			</div>
			<div class="navbar-collapse collapse" id="dropdown-thumbnail-preview">
				<ul class="nav navbar-nav navbar-center">
					<li class="active"><a href="home.html">Home</a></li>
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
					<li ><a href="index.html">Logout</a></li>
				</ul>
			</div>
		</div>
	</div>-->
	<%--
            //ArrayList a=(ArrayList)request.getAttribute("first");
            String name=(String)request.getAttribute("name");
        --%>
	<div class="container" style="padding-bottom:70px;">
		<div class="page-header">	
			<h1 style="color: #000000;font-size:30px;font-weight:bold; font-family: Anothershabby">User Details</h1>
		</div>
		<div class="container" style="color:black;">					
                    <p> 
                    <p>Name :<%--=a.get(0)--%></p>
                    <p>Phone Number :<%--=a.get(0)--%></p>
                    <p>Email :<%--=a.get(0)--%></p>
                    <p>Password :<%--=a.get(0)--%></p>
                    <p>Confirm Password :<%--=a.get(0)--%></p>
                    <p>Address 1 : <%--=a.get(0)--%></p>
                    <p>Address 2 : <%--=a.get(0)--%></p>
                    <p>City :<%--=a.get(0)--%></p>
                    <p>State : <%--=a.get(0)--%></p>
                    <p>Pin :<%--=a.get(0)--%></p>
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
	
	<div class="modal fade" id="delete" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<form class="form-horizontal" role="form">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">x</button>						
						<h4>Enter user name</h4>
					</div>
					<div class="modal-body">
            					<form method="post" action='' name="login_form">
			              			<p><input type="text" class="span3" name="eid" id="user" placeholder="User Name"></p>			              			
            					</form>
          				</div>
					<div class="modal-footer">
						<a class="btn btn-danger">DELETE</a>
					</div>	
				</form> 
			</div>
		</div>
	</div>
	<div class="modal fade" id="view" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<form class="form-horizontal" role="form">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">x</button>						
						<h4>Enter user name</h4>
					</div>
					<div class="modal-body">
            					<form method="post" action='' name="login_form">
			              			<p><input type="text" class="span3" name="eid" id="user" placeholder="User Name"></p>			              			
            					</form>
          				</div>
					<div class="modal-footer">
						<a class="btn btn-danger">VIEW</a>
					</div>	
				</form> 
			</div>
		</div>
	</div>
	<div class="modal fade" id="register" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<form class="form-horizontal" role="form">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">x</button>						
						<h4>REGISTER</h4>
					</div>
					<div class="modal-body">
            					<form method="post" action='' name="login_form">
			              			<p><input type="text" class="span3" name="name" placeholder="Name"></p>
			              			<p><input type="text" class="span3" name="phone" maxlength="10" placeholder="Phone Number"></p>
			              			<p><input type="text" class="span3" name="eid" id="email" placeholder="Email"></p>
			    		  			<p><input type="password" class="span3" name="passwd1" placeholder="Password"></p>
			              			<p><input type="password" class="span3" name="passwd2" placeholder="Confirm Password"></p>
			              			<p><input type="text" class="span3" name="add1" placeholder="Address 1"></p>
			              			<p><input type="text" class="span3" name="add2" placeholder="Address 2"></p>
			              			<p><input type="text" class="span3" name="city" placeholder="City"></p>
			              			<p><input type="text" class="span3" name="state" placeholder="State"></p>
			              			<p><input type="text" class="span3" name="pin" placeholder="Pin"></p>
			              			<!-- <p><input type="text" class="span3" name="debname" placeholder="Name On Card"></p>
			              			<p><input type="text" class="span3" name="debno" placeholder="Card Number"></p>	            			
			              			<p>Expiry Date:</p>								  	   								    
								      	<div class="form-group">								        
								        <div class="col-sm-9">
								          <div class="row">
								            <div class="col-md-4">
								              <select class="form-control" name="expiry-month" id="expiry-month">
								                <option>Month</option>
								                <option value="01">Jan (01)</option>
								                <option value="02">Feb (02)</option>
								                <option value="03">Mar (03)</option>
								                <option value="04">Apr (04)</option>
								                <option value="05">May (05)</option>
								                <option value="06">June (06)</option>
								                <option value="07">July (07)</option>
								                <option value="08">Aug (08)</option>
								                <option value="09">Sep (09)</option>
								                <option value="10">Oct (10)</option>
								                <option value="11">Nov (11)</option>
								                <option value="12">Dec (12)</option>
								              </select>
								            </div>
								            <div class="col-md-4">
								              <select class="form-control" name="expiry-year">
								              	<option>Year</option>
								                <option value="14">2014</option>
								                <option value="15">2015</option>
								                <option value="16">2016</option>
								                <option value="17">2017</option>
								                <option value="18">2018</option>
								                <option value="19">2019</option>
								                <option value="20">2020</option>
								                <option value="21">2021</option>
								                <option value="22">2022</option>
								                <option value="23">2023</option>
								                <option value="24">2024</option>
								                <option value="25">2025</option>
								                <option value="26">2026</option>
								                <option value="27">2027</option>
								              </select>
								            </div>
								          </div>
								        </div>
								      </div>								    
									<p><input type="password" class="span3" name="debcvv" maxlength="4" placeholder="CVV (4 Digits)"></p> -->
			              			<p><input type="text" class="span3" name="amount" placeholder="Amount"></p>							
              						<p><button type="submit" class="btn btn-primary">ADD USER</button></p>
            					</form>
          				</div>
					<div class="modal-footer">iBuy.com</div>
				</form>
			</div>
		</div>
	</div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
</body>
</html>
