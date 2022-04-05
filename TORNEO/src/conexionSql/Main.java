package conexionSql;

public class Main {
	
	public static void main(String[] args) {
		SQL sql = new SQL();
		sql.conexion();
		sql.crearTablas();
		sql.importarRegistroEquipoSQL(sql.leer());
		sql.importarRegistroJugadorSQL(sql.leer());
	}
	
}
