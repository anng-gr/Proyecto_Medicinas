
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
        initComponents();
        
        this.setLocation(350, 190);
        ImageIcon icono = new ImageIcon("C:\\Users\\Vaio\\Documents\\FES Acatlan\\Cuarto semestre\\Data Base\\proyecto\\Medicinas\\src\\imagenes\\inyeccion.jpg");
        this.setIconImage(icono.getImage());
        
        
        
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_persona = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_medicinas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_enfermedades = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dominique", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        btn_persona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ip.jpg"))); // NOI18N
        btn_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_personaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_persona, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 130, 110));

        jLabel2.setFont(new java.awt.Font("Dominique", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("personaS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 130, -1));

        btn_medicinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconmedi.jpg"))); // NOI18N
        btn_medicinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_medicinasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_medicinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 130, 110));

        jLabel3.setFont(new java.awt.Font("Dominique", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("medicinas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 130, -1));

        btn_enfermedades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconenf.jpg"))); // NOI18N
        btn_enfermedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enfermedadesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_enfermedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 130, 110));

        jLabel4.setFont(new java.awt.Font("Dominique", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("enfermedades");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/med3.jpg"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_personaActionPerformed
        Personas p = new Personas();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_personaActionPerformed

    private void btn_medicinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_medicinasActionPerformed
        Medicinas md = new Medicinas();
        md.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_medicinasActionPerformed

    private void btn_enfermedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enfermedadesActionPerformed
        Enfermedades enf = new Enfermedades();
        enf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_enfermedadesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enfermedades;
    private javax.swing.JButton btn_medicinas;
    private javax.swing.JButton btn_persona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_fondo;
    // End of variables declaration//GEN-END:variables
}
