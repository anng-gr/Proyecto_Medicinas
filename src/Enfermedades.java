
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Enfermedades extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3306/medicinas?useSSL=false";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "3290an";
    
    PreparedStatement ps;
    ResultSet rs;

    public static Connection getConection(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD); 
            
        } catch(Exception e){
            System.out.println(e);
        }
        
        return con;
    }
    
     private void limpiarCajas(){
        
        txt_codigo.setText(null);
        txt_nombre.setText(null);
        
    }
    
    public Enfermedades() {
        initComponents();
        this.setTitle("Registrar");
        this.setLocation(350, 190);
        ImageIcon icono = new ImageIcon("C:\\Users\\Vaio\\Documents\\FES Acatlan\\Cuarto semestre\\Data Base\\proyecto\\Medicinas\\src\\imagenes\\inyeccion.jpg");
        this.setIconImage(icono.getImage());
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_guardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbl_fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_principal = new javax.swing.JMenuItem();
        consul_trat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_guardar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("Código:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 40, -1));

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 100, -1));

        btn_buscar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        btn_eliminar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        btn_limpiar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_limpiar.setText("Limpiar");
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/med3.jpg"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 270));

        jMenu1.setText("Opciones");

        menu_principal.setText("Menu principal");
        menu_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_principalActionPerformed(evt);
            }
        });
        jMenu1.add(menu_principal);

        consul_trat.setText("Tratamientos");
        consul_trat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consul_tratActionPerformed(evt);
            }
        });
        jMenu1.add(consul_trat);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        char c =evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
        Connection con = null;
        
        try{
            con = getConection();
            ps = con.prepareStatement("INSERT INTO enfermedad (nombre) VALUES(?)");
            ps.setString(1, txt_nombre.getText());
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Guardado con éxito.");
                limpiarCajas();
            } else{
                JOptionPane.showMessageDialog(null, "Error al guardar.");
                limpiarCajas();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
        Connection con = null;
        
        try{
            con = getConection();
            ps = con.prepareStatement("SELECT * FROM enfermedad WHERE codigo = ? OR nombre = ?");
            ps.setString(1, txt_codigo.getText());
            ps.setString(2, txt_nombre.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                txt_codigo.setText(rs.getString("codigo"));
                txt_nombre.setText(rs.getString("nombre"));   
            } else{
                JOptionPane.showMessageDialog(null, "No se encontraron registros.");
            }
            
        } catch (Exception e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        Connection con = null;
        
        try{
            con = getConection();
            ps = con.prepareStatement("DELETE FROM enfermedad WHERE codigo = ?");
            ps.setInt(1, Integer.parseInt(txt_codigo.getText()));
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Registro eliminado.");
                limpiarCajas();
            } else{
                JOptionPane.showMessageDialog(null, "Error al eliminar.");
                limpiarCajas();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void menu_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_principalActionPerformed
        MenuPrincipal mn = new MenuPrincipal();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_principalActionPerformed

    private void consul_tratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consul_tratActionPerformed
        Tratamientos tra = new Tratamientos();
        tra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_consul_tratActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Connection con = null;
        
        try{
            con = getConection();
            ps = con.prepareStatement("UPDATE enfermedad set nombre=? WHERE codigo = ?");
            ps.setString(1, txt_nombre.getText());
            ps.setString(2, txt_codigo.getText());
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Registro modificado.");
                limpiarCajas();
            } else{
                JOptionPane.showMessageDialog(null, "Error al modificar.");
                limpiarCajas();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Enfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enfermedades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JMenuItem consul_trat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JMenuItem menu_principal;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
