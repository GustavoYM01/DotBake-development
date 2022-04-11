package Telas;


import java.awt.Color;


public class FrameCadastro extends javax.swing.JFrame {

    public FrameCadastro() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        textoUsuario.setBackground(new java.awt.Color(0,0,0,1));
        textoEmail.setBackground(new java.awt.Color(0,0,0,1));
        textoSenha.setBackground(new java.awt.Color(0,0,0,1));
        textoSenha2.setBackground(new java.awt.Color(0,0,0,1));
        DataNasc.setBackground(new java.awt.Color(0,0,0,1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoSenha2 = new javax.swing.JPasswordField();
        DataNasc = new com.toedter.calendar.JDateChooser();
        textoSenha = new javax.swing.JPasswordField();
        textoUsuario = new javax.swing.JTextField();
        textoEmail = new javax.swing.JTextField();
        checkbox1 = new java.awt.Checkbox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoSenha2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        textoSenha2.setBorder(null);
        getContentPane().add(textoSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 650, 40));

        DataNasc.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(DataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, 290, 60));

        textoSenha.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        textoSenha.setBorder(null);
        textoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(textoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 650, 40));

        textoUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoUsuario.setBorder(null);
        textoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(textoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 650, 40));

        textoEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoEmail.setBorder(null);
        textoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(textoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 650, 40));

        checkbox1.setLabel("checkbox1");
        getContentPane().add(checkbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 720, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame cadastro.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame cadastro.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuarioActionPerformed

    private void textoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoSenhaActionPerformed

    private void textoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEmailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DataNasc;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textoEmail;
    private javax.swing.JPasswordField textoSenha;
    private javax.swing.JPasswordField textoSenha2;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}
