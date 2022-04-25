package torneo;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Menus.Principal;
import SQL.Acciones;

public class Usuarios {

    //Inicio de sesion
    public boolean iniciarUsu(String usu, String pass) throws IOException, SQLException{
        boolean acierto = false;

		try {

			ResultSet consulta = Acciones.getUsuario(usu);

			consulta.next();
			
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
			}else if(consulta.getString("usuario").equals(usu.toString())){
				JFrame jFrame = new JFrame();
				JOptionPane.showMessageDialog(jFrame, "La contraseña no existe");
			}

			
		}catch (Exception e) {}
        return acierto;
    }
}
