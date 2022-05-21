package SQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Select {
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

	public static ArrayList<String[]> getTodosEquipos(){
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

	public static String[] getEquipo(String equipo){
		Iniciar.sql = "Select nombre,grupo from equipo where nombre = '"+equipo+"';";

		try {
			ResultSet rs = Iniciar.stmt.executeQuery(Iniciar.sql);

			while (rs.next()) {
				return new String[]{rs.getString("nombre"),rs.getString("grupo")};
			}

		} catch (Exception e) {
			System.out.println("fallo");
		}
		return null;
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
