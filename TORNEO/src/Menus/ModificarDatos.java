package Menus;

import javax.swing.JOptionPane;

import SQL.Acciones;

import javax.swing.JFrame;

public class ModificarDatos extends BarraMenu {

    JFrame jFrame = new JFrame();

    public ModificarDatos() {
        initComponents();
    }

    public static void ejecutar(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarDatos menu = new ModificarDatos();
                menu.setLocationRelativeTo(null);
                menu.setVisible(true);			
            }
        });
    } 
                      
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        enviar = new javax.swing.JButton();
        dato = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        labelrol = new javax.swing.JLabel();
        rol = new javax.swing.JComboBox<>();
        apellido = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        posicion= new javax.swing.JLabel();
        dorsal= new javax.swing.JLabel();
        equipo= new javax.swing.JLabel(); 
        dni= new javax.swing.JLabel();
        sexo= new javax.swing.JLabel();
        nacion = new javax.swing.JLabel();
        estado= new javax.swing.JLabel();
        jTextField1= new javax.swing.JTextField();
        jTextField10= new javax.swing.JTextField();
        jTextField4= new javax.swing.JTextField();
        jTextField5= new javax.swing.JTextField();
        jTextField6= new javax.swing.JTextField();
        jTextField7= new javax.swing.JTextField();
        jTextField8= new javax.swing.JTextField();
        jTextField9= new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(204, 0, 102));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        switch (Datos.tipoDato) {
            case "jugadores":
                jLabel1.setText("MODIFICAR JUGADOR");
            break;

            case "arbitros":
                jLabel1.setText("MODIFICAR ARBITRO");
            break;

            case "equipos":
                jLabel1.setText("MODIFICAR EQUIPO");
            break;

            case "usuarios":
                jLabel1.setText("MODIFICAR USUARIO"); 
            break;
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        enviar.setText("Cambiar datos");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        try {

            switch (Datos.tipoDato) {
                case "jugadores":
                        dato.setModel(new javax.swing.DefaultComboBoxModel<>(Acciones.verDatoSQL("jugador","ID_Jugador")));
                        dni.setText("DNI");

                        nombre.setText("NOMBRE");
                
                        apellido.setText("APELLIDO");
                
                        edad.setText("EDAD");
                
                        sexo.setText("SEXO");
                
                        nacion.setText("NACIONALIDAD");
                
                        estado.setText("ESTADO");
                
                        posicion.setText("POSICION");
                
                        dorsal.setText("DORSAL");
                
                        equipo.setText("EQUIPO");
                
                        javax.swing.GroupLayout PanelJugador = new javax.swing.GroupLayout(jPanel1);
                        jPanel1.setLayout(PanelJugador);
                        PanelJugador.setHorizontalGroup(
                            PanelJugador.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelJugador.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelJugador.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelJugador.createSequentialGroup()
                                        .addComponent(dato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PanelJugador.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(PanelJugador.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(enviar)
                                            .addGroup(PanelJugador.createSequentialGroup()
                                                .addGroup(PanelJugador.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(apellido)
                                                    .addComponent(edad, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(dni, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(sexo, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(33, 33, 33)
                                                .addGroup(PanelJugador.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField2)
                                                    .addComponent(jTextField1)
                                                    .addComponent(jTextField3)
                                                    .addComponent(jTextField4)
                                                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                                .addGap(34, 34, 34)
                                                .addGroup(PanelJugador.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(PanelJugador.createSequentialGroup()
                                                        .addComponent(nacion)
                                                        .addGap(33, 33, 33)
                                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(PanelJugador.createSequentialGroup()
                                                        .addGroup(PanelJugador.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(estado)
                                                            .addComponent(equipo)
                                                            .addComponent(dorsal))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(PanelJugador.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jTextField7)
                                                            .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelJugador.createSequentialGroup()
                                                        .addComponent(posicion)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addContainerGap(24, Short.MAX_VALUE))))
                        );
                        PanelJugador.setVerticalGroup(
                            PanelJugador.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelJugador.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(PanelJugador.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dni)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nacion)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelJugador.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombre)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estado))
                                .addGap(18, 18, 18)
                                .addGroup(PanelJugador.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(apellido)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(posicion))
                                .addGap(18, 18, 18)
                                .addGroup(PanelJugador.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edad)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(equipo))
                                .addGap(18, 18, 18)
                                .addGroup(PanelJugador.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sexo)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dorsal))
                                .addGap(49, 49, 49)
                                .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                        );
                    break;

                case "arbitros":
                    dato.setModel(new javax.swing.DefaultComboBoxModel<>(Acciones.verDatoSQL("arbitro","ID_arbitro")));
                    dni.setText("DNI");

                    nombre.setText("NOMBRE");

                    apellido.setText("APELLIDO");

                    edad.setText("EDAD");

                    sexo.setText("SEXO");

                    estado.setText("ESTADO");

                    javax.swing.GroupLayout PanelArbitro = new javax.swing.GroupLayout(jPanel1);
                    jPanel1.setLayout(PanelArbitro);
                    PanelArbitro.setHorizontalGroup(
                        PanelArbitro.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelArbitro.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(PanelArbitro.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelArbitro.createSequentialGroup()
                                    .addComponent(dato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelArbitro.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(PanelArbitro.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(enviar)
                                        .addGroup(PanelArbitro.createSequentialGroup()
                                            .addGroup(PanelArbitro.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(apellido)
                                                .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(dni, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGap(33, 33, 33)
                                            .addGroup(PanelArbitro.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                .addComponent(jTextField1)
                                                .addComponent(jTextField3))
                                            .addGroup(PanelArbitro.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(PanelArbitro.createSequentialGroup()
                                                    .addGap(47, 47, 47)
                                                    .addGroup(PanelArbitro.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(sexo)
                                                        .addComponent(edad)
                                                        .addComponent(estado))
                                                    .addGap(33, 33, 33)
                                                    .addGroup(PanelArbitro.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelArbitro.createSequentialGroup()
                                                    .addGap(34, 34, 34)
                                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addContainerGap(24, Short.MAX_VALUE))))
                    );
                    PanelArbitro.setVerticalGroup(
                        PanelArbitro.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelArbitro.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(PanelArbitro.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dni)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edad))
                            .addGap(18, 18, 18)
                            .addGroup(PanelArbitro.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nombre)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sexo))
                            .addGap(18, 18, 18)
                            .addGroup(PanelArbitro.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(apellido)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(estado))
                            .addGap(42, 42, 42)
                            .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(144, 144, 144))
                    );
                    break;

                case "equipos":
                        dato.setModel(new javax.swing.DefaultComboBoxModel<>(Acciones.verDatoSQL("equipo","nombre")));
                        nombre.setText("NOMBRE");

                        javax.swing.GroupLayout PanelEquipo = new javax.swing.GroupLayout(jPanel1);
                        jPanel1.setLayout(PanelEquipo);
                        PanelEquipo.setHorizontalGroup(
                            PanelEquipo.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEquipo.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelEquipo.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelEquipo.createSequentialGroup()
                                        .addComponent(dato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PanelEquipo.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(nombre)
                                        .addGap(39, 39, 39)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEquipo.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enviar)
                                .addGap(17, 17, 17))
                        );
                        PanelEquipo.setVerticalGroup(
                            PanelEquipo.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEquipo.createSequentialGroup()
                                .addGroup(PanelEquipo.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelEquipo.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(125, 125, 125))
                                    .addGroup(PanelEquipo.createSequentialGroup()
                                        .addGap(183, 183, 183)
                                        .addGroup(PanelEquipo.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(nombre)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181))
                        );
                    break;

                case "usuarios":
                        dato.setModel(new javax.swing.DefaultComboBoxModel<>(Acciones.verDatoSQL("usuario","usuario")));
                        
                        nombre.setText("NOMBRE");

                        labelrol.setText("ROL");

                        rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "organizador", "usuario" }));

                        apellido.setText("Password");

                        edad.setText("Repetir pass");

                        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                        jPanel1.setLayout(jPanel1Layout);
                        jPanel1Layout.setHorizontalGroup(
                            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(dato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombre)
                                            .addComponent(labelrol)
                                            .addComponent(edad)
                                            .addComponent(apellido))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(rol, 0, 150, Short.MAX_VALUE)
                                            .addComponent(jTextField1)
                                            .addComponent(jTextField2)
                                            .addComponent(jTextField3))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enviar)
                                .addGap(26, 26, 26))
                        );
                        jPanel1Layout.setVerticalGroup(
                            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombre)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelrol)
                                    .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(apellido)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edad)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))
                        );
                    break;
            }

        } catch (Exception e) {}

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, Short.MAX_VALUE)
        );

        pack();
    }                       

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) { 
        
        boolean error= true;

        switch (Datos.tipoDato) {
            case "jugadores":
                error = modificarJugador();
            break;

            case "arbitros":
                error = modificarArbitro();
            break;

            case "equipos":
                error = modificarEquipo();
            break;

            case "usuarios":
                error = modificarUsuario();
            break;

        }
        if(error){
            JOptionPane.showMessageDialog(jFrame, "Algo ha salido mal con la modificacion"); 
        }else{
            JOptionPane.showMessageDialog(jFrame, "Se han modicado los datos");
        }
    }    

    private boolean modificarJugador(){

        boolean error = false;

        //modificar DNI
        if(jTextField1.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField1.getText(), "jugador", "DNI", dato.getSelectedItem(), "ID_Jugador");
        }
        //modificar Nombre
        if(jTextField2.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField2.getText(), "jugador", "nombre", dato.getSelectedItem(), "ID_Jugador");
        }
        //modificar Apellido
        if(jTextField3.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField3.getText(), "jugador", "apellido", dato.getSelectedItem(), "ID_Jugador");
        }
        //modificar Edad 
        if(jTextField4.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField4.getText(), "jugador", "edad", dato.getSelectedItem(), "ID_Jugador");
        }
        //modificar sexo 
        if(jTextField5.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField5.getText(), "jugador", "sexo", dato.getSelectedItem(), "ID_Jugador");
        }
         //modificar nacionalidad
        if(jTextField6.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField6.getText(), "jugador", "nacionalidad", dato.getSelectedItem(), "ID_Jugador");
        }
        //modificar Estado
        if(jTextField7.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField7.getText(), "jugador", "estado", dato.getSelectedItem(), "ID_Jugador");
        }
        //modificar Posicion
        if(jTextField8.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField8.getText(), "jugador", "posicion", dato.getSelectedItem(), "ID_Jugador");
        }
        //modificar equipo
        if(jTextField9.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField6.getText(), "jugador", "equipo", dato.getSelectedItem(), "ID_Jugador");
        }
        //modificar dorsal
        if(jTextField10.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField6.getText(), "jugador", "dorsal", dato.getSelectedItem(), "ID_Jugador");
        }
        return error;
    }

    private boolean modificarArbitro(){

        boolean error = false;
        
        //modificar DNI
        if(jTextField1.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField1.getText(), "arbitro", "DNI", dato.getSelectedItem(), "ID_arbitro");
        }
        //modificar Nombre
        if(jTextField2.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField2.getText(), "arbitro", "nombre", dato.getSelectedItem(), "ID_arbitro");
        }
        //modificar Apellido
        if(jTextField3.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField3.getText(), "arbitro", "apellido", dato.getSelectedItem(), "ID_arbitro");
        }
         //modificar edad
        if(jTextField6.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField6.getText(), "arbitro", "edad", dato.getSelectedItem(), "ID_arbitro");
        }
        //modificar sexo
        if(jTextField7.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField7.getText(), "arbitro", "sexo", dato.getSelectedItem(), "ID_arbitro");
        }
        //modificar estado
        if(jTextField8.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField8.getText(), "arbitro", "estado", dato.getSelectedItem(), "ID_arbitro");
        }
        return error;
    }

    private boolean modificarEquipo(){

        boolean error = false;
        
        //modificar nombre equipo
        if(jTextField1.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField1.getText(), "equipo", "nombre", dato.getSelectedItem(), "nombre");
        }
        return error;
    }

    private boolean modificarUsuario(){

        boolean error = false;
        
        //modificar nombre
        if(jTextField1.getText().length()!=0){
            error = Acciones.modificarDatoSQL(jTextField1.getText(), "usuario", "usuario", dato.getSelectedItem(), "usuario");
        }

        //modificar pass
        if(jTextField2.getText().length()!=0){
            if (jTextField2.getText().equals(jTextField3.getText())) {
                error = Acciones.modificarDatoSQL(jTextField1.getText(), "usuario", "PASSWORD", dato.getSelectedItem(), "usuario");
            }else{
                JOptionPane.showMessageDialog(jFrame, "La contraseña no es igual bobo"); 
                error = true;
            }
        }

        //modificar rol
        String role = (String) rol.getSelectedItem();
        error = Acciones.modificarDatoSQL(role, "usuario", "rol", dato.getSelectedItem(), "usuario");

        return error;
    }

    private javax.swing.JButton enviar;
    private javax.swing.JComboBox<String> dato;
    private javax.swing.JComboBox<String> rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel posicion;
    private javax.swing.JLabel dorsal;
    private javax.swing.JLabel equipo;
    private javax.swing.JLabel dni;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel labelrol;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel nacion;
    private javax.swing.JLabel estado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;      
}