import java.io.IOException;

import Menus.Iniciar;
import conexionSql.SQL;

public class Main {
    public static void main(String[] args) throws IOException {

		SQL sql = new SQL();
		sql.ejecutarSQL();
		
		Iniciar.ejecutar();
	}
}
