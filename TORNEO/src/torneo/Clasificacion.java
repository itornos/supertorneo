package torneo;

import java.util.ArrayList;

import SQL.Acciones;

public class Clasificacion {
    
    public static void sorteo(ArrayList<String[]> lista){
		//String[0] => NOMBRE EQUIPO
		//String[1] => GRUPO (DEFAULT = Z)

		//grupo en orden alfabetico con 4 repeticiones
		String grupos = "AAAABBBBCCCCDDDDEEEEFFFFGGGGHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPPQQQQRRRRSSSSTTTTUUUUVVVVWWWWXXXXYYYYZZZZ";
		int tamaño = lista.size();

		for (int i = 0; i < tamaño; i++) {
			int sorteazo = (int) (Math.random()*lista.size());//NUMERO ALEATORIO PARA EL EQUIPO
			lista.get(sorteazo)[1] = grupos.charAt(i)+"";//CARACTER DE LA POSICION I DEL STRING GRUPOS PARA EVITAR MAS DE 4 EQUIPOS

			//UPDATE A LA TABLA EQUIPO PASANDO PARAMETROS IDENTIFICATORIOS Y VALOR A CAMBIAR JUNTO CON SU NUEVO VALOR
			//1º VALOR NUEVO, 2º TABLA A ACTUALIZAR, 3º COLUMNA A ACTUALIZAR, 4º ID DEL EQUIPO Y 5º COLUMNA ID
			Acciones.modificarDatoSQL(lista.get(sorteazo)[1],"equipo","grupo",lista.get(sorteazo)[0],"nombre");

			//SE ELIMINA PARA EVITAR FALLOS
			lista.remove(sorteazo);
		}
	}
}
