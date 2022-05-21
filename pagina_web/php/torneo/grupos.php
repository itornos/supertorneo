<?php

require_once "../conexion.php";

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
    <title>buscador_jugador</title>
    <link rel="stylesheet" href="../../css/nicepage.css" media="screen">
<link rel="stylesheet" href="../../css/grupos.css" media="screen">
    <script class="u-script" type="text/javascript" src="../../js/jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="../../js/nicepage.js" defer=""></script>
    <meta name="generator" content="Nicepage 4.8.2, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    
    <style>
      #foto{
        width: 20px;
        height: auto;
        max-height: 30px;
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
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="Casa.html" style="padding: 10px 20px;">Casa</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="About.html" style="padding: 10px 20px;">About</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="Contact.html" style="padding: 10px 20px;">Contact</a>
</li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-inner-container-layout u-sidenav-overflow">
                <div class="u-menu-close"></div>
                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Casa.html">Casa</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="About.html">About</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Contact.html">Contact</a>
</li></ul>
              </div>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
      </div></header>
    <section style="background-color: white;" class="u-align-center u-clearfix u-palette-5-dark-3 u-section-1" id="carousel_d01c">
      <div class="u-clearfix u-sheet u-sheet-1">
        <h1 style="color: black;" class="u-text u-text-1">FASE DE GRUPOS</h1>
        <?php

        $sql="SELECT DISTINCT grupo FROM equipo order by grupo";
        $result=$mysqli->query($sql);

        while($mostrar=mysqli_fetch_array($result)){
          if (strtoupper($mostrar['grupo']) == "Z") {
            ?><br><h1 style="color: black;">TODAVIA NO SE HA GENERADO EL SORTEO</h1><?php
            break;
          }else {
        ?>
        <h1 style="color: black;" class="u-align-left u-text u-text-2">GRUPO <?php echo strtoupper($mostrar['grupo']) ?></h1>
        <div class="u-expanded-width u-table u-table-responsive u-table-1">
          <table class="u-table-entity">
            <colgroup>
              <col width="30%">
              <col width="8%">
              <col width="8%">
              <col width="8%">
              <col width="8%">
              <col width="10%">
              <col width="10%">
              <col width="10%">
              <col width="10%">
            </colgroup>
            <thead class="u-align-center u-table-header u-white u-table-header-1">
              <tr style="height: 59px;">
                <th style="text-align: center;" class="u-align-left u-table-cell u-table-cell-1">EQUIPOS</th>
                <th class="u-palette-3-base u-table-cell u-table-cell-2">PJ</th>
                <th class="u-palette-3-base u-table-cell u-table-cell-3"><b>V</b>
                </th>
                <th class="u-palette-3-base u-table-cell u-table-cell-4">E</th>
                <th class="u-palette-3-base u-table-cell u-table-cell-5">D</th>
                <th class="u-palette-2-base u-table-cell u-table-cell-6">GF</th>
                <th class="u-palette-2-base u-table-cell u-table-cell-7"><b>GC</b>
                </th>
                <th class="u-palette-2-base u-table-cell u-table-cell-8">DG</th>
                <th class="u-palette-4-base u-table-cell u-table-cell-9">Pts</th>
              </tr>
            </thead>
            <tbody class="u-align-center u-palette-5-dark-3 u-table-body u-table-body-1">
              <?php

              $sql="SELECT * FROM equipo where grupo = '".$mostrar['grupo']."' order by puntos desc";
              $result2=$mysqli->query($sql);

              while($mostrar2=mysqli_fetch_array($result2)){

              ?>
              <tr style="height: 49px;">
                <td class="u-align-left u-border-1 u-border-palette-5-dark-2 u-first-column u-table-cell"><img id="foto" src="../../imagenes_equipos_jugadores/<?php echo $mostrar2['nombre'] ?>.png"><?php echo strtoupper($mostrar2['nombre']) ?></td>
                <td class="u-border-1 u-border-palette-5-dark-2 u-table-cell"><?php echo strtoupper($mostrar2['partidos_jugados']) ?></td>
                <td class="u-border-1 u-border-palette-5-dark-2 u-table-cell"><?php echo strtoupper($mostrar2['ganado']) ?><br>
                </td>
                <td class="u-border-1 u-border-palette-5-dark-2 u-table-cell"><?php echo strtoupper($mostrar2['empate']) ?></td>
                <td class="u-border-1 u-border-palette-5-dark-2 u-table-cell"><?php echo strtoupper($mostrar2['perdido']) ?></td>
                <td class="u-border-1 u-border-palette-5-dark-2 u-table-cell"><?php echo strtoupper($mostrar2['gol_favor']) ?></td>
                <td class="u-border-1 u-border-palette-5-dark-2 u-table-cell"><?php echo strtoupper($mostrar2['gol_contra']) ?></td>
                <td class="u-border-1 u-border-palette-5-dark-2 u-table-cell"><?php echo strtoupper($mostrar2['dif_goles']) ?></td>
                <td class="u-border-1 u-border-palette-5-dark-2 u-table-cell"><?php echo strtoupper($mostrar2['puntos']) ?></td>
              </tr>
              <?php } ?>
            </tbody>
          </table>
        </div>
        <br><br><br><br><br>
        <?php }} ?>
        <br><br><br><br>
      </div>
    </section>
    <section class="u-align-center u-clearfix u-section-2" id="carousel_d548">
      <div class="u-clearfix u-sheet u-valign-middle-xs u-sheet-1"></div>
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