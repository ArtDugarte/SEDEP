package Vistas;

import Modelos.Operar_Usuario;
import Vistas.Paneles.Panel_Diagnostico;
import Vistas.Paneles.Panel_Paciente;
import Vistas.Paneles.Panel_Paciente_Historial;
import Vistas.Paneles.Panel_Paciente_Test;
import Vistas.Paneles.Panel_Preguntas;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class principal extends javax.swing.JFrame {

    public principal(String usuario, boolean admin) {
        initComponents();
        this.usuario = usuario;
        this.admin = admin;
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login1.png")).getImage());
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        }
        setLocationRelativeTo(null);
        myDate = new Date();
        fecha.setText(new SimpleDateFormat("dd/MM/yyyy").format(myDate));

        if (admin == true) {

            panel_experto.setVisible(true);
            panel_paciente.setVisible(false);
        } else {
            panel_experto.setVisible(false);
            panel_paciente.setVisible(true);
            prt = new Panel_Paciente_Test(usuario);
            ph = new Panel_Paciente_Historial(usuario);
            Capas.add(prt);
            Capas.add(ph);
            prt.setVisible(false);
            ph.setVisible(false);
        }

        pp = new Panel_Paciente();
        ppre = new Panel_Preguntas();
        pd = new Panel_Diagnostico();
        Capas.add(pp);
        Capas.add(ppre);
        Capas.add(pd);
        pd.setVisible(false);
        pp.setVisible(false);
        ppre.setVisible(false);
        panel_transparente.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        contenedor_botones = new javax.swing.JPanel();
        panel_experto = new javax.swing.JPanel();
        diagnostico = new javax.swing.JButton();
        preguntas_test = new javax.swing.JButton();
        pacientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        clave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panel_paciente = new javax.swing.JPanel();
        historial = new javax.swing.JButton();
        realizar_test = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        clave_paciente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Capas = new javax.swing.JLayeredPane();
        panel_transparente = new javax.swing.JPanel();
        fondo = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setName("principal"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botones.setBackground(new java.awt.Color(255, 215, 197));
        botones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fecha.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        fecha.setText("00/00/0000");
        botones.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        contenedor_botones.setOpaque(false);
        contenedor_botones.setLayout(new java.awt.CardLayout());

        panel_experto.setBackground(new java.awt.Color(255, 215, 197));
        panel_experto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        panel_experto.setMaximumSize(new java.awt.Dimension(290, 510));
        panel_experto.setMinimumSize(new java.awt.Dimension(290, 510));
        panel_experto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diagnostico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diagnostico1.png"))); // NOI18N
        diagnostico.setBorderPainted(false);
        diagnostico.setContentAreaFilled(false);
        diagnostico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        diagnostico.setFocusPainted(false);
        diagnostico.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diagnostico2.png"))); // NOI18N
        diagnostico.setRolloverEnabled(false);
        diagnostico.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diagnostico2.png"))); // NOI18N
        diagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosticoActionPerformed(evt);
            }
        });
        panel_experto.add(diagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 60, -1));

        preguntas_test.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preguntas1.png"))); // NOI18N
        preguntas_test.setBorderPainted(false);
        preguntas_test.setContentAreaFilled(false);
        preguntas_test.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        preguntas_test.setFocusPainted(false);
        preguntas_test.setFocusable(false);
        preguntas_test.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preguntas2.png"))); // NOI18N
        preguntas_test.setRolloverEnabled(false);
        preguntas_test.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preguntas2.png"))); // NOI18N
        preguntas_test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preguntas_testActionPerformed(evt);
            }
        });
        panel_experto.add(preguntas_test, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 70, -1));

        pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente.png"))); // NOI18N
        pacientes.setBorderPainted(false);
        pacientes.setContentAreaFilled(false);
        pacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pacientes.setFocusPainted(false);
        pacientes.setFocusable(false);
        pacientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente2.png"))); // NOI18N
        pacientes.setRolloverEnabled(false);
        pacientes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente2.png"))); // NOI18N
        pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacientesActionPerformed(evt);
            }
        });
        panel_experto.add(pacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 60, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel2.setText("Pacientes");
        panel_experto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel3.setText("Preguntas del Test");
        panel_experto.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel4.setText("Cambiar Contraseña");
        panel_experto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panel_experto.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 270, 3));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panel_experto.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, 3));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setFocusable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panel_experto.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 270, 3));

        clave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clave1.png"))); // NOI18N
        clave.setBorderPainted(false);
        clave.setContentAreaFilled(false);
        clave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clave.setFocusPainted(false);
        clave.setFocusable(false);
        clave.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clave2.png"))); // NOI18N
        clave.setRolloverEnabled(false);
        clave.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clave2.png"))); // NOI18N
        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });
        panel_experto.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 60, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel5.setText("Diagnósticos");
        panel_experto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        contenedor_botones.add(panel_experto, "card2");

        panel_paciente.setBackground(new java.awt.Color(255, 215, 197));
        panel_paciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        panel_paciente.setMaximumSize(new java.awt.Dimension(290, 510));
        panel_paciente.setMinimumSize(new java.awt.Dimension(290, 510));
        panel_paciente.setPreferredSize(new java.awt.Dimension(290, 510));
        panel_paciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historial1.png"))); // NOI18N
        historial.setBorderPainted(false);
        historial.setContentAreaFilled(false);
        historial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historial.setFocusPainted(false);
        historial.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historial2.png"))); // NOI18N
        historial.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historial2.png"))); // NOI18N
        historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialActionPerformed(evt);
            }
        });
        panel_paciente.add(historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 70, -1));

        realizar_test.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preguntas1.png"))); // NOI18N
        realizar_test.setBorderPainted(false);
        realizar_test.setContentAreaFilled(false);
        realizar_test.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        realizar_test.setFocusPainted(false);
        realizar_test.setFocusable(false);
        realizar_test.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preguntas2.png"))); // NOI18N
        realizar_test.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preguntas2.png"))); // NOI18N
        realizar_test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizar_testActionPerformed(evt);
            }
        });
        panel_paciente.add(realizar_test, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 90, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel6.setText("Realizar Test");
        panel_paciente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 130, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel7.setText("Cambiar Contraseña");
        panel_paciente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panel_paciente.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 270, 3));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panel_paciente.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 270, 3));

        clave_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clave1.png"))); // NOI18N
        clave_paciente.setBorderPainted(false);
        clave_paciente.setContentAreaFilled(false);
        clave_paciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clave_paciente.setFocusPainted(false);
        clave_paciente.setFocusable(false);
        clave_paciente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clave2.png"))); // NOI18N
        clave_paciente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clave2.png"))); // NOI18N
        clave_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clave_pacienteActionPerformed(evt);
            }
        });
        panel_paciente.add(clave_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 60, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel8.setText("Ver Historial");
        panel_paciente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        contenedor_botones.add(panel_paciente, "card3");

        botones.add(contenedor_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 290, 510));

        getContentPane().add(botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 600));

        Capas.setLayout(new java.awt.CardLayout());

        panel_transparente.setOpaque(false);

        javax.swing.GroupLayout panel_transparenteLayout = new javax.swing.GroupLayout(panel_transparente);
        panel_transparente.setLayout(panel_transparenteLayout);
        panel_transparenteLayout.setHorizontalGroup(
            panel_transparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        panel_transparenteLayout.setVerticalGroup(
            panel_transparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        Capas.add(panel_transparente, "card2");

        getContentPane().add(Capas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 590, 540));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar1.png"))); // NOI18N
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setFocusPainted(false);
        salir.setFocusable(false);
        salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar2.png"))); // NOI18N
        salir.setRolloverEnabled(false);
        salir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar2.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        fondo.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 40, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 710, 600));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 610, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void pacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacientesActionPerformed

        pp.setVisible(true);
        ppre.setVisible(false);
        panel_transparente.setVisible(false);
        pd.setVisible(false);
    }//GEN-LAST:event_pacientesActionPerformed

    private void claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveActionPerformed

        String clave_ant;
        String clave_nueva;
        clave_ant = "";
        clave_nueva = "";

        clave_ant = JOptionPane.showInputDialog(null, "Ingrese la contraseña actual:", "CAMBIO DE CONTRASEÑA", JOptionPane.QUESTION_MESSAGE);

        if (clave_ant.equals("")) {

            JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else if (new Operar_Usuario().Consultar(clave_ant, usuario)) {

            Operar_Usuario op = new Operar_Usuario();
            clave_nueva = JOptionPane.showInputDialog(null, "Ingrese la nueva contraseña:", "CAMBIO DE CONTRASEÑA", JOptionPane.QUESTION_MESSAGE);

            if (clave_nueva.equals("")) {

                JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                op.modificar(clave_ant, clave_nueva, usuario);
            }

        } else {

            JOptionPane.showMessageDialog(null, "¡Contraseña Incorrecta!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_claveActionPerformed

    private void preguntas_testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preguntas_testActionPerformed

        pp.setVisible(false);
        ppre.setVisible(true);
        panel_transparente.setVisible(false);
        pd.setVisible(false);
        ppre.cargarCB();
    }//GEN-LAST:event_preguntas_testActionPerformed

    private void diagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosticoActionPerformed

        pp.setVisible(false);
        ppre.setVisible(false);
        panel_transparente.setVisible(false);
        pd.setVisible(true);
        pd.cargarCB();
        pd.cargar_preguntas();
    }//GEN-LAST:event_diagnosticoActionPerformed

    private void realizar_testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizar_testActionPerformed
        pp.setVisible(false);
        prt.setVisible(true);
        ph.setVisible(false);
        panel_transparente.setVisible(false);
    }//GEN-LAST:event_realizar_testActionPerformed

    private void historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialActionPerformed
        ph.cargar_historial();
        pp.setVisible(false);
        prt.setVisible(false);
        ph.setVisible(true);
        panel_transparente.setVisible(false);
    }//GEN-LAST:event_historialActionPerformed

    private void clave_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clave_pacienteActionPerformed
        String clave_ant;
        String clave_nueva;
        clave_ant = "";
        clave_nueva = "";

        clave_ant = JOptionPane.showInputDialog(null, "Ingrese la contraseña actual:", "CAMBIO DE CONTRASEÑA", JOptionPane.QUESTION_MESSAGE);

        try {
            if (clave_ant.equals("")) {

                JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

            } else if (new Operar_Usuario().Consultar(clave_ant, usuario)) {

                Operar_Usuario op = new Operar_Usuario();
                clave_nueva = JOptionPane.showInputDialog(null, "Ingrese la nueva contraseña:", "CAMBIO DE CONTRASEÑA", JOptionPane.QUESTION_MESSAGE);

                if (clave_nueva.equals("")) {

                    JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                } else {
                    op.modificar(clave_ant, clave_nueva, usuario);
                }

            } else {

                JOptionPane.showMessageDialog(null, "¡Contraseña Incorrecta!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_clave_pacienteActionPerformed

    private Date myDate;
    private Panel_Paciente pp;
    private Panel_Preguntas ppre;
    private Panel_Diagnostico pd;
    private String usuario;
    private boolean admin;
    private Panel_Paciente_Test prt;
    private Panel_Paciente_Historial ph;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Capas;
    private javax.swing.JPanel botones;
    private javax.swing.JButton clave;
    private javax.swing.JButton clave_paciente;
    private javax.swing.JPanel contenedor_botones;
    private javax.swing.JButton diagnostico;
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton historial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton pacientes;
    private javax.swing.JPanel panel_experto;
    private javax.swing.JPanel panel_paciente;
    private javax.swing.JPanel panel_transparente;
    private javax.swing.JButton preguntas_test;
    private javax.swing.JButton realizar_test;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
