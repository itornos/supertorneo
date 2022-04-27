package torneo;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import Menus.Principal;
import SQL.Iniciar;

public class Usuarios {

    //Inicio de sesion
    public boolean iniciarUsu(String usu, String pass) throws IOException, SQLException{
        boolean acierto = false;

		try {
			String sql = "SELECT * FROM usuario";
			ResultSet consulta = Iniciar.stmt.executeQuery(sql);
			
			while (consulta.next()) {
				if(consulta.getString("usuario").equals(usu.toString()) && consulta.getString("PASSWORD").equals(pass.toString())) {

                    acierto = true;
                    
                    switch(consulta.getString("rol")){
	                    case "admin": 
                            Principal.ejecutar("admin");
							break;
	                    case "usuario":
                            Principal.ejecutar("usuario"); 
							break;
	                    case "organizador": 
                            Principal.ejecutar("organizador"); 
							break;
	                }

                    break;
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
        return acierto;
    }
}
