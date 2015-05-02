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
		@font-face { font-family: WolfintheCity; src: url('fonts/Wolf in the City.ttf'); }
                body 
		{
			background: #ffffff url(img/1.jpg) repeat-x fixed center top;
			background-size:cover; 
			padding-bottom:70px;
			padding-top:70px;
		} 	
		</style>   	 
	</head>
<body>

		<div class="navbar navbar-fixed-top navbar1" role="banner" >
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
					
				</ul>
			</div>
		</div>
	</div>
	<div class="container">
		<center><h1 style="color:#FFFFFF;padding-top:130px;"> YOU ARE SIGNED IN AS A GUEST</h1></center>
		<center><h1 style="color:#FFFFFF;">PLEASE LOGIN TO PURCHASE A PRODUCT OR COMMENT!!!</h1></center>
	</div>
	<div class="navbar navbar-fixed-bottom " role="navigation"> 
		<div class="container">
			<div class="navbar-text pull-left">
				<p style="color:#ffffff;">Copyright © 2014</p>
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
	
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
</body>
</html>
