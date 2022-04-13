package Otros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Menus.ImportarDatos;
import conexionSql.SQL;

public class Ficheros {
    public static ArrayList<String[]> leerFichero(String fichero) {
		
		BufferedReader leer = null;//leer el fichero
        String texto;//texto leido
		ArrayList<String[]> lista = new ArrayList<String[]>();//guardar linea leida

		//buscar fichero
		try {

			leer = new BufferedReader(new FileReader(fichero));

		} catch (Exception e) {
			System.out.println("Se ha producido algun problema con el fichero");
		}

        //leer fichero
		try {
				//Repetir mientras no se llegue al final del fichero
			while((texto = leer.readLine()) != null){
				String[] atributos = texto.split(";");
				lista.add(atributos);
			}

		}catch(Exception e) {

			System.out.println("Error de lectura del fichero");

		}

		return lista;
	}

    public static void ImportarDatosFichero(String nombreFichero){

        File prueba = new File(nombreFichero);
        if(prueba.exists()){
            switch (ImportarDatos.tabla){

                case "jugador":
                    SQL.insertarRegistroJugadorSQL(leerFichero(nombreFichero));
                break;

                case "arbitro":
                    SQL.insertarRegistroArbitroSQL(leerFichero(nombreFichero));
                break;

                case "equipo":
                    SQL.insertarRegistroEquipoSQL(leerFichero(nombreFichero));
                break;
            }
            
        }else{
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "No existe el archivo especificado");
        }
    }
}
