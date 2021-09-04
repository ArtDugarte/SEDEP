package Vistas.Paneles;

import Modelos.Desplegable_Pregunta;
import Modelos.Modelo;
import Modelos.Operar_Paciente;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Panel_Paciente extends javax.swing.JPanel {

    public Panel_Paciente() {
        initComponents();
        modificar.setEnabled(false);
        crear.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre_paciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        buscar_cedula = new javax.swing.JTextField();
        lupa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_historial = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(590, 540));
        setMinimumSize(new java.awt.Dimension(590, 540));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 10, 520));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setText("Nombre y Apellido");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        nombre_paciente.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        nombre_paciente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(nombre_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 230, 30));

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel2.setText("Crear Paciente");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        cedula.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        cedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 230, 30));

        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar1.png"))); // NOI18N
        limpiar.setBorderPainted(false);
        limpiar.setContentAreaFilled(false);
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar.setFocusPainted(false);
        limpiar.setFocusable(false);
        limpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar2.png"))); // NOI18N
        limpiar.setRolloverEnabled(false);
        limpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar2.png"))); // NOI18N
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 80, 70));

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar1.png"))); // NOI18N
        modificar.setBorderPainted(false);
        modificar.setContentAreaFilled(false);
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.setFocusPainted(false);
        modificar.setFocusable(false);
        modificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar2.png"))); // NOI18N
        modificar.setRolloverEnabled(false);
        modificar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar2.png"))); // NOI18N
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 70, 70));

        crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear1.png"))); // NOI18N
        crear.setBorderPainted(false);
        crear.setContentAreaFilled(false);
        crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crear.setFocusPainted(false);
        crear.setFocusable(false);
        crear.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear2.png"))); // NOI18N
        crear.setRolloverEnabled(false);
        crear.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear2.png"))); // NOI18N
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 70, 60));

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel3.setText("Buscar Paciente");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        buscar_cedula.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        buscar_cedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(buscar_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 210, 30));

        lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa1.png"))); // NOI18N
        lupa.setBorderPainted(false);
        lupa.setContentAreaFilled(false);
        lupa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupa.setFocusPainted(false);
        lupa.setFocusable(false);
        lupa.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa2.png"))); // NOI18N
        lupa.setRolloverEnabled(false);
        lupa.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa2.png"))); // NOI18N
        lupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaActionPerformed(evt);
            }
        });
        add(lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 40, -1));

        lista_historial.setBackground(new java.awt.Color(255, 215, 197));
        lista_historial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lista_historial.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(lista_historial);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 280, 400));

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel4.setText("Cédula de Identidad");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel5.setText("Limpiar Campos");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel6.setText("Modificar Paciente");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed

        nombre_paciente.setText("");
        cedula.setText("");
        buscar_cedula.setText("");
        modificar.setEnabled(false);
        crear.setEnabled(true);
        DefaultListModel historial = new DefaultListModel();
        lista_historial.setModel(historial);
    }//GEN-LAST:event_limpiarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed

        if (cedula.getText().equals("") || nombre_paciente.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else {

            Operar_Paciente op = new Operar_Paciente();
            op.Crear(cedula.getText().toUpperCase(), nombre_paciente.getText().toUpperCase());
            cedula.setText("");
            nombre_paciente.setText("");
            buscar_cedula.setText("");
        }
    }//GEN-LAST:event_crearActionPerformed

    private void lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaActionPerformed

        if (buscar_cedula.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            m = new Modelo();
            Operar_Paciente op = new Operar_Paciente();
            m = op.buscar_paciente(buscar_cedula.getText());

            if (m != null) {

                ci = buscar_cedula.getText();
                cedula.setText(m.getCedula());
                nombre_paciente.setText(m.getNombre());
                modificar.setEnabled(true);
                crear.setEnabled(false);
                cargarHistorial(m.getId_p());
            }
        }
    }//GEN-LAST:event_lupaActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        if (cedula.getText().equals("") && nombre_paciente.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else if (cedula.getText().equals(ci)) {

            Operar_Paciente op = new Operar_Paciente();
            op.modificar(nombre_paciente.getText().toUpperCase(), cedula.getText());
            nombre_paciente.setText("");
            cedula.setText("");
            buscar_cedula.setText("");
            modificar.setEnabled(false);
            crear.setEnabled(true);
        } else {

            Operar_Paciente op = new Operar_Paciente();
            op.modificar(nombre_paciente.getText().toUpperCase(), cedula.getText(),ci);
            nombre_paciente.setText("");
            cedula.setText("");
            buscar_cedula.setText("");
            modificar.setEnabled(false);
            crear.setEnabled(true);
        }
    }//GEN-LAST:event_modificarActionPerformed

    public void cargarHistorial(int id) {

        Operar_Paciente op = new Operar_Paciente();
        listapre = op.Historial(id);

        DefaultListModel historial = new DefaultListModel();
        lista_historial.setModel(historial);

        if (listapre.size() > 0) {
            for (int i = 0; i < listapre.size(); i++) {
                
                historial.addElement(listapre.get(i));
            }
        }
    }
    
    Modelo m;
    String ci;
    ArrayList<String> listapre;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscar_cedula;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton crear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JList<String> lista_historial;
    private javax.swing.JButton lupa;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre_paciente;
    // End of variables declaration//GEN-END:variables
}
