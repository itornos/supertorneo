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
                <td>Apellido</td>
                <td>Edad</td>
                <td>Sexo</td>
                <td>Estado</td>
                <td>Tarjetas Amarillas</td>
                <td>Tarjetas Rojas</td>
                <td>Corners</td>
                <td>Faltas</td>
            </tr>
            <?php

            $sql="SELECT * FROM arbitro ORDER BY nombre DESC";
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
                        <?php echo $mostrar['estado'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['tarj_am'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['tarj_roj'] ?>
                    </td>
                    <td>
                        <?php echo $mostrar['corners'] ?> </td>
                    <td>
                        <?php echo $mostrar['faltas'] ?>
                    </td>
                </tr>
                <?php
            }
        ?>
        </table>
        <?php
        exec("java -jar D:\Nueva carpeta\pp.jar arguments", $output);
        ?>
    </body>
</html>

