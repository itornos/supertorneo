package Menus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import conexionSql.SQL;

public class Importar extends javax.swing.JFrame {

    public Importar() {
        initComponents();
    }

    static String tabla = "";

    public static void ejecutar(String tabla) {
        Importar.tabla = tabla;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Importar menu = new Importar();
                menu.setLocationRelativeTo(null);
                menu.setVisible(true);			
            }
        });
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        texto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jugador = new javax.swing.JMenuItem();
        arbitro = new javax.swing.JMenuItem();
        clasificacion = new javax.swing.JMenuItem();
        equipos = new javax.swing.JMenuItem();
        registro = new javax.swing.JMenuItem();
        csesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jButton11.setText("IMPORTAR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton11ActionPerformed(evt);
                } catch (FileNotFoundException e) {
                }
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(204, 0, 102));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IMPORTAR JUGADOR");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        texto.setText("texto");

        jLabel2.setText("EL FICHERO DEBE CONTENER LOS DATOS SEPARADOS POR ");

        jLabel3.setText("RUTA Y NOMBRE DEL FICHERO TXT A IMPORTAR");

        jLabel4.setText("PUNTOS Y COMAS Y ORDENADO TENIENDO EN CUENTA");

        jLabel5.setText("LA TABLA CORRESPONDIENTE EN LA BASE DE DATOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(texto))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

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

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException { 
        File prueba = new File(texto.getText());
        if(prueba.exists()){
            switch (Importar.tabla){

                case "jugador":
                    SQL.importarRegistroJugadorSQL(SQL.leer(texto.getText()));
                break;

                case "arbitro":
                    SQL.importarRegistroArbitroSQL(SQL.leer(texto.getText()));
                break;

                case "equipo":
                    importarRegistroEquipoSQL(SQL.leer(texto.getText()));
                break;
            }
            
        }else{
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "No existe el archivo especificado");
        }                                
        
    }                                         
                
    private void importarRegistroEquipoSQL(ArrayList<String[]> leer) {
    }

    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField texto;  
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jugador;
    private javax.swing.JMenuItem csesion;
    private javax.swing.JMenuItem arbitro;
    private javax.swing.JMenuItem clasificacion;
    private javax.swing.JMenuItem registro;
    private javax.swing.JMenuItem equipos;               
}

