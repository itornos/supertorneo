<<<<<<< HEAD
<?php 
error_reporting(E_ALL ^ E_NOTICE ^ E_WARNING);
require_once "conexion.php";
$tabla="";
$consulta=" SELECT * FROM productostda LIMIT 0";
$termino= "";
if(isset($_POST['productos']))
{
	$termino=$mysqli->real_escape_string($_POST['productos']);
	$consulta="SELECT * FROM jugador WHERE 
	nombre LIKE '%".$termino."%' OR
	apellido LIKE '%".$termino."%' OR
	equipo LIKE '%".$termino."%'";
}
$consultaBD=$mysqli->query($consulta);
if($consultaBD->num_rows>=1){
	echo "
	<style> 
		table{
			border-collapse:collapse;
		}
		tr:hover {
		background-color: #339FFF;
		border: solid #339FFF;
	}
	</style>
	<table style .pito tr:hover {
		background-color: #ffff99;
	}class='responsive-table table table-hover table-bordered pito'>
	<thead>
	<tr>
	<th class='bg-info' scope='col'>NOMBRE</th>
	<th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
	<th class='bg-info' scope='col'>APELLIDO</th>
	<th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
	<th class='bg-info' scope='col'>EQUIPO</th>
	<th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
	<th class='bg-info' scope='col'>DORSAL</th>
	</tr>
	</thead><br>
	<tbody>";
	while($fila=mysqli_fetch_array($consultaBD)){
		echo 
		"<tr onclick=\"test(".$fila['ID_Jugador'].",".$nombre.",".$fila['ID_nombre'].",".$fila['ID_Jugador'].",".$fila['ID_Jugador'].")\">
			<td>"
			.$fila['nombre'].
			"</td>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>	
			<td>".$fila['apellido']."</td>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>	
			<td>".$fila['equipo']."</td>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>	
			<td>".$fila['dorsal']."</td>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
			<td>
			<form action=\"datos.php\" method=\"POST\" class=\"u-clearfix u-form-spacing-10  u-inner-form\" style=\"padding: 10px;\" name=\"form-3\">
				<div class=\"u-form-group u-form-name u-label-none\">
				<button style=\"background-color: width:50px;\" name=\"botonaso\" type=\"submit\" value=\"".$fila['ID_Jugador']."\">Ver Jugador</button>
				</div>
			</form>
			</td>
		</tr>";
	}
	echo "</tbody>
	</table>";
}else{
	echo "<center><h4>No hemos encotrado ningun registro con la palabra "."<strong class='text-uppercase'>".$termino."</strong><h4><center>";
}
=======
<?php 
error_reporting(E_ALL ^ E_NOTICE ^ E_WARNING);
require_once "conexion.php";
$tabla="";
$consulta=" SELECT * FROM productostda LIMIT 0";
$termino= "";
if(isset($_POST['productos']))
{
	$termino=$mysqli->real_escape_string($_POST['productos']);
	$consulta="SELECT * FROM jugador WHERE 
	nombre LIKE '%".$termino."%' OR
	apellido LIKE '%".$termino."%' OR
	equipo LIKE '%".$termino."%'";
}
$consultaBD=$mysqli->query($consulta);
if($consultaBD->num_rows>=1){
	echo "
	<table class='responsive-table table table-hover table-bordered'>
	<thead>
	<tr>
	<th class='bg-info' scope='col'>NOMBRE</th>
	<th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
	<th class='bg-info' scope='col'>APELLIDO</th>
	<th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
	<th class='bg-info' scope='col'>EQUIPO</th>
	<th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
	<th class='bg-info' scope='col'>DORSAL</th>
	</tr>
	</thead><br>
	<tbody>";
	while($fila=$consultaBD->fetch_array(MYSQLI_ASSOC)){
		echo 
		"<tr>
			<td>".$fila['nombre']."</td>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>	
			<td>".$fila['apellido']."</td>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>	
			<td>".$fila['equipo']."</td>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>	
			<td>".$fila['dorsal']."</td>
		</tr>";
	}
	echo "</tbody>
	</table>";
}else{
	echo "<center><h4>No hemos encotrado ningun registro con la palabra "."<strong class='text-uppercase'>".$termino."</strong><h4><center>";
}
>>>>>>> cc81bb1931523740b6e9ef755088ee8a65954ccb
?>