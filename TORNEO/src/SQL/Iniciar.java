package SQL;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import Otros.Ficheros;

public class Iniciar {

	public static Statement stmt = null;
	public static String sql="";

	public static void ejecutarSQL() {
		conexion();
		crearTablas();
		Insert.insertarRegistroEquipoSQL(Ficheros.leerFichero("C:\\xampp\\htdocs\\supertorneo\\TORNEO\\equipo.txt"));
		Insert.insertarRegistroJugadorSQL(Ficheros.leerFichero("C:\\xampp\\htdocs\\supertorneo\\TORNEO\\jugador.txt"));
		Insert.insertarRegistroArbitroSQL(Ficheros.leerFichero("C:\\xampp\\htdocs\\supertorneo\\TORNEO\\arbitro.txt"));
		Insert.insertarRegistroUsuarioSQL(Ficheros.leerFichero("C:\\xampp\\htdocs\\supertorneo\\TORNEO\\usuarios.txt"));
	}
	
	private static void conexion() {

		//ENCHEGAR XAMPP
		try {
			Runtime.getRuntime().exec ("C:\\xampp\\xampp_start.exe");
			Runtime.getRuntime().exec ("C:\\xampp\\apache_start.bat");
			Runtime.getRuntime().exec ("C:\\xampp\\mysql_start.bat");
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		//CONECTAR JDBC
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("JDBC no se ha podido registrar");
		}
		System.out.println("JDBC registrada");

		//CONEXION A LA BASE DE DATOS Y CREAR BASE DE DATOS TORNEO
		while(1<2){
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost", "root", "");
				try {
					stmt = conn.createStatement();
					/*String sql = "DROP DATABASE torneo;";
					stmt.executeUpdate(sql);*/
					String sql = "CREATE DATABASE torneo;";
					System.out.println("Conexion con la base de datos exitosa");
					stmt.executeUpdate(sql);			
					System.out.println("Base de datos torneo creada");
					break;
				} catch (Exception e) {
					break;
				}
			} catch (SQLException e) {
				System.out.println("Intentando conectar con la base de datos...");
				try {TimeUnit.SECONDS.sleep(1);} catch (InterruptedException e1) {}
			}			
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
	
	private static void crearTablas() {

		//TABLA EQUIPO
		try {	
			sql = 
				"CREATE TABLE `torneo`.`equipo` "
				+ "( `nombre` VARCHAR(200) NOT NULL,"
				+ " `partidos_jugados` int(20) NOT NULL DEFAULT 0 ,"
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
				+ " `foto` VARCHAR(200),"
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

		//TABLA PARTIDO
		try {	
			sql = 
				"CREATE TABLE `torneo`.`partido` "
				+ "( `local` VARCHAR(20),"
				+ " `golesLocal` INT(20) NOT NULL ,"
				+ " `totalTirosLocal` INT(20) NOT NULL ,"
				+ " `pasesCompletadosLocal` INT(20) NOT NULL ,"
				+ " `posesionLocal` INT(20) NOT NULL ,"
				+ " `visitante` VARCHAR(20),"
				+ " `golesVisitante` INT(20) NOT NULL ,"
				+ " `totalTirosVisitante` INT(20) NOT NULL ,"
				+ " `pasesCompletadossVisitante` INT(20) NOT NULL ,"
				+ " `posesionV` INT(20) NOT NULL ,"
				+ " `momentum` VARCHAR(20),"
				+ " PRIMARY KEY (`local`,`visitante`,`momentum`),"
				+ " CONSTRAINT pk_local FOREIGN KEY (`local`) REFERENCES `torneo`.`equipo`(`nombre`),"
				+ " CONSTRAINT pk_visitante FOREIGN KEY (`visitante`) REFERENCES `torneo`.`equipo`(`nombre`))"
			;

			stmt.executeUpdate(sql);
			System.out.println("Tabla partido creada");
			
		} catch (SQLException e) {
		}

	}
}
