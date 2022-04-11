package torneo;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import Menus.Principal;
import conexionSql.SQL;

public class InicioSesion {

    Auxiliar aux = new Auxiliar();

    String usuario;
    String contrasena;
    boolean existe = false;
    int saltoDeLinea =0;
    String palabra = "";
    int caracter;
    
    
    //Registro de un usuario nuevo (solo puede el admin)
    public void registrarRol() throws IOException{

        BufferedWriter escribir = null;
        try {
            FileWriter ficheroE = new FileWriter("usuarios.txt", true);
            escribir = new BufferedWriter(ficheroE);
        
        }catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
        System.out.println("nombre de usuario");
        usuario = Auxiliar.sc.nextLine();

        System.out.println("Contraseña de usuario");
        contrasena = Auxiliar.sc.nextLine();  
        
        System.out.println("Rol para el nuevo usario\n1_Administrador\t\t2_Usuario\t3_Organizador");
        int caso = Auxiliar.registroNumero();
        String rol= "";
        switch (caso){
            case 1: rol="admin"; break;
            case 2: rol="usuario"; break;
            case 3: rol="organizador"; break;
        }

       escribir.write(usuario+";"+contrasena+";"+rol+";\n");
       escribir.close();
    }


    //Registro de un usuario nuevo (su unico rol sera usuario)
    public void registrarUsu() throws IOException{

        boolean repetido=true;

        BufferedWriter escribir = null;
        try {
            FileWriter ficheroE = new FileWriter("usuarios.txt", true);
            escribir = new BufferedWriter(ficheroE);
        
        }catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
        existe=false;
        System.out.println("nombre de usuario");
        while(!existe){
            usuario = Auxiliar.sc.nextLine();
            pruebaUsu();
        }

        while(repetido){
            System.out.println("Contraseña de usuario");
            contrasena = Auxiliar.sc.nextLine();
            
            System.out.println("Repite la contraseña");
            String Pcontrasena = Auxiliar.sc.nextLine();

            if(contrasena.equals(Pcontrasena)){
                System.out.println("Contraseña guardada");
                break;
            }else{
                System.out.println("Te has equivocado");
            }
        }

        String rol= "usuario";

        escribir.write(usuario+";"+contrasena+";"+rol+";\n");
        escribir.close();
    }


    //Inicio de sesion
    public boolean iniciarUsu(String usu, String pass) throws IOException, SQLException{
        boolean acierto = false;

		try {
			String sql = "SELECT * FROM usuario";
			ResultSet consulta = SQL.stmt.executeQuery(sql);
			
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
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
        return acierto;
    }


    //Prueba de la existencia de un usuario concreto
    public void pruebaUsu() throws IOException{

        try (FileReader fichero = new FileReader("usuarios.txt")) {
            existe=true;
            while((caracter = fichero.read()) != -1 && existe) { 
                if((char)caracter!=';') {
                    palabra = palabra + (char)caracter;
                }
                else if(usuario.equals(palabra) && existe){
                    existe=false;
                    palabra="";
                    System.out.println("Este usuario ya esta registrado, escoge otro nombre");
                    break;
                }else if (existe){
                    saltoDeLinea++;
                    if(saltoDeLinea==3){
                        caracter = fichero.read();
                        saltoDeLinea=0;
                        }
                    palabra="";
                 }
            }
        }
    }
}
