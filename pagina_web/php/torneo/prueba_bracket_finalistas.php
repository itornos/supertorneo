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
        table{
            padding-top: 100px;
            border-spacing: 0px 10%;
            width: 100%;
            height: 100%;
            max-height: 500px;
        }
        td{
            padding-left: 12px;
            vertical-align: middle;
            height: 60px;
            padding-top: 15px;
        }
        .llena{
            padding-left: 15px;
            background-image: url("bracket.png");
            background-repeat: no-repeat;
            background-size: 100% 102%;
            font-family: sans-serif;
            font-size: 40px;
        }
        #foto{
            margin-left: 30px;
            height: 50px;
            width: 50px;
        }
        #asd{
            float: right;
            padding-right: 13%;
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
    <body class="u-body u-xl-mode">
    <header class="u-clearfix u-header u-header" id="sec-206f">
        <div class="u-clearfix u-sheet u-valign-middle u-sheet-1">
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
                    <ul class="u-nav u-unstyled u-nav-1">
                        <li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="http://torneo.local/casa.html" style="padding: 10px 20px;">Casa</a>
                        </li>
                        <li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="About.html" style="padding: 10px 20px;">About</a>
                        </li>
                        <li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="Contact.html" style="padding: 10px 20px;">Contact</a>
                        </li>
                    </ul>
                </div>
                <div class="u-custom-menu u-nav-container-collapse">
                    <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
                        <div class="u-inner-container-layout u-sidenav-overflow">
                            <div class="u-menu-close"></div>
                            <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2">
                                <li class="u-nav-item"><a class="u-button-style u-nav-link" href="http://torneo.local/casa.html">Casa</a>
                                </li>
                                <li class="u-nav-item"><a class="u-button-style u-nav-link" href="About.html">About</a>
                                </li>
                                <li class="u-nav-item"><a class="u-button-style u-nav-link" href="Contact.html">Contact</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
                </div>
            </nav>
        </div>
    </header>
    <table>
    <?php
    
        error_reporting(E_ALL ^ E_WARNING);
        
        $sql="SELECT * FROM clafinal";
        $result=$mysqli->query($sql);
        $posequipo = array();
        $equipos = array();

        while($mostrar=mysqli_fetch_array($result)){
            array_push($equipos,$mostrar['nombre']);
            array_push($posequipo,$mostrar['eliminatoria']);
        }


        $tamaño = sizeof($equipos);
        $cont=0;

        while ($tamaño%2==0) {
            $tamaño = $tamaño/2;
            $cont++;
        }

        $posicion = array();
        $tamaño = sizeof($equipos);
        $tabla = ($cont*sizeof($equipos))*2;
        $cont=0;

        //PRIMERA ELIMINATORIA
        for ($i = 1; $i <= $tamaño ; $i++) {
            if($i%2!=0 && $i){
                $cont++;
                $posicion += [$cont=>$i];
            }
        }

        $pos = 1;

            //EL RESTO ELIMINATORIAS
        while($element = current($posicion)) {
            $pro = key($posicion);
            next($posicion);
            $prim = key($posicion);
            if ($prim != null) {
                $posicion += [$pro.$prim=>((($posicion[$pro]+$posicion[$prim])/2)+$tamaño)];
            }
            next($posicion);
        }

        $lleno = false;
        $partidohecho = false;
        $auxPos = array();
        $auxPos = $posicion;
        $uno = "";

        for ($i=1; $i < $tamaño; $i++) { 
            ?>
            <tr>
            <?php
            for ($j=$i; $j <= $tabla-($tamaño-$i); $j+=$tamaño) { 
            foreach ($posicion as &$pos) {
                if ($pos==$j) {
                        
                    $pro = array_search( $pos , $posicion);                                   
                    
                    foreach ($posequipo as &$equip) {
                        $matriz1 = str_split($equip);
                        for ($k=0; $k < sizeof($matriz1); $k++) {               
                            $uno+=$matriz1[$k];
                            if ($uno == $pro) {

                                $partidohecho = true;

                                $sql="SELECT * FROM clafinal where eliminatoria=".$equip."";
                                $result=$mysqli->query($sql);
                                $mostrar=mysqli_fetch_array($result);

                                ?>
                                <td class="llena"><img id="foto" src="../../imagenes_equipos_jugadores/<?php echo $mostrar["nombre"] ?>.png"><div id="asd">2</div> </td>
                                <?php
                                break;
                            }
                        }
                        $uno="";
                    }
                    
                    if (!$partidohecho) {
                        ?>
                        <td class="llena"><div id="asd">PENDIENTE</div></td>
                        <?php
                    }else {
                        $partidohecho = false;
                    }

                    $lleno = true; 
                    break;

                }else if ($tabla-$pos==$j) {
                    $pro = array_search( $pos , $posicion);                                   
                    switch ($pro) {
                        case 1:
                            $pro = 5;
                            break;
                        case 2:
                            $pro = 6;
                            break;
                        case 3:
                            $pro = 7;
                            break;   
                        case 4:
                            $pro = 8;
                        break;
                    }
                    foreach ($posequipo as &$equip) {
                        $matriz1 = str_split($equip);
                        for ($k=0; $k < sizeof($matriz1); $k++) {               
                            $uno+=$matriz1[$k];
                            if ($uno == $pro) {

                                $partidohecho = true;

                                $sql="SELECT * FROM clafinal where eliminatoria=".$equip."";
                                $result=$mysqli->query($sql);
                                $mostrar=mysqli_fetch_array($result);

                                ?>
                                <td class="llena"><img id="foto" src="../../imagenes_equipos_jugadores/<?php echo $mostrar["nombre"] ?>.png"><div id="asd">2</div> </td>
                                <?php
                                break;
                            }
                        }
                        $uno="";
                    }
                    
                    if (!$partidohecho) {
                        ?>
                        <td class="llena"><div id="asd">PENDIENTE</div></td>
                        <?php
                    }else {
                        $partidohecho = false;
                    }

                    $lleno = true; 
                    break;
                }
            }
            if (!$lleno) {
            ?>
                <td class="vacio"></td>
            <?php
            }else{
                $lleno = false;
            }}
            ?>
            </tr>
            <?php
        }
    ?>
    </table>
</body>
</html>
