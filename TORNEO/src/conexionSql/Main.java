package conexionSql;

public class Main {
	
	public static void main(String[] args) {
		SQL sql = new SQL();
		sql.conexion();
		sql.crearTablas();
		sql.importarRegistroJugadorSQL(sql.leer());
	}
	
}
