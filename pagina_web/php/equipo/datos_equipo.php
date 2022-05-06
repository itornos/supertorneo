<?php 
    
    $conexion=mysqli_connect('localhost','root','','torneo');
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
    <title>buscador_equipos</title>
    <link rel="stylesheet" href="../../css/nicepage.css" media="screen">
<link rel="stylesheet" href="../../css/buscador_equipos.css" media="screen">
    <script class="u-script" type="text/javascript" src="../../js/jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="../../js/nicepage.js" defer=""></script>
    <script src="../../js/jquery-3.4.1.min.js"></script>
	  <script src="../../js/bootstrap.min.js"></script>
	  <script src="../../js/buscar_equipo.js"></script>
    <meta name="generator" content="Nicepage 4.8.2, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    <link id="u-page-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i|Roboto+Condensed:300,300i,400,400i,700,700i">
    
    <style>
      #pitoh1{
        position: absolute;
        margin: 2.75% 0% 0% 20%;
      }

      .menusticky {
        background-color: #fff;
        position: sticky;
        top: 0;
        z-index: 100;
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
  <body class="u-body u-xl-mode"><header class="u-clearfix u-header u-header" id="sec-206f"><div class="u-clearfix u-sheet u-sheet-1">
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
    <h1 class="u-text-default u-text-1" id="pitoh1">Buscar Equipo</h1>
      <div class="u-clearfix u-sheet u-valign-middle u-sheet-1">
      <div class="u-form u-form-1">
          <form action="buscador_equipos.php" method="POST" class="u-clearfix u-form-spacing-10  u-inner-form" style="padding: 10px;" source="email" name="form-3">
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
    require_once "../conexion.php";
    
    $sql="SELECT * FROM equipo where nombre='".$_POST['botonaso']."'";
    $result=mysqli_query($conexion,$sql);

    $mostrar=mysqli_fetch_array($result);
    ?>

    <section class="u-align-center u-clearfix u-section-2" id="carousel_d548">
      <div class="u-clearfix u-sheet u-valign-middle-xs u-sheet-1">
        <div class="u-container-style u-group u-shape-rectangle u-group-1">
          <div class="u-container-layout u-container-layout-1">
            <img src="../../imagenes_equipos_jugadores/<?php echo $mostrar['nombre'] ?>.png" alt="" class="u-expanded-width u-image u-image-contain u-image-default u-image-1" data-image-width="354" data-image-height="354">
          </div>
        </div>
        <h1 class="u-align-center u-text u-text-1"><?php echo strtoupper($mostrar['nombre']) ?></h1>
        <h2 class="u-align-center u-text u-text-2">Listado de jugadores<br>
        </h2>
        <div class="u-list u-list-1">
          <div class="u-repeater u-repeater-1">
            <div class="u-container-style u-list-item u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-2"><span class="u-file-icon u-icon u-spacing-16 u-icon-1"><img src="../../images/1250694.png" alt=""></span>
                <p class="u-text u-text-3"><?php echo $mostrar['partidos_jugados'] ?></p>
                <h4 class="u-text u-text-4">PARTIDOS JUGADOS</h4>
              </div>
            </div>
            <div class="u-container-style u-list-item u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-3"><span class="u-file-icon u-icon u-spacing-16 u-icon-2"><img src="../../images/748113.png" alt=""></span>
                <p class="u-text u-text-5"><?php echo $mostrar['ganado'] ?></p>
                <h4 class="u-text u-text-6">GANADOS</h4>
              </div>
            </div>
            <div class="u-container-style u-list-item u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-4"><span class="u-file-icon u-icon u-spacing-16 u-icon-3"><img src="../../images/43472.png" alt=""></span>
                <p class="u-text u-text-7"><?php echo $mostrar['empate'] ?></p>
                <h4 class="u-text u-text-8">EMPATES</h4>
              </div>
            </div>
            <div class="u-container-style u-list-item u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-5"><span class="u-file-icon u-icon u-spacing-16 u-icon-4"><img src="../../images/1828901.png" alt=""></span>
                <p class="u-text u-text-9"><?php echo $mostrar['perdido'] ?></p>
                <h4 class="u-text u-text-10">PERDIDOS</h4>
              </div>
            </div>
            <div class="u-container-style u-list-item u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-6"><span class="u-file-icon u-icon u-spacing-16 u-icon-5"><img src="../../images/2726007.png" alt=""></span>
                <p class="u-text u-text-11"><?php echo $mostrar['gol_favor'] ?></p>
                <h4 class="u-text u-text-12">GOLES A FAVOR</h4>
              </div>
            </div>
            <div class="u-container-style u-list-item u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-7"><span class="u-file-icon u-icon u-spacing-16 u-icon-6"><img src="../../images/7266255.png" alt=""></span>
                <p class="u-text u-text-13"><?php echo $mostrar['gol_contra'] ?></p>
                <h4 class="u-text u-text-14">GOLES EN CONTRA</h4>
              </div>
            </div>
            <div class="u-container-style u-list-item u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-8"><span class="u-file-icon u-icon u-spacing-16 u-icon-7"><img src="../../images/5090744.png" alt=""></span>
                <p class="u-text u-text-15"><?php echo $mostrar['dif_goles'] ?></p>
                <h4 class="u-text u-text-16">DIF DE GOLES</h4>
              </div>
            </div>
            <div class="u-container-style u-list-item u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-9"><span class="u-file-icon u-icon u-spacing-16 u-icon-8"><img src="../../images/419952.png" alt=""></span>
                <p class="u-text u-text-17"><?php echo $mostrar['puntos'] ?></p>
                <h4 class="u-text u-text-18">PUNTOS</h4>
              </div>
            </div>
            <div class="u-container-style u-list-item u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-10"><span class="u-file-icon u-icon u-spacing-16 u-icon-9"><img src="../../images/33308.png" alt=""></span>
                <p class="u-text u-text-19"><?php echo $mostrar['grupo'] ?></p>
                <h4 class="u-text u-text-20">GRUPO&nbsp;</h4>
              </div>
            </div>
          </div>
        </div>
        <div class="u-table u-table-responsive u-table-1">
          <table>
            <colgroup>
              <col width="33%">
              <col width="37.7%">
              <col width="17.2%">
              <col width="12.1%">
            </colgroup>
            <thead class="u-grey-50 u-table-header u-table-header-1">
              <tr style="height: 52px;">
                <th class="u-border-1 u-border-grey-50 u-table-cell">Nombre</th>
                <th class="u-border-1 u-border-grey-50 u-table-cell">Apellido</th>
                <th class="u-border-1 u-border-grey-50 u-table-cell">Posicion</th>
                <th class="u-border-1 u-border-grey-50 u-table-cell">Dorsal</th>
                <th class="u-border-1 u-border-grey-50 u-table-cell">Ver</th>
              </tr>
            </thead>
            <tbody class="u-table-body">
              <?php
              $sql="SELECT * FROM jugador where equipo='".$_POST['botonaso']."'";
              $result=mysqli_query($conexion,$sql);
                
              while($mostrar=mysqli_fetch_array($result)){
              ?>
              <tr style="height: 36px;">
                <td class="u-border-1 u-border-grey-40 u-border-no-left u-border-no-right u-table-cell"><?php echo $mostrar['nombre'] ?></td>
                <td class="u-border-1 u-border-grey-40 u-border-no-left u-border-no-right u-table-cell"><?php echo $mostrar['apellido'] ?></td>
                <td class="u-border-1 u-border-grey-40 u-border-no-left u-border-no-right u-table-cell"><?php echo $mostrar['posicion'] ?></td>
                <td class="u-border-1 u-border-grey-40 u-border-no-left u-border-no-right u-table-cell"><?php echo $mostrar['dorsal'] ?></td>
                <td class="u-border-1 u-border-grey-40 u-border-no-left u-border-no-right u-table-cell">
                  <form action="../jugador/datos_jugador.php" method="POST" class="u-clearfix u-form-spacing-10  u-inner-form" name="form-3">
                  <div class="u-form-group u-form-name u-label-none\">
                  <button name="botonaso" type="submit" value="<?php echo $mostrar['ID_Jugador'] ?>">ver</button>
                  </div>
                  </form>
                </td>
              </tr>
              <?php 
              }
              ?>
            </tbody>
          </table>
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