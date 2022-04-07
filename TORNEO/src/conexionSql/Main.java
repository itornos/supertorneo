package conexionSql;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {

		SQL sql = new SQL();

		sql.conexion();
		sql.crearTablas();
		sql.importarRegistroEquipoSQL(sql.leer("equipo"));
		sql.importarRegistroJugadorSQL(sql.leer("jugador"));
		sql.importarRegistroArbitroSQL(sql.leer("arbitro"));
		sql.importarRegistroUsuarioSQL(sql.leer("usuarios"));

		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
				Iniciar iniciar = new Iniciar();
				iniciar.setLocationRelativeTo(null);
                iniciar.setVisible(true);				
            }
        });		
	}	
}
