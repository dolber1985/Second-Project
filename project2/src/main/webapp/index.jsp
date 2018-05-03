
<<<<<<< HEAD

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
=======
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

>>>>>>> 5230191adcdc145f01bea61f3d126f283dc3d673
<html lang="en" xmlns="http://www.w3.org/1999/xhtml"
	  xmlns:h="http://xmlns.jcp.org/jsf/html"
	  xmlns:f="http://xmlns.jcp.org/jsf/core"
	  xmlns:a="http://xmlns.jcp.org/jsf/passthrough">

<<<<<<< HEAD
<head>
	<title> Super Relax </title>
	<link rel="stylesheet" type="text/css" media="all" href="/resources/css/bootstrap.css" />
=======

<head>
	<title> Super Relax </title>
	<link href="../webapp/resources/static/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
>>>>>>> 5230191adcdc145f01bea61f3d126f283dc3d673
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<!-- <script src="js/jquery.min.js" ></script> -->
	<!-- Custom Theme files -->
	<!--theme-style-->
<<<<<<< HEAD
	<link rel="stylesheet" type="text/css" media="all" href="/resources/css/style.css" />
=======
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
>>>>>>> 5230191adcdc145f01bea61f3d126f283dc3d673
	<!--//theme-style-->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Mattress Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
	<!--
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	-->
	<!--fonts-->
	<link href='//fonts.googleapis.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>
	<link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'><!--//fonts-->
	<!-- start menu -->
<<<<<<< HEAD
	<link rel="stylesheet" type="text/css" media="all" href="/resources/css/memenu.css" />
=======
	<link href="css/memenu.css" rel="stylesheet" type="text/css" media="all" />
>>>>>>> 5230191adcdc145f01bea61f3d126f283dc3d673

</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="social">
				<ul>
					<li><a href="#"><i class="facebok"> </i></a></li>
					<li><a href="#"><i class="twiter"> </i></a></li>
					<li><a href="#"><i class="inst"> </i></a></li>
					<li><a href="#"><i class="goog"> </i></a></li>
					<div class="clearfix"></div>
				</ul>
			</div>
			<div class="header-left">

<<<<<<< HEAD
	<!--			<div class="search-box">
					<div id="sb-search" class="sb-search">
						<form action="#" method="post">
							<input class="sb-search-input" placeholder="Enter your search term..." type="search"  id="search">
							<input class="sb-search-submit" type="submit" value="">
							<span class="sb-icon-search"> </span>
						</form>
					</div>
				</div>
				-->
=======
				<!--			<div class="search-box">
                                <div id="sb-search" class="sb-search">
                                    <form action="#" method="post">
                                        <input class="sb-search-input" placeholder="Enter your search term..." type="search"  id="search">
                                        <input class="sb-search-submit" type="submit" value="">
                                        <span class="sb-icon-search"> </span>
                                    </form>
                                </div>
                            </div>
                            -->
>>>>>>> 5230191adcdc145f01bea61f3d126f283dc3d673

				<!-- search-scripts -->

				<!-- //search-scripts -->

				<div class="ca-r">
					<div class="cart box_1">
<<<<<<< HEAD
						<a href="index.jsp">
							    <div class="total">
								<span class="simpleCart_total"></span> </div>
								<img src="/resources/images/cart.png" alt=""/></h3>
=======
						<a href="./index.jsp">
							<div class="total">
								<span class="simpleCart_total"></span> </div>
							<img src="images/cart.png" alt=""/></h3>
>>>>>>> 5230191adcdc145f01bea61f3d126f283dc3d673
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Carrello Vuoto</a></p>

					</div>
				</div>
				<div class="clearfix"> </div>
			</div>

		</div>
	</div>
	<div class="container">
		<div class="head-top">
			<div class="logo">
				<h1><a href="index.jsp"> Super Relax </a></h1>
			</div>
			<div class=" h_menu4">
				<ul class="memenu skyblue">

						<%
						if ((session.getAttribute("user") == null) || (session.getAttribute("user") == "")) {
					%>

<<<<<<< HEAD
								<%}
								else {
					%>
					<li><a class="color1" href="#">Prodotti</a>
=======
						<%}
								else {
					%>
					<li><a class="color1" href="ProductsServlet">Prodotti</a>
>>>>>>> 5230191adcdc145f01bea61f3d126f283dc3d673

					</li>
						<%
						}
					%>


					<li class="grid"><a class="color2" href="ServiceController">Servizi</a>

					</li>

<<<<<<< HEAD
					<%
						if ((session.getAttribute("user") == null) || (session.getAttribute("user") == "")) {
					%>

					<li><a class="color4" href="/WEB-INF/views/login.jsp">Accedi</a></li>
					<li><a class="color4" href="sign_up.jsp">Registrati</a></li>

					<%
=======
						<%
						if ((session.getAttribute("user") == null) || (session.getAttribute("user") == "")) {
					%>

					<li><a class="color4" href="login.jsp">Accedi</a></li>
					<li><a class="color4" href="sign_up.jsp">Registrati</a></li>

						<%
>>>>>>> 5230191adcdc145f01bea61f3d126f283dc3d673
					}
					else {
					%>
					<li><a class="color4" href="LogoutController" onclick="if (!confirm('Sei sicuro di voler uscire? ')) return false"
						   action="">Logout</a></li>
<<<<<<< HEAD
						   
						   <li><a class="color8" href="EthereumController">Wallet</a></li>

					<%
						}
					%>

					</div>
				</ul>
			</div>

			<div class="clearfix"> </div>
		</div>
	</div>
</div>
=======

					<li><a class="color8" href="EthereumController">Wallet</a></li>

						<%
						}
					%>

			</div>
			</ul>
		</div>

		<div class="clearfix"> </div>
	</div>
</div>
</div>
>>>>>>> 5230191adcdc145f01bea61f3d126f283dc3d673
<div class="banner">
	<div class="container">
		<!-- <script src="js/responsiveslides.min.js"></script> -->
		<!--  <script type="">
            $(function () {
                $("#slider").responsiveSlides({
                    auto: true,
                    nav: true,
                    speed: 500,
                    namespace: "callbacks",
                    pager: true,
                });
            });
		</script>
<<<<<<< HEAD
		--> 
=======
		-->
>>>>>>> 5230191adcdc145f01bea61f3d126f283dc3d673
		<div  id="top" class="callbacks_container">
			<ul class="rslides" id="slider">
				<li>

					<div class="banner-text">
						<h3>Rilassati con i nostri servizi  </h3>
						<p> Scegli uno dei nostri servizi e passa indimenticabili momenti di relax </p>

					</div>

				</li>
				<li>

					<div class="banner-text">
						<h3>Ce ne sono molti</h3>
						<p>Se usufruirai dei nostri servizi potrai acquistare speciali articoli</p>


					</div>

				</li>
				<li>
					<div class="banner-text">
						<h3>Che bello, finalmente</h3>
						<p>Veramente molto relax nei nostri punti relax, complimenti</p>


					</div>

				</li>
			</ul>
		</div>

	</div>
</div>


</body>
</html>
