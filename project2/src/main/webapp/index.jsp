<!--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>UniMarina Economia - Log in</title>
</head>
<body>
<form action="loginController" method="post">
	Enter Email : <input type="text" name="username"> <BR>
	Enter Password : <input type="password" name="password"> <BR>
	<input type="submit" value="Accedi"/>
</form>

<form action="loginController/logout" method="get">
	<input type="submit" value="Registrati"/>
</form>
</body>
</html>

author: Boostraptheme
author URL: https://boostraptheme.com
License: Creative Commons Attribution 4.0 Unported
License URL: https://creativecommons.org/licenses/by/4.0/
-->

<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Unimarina - Università Telematica di Economia</title>
    <link rel="shortcut icon" href="/resources/img/logo.png">

    <!-- Global Stylesheets -->
    <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i" rel="stylesheet">
    <link href="/resources/css/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/resources/font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/resources/css/animate/animate.min.css">
    <link rel="stylesheet" href="/resources/css/owl-carousel/owl.carousel.min.css">
    <link rel="stylesheet" href="/resources/css/owl-carousel/owl.theme.default.min.css">
    <link rel="stylesheet" href="/resources/css/style.css">
  </head>

  <body id="page-top">

<!--====================================================
                         HEADER
======================================================--> 

    <header>

      <!-- Top Navbar  -->
      <div class="top-menubar">
        <div class="topmenu">
          <div class="container">
            <div class="row">
              <div class="col-md-7">
                
              </div> 
              <div class="col-md-5">
                <ul class="list-inline top-data">
                
                  <li><a href="#" class="log-top" data-toggle="modal" data-target="#login-modal">Accedi/Registrati</a></li>  
                </ul>
              </div>
            </div>
          </div>
        </div> 
      </div> 
      
      <!-- Navbar -->
      <nav class="navbar navbar-expand-lg navbar-light" id="mainNav" data-toggle="affix">
        <div class="container">
          <a class="navbar-brand smooth-scroll" href="index.jsp">
            <img src="/resources/img/logo.png" alt="logo">
          </a> 
		  <p>
<br><br>
<br><br>
<br><br>
<p>
	
          <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"> 
                <span class="navbar-toggler-icon"></span>
          </button>  
          <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item" ><a class="nav-link smooth-scroll" href="index.jsp">Home</a></li>
                <li class="nav-item dropdown" >
     
                </li>
                <li class="nav-item" ><a class="nav-link smooth-scroll" href="about.jps">Chi siamo</a></li>
                <li class="nav-item dropdown" >
       
                </li>
        
                <li>
                  <i class="search fa fa-search search-btn"></i>
                  <div class="search-open">
                    <div class="input-group animated fadeInUp">
                      <input type="text" class="form-control" placeholder="Search" aria-describedby="basic-addon2">
                      <span class="input-group-addon" id="basic-addon2">Go</span>
                    </div>
                  </div>
                </li> 
                <li>
                 
                </li>
            </ul>  
          </div>
        </div>
      </nav>
    </header> 

<!--====================================================
                    LOGIN OR REGISTER
======================================================-->
    <section id="login">
      <div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
          <div class="modal-dialog">
              <div class="modal-content">
                  <div class="modal-header" align="center">
                      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                          <span class="fa fa-times" aria-hidden="true"></span>
                      </button>
                  </div>
                  <div id="div-forms">
                      <form id="login-form" action="loginController" method="post">
                          <h3 class="text-center">Accedi</h3>
                          <div class="modal-body">
                              <label for="login_username" floating>Email Istituzionale</label>
                              <input id="login_username" class="form-control" type="text" placeholder="" name="username" required>
                              <label for="login_password">Password</label>
                              <input id="login_password" class="form-control" type="password" placeholder="" name="password" required>
                              <div class="checkbox">
                                  <label>
                                      <input type="checkbox"> Remember me
                                  </label>
                              </div>
                          </div>
                          <div class="modal-footer text-center">
                              <div>
                                  <button type="submit" class="btn btn-general btn-white">Accedi</button>
                              </div>
                              <div>
                                  <button id="login_register_btn" type="button" class="btn btn-link">Registrati</button>
                              </div>
                          </div>
                      </form>
                      <form id="register-form" style="display:none;" action="/registerController" method="post">
                          <h3 class="text-center">Registrati</h3>
                          <div class="modal-body"> 
                              <label for="register_name">Nome</label>
                              <input id="register_name" class="form-control" type="text" placeholder="" required maxlength="32" pattern="[A-Za-z]*$">

                              <label for="register_cognome">Cognome</label>
                              <input id="register_cognome" class="form-control" type="text" placeholder="" required maxlength="32" pattern="[A-Za-z]*$">

                              <label for="register_data_di_nascita">Data di nascita</label>
                              <input id="register_data_di_nascita" class="form-control" type="date" placeholder="" required>

							  <label for="register_email_personale">Email personale</label>
                              <input id="register_email_personale" class="form-control" type="password" placeholder="" require maxlength="28">

                              <label for="register_password">Password</label> 
                              <input id="register_password" class="form-control" type="password" placeholder="" required maxlength="8">
                          </div>
                          <div class="modal-footer">
                              <div>
                                  <button type="submit" class="btn btn-general btn-white">Registrati</button>
                              </div>
                              <div>
                                  <button id="register_login_btn" type="button" class="btn btn-link">Accedi</button>
                              </div>
                          </div>
                      </form>
                  </div>
              </div>
          </div>
      </div>
    </section>      

<!--====================================================
                         HOME
======================================================-->
    <section id="home">
      <div id="carousel" class="carousel slide carousel-fade" data-ride="carousel"> 
        <!-- Carousel items -->
        <div class="carousel-inner">
            <div class="carousel-item active slides">
              <div class="overlay"></div>
              <div class="slide-1"></div>
                      
            </div> 
        </div> 
      </div> 
    </section> 

<!--====================================================
                        ABOUT
======================================================-->
    <section id="about" class="about">
      <div class="container">
        <div class="row title-bar">
          <div class="col-md-12">
		   <center>
		   <img src="/resources/img/logo.png">
		   </center>
        
            <p class="wow fadeInUp" data-wow-delay="0.4s">L'università telematica di Economia e Management, con la sua offerta didattica, mira a rispondere alla esigenza di formazione professionale e scientifica della società e del mercato del lavoro relativamente ai settori aziendale, economico in senso lato e statistico. Gli studenti possono approfondire le proprie conoscenze nell'ambito di quattro aree principali: economica, economico-aziendale, statistico-matematica e giuridica.</p>
            
          </div>
        </div>
      </div>  
      <!-- About right side withBG parallax -->
      <div class="container-fluid">
        <div class="row"> 
          <div class="col-md-4 bg-starship">
            <div class="about-content-box wow fadeInUp" data-wow-delay="0.3s">
              <i class="fa fa-user-plus"></i>
              <h5>Effettua la registazione</h5>
              <p class="desc">Inserisci i tuoi dati personali, una email e una password</p>
			  <p class="desc">Ti verrà fornita una email istituzionale</p>
            </div>
          </div> 
          <div class="col-md-4 bg-chathams">
            <div class="about-content-box wow fadeInUp" data-wow-delay="0.5s">
              <i class="fa fa-user-circle-o"></i>
              <h5>Effettua il login</h5>
              <p class="desc">Assicurati di aver correttamente inserito i dati</p>
            </div>
          </div> 
          <div class="col-md-4 bg-matisse">
            <div class="about-content-box wow fadeInUp" data-wow-delay="0.7s">
              <i class="fa fa-list-ul"></i>
              <h5>Crea il tuo piano di studi</h5>
              <p class="desc">Scegli 10 esami tra i 30 disponibili</p>
            </div>
          </div> 
        </div> 
      </div>       
    </section> 
	

<p>
<br><br>
<br><br>
<br><br>
<p>
<!--====================================================
                      FOOTER
======================================================--> 
    <footer> 
	
        <div id="footer-s1" class="footer-s1">
          <div class="footer">
            <div class="container">
              <div class="row">
                <!-- About Us -->
                <div class="col-md-3 col-sm-6 ">
                  <div><img src="/resources/img/logo-w.png" alt="" class="img-fluid"></div>
                  <ul class="list-unstyled comp-desc-f">
                     <li><p>      Investi sul tuo futuro! <br>
					 Iscriviti al nostro corso di laurea online </p></li> 
                  </ul><br> 
                </div>
                <!-- End About Us -->

                
                <!-- End Recent list -->

                <!-- Recent Blog Entries -->
                <div class="col-md-3 col-sm-6 ">
                  
                </div>
                <!-- End Recent Blog Entries -->
<!-- Recent News -->
                <div class="col-md-3 col-sm-6 ">
                  <div class="heading-footer"><h2>Link utili</h2></div>
                  <ul class="list-unstyled link-list">

                    <li><a href="about.jsp">Chi siamo</a></li>
                    <li><a href="project.jsp">Esami</a></li>
                    
                  </ul>
                </div>
                <!-- Latest Tweets -->
                <div class="col-md-3 col-sm-6">
                  <div class="heading-footer"><h2>Ci trovi qui</h2></div>
                  <address class="address-details-f">
                    Giovanni Pezzotti, 8 Milano (IT)<br>
                    Telefono: 02 123 3456 <br>
                    
                    Email: <a href="mailto:info@unimarina.it" class="">info@unimarina.it</a>
                  </address>  
                  
                </div>
                <!-- End Latest Tweets -->
              </div>
            </div><!--/container -->
          </div> 
        </div>

        <div id="footer-bottom">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div id="footer-copyrights">
                            <p>Copyrights &copy; 2018 All Rights Reserved by Unimarina. <a href="#">Privacy Policy</a> <a href="#">Terms of Services</a></p>
                        </div>
                    </div> 
                </div>
            </div>
        </div>
        <a href="#home" id="back-to-top" class="btn btn-sm btn-green btn-back-to-top smooth-scrolls hidden-sm hidden-xs" title="home" role="button">
            <i class="fa fa-angle-up"></i>
        </a>
    </footer>

    <!--Global JavaScript -->
    <script src="/resources/js/jquery/jquery.min.js"></script>
    <script src="/resources/js/popper/popper.min.js"></script>
    <script src="/resources/js/bootstrap/bootstrap.min.js"></script>
    <script src="/resources/js/wow/wow.min.js"></script>
    <script src="/resources/js/owl-carousel/owl.carousel.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="/resources/js/jquery-easing/jquery.easing.min.js"></script> 
    <script src="/resources/js/custom.js"></script> 
  </body>

</html>


