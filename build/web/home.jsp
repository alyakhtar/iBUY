
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
			padding-top:670px;
		} 	
		</style>   	 
	</head>
<body>

		<div class="navbar navbar-fixed-top" role="banner">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#dropdown-thumbnail-preview">				
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>				
				</button>
				<a class="navbar-brand " href="#">ibuy</a>
			</div>
			<div class="navbar-collapse collapse" id="dropdown-thumbnail-preview">
				<ul class="nav navbar-nav navbar-center">
					<li class="active"><a href="#">Home</a></li>
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
					<li ><a href="order.html">Orders</a></li>
					<li ><a href="index.html">Logout</a></li>
				</ul>
			</div>
		</div>
	</div>
	
	<div class="container">
		<div id="carousel" class="carousel slide" data-ride="carousel" data-interval="3000">
			<ol class="carousel-indicators">
				<li data-target="#carousel" data-slide-to="0" class="active"></li>
				<li data-target="#carousel" data-slide-to="1"></li>
		       	<li data-target="#carousel" data-slide-to="2"></li>
				<li data-target="#carousel" data-slide-to="3"></li>
				<li data-target="#carousel" data-slide-to="4"></li>
				<li data-target="#carousel" data-slide-to="5"></li>
				<li data-target="#carousel" data-slide-to="6"></li>
				<li data-target="#carousel" data-slide-to="7"></li>
		  	</ol>
			<div class="carousel-inner">
	            	    <div class="item active">
		            	<img src="img/osx.jpg" alt="...">
		            	<div class="carousel-caption">
			    		
	 		        </div>	
		            </div>
		    	<div class="item">
		        	<img src="img/7.jpg" alt="...">
		        	<div class="carousel-caption">
					
		        	</div>
		    	</div>
		        <div class="item">
		        	<img src="img/4.jpg" alt="...">
		        	<div class="carousel-caption">
			  		
		      		</div>
		    	</div>
			<div class="item">
		        	<img src="img/5.jpg" alt="...">
		        	<div class="carousel-captionFb">
			  		
		      		</div>
		    	</div>
			<div class="item">
		        	<img src="img/10.jpg" alt="...">
		        	<div class="carousel-caption">
			  		
		      		</div>
		    	</div>
			<div class="item">
		        	<img src="img/3.png" alt="...">
		        	<div class="carousel-caption">
			  		
		      		</div>
		    	</div>
			<div class="item">
		        	<img src="img/2.jpg" alt="...">
		        	<div class="carousel-caption">
			  		
		      		</div>
		    	</div>
			<div class="item">
		        	<img src="img/9.png" alt="...">
		        	<div class="carousel-caption">
			  		
		      		</div>
		    	</div>
		</div>
		<a class="left carousel-control" href="#carousel" role="button" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left"></span>
		</a>
	    <a class="right carousel-control" href="#carousel" role="button" data-slide="next">
			<span class="glyphicon glyphicon-chevron-right"></span>
		</a>
	</div>		
		<div class="row " style="padding-top:250px;">
			<div class="col-sm-4">
				<a href="#" class="thumbnail thumb-home">
					<img src="img/2.jpg"alt="apple" style="background-color: #FFFFFF"></img>
				</a>
				<center><h3 style="color: #000000; font-weight:bold">iPhone 
				</h3>
				<p style="color: black;"></p>
				<a href="page3.html" class="btn btn-success ">View »</a></center>
			</div>
			<div class="col-sm-4">
				<a href="#" class="thumbnail thumb-home">
					<img src="img/9.jpg"alt="apple" ></img>
				</a>				
				<center><h3 style="color: #000000; font-weight:bold">Macbook</h3>
				<p style="color: black;"></p>
				<a href="page2.html" class="btn btn-primary">View</a></center>
			</div>
			<div class="col-sm-4">
				<a href="#" class="thumbnail thumb-home">
					<img src="img/7.jpg" alt="apple" ></img>
				</a>
				<center>
					<h3 style="color: #000000; font-weight:bold">iPad</h3>
					<p style="color: black;"></p>
					<a href="page4.html" class="btn btn-danger">View</a>
				</center>
			</div>
		</div>
	</div>
	<br><br><br><br><br>
	<center><h1 style="font-family: orangejuice;color:#000000;font-size:50px;">UPCOMING</h1></center> 
	<br><br><br><br><br>
	<div class="featurette">	
    		<img class="featurette-image img-circle pull-right" src="img/osxyosemite.jpg">					
				<h2 class="featurette-heading" style="color:#000066; padding-left:420px; font-family: ZOMBIFIED">OSX YOSEMITE</span></h2>
    				<p class="lead"></p>
			</img>
	</div>
   	<br><br>
  	<div class="featurette">
    	<img class="featurette-image img-circle pull-left" src="img/iwatch.jpg">
    		<h2 class="featurette-heading" style="color:#330033;font-family: ZOMBIFIED;padding-left:700px;">APPLE WATCH</span></h2>
    			<p class="lead"></p>
		</img>
	</div>
  	<br><br>
  	<div class="featurette">
    	<img class="featurette-image img-circle pull-right" src="img/iphone6plus.jpg">
		    <h2 class="featurette-heading"  style="color:#830033;font-family:ZOMBIFIED;padding-left:120px">iPhone 6 Plus</span></h2>
			    <p class="lead"></p>
		</img>	
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
				<form class="form-horizontal" role="form" method="get" action="feedback.html" >
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
                                               
                                                    <input type="submit"  class="btn btn-primary" value="SEND">
					</div>
				</form>
			</div>
		</div>
	</div>
	<!--<div class="modal fade" id="login" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<form class="form-horizontal" role="form">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">x</button>						
						<h4>LOGIN</h4>
					</div>
					<div class="modal-body">
            					<form method="post" action='' name="login_form">
			              			<p><input type="text" class="span3" name="eid" id="email" placeholder="Email"></p>
			              			<p><input type="password" class="span3" name="passwd" placeholder="Password"></p>
              						<p><button type="submit" class="btn btn-primary">Sign in</button>
                						<a href="#">Forgot Password?</a>
              						</p>
            					</form>
          				</div>
						<div class="modal-footer">
            					<p style="position:absolute; left:100px; font-weight:bold; ">New To iBuy.com?</p>  
            					<a style="position:absolute; left:400px;"href="#register" data-toggle="modal" class="btn btn-primary">Register</a>
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
			              			<p><input type="text" class="span3" name="debname" placeholder="Name On Card"></p>
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
									<p><input type="password" class="span3" name="debccv" maxlength="4" placeholder="CCV (4 Digits)"></p>
			              			<p><input type="text" class="span3" name="amount" placeholder="Amount"></p>							
              						<p><button type="submit" class="btn btn-primary">Sign Up</button></p>
            					</form>
          				</div>
					<div class="modal-footer">iBuy.com</div>
				</form>
			</div>
		</div>
	</div>
	<div class="modal fade" id="cart" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<form class="form-horizontal" role="form">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">x</button>						
						<h4>SHOPPING CART</h4>
					</div>
					<div class="modal-body"></div>
					<div class="modal-footer">iBuy.com</div>
				</form>
			</div>
		</div>
	</div>-->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
</body>
</html>
