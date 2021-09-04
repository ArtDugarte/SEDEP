package Vistas.Paneles;

import BD.BDConex;
import Modelos.Desplegable_Pregunta;
import Modelos.Modelo;
import Modelos.Mostrar_Historial;
import Modelos.Operar_Test;
import Vistas.login;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Panel_Paciente_Test extends javax.swing.JPanel {

    login us = new login();
    Modelo ve = new Modelo();
    Mostrar_Historial mh = new Mostrar_Historial();
    String Pac = "";
    Panel_Paciente_Historial act;
    int id_r = 0;

    public void up() {
        act.cargar_historial();
    }

    public Panel_Paciente_Test(String usuario) {
        initComponents();
        cargar_preguntas();
        diagnosticos = new Operar_Test().lista();
        this.usuario = usuario;
        act = new Panel_Paciente_Historial(usuario);
        Modelo ve = mh.Comparar(usuario);
        Pac = ve.getId_paciente();
        up();
    }

    public void limpiar() {
        cargar_preguntas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TerminarT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Preguntas_Test = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        limpiar1 = new javax.swing.JButton();
        TxtFecha = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(590, 540));
        jPanel1.setMinimumSize(new java.awt.Dimension(590, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(590, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TerminarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diagnostico1.png"))); // NOI18N
        TerminarT.setBorderPainted(false);
        TerminarT.setContentAreaFilled(false);
        TerminarT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TerminarT.setFocusPainted(false);
        TerminarT.setFocusable(false);
        TerminarT.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diagnostico2.png"))); // NOI18N
        TerminarT.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diagnostico2.png"))); // NOI18N
        TerminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarTActionPerformed(evt);
            }
        });
        jPanel1.add(TerminarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 70, 80));

        Preguntas_Test.setBackground(new java.awt.Color(255, 255, 255));
        Preguntas_Test.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        Preguntas_Test.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Preguntas_Test.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(Preguntas_Test);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 550, 410));

        label.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        label.setText("Terminar Test");
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        jLabel2.setText("Limpiar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        limpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar1.png"))); // NOI18N
        limpiar1.setBorderPainted(false);
        limpiar1.setContentAreaFilled(false);
        limpiar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar1.setFocusPainted(false);
        limpiar1.setFocusable(false);
        limpiar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar2.png"))); // NOI18N
        limpiar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar1.png"))); // NOI18N
        limpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar1ActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 70, 70));

        TxtFecha.setText("jLabel1");
        jPanel1.add(TxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TerminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarTActionPerformed

        int terminar = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea terminar el test?", "CONFIRMAR", JOptionPane.YES_NO_OPTION);
        boolean correcto = true;

        switch (terminar) {
            case 0:

                String diagnostico = "";
                lista_aux = new ArrayList<Integer>();
                id_r = 0;

                for (int j = 0; j < listapre.size(); j++) {
                    
                    if (cb[j].isSelected()) {
                        
                        lista_aux.add(listapre.get(j).getId_pregunta());
                    }
                }

                for (int i = 0; i < diagnosticos.size(); i++) {

                    correcto = true;
                    preguntas = new Operar_Test().lista_pd(diagnosticos.get(i).getId_diagnostico());
                       
                    if(lista_aux.size() == preguntas.size()){
                        
                        for(int j = 0; j < preguntas.size(); j++){
                            
                            if(lista_aux.get(j) != preguntas.get(j).getId_pregunta()){
                                
                                correcto = false;
                            }
                        }
                    }
                    else{
                        
                        correcto = false;
                    }
                    
                    if(correcto == true){
                        
                        id_r = diagnosticos.get(i).getId_diagnostico();
                        diagnostico = diagnosticos.get(i).getNombre_diagnostico();
                        i = diagnosticos.size();
                    }
                }
                
                if(correcto == false){
                    
                    diagnostico = "Desconocido";
                }
                
                JOptionPane.showMessageDialog(this, "Su diagnóstico es: " + diagnostico);
                
                if(correcto == true && id_r != 0){
                    enviar_test();
                }
                
                limpiar();
                this.setVisible(false);
            break;
        }
    }//GEN-LAST:event_TerminarTActionPerformed

    public void cargar_preguntas() {

        Desplegable_Pregunta lista = new Desplegable_Pregunta();
        listapre = lista.Desplegable();

        if (listapre.size() > 0) {

            Preguntas_Test.removeAll();
            Preguntas_Test.repaint();
            GridLayout gl = new GridLayout(listapre.size(), 1);
            Preguntas_Test.setLayout(gl);
            cb = new JCheckBox[listapre.size()];

            for (int i = 0; i < listapre.size(); i++) {

                cb[i] = new JCheckBox(listapre.get(i).getPregunta());
                cb[i].setFont(new Font("Rockwell Condensed", Font.BOLD, 14));
                cb[i].setSelected(false);
                Preguntas_Test.add(cb[i]);
            }
        }
        Dimension tamanhoTextArea = Preguntas_Test.getSize();
        Point p = new Point(0, tamanhoTextArea.height);
        jScrollPane1.getViewport().setViewPosition(p);
    }

    public void enviar_test() {

        BDConex con = new BDConex();
        Connection cn = con.getConexion();

        PreparedStatement hist;
        try {

            hist = cn.prepareStatement("INSERT INTO Historial (fecha, id_paciente, id_resultado) VALUES (?,?,?)");
            hist.setString(1, FechaD());
            hist.setString(2, Pac);
            hist.setInt(3, id_r);
            hist.executeUpdate();
            up();
            Generar_Reporte();
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Paciente_Test.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cargar_diagnostico() {
        Desplegable_Pregunta lista = new Desplegable_Pregunta();
        listapre = lista.Desplegable();

        if (listapre.size() > 0) {

            Preguntas_Test.removeAll();
            Preguntas_Test.repaint();
            GridLayout gl = new GridLayout(listapre.size(), 1);
            Preguntas_Test.setLayout(gl);
            cb = new JCheckBox[listapre.size()];

            for (int i = 0; i < listapre.size(); i++) {

                cb[i] = new JCheckBox(listapre.get(i).getPregunta());
                cb[i].setFont(new Font("Rockwell Condensed", Font.BOLD, 14));
                cb[i].setSelected(false);
                Preguntas_Test.add(cb[i]);
            }
        }
    }

    public void Generar_Reporte() {
        BDConex con = new BDConex();
        Connection cn = con.getConexion();
        try {
            JasperReport reporte = null;
            String path = "C:\\SEDEP\\report1.jasper";

            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer ver = new JasperViewer(jprint, false);
            ver.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            ver.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Panel_Paciente_Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String FechaD() {
        Date fecha = new Date();
        SimpleDateFormat FormFecha = new SimpleDateFormat("dd/MM/yyyy");
        return FormFecha.format(fecha);
    }

    private void limpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar1ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_limpiar1ActionPerformed

    ArrayList<Modelo> listaaux;
    String usuario = "";
    ArrayList<Modelo> listad;
    JCheckBox[] cb;
    ArrayList<Modelo> listapre;
    ArrayList<Modelo> diagnosticos;
    ArrayList<Modelo> preguntas;
    ArrayList<Integer> lista_aux;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Preguntas_Test;
    private javax.swing.JButton TerminarT;
    private javax.swing.JLabel TxtFecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JButton limpiar1;
    // End of variables declaration//GEN-END:variables
}
