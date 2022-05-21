package SQL;
import java.sql.SQLException;
import java.util.ArrayList;

public class Insert {
    public static boolean insertarRegistroJugadorSQL(ArrayList<String[]> lista) {

		try {
			for(String[] i : lista){
				Iniciar.sql = "INSERT INTO `jugador` (`DNI`, `nombre`, `apellido`, `edad`, `sexo`, `nacionalidad`, `estado`, `posicion`, `equipo`, `dorsal`, `salario`)" 
					+ "VALUES ('"+ i[0] +"', '"+ i[1] +"', '"+ i[2] +"', '"+ i[3] +"', '"+ i[4] +"', '"+ i[5] +"', '"+ i[6] +"', '"+ i[7] +"', '"+ i[8].toLowerCase() +"', '"+ i[9] +"','"+ i[10] +"');"
				;
				Iniciar.stmt.executeUpdate(Iniciar.sql);
			}
			
		} catch (SQLException e) {
			return true;
		}
		return false;
	}

	public static boolean insertarRegistroEquipoSQL(ArrayList<String[]> lista) {
		try {
			for(String[] i : lista){
				Iniciar.sql = "INSERT INTO `equipo` (`nombre`) VALUES ('"+ i[0].toLowerCase() +"');";
				Iniciar.stmt.executeUpdate(Iniciar.sql);
			}
			
		} catch (SQLException e) {
			return true;
		}
		return false;
	}

	public static boolean insertarRegistroArbitroSQL(ArrayList<String[]> lista) {
		try {
			for(String[] i : lista){
				Iniciar.sql = "INSERT INTO arbitro (DNI, nombre, apellido, `edad`, `sexo`, `estado`, `tarj_am`, `tarj_roj`, `corners`, `faltas`)" 
					+ "VALUES ('"+ i[0] +"', '"+ i[1] +"', '"+ i[2] +"', '"+ i[3] +"', '"+ i[4] +"', '"+ i[5] +"', 0 , 0 , 0 , 0 );"
				;
				Iniciar.stmt.executeUpdate(Iniciar.sql);
			}
			
		} catch (SQLException e) {
			return true;
		}
		return false;
	}

	public static boolean insertarRegistroUsuarioSQL(ArrayList<String[]> lista) {
		
		try {
			for(String[] i : lista){
				Iniciar.sql = "INSERT INTO `usuario` (`usuario`, `PASSWORD`, `rol` )" 
					+ "VALUES ('"+ i[0].toLowerCase() +"', '"+ i[1] +"', '"+ i[2] +"');"
				;
				Iniciar.stmt.executeUpdate(Iniciar.sql);
			}
			
		} catch (SQLException e) {
			return true;
		}
		return false;
	}

	public static boolean insertarRegistroPartidoSQL(ArrayList<String[]> lista) {

		try {
			for(String[] i : lista){
				Iniciar.sql = "INSERT INTO `partido` (`local`, `golesLocal`, `totalTirosLocal`, `pasesCompletadosLocal`, `posesionLocal`, `visitante`, `golesVisitante`, `totalTirosVisitante`, `pasesCompletadossVisitante`, `posesionV`, `momentum`)"
				+ "VALUES ('"+ i[0].toLowerCase() +"', '"+ i[1].toLowerCase() +"', '"+ i[2].toLowerCase() +"', '"+ i[3].toLowerCase() +"', '"+ i[4].toLowerCase() +"', '"+ i[5].toLowerCase() +"', '"+ i[6].toLowerCase() +"', '"+ i[7].toLowerCase() +"', '"+ i[8].toLowerCase() +"', '"+ i[9].toLowerCase() +"', '"+ i[10].toLowerCase() +"');";
				Iniciar.stmt.executeUpdate(Iniciar.sql);
			}
			
		} catch (SQLException e) {
			return true;
		}
		return false;
	}
}
