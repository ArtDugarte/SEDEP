package Vistas.Paneles;

import Modelos.Desplegable_Diagnostico;
import Modelos.Desplegable_Pregunta;
import Modelos.Modelo;
import Modelos.Operar_Diagnostico;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Panel_Diagnostico extends javax.swing.JPanel {

    public Panel_Diagnostico() {
        initComponents();
        cargarCB();
        desplegable.setSelectedIndex(-1);
        diagnostico.setText("");
        recomendaciones.setText("");
        borrar.setEnabled(false);
        crear.setEnabled(true);
        recomendaciones.setLineWrap(true);
        diagnostico.setEditable(true);
        recomendaciones.setEditable(true);
        cargar_preguntas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        recomendaciones = new javax.swing.JTextArea();
        desplegable = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        diagnostico = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Preguntas = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(590, 540));
        setMinimumSize(new java.awt.Dimension(590, 540));
        setName("Panel Diagnóstico"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 10, 520));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setText("Diagnóstico");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel2.setText("Crear Diagnóstico");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));

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
        add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 80, 70));

        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar1.png"))); // NOI18N
        borrar.setBorderPainted(false);
        borrar.setContentAreaFilled(false);
        borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrar.setFocusPainted(false);
        borrar.setFocusable(false);
        borrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar2.png"))); // NOI18N
        borrar.setRolloverEnabled(false);
        borrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar2.png"))); // NOI18N
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 50, 70));

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
        add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 50, 70));

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel3.setText("Preguntas Disponibles");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel5.setText("Limpiar Campos");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel6.setText("Borrar Diagnóstico");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        recomendaciones.setColumns(20);
        recomendaciones.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        recomendaciones.setRows(5);
        recomendaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        recomendaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(recomendaciones);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 230, 140));

        desplegable.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        desplegable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pregunta 1", "Pregunta 2", "Pregunta 3", "Pregunta 4", "Pregunta 5", "Pregunta 6" }));
        desplegable.setSelectedIndex(-1);
        desplegable.setBorder(null);
        desplegable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                desplegableItemStateChanged(evt);
            }
        });
        add(desplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 240, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel4.setText("Recomendaciones");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        diagnostico.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        diagnostico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(diagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 230, 30));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Preguntas.setBackground(new java.awt.Color(255, 255, 255));
        Preguntas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(Preguntas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 220));

        jLabel7.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel7.setText("Buscar Diagnóstico");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed

        cargarCB();
        cargar_preguntas();
        desplegable.setSelectedIndex(-1);
        borrar.setEnabled(false);
        crear.setEnabled(true);
        desplegable.setSelectedIndex(-1);
        recomendaciones.setText("");
        diagnostico.setText("");
        diagnostico.setEditable(true);
        recomendaciones.setEditable(true);
    }//GEN-LAST:event_limpiarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed

        if (diagnostico.getText().equals("") || recomendaciones.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean vacio;
            vacio = true;

            for (int i = 0; i < listapre.size(); i++) {

                if (cb[i].isSelected()) {

                    vacio = false;
                    i = listapre.size();
                }
            }
            if (vacio == true) {
                JOptionPane.showMessageDialog(null, "   ¡Debes añadir alguna pregunta!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                boolean correcto;
                correcto = false;

                Operar_Diagnostico op = new Operar_Diagnostico();
                correcto = op.Crear(diagnostico.getText().toUpperCase(), recomendaciones.getText().toUpperCase());

                if (correcto) {

                    for (int i = 0; i < listapre.size(); i++) {

                        if (cb[i].isSelected()) {

                            op.agregar_pregunta(listapre.get(i).getId_pregunta());
                        }
                    }

                    JOptionPane.showMessageDialog(null, "     ¡Creación Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
                    cargarCB();
                    cargar_preguntas();
                    desplegable.setSelectedIndex(-1);
                    borrar.setEnabled(false);
                    crear.setEnabled(true);
                    desplegable.setSelectedIndex(-1);
                    recomendaciones.setText("");
                    diagnostico.setText("");
                }
            }
        }
    }//GEN-LAST:event_crearActionPerformed

    private void desplegableItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_desplegableItemStateChanged

        if (desplegable.getSelectedIndex() >= 0) {

            diagnostico.setText(listad.get(desplegable.getSelectedIndex()).getDiagnostico());
            recomendaciones.setText(listad.get(desplegable.getSelectedIndex()).getRecomendacion());
            borrar.setEnabled(true);
            crear.setEnabled(false);
            diagnostico.setEditable(false);
            recomendaciones.setEditable(false);

            Desplegable_Diagnostico op = new Desplegable_Diagnostico();
            listaaux = op.Preguntas(listad.get(desplegable.getSelectedIndex()).getId_diagnostico());
            int p = 0;
            cargar_preguntas();

            for (int i = 0; i < listaaux.size(); i++) {
                p = listaaux.get(i).getId_pregunta();

                for (int j = 0; j < listapre.size(); j++) {

                    if (p == listapre.get(j).getId_pregunta()) {

                        cb[j].setSelected(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_desplegableItemStateChanged

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        
        Operar_Diagnostico op = new Operar_Diagnostico();
        op.borrar(listad.get(desplegable.getSelectedIndex()).getId_diagnostico());
        
        cargarCB();
        cargar_preguntas();
        desplegable.setSelectedIndex(-1);
        borrar.setEnabled(false);
        crear.setEnabled(true);
        desplegable.setSelectedIndex(-1);
        recomendaciones.setText("");
        diagnostico.setText("");

    }//GEN-LAST:event_borrarActionPerformed

    public void cargar_preguntas() {

        Desplegable_Pregunta lista = new Desplegable_Pregunta();
        listapre = lista.Desplegable();

        if (listapre.size() > 0) {

            Preguntas.removeAll();
            Preguntas.repaint();
            GridLayout gl = new GridLayout(listapre.size(), 1);
            Preguntas.setLayout(gl);
            cb = new JCheckBox[listapre.size()];

            for (int i = 0; i < listapre.size(); i++) {

                cb[i] = new JCheckBox(listapre.get(i).getPregunta());
                cb[i].setFont(new Font("Rockwell Condensed", Font.BOLD, 14));
                cb[i].setSelected(false);
                Preguntas.add(cb[i]);
            }
        }
        Dimension tamanhoTextArea = Preguntas.getSize();
        Point p = new Point(0, tamanhoTextArea.height);
        jScrollPane1.getViewport().setViewPosition(p);
    }

    public void cargarCB() {

        desplegable.removeAllItems();
        Desplegable_Diagnostico lista = new Desplegable_Diagnostico();
        listad = lista.Desplegable();

        if (listad.size() > 0) {
            for (int i = 0; i < listad.size(); i++) {

                desplegable.addItem(listad.get(i).getDiagnostico());
            }
        }
        desplegable.setSelectedIndex(-1);
        borrar.setEnabled(false);
        crear.setEnabled(true);
        desplegable.setSelectedIndex(-1);
        recomendaciones.setText("");
        diagnostico.setText("");
        diagnostico.setEditable(true);
        recomendaciones.setEditable(true);
    }

    ArrayList<Modelo> listaaux;
    ArrayList<Modelo> listad;
    JCheckBox[] cb;
    ArrayList<Modelo> listapre;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Preguntas;
    private javax.swing.JButton borrar;
    private javax.swing.JButton crear;
    private javax.swing.JComboBox<String> desplegable;
    private javax.swing.JTextField diagnostico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextArea recomendaciones;
    // End of variables declaration//GEN-END:variables
}
