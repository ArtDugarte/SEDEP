package Vistas.Paneles;

import BD.BDConex;
import Modelos.Modelo;
import Modelos.Mostrar_Historial;
import Vistas.login;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Panel_Paciente_Historial extends javax.swing.JPanel {
    login us = new login();
    Modelo ve = new Modelo();
    Mostrar_Historial mh = new Mostrar_Historial();
    String Pac = "";
    String usuario = "";
    
    public Panel_Paciente_Historial(String usuario) {
        initComponents();
        cargar_historial(); 
        TbHistorial.getTableHeader().setFont(new Font("Rockwell Condensed", 0, 25));
        TbHistorial.setEnabled(false);
        this.usuario = usuario;
        Modelo ve = mh.Comparar(usuario);
        Pac = ve.getId_paciente();
    }

    public void cargar_historial() {
        BDConex con = new BDConex();
        Connection cn = con.getConexion();
        String sql = "SELECT historial.fecha, resultado.diagnostico FROM historial JOIN resultado ON historial.id_resultado = resultado.id "
                + "ORDER BY historial.id desc;";
        Statement st;
        
        DefaultTableModel Historial = new DefaultTableModel();        
        
        Historial.addColumn("Fecha");
        Historial.addColumn("Diagnóstico");

        TbHistorial.setModel(Historial);
        
        String[] Ht = new String[4];

        try {
            st = cn.createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                Ht[0] = result.getString(1);
                Ht[1] = result.getString(2);
                Historial.addRow(Ht);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Paciente_Historial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JScroll = new javax.swing.JScrollPane();
        TbHistorial = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        JScroll.setBackground(new java.awt.Color(255, 255, 255));
        JScroll.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JScroll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JScroll.setFocusable(false);
        JScroll.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N

        TbHistorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153)));
        TbHistorial.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        TbHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbHistorial.getTableHeader().setReorderingAllowed(false);
        JScroll.setViewportView(TbHistorial);
        if (TbHistorial.getColumnModel().getColumnCount() > 0) {
            TbHistorial.getColumnModel().getColumn(0).setResizable(false);
            TbHistorial.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JScroll)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JScroll)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScroll;
    private javax.swing.JTable TbHistorial;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
