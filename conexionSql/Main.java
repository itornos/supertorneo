package conexionSql;

import torneo.Auxiliar;

public class Main {
	
	public static void main(String[] args) {
		
		SQL sql = new SQL();
		boolean prueba = false;
		int cont = 0;
		
		sql.conexion();
		sql.crearTablas();
		sql.importarRegistroEquipoSQL(sql.leer("equipo"));
		sql.importarRegistroJugadorSQL(sql.leer("jugador"));
		sql.importarRegistroArbitroSQL(sql.leer("arbitro"));
		sql.importarRegistroUsuarioSQL(sql.leer("usuarios"));
		
		while(!prueba || cont<=3) {
			String nombre = Auxiliar.sc.nextLine();
			String pass = Auxiliar.sc.nextLine();
			
			prueba = sql.registroSQL(nombre, pass);
			System.out.println("Has fallado, tienes"+(3-cont)+"intentos mas");
			cont++;
		}
	}	
}
