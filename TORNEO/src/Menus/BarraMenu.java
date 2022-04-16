package Menus;

public class BarraMenu extends javax.swing.JFrame{

    public BarraMenu(){
        initComponentsMenu();
    }
    

    public void initComponentsMenu() { 
        
    jMenuBar2 = new javax.swing.JMenuBar();
    jMenu2 = new javax.swing.JMenu();
    jugador = new javax.swing.JMenuItem();
    arbitro = new javax.swing.JMenuItem();
    clasificacion = new javax.swing.JMenuItem();
    equipos = new javax.swing.JMenuItem();
    registro = new javax.swing.JMenuItem();
    csesion = new javax.swing.JMenuItem();    

    jMenu2.setText("Menu Principal");

            jugador.setText("jugador");
            jugador.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jugador(evt);
                }
            });
            jMenu2.add(jugador);

            arbitro.setText("arbitros");
            arbitro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    arbitroActionPerformed(evt);
                }
            });
            jMenu2.add(arbitro);

            clasificacion.setText("clasificacion");
            clasificacion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    clasificacionActionPerformed(evt);
                }
            });
            jMenu2.add(clasificacion);

            equipos.setText("equipos");
            equipos.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    equiposActionPerformed(evt);
                }
            });
            jMenu2.add(equipos);

            if (Principal.rol.equals("admin")) {
                
                registro.setText("registrar usuario");
                registro.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        registroActionPerformed(evt);
                    }
                });
            jMenu2.add(registro);
            }

            csesion.setText("cerrar sesion");
            csesion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    csesionActionPerformed(evt);
                }
            });
            jMenu2.add(csesion);

            jMenuBar2.add(jMenu2);

            setJMenuBar(jMenuBar2); 
            
        }
        
        private void arbitroActionPerformed(java.awt.event.ActionEvent evt) {  
            setVisible(false);
            Datos.tipoDato = "arbitros";
            Datos.ejecutar();                                      
        }                                          
    
        private void clasificacionActionPerformed(java.awt.event.ActionEvent evt) {                                         
            setVisible(false);
            Clasificacion.ejecutar();
        }                                          
    
        private void equiposActionPerformed(java.awt.event.ActionEvent evt) { 
            setVisible(false); 
            Datos.tipoDato = "equipos";                                           
            Datos.ejecutar();
        }                                          
    
        private void registroActionPerformed(java.awt.event.ActionEvent evt) {  
            setVisible(false);                                        
            RegistrarDatos.ejecutar();
        }                                          
    
        private void csesionActionPerformed(java.awt.event.ActionEvent evt) {   
            setVisible(false);                                       
            IniciarSesion.ejecutar();
        }                                          
    
        private void jugador(java.awt.event.ActionEvent evt) {  
            setVisible(false);    
            Datos.tipoDato = "jugadores";                                   
            Datos.ejecutar();
        } 

    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jugador;
    private javax.swing.JMenuItem csesion;
    private javax.swing.JMenuItem arbitro;
    private javax.swing.JMenuItem clasificacion;
    private javax.swing.JMenuItem registro;
    private javax.swing.JMenuItem equipos;         
}
