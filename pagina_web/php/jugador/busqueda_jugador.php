<?php 
error_reporting(E_ALL ^ E_NOTICE ^ E_WARNING);
require_once "../conexion.php";
$tabla="";
$termino= "";
if(isset($_POST['productos']))
{
	$termino=$mysqli->real_escape_string($_POST['productos']);
	$consulta="SELECT * FROM jugador WHERE 
	nombre LIKE '%".$termino."%' OR
	apellido LIKE '%".$termino."%' OR
	equipo LIKE '%".$termino."%' OR
	dorsal LIKE '%".$termino."%'";
}
$consultaBD=$mysqli->query($consulta);
if($consultaBD->num_rows>=1){
	?>
		<style> 
			table{
				position: absolute;
				z-index: 10;
				backdrop-filter: blur(20px);
			}
			td,th{
				text-align: center;
				padding-left:15mm;
			}
			#lupa{
				background: url(../../images/lupa.png) no-repeat center;
				background-size: 30px 30px;
				width: 30px;
				height: 30px;
				border: 0px;
				-webkit-transition:all .4s ease; /* Safari y Chrome */
				-moz-transition:all .4s ease; /* Firefox */
				-o-transition:all .4s ease; /* IE 9 */
				-ms-transition:all .4s ease; /* Opera */
			}
			#lupa:hover {
				-webkit-transform:scale(1.2);
				-moz-transform:scale(1.2);
				-ms-transform:scale(1.2);
				-o-transform:scale(1.2);
				transform:scale(1.2);
			}
		</style>
		<table>
		<thead>
		<tr>
			<th>NOMBRE</th>
			<th>APELLIDO</th>
			<th>EQUIPO</th>
			<th>DORSAL</th>
		</tr>
		</thead><br>
		<tbody>
	<?php 
	while($fila=mysqli_fetch_array($consultaBD)){
		$cont++;
	?>
		<tr id="asd">
			<td><?php echo $fila['nombre'] ?></td>
			<td><?php echo $fila['apellido'] ?></td>
			<td><?php echo $fila['equipo'] ?></td>	
			<td><?php echo $fila['dorsal'] ?></td>
			<td id="tdlupa">
			<form action="datos_jugador.php" method="POST" class="u-clearfix u-form-spacing-10  u-inner-form" style="padding: 10px;" name="form-3">
				<div class="u-form-group u-form-name u-label-none">
				<button id="lupa" name="botonaso" type="submit" value="<?php echo $fila['ID_Jugador']?>"></button>
				</div>
			</form>
			</td>
		</tr>
		<?php
		if ($cont==9) {
			break;
		}
	}
	echo "</tbody>
	</table>";
}else{
	echo "<center><h4>No hemos encotrado ningun registro con la palabra "."<strong class='text-uppercase'>".$termino."</strong><h4><center>";
}
?>