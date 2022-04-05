package conexionSql;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;

import torneo.Auxiliar;

public class SQL {

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
			System.out.println("La base de datos torneo no se ha podido crear o ya existe");
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
				+ "( `nombre` VARCHAR(200) NOT NULL AUTO_INCREMENT,"
				+ " `ganado` int(20) NOT NULL DEFAULT 0 ,"
				+ " `empate` int(20) NOT NULL DEFAULT 0,"
				+ " `perdido` int(20) NOT NULL DEFAULT 0,"
				+ " `gol_favor` int(20) NOT NULL DEFAULT 0,"
				+ " `gol_contra` int(20) NOT NULL DEFAULT 0,"
				+ " `dif_goles` int(20) NOT NULL DEFAULT 0,"
				+ " `puntos` int(20) NOT NULL DEFAULT 0,"
				+ " `grupo` int(20) NOT NULL DEFAULT null,"
				+ " PRIMARY KEY (`nombre`))"
			;

			stmt.executeUpdate(sql);
			System.out.println("Tabla equipo creada");
			
		} catch (SQLException e) {
			System.out.println("La tabla jugador no se ha podido crear o ya existe");
		} 


		//TABLA JUGADOR
		try {	
			sql = 
				"CREATE TABLE `torneo`.`jugador` "
				+ "( `ID_Jugador` INT(20) NOT NULL AUTO_INCREMENT,"
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
				+ " `salario` INT NOT ,"
				+ " PRIMARY KEY (`ID_Jugador`),"
				+ " CONSTRAINT pk_equipo FOREIGN KEY (`equipo`) REFERENCES `torneo`.`equipo`(`nombre`))"
			;

			stmt.executeUpdate(sql);
			System.out.println("Tabla jugador creada");
			
		} catch (SQLException e) {
			System.out.println("La tabla jugador no se ha podido crear o ya existe");
		}


		//TABLA ARBITRO
		try {	
			sql = 
				"CREATE TABLE `torneo`.`arbitro` "
				+ "( `ID_arbitro` INT(20) NOT NULL AUTO_INCREMENT,"
				+ " `DNI` INT(9) NOT NULL ,"
				+ " `nombre` VARCHAR(255) NOT NULL ,"
				+ " `apellido` VARCHAR(255) NOT NULL ,"
				+ " `edad` VARCHAR(255) NOT NULL ,"
				+ " `sexo` VARCHAR(255) NOT NULL ,"
				+ " `estado` VARCHAR(255) NOT NULL ,"
				+ " `tarj_am` INT(10) NOT NULL ,"
				+ " `tarj_roj` INT(10) NOT NULL ,"
				+ " `corners` INT(10) NOT NULL ,"
				+ " `faltas` INT(10) NOT NULL ,"
				+ " PRIMARY KEY (`ID_arbitro`))"
			;

			stmt.executeUpdate(sql);
			System.out.println("Tabla arbitro creada");
			
		} catch (SQLException e) {
			System.out.println("La tabla jugador no se ha podido crear o ya existe");
		}


		//TABLA USUARIO
		try {	

			sql = 
				"CREATE TABLE `torneo`.`usuario` "
				+ "( `usuario` VARCHAR(20) NOT NULL ,"
				+ " `PASSWORD` VARCHAR(200) NOT NULL ,"
				+ " PRIMARY KEY (`usuario`))"
			;

			stmt.executeUpdate(sql);
			System.out.println("Tabla arbitro creada");
			
		} catch (SQLException e) {
			System.out.println("La tabla jugador no se ha podido crear o ya existe");
		}

	}

	public ArrayList<String[]> leer() {
		boolean repetido=true;//bucle
		BufferedReader leer = null;//leer el fichero
		ArrayList<String[]> lista = new ArrayList<String[]>();

		//buscar fichero
		while(repetido){
			try {

				System.out.println("Nombre de Fichero");
				String nombreFichero = Auxiliar.sc.nextLine();
				leer = new BufferedReader(new FileReader(nombreFichero+".txt"));
				repetido = false;

			} catch (Exception e) {

				System.out.println("fichero no encontrado\n1_Prueba otra vez\t2_Salir");
				repetido = Auxiliar.prueba();
				if(!repetido){
					return null;
				}

			}
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
				
				sql = "INSERT INTO `jugador` (`ID_Jugador`, `nombre`, `apellido`, `edad`, `sexo`, `nacionalidad`, `estado`, `equipo`, `posicion`, `dorsal`, `Partidos_jugados`, `Goles`, `salario`)" 
					+ "VALUES ('"+ i[0] +"', '"+ i[1] +"', '"+ i[2] +"', '"+ i[3] +"', '"+ i[4] +"', '"+ i[5] +"', '"+ i[6] +"', '"+ i[7] +"', '"+ i[8] +"', '"+ i[9] +"', '0', '0', '"+ i[10] +"');";
				}
				
				stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void importarRegistroEquipoSQL(ArrayList<String[]> lista) {
		try {
			for(int i = 0;i<lista.size() ;i++){
				System.out.println(lista.size());
				System.out.println(lista.get(i).length);
				System.out.println(lista.get(i)[0]);
				sql = "INSERT INTO `equipo` (`nombre`)" 
					+ "VALUES ('"+ lista.get(i)[0] +"');";
			}
				stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void importarRegistroArbitroSQL(ArrayList<String[]> atributos) {
		
	}

	public void importarRegistroUsuarioSQL(ArrayList<String[]> atributos) {
		
	}

	public void registroSQL(ArrayList<String[]> atributos) {
		
	}
}
