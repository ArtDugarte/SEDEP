package Vistas;

import Modelos.Modelo;
import Modelos.Operar_Login;
import Modelos.Operar_Usuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login1.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        clave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SEDEP");
        setBackground(new java.awt.Color(255, 215, 197));
        setForeground(new java.awt.Color(255, 215, 197));
        setMaximumSize(new java.awt.Dimension(400, 600));
        setMinimumSize(new java.awt.Dimension(400, 600));
        setName("Login"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        login.setBackground(new java.awt.Color(255, 215, 197));
        login.setMaximumSize(new java.awt.Dimension(400, 600));
        login.setMinimumSize(new java.awt.Dimension(400, 600));
        login.setPreferredSize(new java.awt.Dimension(400, 600));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login1.png"))); // NOI18N
        jLabel1.setToolTipText("");
        login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 310, 310));

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 30)); // NOI18N
        jLabel3.setText("Usuario:");
        login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel4.setText("Inicio de Sesión");
        login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell Condensed", 1, 30)); // NOI18N
        jLabel5.setText("Contraseña:");
        login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        usuario.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        login.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 250, 26));

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
        login.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 40, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar1.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        login.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, -1, -1));

        clave.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        clave.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        login.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 250, 26));

        getContentPane().add(login);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (usuario.getText().equals("") || clave.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            Operar_Login op = new Operar_Login();
            Modelo m = op.Ingresar(usuario.getText(), clave.getText());
            if (m == null) {
                JOptionPane.showMessageDialog(null, "¡Usuario o Contraseña Incorrectos! \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                usuario.setText("");
                clave.setText("");
            } else {
                p = new principal(usuario.getText(), m.isAdmin());
                p.setVisible(true);
                this.dispose();
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    principal p;
    boolean admin = false;
    String user = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField clave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel login;
    private javax.swing.JButton salir;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
