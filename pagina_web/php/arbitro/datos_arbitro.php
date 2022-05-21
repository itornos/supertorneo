<?php 
    
    require_once "../conexion.php";
    error_reporting(E_ALL ^ E_NOTICE ^ E_WARNING); 

?>

<!DOCTYPE html>
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="Hosting for your business, ​Hosting solution with benefits, ​Fastest Hosting, We help and solve your business problem., 01, 02, 03, 04, faq, Start now &amp;amp;
don&amp;apos;t look back., Stop pushing your clients into a corner., $ 29, $ 59, $ 139, Contact us">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>buscador_arbitro</title>
    <link rel="stylesheet" href="../../css/nicepage.css" media="screen">
<link rel="stylesheet" href="../../css/buscador_jugador.css" media="screen">
    <script class="u-script" type="text/javascript" src="../../js/jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="../../js/nicepage.js" defer=""></script>
    <script src="../../js/jquery-3.4.1.min.js"></script>
	  <script src="../../js/bootstrap.min.js"></script>-
	  <script src="../../js/buscar_arbitro.js"></script>
    <meta name="generator" content="Nicepage 4.8.2, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    <link id="u-page-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i|Roboto+Condensed:300,300i,400,400i,700,700i">
    
    <style>

    .menusticky {
      background-color: #fff;
      position: sticky;
      top: 0;
      z-index: 100;
    }
    #ads {
      margin-top: -20px;
      margin-bottom: -40px;
    }
    </style>

    <script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "",
		"logo": "../../images/default-logo.png"
}</script>
    <meta name="theme-color" content="#478ac9">
    <meta property="og:title" content="buscador_jugador">
    <meta property="og:type" content="website">
  </head>
  <body class="u-body u-xl-mode"><header class="u-clearfix u-header u-header" id="sec-206f"><div class="u-clearfix u-sheet u-valign-middle u-sheet-1">
        <a href="https://nicepage.com" class="u-image u-logo u-image-1" data-image-width="80" data-image-height="40">
          <img src="../../images/default-logo.png" class="u-logo-image u-logo-image-1">
        </a>
        <nav class="u-menu u-menu-dropdown u-offcanvas u-menu-1">
          <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px;">
            <a class="u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="#">
              <svg class="u-svg-link" viewBox="0 0 24 24"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
              <svg class="u-svg-content" version="1.1" id="menu-hamburger" viewBox="0 0 16 16" x="0px" y="0px" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns="http://www.w3.org/2000/svg"><g><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
</g></svg>
            </a>
          </div>
          <div class="u-custom-menu u-nav-container">
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="http://torneo.local/casa.html" style="padding: 10px 20px;">Casa</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="About.html" style="padding: 10px 20px;">About</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="Contact.html" style="padding: 10px 20px;">Contact</a>
</li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-inner-container-layout u-sidenav-overflow">
                <div class="u-menu-close"></div>
                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="http://torneo.local/casa.html">Casa</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="About.html">About</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Contact.html">Contact</a>
</li></ul>
              </div>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
      </div></header>
    <div class="menusticky">  
    <section class="u-align-center u-clearfix u-grey-5 u-section-1" id="sec-c374">
      <div class="u-clearfix u-sheet u-sheet-1" id="ads">
        <h1 class="u-text u-text-default u-text-1">Buscar Arbitro</h1>
        <div class="u-form u-form-1">
          <form action="buscador_arbitros.php" method="POST" class="u-clearfix u-form-spacing-10 u-form-vertical u-inner-form" style="padding: 10px;" source="email" name="form-3">
          <div class="u-form-group u-form-name u-label-none">
              <label for="name-5485" class="u-label">Nombre</label>
              <input autocomplete="off" style="outline: none;" class="u-border-1 u-border-grey-30 u-border-no-left u-border-no-right u-border-no-top u-input u-input-rectangle u-input-1" type="text" name="termino" id="termino">
            
            <section class="content-area">
              <div class="table-area" id="tabla_resultados">
              </div>
            </section>
            </div>
          </form>
        </div>
      </div>
    </section>
</div>

    
    <?php 
    
    $sql="SELECT * FROM arbitro where ID_arbitro='".$_POST['botonaso']."'";
    $result=$mysqli->query($sql);

    $mostrar=mysqli_fetch_array($result);
    ?>
    
    <section class="u-clearfix u-grey-10 u-section-2" id="sec-dedf">
      <div class="u-clearfix u-expanded-width u-gutter-0 u-layout-wrap u-layout-wrap-1">
        <div class="u-layout" style="">
          <div class="u-layout-row" style="">
            <div class="u-align-center u-container-style u-image u-layout-cell u-right-cell u-size-33 u-size-xs-60 u-image-1" src="" data-image-width="900" data-image-height="600">
              <div class="u-container-layout u-valign-bottom u-container-layout-1" src=""></div>
            </div>
            <div class="u-align-center u-container-style u-layout-cell u-left-cell u-shape-rectangle u-size-27 u-size-xs-60 u-white u-layout-cell-2" src="">
              <div class="u-container-layout u-container-layout-2">
                <h1 class="u-custom-font u-font-montserrat u-text u-text-palette-1-base u-text-1"><?php echo $mostrar['nombre'] ?></h1>
                <h1 class="u-custom-font u-font-montserrat u-text u-text-palette-1-base u-text-2"><?php echo $mostrar['apellido'] ?></h1>
                <h1 class="u-custom-font u-font-montserrat u-text u-text-palette-1-base u-text-3">EDAD<br>
                </h1>
                <h1 class="u-custom-font u-font-montserrat u-text u-text-4">~<?php echo $mostrar['edad'] ?></h1>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

    <section class="u-align-center-lg u-align-center-md u-align-center-sm u-align-center-xl u-align-left-xs u-clearfix u-section-3" id="sec-1960">
      <div class="u-clearfix u-sheet u-sheet-1">
        <h2 class="u-align-center-lg u-align-center-md u-align-center-sm u-align-center-xl u-text u-text-default u-text-palette-1-base u-text-1"> DATOS DEL ARBITRO</h2>
        <div class="u-list u-list-1">
          <div class="u-repeater u-repeater-1">
            <div class="u-container-style u-list-item u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-1">
                <h5 class="u-custom-font u-font-roboto-condensed u-text u-text-palette-1-base u-text-2"> ESTADO</h5><span class="u-file-icon u-icon u-spacing-18 u-icon-1"><img src="../../images/68858.png" alt=""></span>
                <h5 class="u-custom-font u-font-roboto-condensed u-text u-text-3"> ~<?php echo $mostrar['estado'] ?></h5>
              </div>
            </div>
            <div class="u-container-style u-list-item u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-2">
                <h5 class="u-custom-font u-font-roboto-condensed u-text u-text-palette-1-base u-text-4"> SEXO</h5><span class="u-file-icon u-icon u-spacing-18 u-icon-2"><img src="../../images/505972.png" alt=""></span>
                <h5 class="u-custom-font u-font-roboto-condensed u-text u-text-5"> ~<?php echo $mostrar['sexo'] ?></h5>
              </div>
            </div>
          </div>
        </div>
        <div class="u-list u-list-2">
          <div class="u-repeater u-repeater-2">
            <div class="u-container-style u-list-item u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-3"><span class="u-file-icon u-icon u-spacing-18 u-icon-3"><img src="../../images/7153240.png" alt=""></span>
                <h5 class="u-custom-font u-font-roboto-condensed u-text u-text-palette-1-base u-text-6"> TARJETAS AMARILLAS</h5>
                <h5 class="u-custom-font u-font-roboto-condensed u-text u-text-7"> ~<?php echo $mostrar['tarj_am'] ?></h5>
              </div>
            </div>
            <div class="u-container-style u-list-item u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-4"><span class="u-file-icon u-icon u-spacing-18 u-icon-4"><img src="../../images/451718.png" alt=""></span>
                <h5 class="u-custom-font u-font-roboto-condensed u-text u-text-palette-1-base u-text-8">TARJETAS ROJAS</h5>
                <h5 class="u-custom-font u-font-roboto-condensed u-text u-text-9"> ~<?php echo $mostrar['tarj_roj'] ?></h5>
              </div>
            </div>
          </div>
        </div>
        <div class="u-list u-list-3">
          <div class="u-repeater u-repeater-3">
            <div class="u-container-style u-list-item u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-5"><span class="u-file-icon u-icon u-spacing-18 u-icon-5"><img src="../../images/182608.png" alt=""></span>
                <h5 class="u-custom-font u-font-roboto-condensed u-text u-text-palette-1-base u-text-10">FALTAS PITADAS</h5>
                <h5 class="u-custom-font u-font-roboto-condensed u-text u-text-black u-text-11"> ~<?php echo $mostrar['faltas'] ?></h5>
              </div>
            </div>
            <div class="u-container-style u-list-item u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-6"><span class="u-file-icon u-icon u-spacing-18 u-icon-6"><img src="../../images/451743.png" alt=""></span>
                <h5 class="u-custom-font u-font-roboto-condensed u-text u-text-palette-1-base u-text-12">CORNERS PITADOS<br>
                </h5>
                <h5 class="u-custom-font u-font-roboto-condensed u-text u-text-black u-text-13"> ~<?php echo $mostrar['corners'] ?></h5>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    
    
    <footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-e88d"><div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1">Texto de ejemplo&nbsp; xd lol<br>
        </p>
      </div></footer>
    <section class="u-backlink u-clearfix u-grey-80">
      <a class="u-link" href="html-templates" target="_blank">
        <span>HTML Template</span>
      </a>
      <p class="u-text">
        <span>created with</span>
      </p>
      <a class="u-link" href="html-website-builder" target="_blank">
        <span>HTML Website Builder</span>
      </a>. 
    </section>
  </body>
</html>