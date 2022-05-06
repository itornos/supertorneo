<?php 

error_reporting(E_ALL ^ E_NOTICE ^ E_WARNING);

require_once "../conexion.php";
$tabla="";
$termino= "";
if(isset($_POST['productos']))
{
	$termino=$mysqli->real_escape_string($_POST['productos']);
	$consulta="SELECT * FROM equipo WHERE 
	nombre LIKE '%".$termino."%'";
}
$consultaBD=$mysqli->query($consulta);
if($consultaBD->num_rows>=1){
	?>
	<style> 
		#tablabuscador{
			position: absolute;
			z-index: 10;
			backdrop-filter: blur(20px);
		}
		#tablabuscador td,th{
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
	<table id="tablabuscador">
		<thead>
		<tr>
			<th class='bg-info' scope='col'>NOMBRE</th>
		</tr>
		</thead><br>
		<tbody>

	<?php 
	while($fila=mysqli_fetch_array($consultaBD)){
		$cont++;
	?>

		<tr id="asd">
			<td><?php echo strtoupper($fila['nombre']) ?></td>
			<td id="tdlupa">
			<form action="datos_equipo.php" method="POST" class="u-clearfix u-form-spacing-10  u-inner-form" style="padding: 10px;" name="form-3">
				<div class="u-form-group u-form-name u-label-none">
				<button id="lupa" name="botonaso" type="submit" value="<?php echo $fila['nombre'] ?>"></button>
				</div>
			</form>
			</td>
		</tr>
	<?php
		if ($cont==5) {
			break;
		}
	}
	?>
	</tbody>
	</table>

	<?php 
}else if (strlen ($termino) != 0) {
	?><center><h4>No hemos encotrado ningun registro con la palabra <strong class='text-uppercase'><?php echo $termino ?></strong><h4><center><?php
}
?>