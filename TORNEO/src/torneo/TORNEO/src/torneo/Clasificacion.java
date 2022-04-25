package torneo;

import java.util.ArrayList;

public class Clasificacion {
    static int numeroEquipos = 0;
    static int numeroGrupos = 0;
    static boolean sorteo = false;
    static ArrayList<Clasificacion> grupos = new ArrayList();
    static ArrayList<String> finalistas = new ArrayList();
    static ArrayList<String> bracket = new ArrayList();
    
    String equipo;
    int grupo;
    Auxiliar aux = new Auxiliar();

    public Clasificacion(String equipo,int grupo) {
        this.equipo = equipo;
        this.grupo = grupo;
    }

    public Clasificacion(){}

    //Sorteo de grupos y equipos
    public void sorteo(){

        sorteo = true;

        Clasificacion sorteo = new Clasificacion();
        int[] bolascalientes = new int[numeroEquipos];//Para evitar duplicados, cuando aparece una "bola" nueva entra en el array (ese valor ya no puede salir mas)

        int[] gruposcalientes = new int[numeroEquipos];//Para evitar duplicados, cuando aparece una "bola" nueva entra en el array (ese valor ya no puede salir mas)
        int contadorEquiposGrupos = 0;

        int datosArray=0;

        /*
        El Array por defecto se inicializa con valor 0 en todas su posiciones.
        Se crea un bucle con el tamaño del Array para cambiarlo por 99 (Un valor imposible para evitar una mala manipulacion de datos)
        */
        for(int l=0;l<bolascalientes.length;l++){
            bolascalientes[l] = 99;
            gruposcalientes[l] = 99;
        }

        //Empieza el sorteo, se recoge un numero aleatorio para el equipo y otro para el grupo al que pertenecera
        for(int i =0;i<numeroEquipos;i++){
            //nummero aleatorio para grupo y equipo

            //Numero aleatorio teniendo en cuenta el tamaño de la lista equipos (volcar nombres equipos de la base de datos a lista y cambiar math random)
            int manoInocenteEquipos = (int)Math.floor(Math.random()*Clasificacion.numeroEquipos);

            //Tener en cuenta cuantos equipos van a participar, deben ser 16equipos, 32 equipos, 64 equipos... [16(equipos)/4(Equipos por grupo) = 4 grupos] [32/4 = 8]
            int manoInocenteGrupos = (int)Math.floor(Math.random()*numeroGrupos);

            contadorEquiposGrupos=0;

            //busqueda de valores repetidos (grupos), se busca dentro del Array de repetidos si el numero aleatorio dado arriba ya a salido o no
            for(int j =0;j<gruposcalientes.length;j++){
                if(manoInocenteGrupos==gruposcalientes[j]){//SI Mano inocente (numero aleatorio) es igual al valor del array grupos calientes (repetidos) 
                    contadorEquiposGrupos++;//Se incrementa el contador
                    if(contadorEquiposGrupos==4){//en el caso de que haya mas de 4 equipos en un mismo grupo se busca un nuevo grupo, nuevo numero y reset del bucle y contador para evitar cont > 4
                        manoInocenteGrupos = (int)Math.floor(Math.random()*numeroGrupos);
                        contadorEquiposGrupos = 0;
                        j=-1;
                    }
                }
            }

            //busqueda de valores repetidos (equipos), se busca dentro del Array de repetidos si el numero aleatorio dado arriba ya a salido o no
            for(int k =0;k<bolascalientes.length;k++){
                if(manoInocenteEquipos==bolascalientes[k]){//SI Mano inocente (numero aleatorio) es igual al valor del array grupos calientes (repetidos)
                    manoInocenteEquipos = (int)Math.floor(Math.random()*Clasificacion.numeroEquipos);//Nuevo numero Aleatorio
                    k=-1;//Reset del bucle
                }
            }

            /*
            Estos bucles de repetidos no son muy optimos 
            Recomendaciones:
            - Generar num aleatorio y borrar equipo de la lista (estan en la base de datos)
            - Los primeros 4 al grupo A los siguientes 4 al B etc...
            */

            //Guardamos el equipo con su grupo (Cambiar los datos en la base de datos con update en clase acciones Paquete SQL)
            bolascalientes[datosArray] = manoInocenteEquipos;
            gruposcalientes[datosArray] = manoInocenteGrupos;
            datosArray++;//Suma para la siguiente posicion del Array

            sorteo.equipo = Registro.clubs.get((manoInocenteEquipos)).club;
            sorteo.grupo = manoInocenteGrupos;

            System.out.println(Registro.clubs.get(manoInocenteEquipos).club);

            Clasificacion valorgrupos = new Clasificacion(sorteo.equipo,sorteo.grupo);
            grupos.add(valorgrupos);
        }
        faseGrupos();
    }

    //lista de grupos para imprimir los grupos junto con sus estadisticas ejemplo de su funcionamiento anterior(este metodo imprime por pantalla, esta obsoleto, pasar a pagina web): 
    //https://www.google.com/search?q=fase+de+grupos+champions&rlz=1C1CHBF_esES991ES991&oq=fase+de+grupos+cham&aqs=chrome.0.0i512l2j69i57j0i512l7.7211j1j7&sourceid=chrome&ie=UTF-8#sie=lg;/g/11j8x175ph;2;/m/0c1q0;st;fp;1;;
    public void faseGrupos(){
        finalistas.clear();//siempre que hay variaciones limpiamos los finalistas y se actualizan, pasan los 2 mejores de cada grupo
        Menus menu = new Menus();
        int grupoi;
        int grupoList;
        int pos =0;
        String auxnombre [] = new String[4];
        
        //Esquema grupos equipos y sus estadisticas
        for(int i = 0;i<numeroGrupos;i++){
            grupoi = i;
            menu.faseGruposT(i);//Menu del grupo x (Muestra sus estadisticas en orden de puntos)
            pos =0;
            for(int j = 0;j<Registro.clubs.size();j++){
                grupoList = grupos.get(j).grupo;
                if(grupoi == grupoList){
                    auxnombre [pos] = grupos.get(j).equipo;
                    pos++;
                }
            }
            auxnombre=aux.ordenarE(auxnombre);
            finalistas.add(auxnombre[0]);//primero 
            finalistas.add(auxnombre[1]);//segundo del grupo x
            System.out.println("");
        }
    }

    //sorteo de octavos o dieciseisavos de final
    public void sorteobrackets(){
        faseGrupos();
        int manoInocente = (int)Math.floor(Math.random()*(finalistas.size()));//numero random teniendo en cuena el numero de equipos finalistas
        bracket.add(finalistas.get(manoInocente));//Se añade el primer equipo para empezar a comprobar duplicados

        for(int i=0;i<finalistas.size()-1;i++){
            manoInocente = (int)Math.floor(Math.random()*(finalistas.size()));//numero random teniendo en cuena el numero de equipos finalistas
            for(int j=0;j<bracket.size();j++){//Comprobacion de numero aleatorios
                if(bracket.get(j)==finalistas.get(manoInocente)){//SI son iguales el valor esta repetido
                    manoInocente = (int)Math.floor(Math.random()*(finalistas.size()));//numero random teniendo en cuena el numero de equipos finalistas
                    j=-1;//Reset de bucle
                }
            }
            bracket.add(finalistas.get(manoInocente));//Se añade el equipo despues de comprobacion de duplicados (Esta mal optimizado)
        }
    }

    //Partidos de la eliminatoria final.
    //Seria mejor crear una tabla con finalistas con unas columnas de posicion en el backet (dieciseisavos[1-32], octavos[1-16], cuartos[1-8], semis[1-4], final[1-2] y mas o como veas) y si esta o no eliminado.
    public void brackets(){
        ArrayList<String> perdedores = new ArrayList();
        int cont=1;
        int local;
        int vis;
        //las estadisticas son goles y ya por pereza pero estaria bien meter los todos los datos del partido
            for(int i=0;i<bracket.size();i+=2){
                Menus.brackets();
                System.out.println(cont+"º PARTIDO DE LA ELIMINATORIA");
                System.out.println(bracket.get(i)+" VS "+bracket.get(i+1));//Equipo x contra el siguiente en la lista
                System.out.println("Resultado:\n"+bracket.get(i)+":");
                local = Auxiliar.registroNumero();//Cuanto goles?
                System.out.println("Resultado:\n"+bracket.get(i+1)+":");
                vis = Auxiliar.registroNumero();//Cuantos goles?
                if(local>vis){
                    perdedores.add(bracket.get(i+1));
                }else{
                    perdedores.add(bracket.get(i));
                }
                cont++;
            }
        
        //Si a perdido...
        for(int i =0;i<perdedores.size();i++){
            for(int j =0;j<bracket.size();j++){
                if(perdedores.get(i).equals(bracket.get(j))){
                    bracket.remove(j);//...a tomar por culo (Buena idea para el sorteo, cuando salga un equipo .remove y ya no sale)
                }
            }
        }

        //Si quedan 2 equipos en el backet FINAL
        if(bracket.size()==2){
            System.out.println("FINAL");
            System.out.println(bracket.get(0)+" VS "+bracket.get(1));
            System.out.println("Quien ganara??");
            System.out.println("Resultado:\n"+bracket.get(0)+":");
            local = Auxiliar.registroNumero();
            System.out.println("Resultado:\n"+bracket.get(1)+":");
            vis = Auxiliar.registroNumero();
            if(local>vis){
                System.out.println(bracket.get(0)+" HA GANADO EL TORNEO");
            }else{
                System.out.println(bracket.get(1)+" HA GANADO EL TORNEO");
            }
            return;//////////////////
        }
        brackets();//Recursividad para hacer todos los partidos de la eliminatoria, return cuando se hace la [[ final ]], con la base de datos no hace falta
    }
}
