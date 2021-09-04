package Vistas.Paneles;

import Modelos.Desplegable_Pregunta;
import Modelos.Modelo;
import Modelos.Operar_Pregunta;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Panel_Preguntas extends javax.swing.JPanel {

    public Panel_Preguntas() {
        initComponents();
        cargarCB();
        desplegable.setSelectedIndex(-1);
        pregunta.setText("");
        modificar.setEnabled(false);
        crear.setEnabled(true);
        pregunta.setLineWrap(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_historial = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pregunta = new javax.swing.JTextArea();
        desplegable = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(590, 540));
        setMinimumSize(new java.awt.Dimension(590, 540));
        setName("Panel Preguntas"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 10, 520));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setText("Pregunta para el Test");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel2.setText("Crear Pregunta");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

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
        jLabel3.setText("Buscar Pregunta");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        lista_historial.setBackground(new java.awt.Color(255, 215, 197));
        lista_historial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lista_historial.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(lista_historial);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 280, 400));

        jLabel5.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel5.setText("Limpiar Campos");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel6.setText("Modificar Pregunta");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pregunta.setColumns(20);
        pregunta.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        pregunta.setRows(5);
        pregunta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(pregunta);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 240, 140));

        desplegable.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        desplegable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pregunta 1", "Pregunta 2", "Pregunta 3", "Pregunta 4", "Pregunta 5", "Pregunta 6" }));
        desplegable.setSelectedIndex(-1);
        desplegable.setBorder(null);
        desplegable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable.setFocusable(false);
        desplegable.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                desplegableItemStateChanged(evt);
            }
        });
        add(desplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 240, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed

        cargarCB();
        desplegable.setSelectedIndex(-1);
        pregunta.setText("");
        modificar.setEnabled(false);
        crear.setEnabled(true);
    }//GEN-LAST:event_limpiarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed

        if (pregunta.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            Operar_Pregunta op = new Operar_Pregunta();
            op.Crear(pregunta.getText().toUpperCase());
            cargarCB();
            desplegable.setSelectedIndex(-1);
            pregunta.setText("");
            modificar.setEnabled(false);
            crear.setEnabled(true);
        }
    }//GEN-LAST:event_crearActionPerformed

    private void desplegableItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_desplegableItemStateChanged

        if (desplegable.getSelectedIndex() >= 0) {

            pregunta.setText(listapre.get(desplegable.getSelectedIndex()).getPregunta());
            modificar.setEnabled(true);
            crear.setEnabled(false);
        }
    }//GEN-LAST:event_desplegableItemStateChanged

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        if (pregunta.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            
            Operar_Pregunta op = new Operar_Pregunta();
            op.modificar(pregunta.getText().toUpperCase(), listapre.get(desplegable.getSelectedIndex()).getId_pregunta());
            cargarCB();
            desplegable.setSelectedIndex(-1);
            pregunta.setText("");
            modificar.setEnabled(false);
            crear.setEnabled(true);
        }
    }//GEN-LAST:event_modificarActionPerformed

    public void cargarCB() {

        desplegable.removeAllItems();
        Desplegable_Pregunta lista = new Desplegable_Pregunta();
        listapre = lista.Desplegable();

        DefaultListModel historial = new DefaultListModel();
        lista_historial.setModel(historial);

        if (listapre.size() > 0) {
            for (int i = 0; i < listapre.size(); i++) {

                desplegable.addItem(listapre.get(i).getPregunta());
                historial.addElement(listapre.get(i).getPregunta());
            }
        }
        desplegable.setSelectedIndex(-1);
        pregunta.setText("");
        modificar.setEnabled(false);
        crear.setEnabled(true);
    }
    
    ArrayList<Modelo> listapre;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crear;
    private javax.swing.JComboBox<String> desplegable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiar;
    private javax.swing.JList<String> lista_historial;
    private javax.swing.JButton modificar;
    private javax.swing.JTextArea pregunta;
    // End of variables declaration//GEN-END:variables
}
