package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Acciones {


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

	public static boolean modificarDatoSQL(String valor,String tabla,String columna,Object id,String columnaID) {
		try {
			Iniciar.sql = "UPDATE "+tabla+" SET "+columna+" = '"+valor+"' " 
				+ "WHERE "+columnaID+" = '"+id+"';"
			;
			Iniciar.stmt.executeUpdate(Iniciar.sql);

		} catch (SQLException e) {
			System.out.println(e);
			return true;
		}
		return false;
	}

	public static String[] verDatoSQL(String tabla,String id) throws SQLException {
		
		int size = 0;

		Iniciar.sql = "Select count(*) from "+tabla+";";
		ResultSet rs = Iniciar.stmt.executeQuery(Iniciar.sql);
		if(rs.next()) {
			size = rs.getInt(1);
		}

		Iniciar.sql = "Select "+id+" from "+tabla+";";
	
		try {
			rs = Iniciar.stmt.executeQuery(Iniciar.sql);

			String[] array = new String[size];

			size=0;
			while (rs.next()) {
				array[size] = rs.getString(id);
				size++;
			}

			return array;

		} catch (Exception e) {
			System.out.println("fallo");
		}

		return null;	
	}

	public static String getRol(String id){
		Iniciar.sql = "Select rol from usuario where usuario = '"+id+"';";
		String rol = "";

		try {
			ResultSet rs = Iniciar.stmt.executeQuery(Iniciar.sql);

			while (rs.next()) {
				rol = rs.getString("rol");
			}

		} catch (Exception e) {
			System.out.println("fallo");
		}
		return rol;

	}

	public static 
}
