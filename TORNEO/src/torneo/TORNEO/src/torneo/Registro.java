package torneo;

import java.util.ArrayList;

public class Registro {

    int numero = 0;

	Auxiliar aux = new Auxiliar();
	Arbitro arbitro = new Arbitro();
	Jugador jugador = new Jugador();
	Clasificacion juego = new Clasificacion();

	static ArrayList<Equipo> clubs = new ArrayList();
	static ArrayList<Jugador> FichaJugadores = new ArrayList();
	static ArrayList<Arbitro> FichaArbitros = new ArrayList();
	static ArrayList<Partido> partidos = new ArrayList();

	public void verRegistroE() {
		System.out.println("\nNombre del equipo");
		String nombreE = Auxiliar.sc.nextLine();
		int idclub = aux.buscarNombreE(clubs.size(),nombreE);
		if(idclub!=-1){
			System.out.println("---------------------------------------------------------------");
			System.out.println("Nombre:\t \t \t"+ clubs.get(idclub).club);
			System.out.println("Puntos:\t \t \t"+clubs.get(idclub).puntos);
			System.out.println("Partidos Jugados:\t"+clubs.get(idclub).partidosJugados);
			System.out.println("Ganados:\t \t"+clubs.get(idclub).ganados);
			System.out.println("Empates:\t \t"+clubs.get(idclub).empates);
			System.out.println("Derrotas:\t \t"+clubs.get(idclub).derrotas);
			System.out.println("Goles a favor:\t \t"+clubs.get(idclub).golesfavor);
			System.out.println("Goles en contra:\t"+clubs.get(idclub).golescontra);
			System.out.println("Dif de goles:\t \t"+clubs.get(idclub).difgoles);
			System.out.println("---------------------------------------------------------------");	
			System.out.println("");
		}
	}

	public void listaJdeEquipo(int ide){
		System.out.println("\n\n\n");
		String nombreClub = clubs.get(ide).club.toLowerCase();
		System.out.println(nombreClub.toUpperCase());
		System.out.println("ID_JUGADOR\tNOMBRE\t\t\t\tPOS\tDOR\tPJ\tG");

		for(Jugador i : FichaJugadores){
			if(nombreClub.equals(i.equipo.toLowerCase())){
				System.out.print(i.id+"\t\t");

				if(i.nombre.length()<=7){
					System.out.print(i.nombre +"\t\t\t");
				}else if(i.nombre.length()<=14){
					System.out.print(i.nombre +"\t\t");
				}else{
					System.out.print(i.nombre +"\t");
				}

				System.out.print("\t"+i.posicion);
				System.out.print("\t"+i.dorsal);
				System.out.print("\t"+i.partidosjugados);
				System.out.print("\t"+i.goles);
				System.out.println();
			}
		}
		System.out.println();
	}

	public void listaArbitros(){
		System.out.println("ID_ARBITRO\tNOMBRE");
		for(Arbitro i : FichaArbitros){
			System.out.print(i.id);
			System.out.print("\t\t"+i.nombre);
			System.out.println();
		}
	}

	public void verRegistroPartido(){
		Menus menu = new Menus();

		int grupoloc = 0;//Grupo del equipo local
        String local="";//Nombre del equipo local
        int idclubl = 0;//id del equipo local

		int grupovis = 0;//Grupo del equipo visitante
		String visitante="";//Nombre del equipo visitante
		int idclubv = 0;//id del equipo visitante
		
		boolean partidoinvalido = false;

		while(!partidoinvalido){
			System.out.println("Equipo local");
			local = Auxiliar.sc.nextLine();
			local = aux.encontrarE(Registro.clubs.size(),local);
			local = local.toLowerCase();

			System.out.println("Equiop visitante");
			visitante = Auxiliar.sc.nextLine();
			visitante = aux.encontrarE(Registro.clubs.size(),visitante);
			visitante = visitante.toLowerCase();

			for(Clasificacion i : Clasificacion.grupos){
				if(visitante.equals(i.equipo.toLowerCase())){
					grupoloc = i.grupo;
				}
				if(local.equals(i.equipo.toLowerCase())){
					grupovis = i.grupo;
				}
			}

			if(grupoloc == grupovis){
				idclubl = aux.buscarNombreE(Registro.clubs.size(),local);
				listaJdeEquipo(idclubl);
				idclubv = aux.buscarNombreE(Registro.clubs.size(),visitante);
				listaJdeEquipo(idclubv);
				break;
			}else{
				System.out.println("Estos equipos pertenecen a difrentes grupos\n");
			}

			partidoinvalido = aux.repetidoPartido(local, visitante);		
		}
		menu.estadisticasPartidos(aux.buscarPartido(local,visitante));
	}
}
