<<<<<<< HEAD
<?php

  $conexion=mysqli_connect('localhost','root','','torneo');

?>

    <!DOCTYPE html>
    <html lang="en" dir="ltr">

    <head>
        <meta charset="utf-8">
        <title></title>
    </head>

    <body>
        <table border="1">
            <tr>
                <td>nombre</td>
                <td>Partidos Jugados</td>
                <td>Ganados</td>
                <td>Empate</td>
                <td>Perdidos</td>
                <td>Goles a Favor</td>
                <td>Goles en contra</td>
                <td>Dif de goles</td>
                <td>Puntos</td>
                <td>Grupo</td>
            </tr>
            <?php

            $sql="SELECT * FROM equipo ORDER BY puntos DESC";
            $result=mysqli_query($conexion,$sql);

            while($mostrar=mysqli_fetch_array($result)){

        ?>

                <tr>
                    <td>
                        <?php echo $mostrar['nombre'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['PartidosJugados'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['Ganado'] ?> </td>
                    <td>
                        <?php echo $mostrar['empate'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['perdido'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['gol_favor'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['gol_contra'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['dif_goles'] ?> </td>
                    <td>
                        <?php echo $mostrar['puntos'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['grupo'] ?>
                    </td>
                </tr>
                <?php
            }
        ?>
        </table>
    </body>

=======
<?php

  $conexion=mysqli_connect('localhost','root','','torneo');

?>

    <!DOCTYPE html>
    <html lang="en" dir="ltr">

    <head>
        <meta charset="utf-8">
        <title></title>
    </head>

    <body>
        <table border="1">
            <tr>
                <td>nombre</td>
                <td>Partidos Jugados</td>
                <td>Ganados</td>
                <td>Empate</td>
                <td>Perdidos</td>
                <td>Goles a Favor</td>
                <td>Goles en contra</td>
                <td>Dif de goles</td>
                <td>Puntos</td>
                <td>Grupo</td>
            </tr>
            <?php

            $sql="SELECT * FROM equipo ORDER BY puntos DESC";
            $result=mysqli_query($conexion,$sql);

            while($mostrar=mysqli_fetch_array($result)){

        ?>

                <tr>
                    <td>
                        <?php echo $mostrar['nombre'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['PartidosJugados'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['Ganado'] ?> </td>
                    <td>
                        <?php echo $mostrar['empate'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['perdido'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['gol_favor'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['gol_contra'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['dif_goles'] ?> </td>
                    <td>
                        <?php echo $mostrar['puntos'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['grupo'] ?>
                    </td>
                </tr>
                <?php
            }
        ?>
        </table>
    </body>

>>>>>>> cc81bb1931523740b6e9ef755088ee8a65954ccb
    </html>