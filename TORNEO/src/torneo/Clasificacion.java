package torneo;

import java.util.ArrayList;

import SQL.Update;
import SQL.Insert;
import SQL.Select;

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
			Update.modificarDatoSQL(lista.get(sorteazo)[1],"equipo","grupo",lista.get(sorteazo)[0],"nombre");

			//SE ELIMINA PARA EVITAR FALLOS
			lista.remove(sorteazo);
		}
	}

	public static void eliminatoriaFinal(){
		int sd = Select.getTodosEquipos().size()/4;
		String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		ArrayList<String[]> listadoFinal = new ArrayList<>();
		ArrayList<String[]> equipos  = new ArrayList<>();
		
		for (int i = 0; i < sd; i++) {
			equipos = Select.getPuntos(letras.charAt(i),equipos);
		}

		int tamaño = equipos.size();

		for (int i = 1; i <= tamaño; i++) {
			int numero = (int) (Math.random()*equipos.size());
			equipos.get(numero)[1] = String.valueOf(i);
			listadoFinal.add(equipos.get(numero));
			equipos.remove(numero);
		}

		Insert.insertarFinalesSQL(listadoFinal);
	}
}
