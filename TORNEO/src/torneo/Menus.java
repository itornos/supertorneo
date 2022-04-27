package torneo;

public class Menus {

	Auxiliar aux = new Auxiliar();
    int opcion = 0;
	boolean bucleMain=true;

	//Menu para la clasificacion
	public void menuC(){
        System.out.println("  ______________________  ");
        System.out.println("||                      ||");
        System.out.println("||  Que desea hacer...  ||");
        System.out.println("||----------------------||");
        System.out.println("||  1_Sorteo            ||");
        System.out.println("||  2_Consultar grupos  ||");
        System.out.println("||  3_Ver los brackets  ||");
        System.out.println("||  4_Salir             ||");
        System.out.println("||______________________||");
    }

	//Menu para la clasificacion Usuario
	public void menuCUsuario(){
        System.out.println("  ______________________  ");
        System.out.println("||                      ||");
        System.out.println("||  Que desea hacer...  ||");
        System.out.println("||----------------------||");
        System.out.println("||  1_Consultar grupos  ||");
        System.out.println("||  2_Ver los brackets  ||");
        System.out.println("||  4_Salir             ||");
        System.out.println("||______________________||");
    }

	///////////////////////////////////////////////////////////////

	

	//Menus Partidos
	public void menuP(){
        System.out.println("  ________________________________________ ");
        System.out.println("||                                        ||");
        System.out.println("||  Que desea hacer...                    ||");
        System.out.println("||-----------------------------------     ||");
        System.out.println("||  1_Registrar estadisticas Partido      ||");
        System.out.println("||  2_Registrar partidos automaticamente  ||");
        System.out.println("||  3_Ver estadisticas pardido            ||");
        System.out.println("||  4_Salir                               ||");
        System.out.println("||________________________________________||");
    }

	//Menus Partidos Ususario
	public void menuPUsuario(){
        System.out.println("  _______________________________ ");
        System.out.println("||                               ||");
        System.out.println("||  Que desea hacer...           ||");
        System.out.println("||-------------------------------||");
        System.out.println("||  1_Ver estadisticas pardido   ||");
        System.out.println("||  2_Salir                      ||");
        System.out.println("||_______________________________||");
    }

	///////////////////////////////////////////////////////////////



	//Ejemplo: https://as.com/futbol/2018/07/10/mundial/1531223313_934411.html
    public static void brackets(){
		for(int i=0;i<Clasificacion.bracket.size();i++){
			if(i % 2 == 1){
				System.out.print("-------------------------             |\n|\t");
				if(Clasificacion.bracket.get(i).length()<=7){
					System.out.print(Clasificacion.bracket.get(i) +"\t\t");
				}else if(Clasificacion.bracket.get(i).length()<=14){
					System.out.print(Clasificacion.bracket.get(i) +"\t");
				}
				System.out.print("|-------------|\n");
				System.out.print("-------------------------\n");
			}
			if(i % 2 == 0){
				System.out.print("-------------------------\n|\t");
				if(Clasificacion.bracket.get(i).length()<=7){
					System.out.print(Clasificacion.bracket.get(i) +"\t\t");
				}else if(Clasificacion.bracket.get(i).length()<=14){
					System.out.print(Clasificacion.bracket.get(i) +"\t");
				}
				System.out.print("|");
				System.out.println("-------------|");
				if(Clasificacion.bracket.get(i).length()<=7){
					System.out.print("-------------------------             |____");
				}else if(Clasificacion.bracket.get(i).length()<=14){
					System.out.print("-------------------------             |____");
				}
			}
			System.out.println();
		}
    }

	//Ejemplo: https://www.google.com/search?q=fase+de+grupos+champions&rlz=1C1CHBF_esES991ES991&oq=fase+de+grupos+cham&aqs=chrome.0.0i512l2j69i57j0i512l7.7211j1j7&sourceid=chrome&ie=UTF-8#sie=lg;/g/11j8x175ph;2;/m/0c1q0;st;fp;1
    public void faseGruposE(int posicionE){
		if(Registro.clubs.get(posicionE).club.length()<=7){
			System.out.print(Registro.clubs.get(posicionE).club +"\t\t\t");
		}else if(Registro.clubs.get(posicionE).club.length()<=14){
			System.out.print(Registro.clubs.get(posicionE).club +"\t\t");
		}else{
			System.out.print(Registro.clubs.get(posicionE).club +"\t");
		}
        System.out.println(Registro.clubs.get(posicionE).partidosJugados+"\t"+ Registro.clubs.get(posicionE).ganados +"\t"+
		Registro.clubs.get(posicionE).empates+"\t"+Registro.clubs.get(posicionE).derrotas+"\t"+Registro.clubs.get(posicionE).golesfavor+"\t"+Registro.clubs.get(posicionE).golescontra+"\t"+
		Registro.clubs.get(posicionE).difgoles+"\t"+Registro.clubs.get(posicionE).puntos+"\n");
    }  

	//Ejemplo de arriba (son las estadisticas)
	public void faseGruposT(int numGrupo){
        System.out.println("_________________");
        System.out.println("");
        System.out.println("Grupo "+ (numGrupo+1) +"\t\t\tPJ\tG\tE\tP\tGF\tGC\tDG\tP");
		System.out.println("");
        System.out.println("-----------------");
		System.out.println("");
    }  

	//Ejemplo https://twitter.com/atleticokin/status/994779584058052609?lang=eu
	public void estadisticasPartidos(int posicion){
		System.out.println("LOCAL\t\t\tVISITANTE");

		if(Registro.partidos.get(posicion).local.length()<=7){
			System.out.print(Registro.partidos.get(posicion).local +"\t\t\t");
		}else if(Registro.partidos.get(posicion).local.length()<=14){
			System.out.print(Registro.partidos.get(posicion).local +"\t\t");
		}else{
			System.out.print(Registro.partidos.get(posicion).local +"\t");
		}

		if(Registro.partidos.get(posicion).visistante.length()<=7){
			System.out.print(Registro.partidos.get(posicion).visistante +"\t\t\t");
		}else if(Registro.partidos.get(posicion).visistante.length()<=14){
			System.out.print(Registro.partidos.get(posicion).visistante +"\t\t");
		}else{
			System.out.print(Registro.partidos.get(posicion).visistante +"\t");
		}
		System.out.println();
		System.out.println(Registro.partidos.get(posicion).golesLocal+"\t\t\t"+Registro.partidos.get(posicion).golesVisitante);
	}

	//Alineacion del equipo (sin mas)
	public void alineacion(int id,int plantilla[]){
		System.out.println("");
		System.out.println(Registro.FichaJugadores.get(plantilla[9]).nombre+" "+Registro.FichaJugadores.get(plantilla[9]).dorsal+"\t"+Registro.FichaJugadores.get(plantilla[9]).nombre+" "+Registro.FichaJugadores.get(plantilla[9]).dorsal+"\t"+Registro.FichaJugadores.get(plantilla[10]).nombre+" "+Registro.FichaJugadores.get(plantilla[10]).dorsal);
		System.out.println(Registro.FichaJugadores.get(plantilla[6]).nombre+" "+Registro.FichaJugadores.get(plantilla[6]).dorsal+"\t\t\t"+Registro.FichaJugadores.get(plantilla[7]).nombre+" "+Registro.FichaJugadores.get(plantilla[7]).dorsal);
		System.out.println("\t\t"+Registro.FichaJugadores.get(plantilla[5]).nombre+" "+Registro.FichaJugadores.get(plantilla[5]).dorsal);
		System.out.println(Registro.FichaJugadores.get(plantilla[1]).nombre+" "+Registro.FichaJugadores.get(plantilla[1]).dorsal+"\t"+Registro.FichaJugadores.get(plantilla[2]).nombre+" "+Registro.FichaJugadores.get(plantilla[2]).dorsal+"\t"+Registro.FichaJugadores.get(plantilla[3]).nombre+" "+Registro.FichaJugadores.get(plantilla[3]).dorsal+"\t"+Registro.FichaJugadores.get(plantilla[4]).nombre+" "+Registro.FichaJugadores.get(plantilla[4]).dorsal);
		System.out.println("\t\t"+Registro.FichaJugadores.get(plantilla[0]).nombre+" "+Registro.FichaJugadores.get(plantilla[0]).dorsal);
	}
}
