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
                <td>Nombre</td>
                <td>Apelldio</td>
                <td>Edad</td>
                <td>Sexo</td>
                <td>Nacionalidad</td>
                <td>Estado</td>
                <td>Posicion</td>
                <td>Equipo</td>
                <td>Dorsal</td>
                <td>PJ</td>
                <td>Goles</td>
                <td>Salario</td>
            </tr>
            <?php

            $sql="SELECT * FROM jugador ORDER BY equipo DESC";
            $result=mysqli_query($conexion,$sql);

            while($mostrar=mysqli_fetch_array($result)){

        ?>

                <tr>
                    <td>
                        <?php echo $mostrar['nombre'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['apellido'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['edad'] ?> </td>
                    <td>
                        <?php echo $mostrar['sexo'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['nacionalidad'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['estado'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['posicion'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['equipo'] ?> </td>
                    <td>
                        <?php echo $mostrar['dorsal'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['Partidos_jugados'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['Goles'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['salario'] ?>
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
                <td>Nombre</td>
                <td>Apelldio</td>
                <td>Edad</td>
                <td>Sexo</td>
                <td>Nacionalidad</td>
                <td>Estado</td>
                <td>Posicion</td>
                <td>Equipo</td>
                <td>Dorsal</td>
                <td>PJ</td>
                <td>Goles</td>
                <td>Salario</td>
            </tr>
            <?php

            $sql="SELECT * FROM jugador ORDER BY equipo DESC";
            $result=mysqli_query($conexion,$sql);

            while($mostrar=mysqli_fetch_array($result)){

        ?>

                <tr>
                    <td>
                        <?php echo $mostrar['nombre'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['apellido'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['edad'] ?> </td>
                    <td>
                        <?php echo $mostrar['sexo'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['nacionalidad'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['estado'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['posicion'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['equipo'] ?> </td>
                    <td>
                        <?php echo $mostrar['dorsal'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['Partidos_jugados'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['Goles'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['salario'] ?>
                    </td>
                </tr>
                <?php
            }
        ?>
        </table>
    </body>

>>>>>>> cc81bb1931523740b6e9ef755088ee8a65954ccb
    </html>