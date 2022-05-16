<!DOCTYPE html>
<html lang="es">
<head>
    <title>Document</title>
    <style>
        table{
            padding-top: 100px;
            border-spacing: 0px 10%;
            width: 100%;
            height: 100%;
            max-height: 500px;
        }
        td{
            padding: 0.8% 0;
            padding-left: 12px;
            vertical-align: middle;
            height: 60px;
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
            padding-left: 22%;
            height: 40px;
            width: 40px;
        }
        #asd{
            float: right;
            padding-right: 13%;
        }
        
    </style>
</head>
<body>
    <table>
    <?php
        error_reporting(E_ALL ^ E_NOTICE);
        $equipos = array("Madrid","barsa","ayax","444","555","666","777","888","999","101010","111111","121212","131313","141414","151515","161616","Madrid","barsa","ayax","444","555","666","777","888","999","101010","111111","121212","131313","141414","151515","161616","Madrid","barsa","ayax","444","555","666","777","888","999","101010","111111","121212","131313","141414","151515","161616","Madrid","barsa","ayax","444","555","666","777","888","999","101010","111111","121212","131313","141414","151515","161616");
        $posicion = array();
        $tamaño = sizeof($equipos);
        $primera = true;
        $pos = 0;
        $cont=0;

        while ($tamaño%2==0) {
            $tamaño = $tamaño/2;
            $cont++;
        }
        
        $tamaño = sizeof($equipos);
        $tabla = ($cont*sizeof($equipos))*2;

            //PRIMERA ELIMINATORIA
        for ($i = 1; $i <= $tamaño ; $i++) {
            if($i%2!=0 && $i){
                array_push($posicion, $i);
            }
        }

            //EL RESTO ELIMINATORIAS
        for ($i = $tamaño+1; $i <= $tabla/2 ; $i++) {
            if (((($posicion[$pos]+$posicion[$pos+1])/2)+$tamaño)==$i) {
                    $pos += 2;
                    array_push($posicion, $i);
            }
        }

        $pos = 0;
        $lleno = false;
    
        $conexion=mysqli_connect('localhost','root','','torneo');

        $sql="SELECT * FROM equipo";
        $result=mysqli_query($conexion,$sql);

        for ($i=1; $i < $tamaño; $i++) { 
            ?>
            <tr>
            <?php
            for ($j=$i; $j <= $tabla-($tamaño-$i); $j+=$tamaño) { 
            foreach ($posicion as &$pos) {
                if ($pos==$j || $tabla-$pos==$j) {
                    $mostrar=mysqli_fetch_array($result);
                    ?>
                    <td class="llena"><img id="foto" src="../../imagenes_equipos_jugadores/<?php echo $mostrar['nombre'] ?>.png"><div id="asd">2</div> </td>
                    <?php
                    $lleno = true; 
                }
            }
            if (!$lleno) {
            ?>
                <td class="vacio"><?php echo $j ?></td>
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
