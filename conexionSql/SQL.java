package conexionSql;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;

import torneo.*;

public class SQL {

	Menus menu = new Menus();
	Statement stmt = null;
	String sql="";
	
	public void conexion() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("JDBC no se ha podido registrar");
		}
		System.out.println("JDBC registrada");


		//CREAR BASE DE DATOS TORNEO
		try {	
			String sql = "CREATE DATABASE torneo;";
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost", "root", "");
			System.out.println("Conexion con la base de datos exitosa");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Base de datos torneo creada");
					
		} catch (SQLException e) {
		} 


		//CONEXION A LA BASE DE DATOS TORNEO
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/torneo", "root", "");
			System.out.println("Conexion con la base de datos torneo exitosa");
			stmt = conn.createStatement();

		} catch (Exception e) {
			System.out.println("Error en la conexion a la base de datos");
		}
	}
	
	public void crearTablas() {

		//TABLA EQUIPO
		try {	
			sql = 
				"CREATE TABLE `torneo`.`equipo` "
				+ "( `nombre` VARCHAR(200) NOT NULL,"
				+ " `ganado` int(20) NOT NULL DEFAULT 0 ,"
				+ " `empate` int(20) NOT NULL DEFAULT 0,"
				+ " `perdido` int(20) NOT NULL DEFAULT 0,"
				+ " `gol_favor` int(20) NOT NULL DEFAULT 0,"
				+ " `gol_contra` int(20) NOT NULL DEFAULT 0,"
				+ " `dif_goles` int(20) NOT NULL DEFAULT 0,"
				+ " `puntos` int(20) NOT NULL DEFAULT 0,"
				+ " `grupo` VARCHAR(1) NOT NULL DEFAULT 'Z',"
				+ " PRIMARY KEY (`nombre`));"
			;

			stmt.executeUpdate(sql);
			System.out.println("Tabla equipo creada");
			
		} catch (SQLException e) {

		} 


		//TABLA JUGADOR
		try {	
			sql = 
				"CREATE TABLE `torneo`.`jugador` "
				+ "( `ID_Jugador` INT(20) AUTO_INCREMENT,"
				+ " `DNI` INT(9) NOT NULL UNIQUE,"
				+ " `nombre` VARCHAR(255) NOT NULL ,"
				+ " `apellido` VARCHAR(255) NOT NULL ,"
				+ " `edad` INT(3) NOT NULL ,"
				+ " `sexo` VARCHAR(255) NOT NULL ,"
				+ " `nacionalidad` VARCHAR(255) NOT NULL ,"
				+ " `estado` VARCHAR(255) NOT NULL ,"
				+ " `posicion` VARCHAR(20) NOT NULL ,"
				+ " `equipo` VARCHAR(255) NOT NULL ,"
				+ " `dorsal` INT NOT NULL ,"
				+ " `Partidos_jugados` INT NOT NULL DEFAULT 0,"
				+ " `Goles` INT NOT NULL DEFAULT 0,"
				+ " `salario` INT NOT NULL ,"
				+ " PRIMARY KEY (`ID_jugador`),"
				+ " CONSTRAINT pk_equipo FOREIGN KEY (`equipo`) REFERENCES `torneo`.`equipo`(`nombre`))"
			;

			stmt.executeUpdate(sql);
			System.out.println("Tabla jugador creada");
			
		} catch (SQLException e) {

		}


		//TABLA ARBITRO
		try {	
			sql = 
				"CREATE TABLE `torneo`.`arbitro` "
				+ "( `ID_arbitro` INT(20) NOT NULL AUTO_INCREMENT,"
				+ " `DNI` INT(9) NOT NULL UNIQUE,"
				+ " `nombre` VARCHAR(255) NOT NULL ,"
				+ " `apellido` VARCHAR(255) NOT NULL ,"
				+ " `edad` VARCHAR(255) NOT NULL ,"
				+ " `sexo` VARCHAR(255) NOT NULL ,"
				+ " `estado` VARCHAR(255) NOT NULL ,"
				+ " `tarj_am` INT(10) NOT NULL DEFAULT 0,"
				+ " `tarj_roj` INT(10) NOT NULL DEFAULT 0,"
				+ " `corners` INT(10) NOT NULL DEFAULT 0,"
				+ " `faltas` INT(10) NOT NULL DEFAULT 0,"
				+ " PRIMARY KEY (`ID_arbitro`))"
			;

			stmt.executeUpdate(sql);
			System.out.println("Tabla arbitro creada");
			
		} catch (SQLException e) {
			
		}


		//TABLA USUARIO
		try {	

			sql = 
				"CREATE TABLE `torneo`.`usuario` "
				+ "( `usuario` VARCHAR(20) NOT NULL ,"
				+ " `PASSWORD` VARCHAR(200) NOT NULL ,"
				+ " `rol` VARCHAR(20) NOT NULL ,"
				+ " PRIMARY KEY (`usuario`))"
			;

			stmt.executeUpdate(sql);
			System.out.println("Tabla usuario creada");
			
		} catch (SQLException e) {
		}

	}

	public ArrayList<String[]> leer(String fichero) {
		
		BufferedReader leer = null;//leer el fichero
		ArrayList<String[]> lista = new ArrayList<String[]>();

		//buscar fichero
		try {

			leer = new BufferedReader(new FileReader(fichero+".txt"));

		} catch (Exception e) {
			System.out.println("Se ha producido algun problema con el fichero");
		}

		try {
			String texto = leer.readLine();
				//Repetir mientras no se llegue al final del fichero
			while(texto != null){
				String[] atributos = texto.split(";");
				lista.add(atributos);
				texto = leer.readLine();
			}

		}catch(Exception e) {

			System.out.println("Error de lectura del fichero");
			System.out.println(e.getMessage());

		}

		return lista;
	}

	public void importarRegistroJugadorSQL(ArrayList<String[]> lista) {

		try {
			for(String[] i : lista){
				sql = "INSERT INTO `jugador` (`DNI`, `nombre`, `apellido`, `edad`, `sexo`, `nacionalidad`, `estado`, `posicion`, `equipo`, `dorsal`, `Partidos_jugados`, `Goles`, `salario`)" 
					+ "VALUES ('"+ i[0] +"', '"+ i[1] +"', '"+ i[2] +"', '"+ i[3] +"', '"+ i[4] +"', '"+ i[5] +"', '"+ i[6] +"', '"+ i[7] +"', '"+ i[8].toLowerCase() +"', '"+ i[9] +"', '0', '0', '"+ i[10] +"');"
				;
				stmt.executeUpdate(sql);
			}
			
		} catch (SQLException e) {
		}
	}

	public void importarRegistroEquipoSQL(ArrayList<String[]> lista) {
		try {
			for(String[] i : lista){
				sql = "INSERT INTO `equipo` (`nombre`) VALUES ('"+ i[0].toLowerCase() +"');";
				stmt.executeUpdate(sql);
			}
			
		} catch (SQLException e) {
		}
	}

	public void importarRegistroArbitroSQL(ArrayList<String[]> lista) {
		try {
			for(String[] i : lista){
				sql = "INSERT INTO `arbitro` (`DNI`, `nombre`, `apellido`, `edad`, `sexo`, `estado`, `tarj_am`, `tarj_roj`, `corners`, `faltas`)" 
					+ "VALUES ('"+ i[0] +"', '"+ i[1] +"', '"+ i[2] +"', '"+ i[3] +"', '"+ i[4] +"', '"+ i[5] +"', 0 , 0 , 0 , 0 );"
				;
				stmt.executeUpdate(sql);
			}
			
		} catch (SQLException e) {
		}
	}

	public void importarRegistroUsuarioSQL(ArrayList<String[]> lista) {
		
		try {
			for(String[] i : lista){
				sql = "INSERT INTO `usuario` (`usuario`, `PASSWORD`, `rol` )" 
					+ "VALUES ('"+ i[0].toLowerCase() +"', '"+ i[1] +"', '"+ i[2] +"');"
				;
				stmt.executeUpdate(sql);
			}
			
		} catch (SQLException e) {
		}
	}

	public boolean registroSQL(String usuP, String passP) {
		
		try {
			sql = "SELECT * FROM usuario";
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				if(rs.getString("usuario").equals(usuP.toLowerCase()) && rs.getString("PASSWORD").equals(passP)) {
					System.out.println("Contraseña acertada");
                    switch(rs.getString("rol")){
	                    case "admin": menu.menuAdmin(); break;
	                    case "usuario": menu.menuOrganizador(); break;
	                    case "organizador": menu.menuUsuario(); break;
	                }
                    return true;
				}
			}
			 
			rs.close();
			stmt.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
