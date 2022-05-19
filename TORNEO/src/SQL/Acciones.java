package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

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

	public static boolean AumentarDatoSQL(String valor,String tabla,String columna,Object id,String columnaID) {
		try {
			Iniciar.sql = "UPDATE "+tabla+" SET "+columna+" = '"+valor+"' + "+columna+" " 
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

	public static ResultSet getUsuario(String id){
		Iniciar.sql = "SELECT * FROM usuario where usuario= '"+id+"'";
		
		try {
			if(Iniciar.stmt.executeQuery(Iniciar.sql) != null){
				return Iniciar.stmt.executeQuery(Iniciar.sql);
			}else{
				JFrame jFrame = new JFrame();
				JOptionPane.showMessageDialog(jFrame, "El usuario no esta mal");
			}
			
		} catch (SQLException e) {}
		return null;
	}

	public static ArrayList<String[]> getEquipoGrupo(){
		Iniciar.sql = "Select nombre,grupo from equipo;";
		ArrayList<String[]> lista = new ArrayList<>();

		try {
			ResultSet rs = Iniciar.stmt.executeQuery(Iniciar.sql);

			while (rs.next()) {
				String[] equipoGrupo = new String[]{rs.getString("nombre"),rs.getString("grupo")};
				lista.add(equipoGrupo);
			}

		} catch (Exception e) {
			System.out.println("fallo");
		}
		return lista;
	}

	public static int contarPartidos() {
		try {
			Iniciar.sql = "SELECT COUNT(*) FROM PARTIDO;";
			ResultSet rs = Iniciar.stmt.executeQuery(Iniciar.sql);

			while (rs.next()) {
				return rs.getInt("count(*)");
			}

		} catch (SQLException e) {}
		return 0;
	}
}
