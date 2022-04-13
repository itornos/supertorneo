import Menus.IniciarSesion;
import conexionSql.SQL;

public class Main {
    public static void main(String[] args) {

		SQL.ejecutarSQL();
		IniciarSesion.ejecutar();
		
	}
}
