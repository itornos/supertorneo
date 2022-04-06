package torneo;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
        int[] bolascalientes = new int[numeroEquipos];//Para evitar duplicaos

        int[] gruposcalientes = new int[numeroEquipos];//Para evitar duplicaos
        int contadorEquiposGrupos = 0;

        int datosArray=0;

        for(int l=0;l<bolascalientes.length;l++){//Le damos un valor que no influya, por defecto el valor es 0 
            bolascalientes[l] = 99;
            gruposcalientes[l] = 99;
        }

        for(int i =0;i<numeroEquipos;i++){
            //nummero aleatorio para grupo y equipo
            int manoInocenteEquipos = (int)Math.floor(Math.random()*Clasificacion.numeroEquipos);
            int manoInocenteGrupos = (int)Math.floor(Math.random()*numeroGrupos);

            contadorEquiposGrupos=0;

            //busqueda de valores repetidos
            for(int j =0;j<gruposcalientes.length;j++){
                if(manoInocenteGrupos==gruposcalientes[j]){
                    contadorEquiposGrupos++;
                    if(contadorEquiposGrupos==4){//en el caso de que haya mas de 4 equipos en un mismo grupo se busca un nuevo grupo 
                        manoInocenteGrupos = (int)Math.floor(Math.random()*numeroGrupos);
                        contadorEquiposGrupos = 0;
                        j=-1;
                    }
                }
            }

            //busqueda de valores repetidos
            for(int k =0;k<bolascalientes.length;k++){
                if(manoInocenteEquipos==bolascalientes[k]){//en caso de que ese equipo ya haya salido y este asignado se busca un nuevo equipo 
                    manoInocenteEquipos = (int)Math.floor(Math.random()*Clasificacion.numeroEquipos); 
                    k=-1;
                }
            }

            //Guardamos el equipo con su grupo
            bolascalientes[datosArray] = manoInocenteEquipos;
            gruposcalientes[datosArray] = manoInocenteGrupos;
            datosArray++;

            sorteo.equipo = Registro.clubs.get((manoInocenteEquipos)).club;
            sorteo.grupo = manoInocenteGrupos;

            System.out.println(Registro.clubs.get(manoInocenteEquipos).club);

            Clasificacion valorgrupos = new Clasificacion(sorteo.equipo,sorteo.grupo);
            grupos.add(valorgrupos);
        }
        faseGrupos();
    }

    //lista de grupos
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
            menu.faseGruposT(i);
            pos =0;
            for(int j = 0;j<Registro.clubs.size();j++){
                grupoList = grupos.get(j).grupo;
                if(grupoi == grupoList){
                    auxnombre [pos] = grupos.get(j).equipo;
                    pos++;
                    nadaquever();//eliminar para evitar alerta de sorteo
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
        int manoInocente = (int)Math.floor(Math.random()*(finalistas.size()));
        bracket.add(finalistas.get(manoInocente));
        for(int i=0;i<finalistas.size()-1;i++){
            manoInocente = (int)Math.floor(Math.random()*(finalistas.size()));
            for(int j=0;j<bracket.size();j++){
                if(bracket.get(j)==finalistas.get(manoInocente)){
                    manoInocente = (int)Math.floor(Math.random()*(finalistas.size()));
                    j=-1;
                }
            }
            bracket.add(finalistas.get(manoInocente));
        }
    }

    //Partidos de la eliminatoria final
    public void brackets(){
        ArrayList<String> perdedores = new ArrayList();
        int cont=1;
        int local;
        int vis;
            for(int i=0;i<bracket.size();i+=2){
                Menus.brackets();
                System.out.println(cont+"º PARTIDO DE LA ELIMINATORIA");
                System.out.println(bracket.get(i)+" VS "+bracket.get(i+1));
                System.out.println("Resultado:\n"+bracket.get(i)+":");
                local = Auxiliar.registroNumero();
                System.out.println("Resultado:\n"+bracket.get(i+1)+":");
                vis = Auxiliar.registroNumero();
                if(local>vis){
                    perdedores.add(bracket.get(i+1));
                }else{
                    perdedores.add(bracket.get(i));
                }
                cont++;
            }
        for(int i =0;i<perdedores.size();i++){
            for(int j =0;j<bracket.size();j++){
                if(perdedores.get(i).equals(bracket.get(j))){
                    bracket.remove(j);
                }
            }
        }
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
            return;
        }
        brackets();
    }

    //Alerta de sorteo
    public void nadaquever(){
        ImageIcon icon = new ImageIcon("sorteo.gif");
        JLabel label = new JLabel(icon);

        JFrame f = new JFrame("SORTEO ATENTOS");
        f.getContentPane().add(label);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        ImageIcon icono = new ImageIcon("sorteo-2.gif");
        JLabel labelo = new JLabel(icono);

        f.getContentPane().add(labelo);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        ImageIcon icono0 = new ImageIcon("sorteo-3.gif");
        JLabel labelo0 = new JLabel(icono0);

        f.getContentPane().add(labelo0);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
