package Menus;

import torneo.PaginaWeb;

public class Datos extends javax.swing.JFrame {

    static String tipoDato;

    public Datos() {
        initComponents();
    }

    public static void ejecutar(){//Mostrar ventana en pantalla
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Datos menu = new Datos();
				menu.setLocationRelativeTo(null);
                menu.setVisible(true);		
            }
        });	
    }
                      
    private void initComponents() {        

        jPanel1 = new javax.swing.JPanel();
        ver = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        sesion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        importar = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jugador = new javax.swing.JMenuItem();
        arbitro = new javax.swing.JMenuItem();
        clasificacion = new javax.swing.JMenuItem();
        equipos = new javax.swing.JMenuItem();
        registro = new javax.swing.JMenuItem();
        csesion = new javax.swing.JMenuItem();

        if (Principal.rol.equals("admin") || Principal.rol.equals("organizador")) {
            modificar.setText("Modificar "+tipoDato);
            modificar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modificarActionPerformed(evt);
                }
            });

            registrar.setText("Registrar "+tipoDato);
            registrar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    registrarActionPerformed(evt);
                }
            });

            importar.setText("Importar "+tipoDato);
            importar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    importarActionPerformed(evt);
                }
            });
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        ver.setText("Ver "+tipoDato);
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });

        sesion.setText("Cerrar Sesion");
        sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesionActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(204, 0, 102));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        if (tipoDato.equals("jugadores")) {
            jLabel1.setText("MENU JUGADOR");
        } else if(tipoDato.equals("arbitros")) {
            jLabel1.setText("MENU ARBITRO");
        } else {
            jLabel1.setText("MENU EQUIPO");
        }
        
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        if (Principal.rol.equals("admin") || Principal.rol.equals("organizador")) {
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(modificar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(importar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47))))
            );
        }else{
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47))))
            );
        }
        if (Principal.rol.equals("admin") || Principal.rol.equals("organizador")) {
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(41, 41, 41)
                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addComponent(importar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(56, 56, 56))
            );
        }else {
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(41, 41, 41)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(56, 56, 56))
            );
        }

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

        registro.setText("registrar usuario");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        jMenu2.add(registro);

        csesion.setText("cerrar sesion");
        csesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csesionActionPerformed(evt);
            }
        });
        jMenu2.add(csesion);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>    
    
    
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
        Registro.ejecutar();
    }                                          

    private void csesionActionPerformed(java.awt.event.ActionEvent evt) { 
        setVisible(false);                                           
        Iniciar.ejecutar();
    }                                          

    private void jugador(java.awt.event.ActionEvent evt) {    
        setVisible(false);     
        Datos.tipoDato = "jugadores";                                   
        Datos.ejecutar();
    }    

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {  
        setVisible(false);                                        
        Registro.ejecutar();
    }                                        

    private void sesionActionPerformed(java.awt.event.ActionEvent evt) {                                          
        setVisible(false);                                        
        Iniciar.ejecutar();
    }                                         

    private void verActionPerformed(java.awt.event.ActionEvent evt) {     
        if(Datos.tipoDato.equals("jugadores")){                                 
            PaginaWeb.abrirPagina("jugadores.html");
        }else if(Datos.tipoDato.equals("arbitros")){
            PaginaWeb.abrirPagina("arbitros.php");
        }else{
            PaginaWeb.abrirPagina("equipos.php");
        }
    }                                        

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) { 
        setVisible(false);                                        
        
    }                                        

    private void importarActionPerformed(java.awt.event.ActionEvent evt) {     
        setVisible(false);                                      
        Importar.ejecutar("jugador");
    }                                         
                
    private javax.swing.JButton ver;
    private javax.swing.JButton importar;
    private javax.swing.JButton sesion;
    private javax.swing.JButton modificar;
    private javax.swing.JButton registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;   
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jugador;
    private javax.swing.JMenuItem csesion;
    private javax.swing.JMenuItem arbitro;
    private javax.swing.JMenuItem clasificacion;
    private javax.swing.JMenuItem registro;
    private javax.swing.JMenuItem equipos;             
}