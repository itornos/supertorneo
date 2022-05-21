package SQL;
import java.sql.SQLException;

public class Update {
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

	public static boolean AumentarDatoSQL(String golesFavor,String golesContra,String difGoles,String puntos,String id,String ganas) {
		try {
			Iniciar.sql = "UPDATE `equipo` SET `partidos_jugados` = '1' + `partidos_jugados`,`"+ganas+"` = '1' + `"+ganas+"`, `gol_favor` = '"+ golesFavor +"' + `gol_favor`, `gol_contra` = '"+ golesContra +"' + `gol_contra`, `dif_goles` = '"+ difGoles +"' + `dif_goles`, `puntos` = '"+ puntos +"' + `puntos`"
			+ "WHERE `equipo`.`nombre` = '"+id+"'";
			Iniciar.stmt.executeUpdate(Iniciar.sql);

		} catch (SQLException e) {
			System.out.println(e);
			return true;
		}
		return false;
	}
}
