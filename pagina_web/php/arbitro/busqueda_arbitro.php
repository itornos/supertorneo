<?php 

error_reporting(E_ALL ^ E_NOTICE ^ E_WARNING);

require_once "../conexion.php";
$tabla="";
$termino= "";
if(isset($_POST['productos']))
{
	$termino=$mysqli->real_escape_string($_POST['productos']);
	$consulta="SELECT * FROM arbitro WHERE 
	nombre LIKE '%".$termino."%' OR
	apellido LIKE '%".$termino."%'";
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
	</tr>
	</thead><br>
	<tbody>";
	while($fila=mysqli_fetch_array($consultaBD)){
		echo 
		"<tr onclick=\"test(".$fila['ID_arbitro'].",".$nombre.",".$fila['ID_nombre'].",".$fila['ID_arbitro'].",".$fila['ID_arbitro'].")\">
			<td>"
			.$fila['nombre'].
			"</td>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>	
			<td>".$fila['apellido']."</td>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
			<td>
			<form action=\"datos_arbitro.php\" method=\"POST\" class=\"u-clearfix u-form-spacing-10  u-inner-form\" style=\"padding: 10px;\" name=\"form-3\">
				<div class=\"u-form-group u-form-name u-label-none\">
				<button style=\"background-color: width:50px;\" name=\"botonaso\" type=\"submit\" value=\"".$fila['ID_arbitro']."\">Ver Arbitro</button>
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
?>