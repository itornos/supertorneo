<?php 
error_reporting(E_ALL ^ E_NOTICE ^ E_WARNING);
require_once "../conexion.php";
$tabla="";
$termino= "";
if(isset($_POST['productos']))
{
	$termino=$mysqli->real_escape_string($_POST['productos']);
	$consulta="SELECT * FROM partido WHERE 
	local LIKE '%".$termino."%' OR
	visitante LIKE '%".$termino."%' OR
	momentum LIKE '%".$termino."%'";
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
			<th>LOCAL</th>
			<th>VISITANTE</th>
			<th>MOMENTO</th>
		</tr>
		</thead><br>
		<tbody>

	<?php 
	while($fila=mysqli_fetch_array($consultaBD)){
		$cont++;
	?>

		<tr id="asd">
			<td><?php echo $fila['local'] ?></td>
			<td><?php echo $fila['visitante'] ?></td>
			<td><?php echo $fila['momentum'] ?></td>	
			<td id="tdlupa">
			<form action="datos_partido.php" method="POST" class="u-clearfix u-form-spacing-10  u-inner-form" style="padding: 10px;" name="form-3">
				<div class="u-form-group u-form-name u-label-none">
				<button id="lupa" name="botonaso" type="submit" value="<?php echo $fila['local'].",".$fila['visitante'].",".$fila['momentum']?>"></button>
				</div>
			</form>
			</td>
		</tr>
		<?php
		if ($cont==9) {
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