
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MedicinaBuscar extends javax.swing.JFrame {

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
        txt_dosis.setText(null);
        cbx_forma.setSelectedIndex(0);
        
    }
    
    public MedicinaBuscar() {
        initComponents();
        
        this.setTitle("Buscar");
        this.setLocation(350, 190);
        ImageIcon icono = new ImageIcon("C:\\Users\\Vaio\\Documents\\FES Acatlan\\Cuarto semestre\\Data Base\\proyecto\\Medicinas\\src\\imagenes\\inyeccion.jpg");
        this.setIconImage(icono.getImage());
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_dosis = new javax.swing.JTextField();
        cbx_forma = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        lbl_fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        bGeneral = new javax.swing.JMenuItem();
        menu_principal = new javax.swing.JMenuItem();
        regresar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("Código:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Dosis:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Forma:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        txt_codigo.setEditable(false);
        txt_codigo.setBackground(new java.awt.Color(255, 255, 255));
        txt_codigo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 30, -1));

        txt_dosis.setEditable(false);
        txt_dosis.setBackground(new java.awt.Color(255, 255, 255));
        txt_dosis.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        getContentPane().add(txt_dosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 170, 90));

        cbx_forma.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cbx_forma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Tabletas", "Jarabe", "Gotas", "Capsulas", "Inyectable" }));
        getContentPane().add(cbx_forma, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 110, -1));

        btn_buscar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        btn_modificar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        btn_eliminar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        btn_limpiar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_limpiar.setText("Limpiar");
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 120, -1));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/med3.jpg"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 290));

        jMenu1.setText("Opciones");

        bGeneral.setText("Busqueda general");
        bGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGeneralActionPerformed(evt);
            }
        });
        jMenu1.add(bGeneral);

        menu_principal.setText("Menu principal");
        menu_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_principalActionPerformed(evt);
            }
        });
        jMenu1.add(menu_principal);

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jMenu1.add(regresar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        
        Connection con = null;
        
        try{
            con = getConection();
            ps = con.prepareStatement("UPDATE medicamento set nombre=?, dosis=?, forma=? WHERE codigo = ?");
            ps.setString(1, txt_nombre.getText());
            ps.setString(2, txt_dosis.getText());
            ps.setString(3, cbx_forma.getSelectedItem().toString());
            ps.setString(4, txt_codigo.getText());
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Medicamento modificada.");
                limpiarCajas();
            } else{
                JOptionPane.showMessageDialog(null, "Error al modificar.");
                limpiarCajas();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        char c =evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void menu_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_principalActionPerformed
        MenuPrincipal mn = new MenuPrincipal();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_principalActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Personas p = new Personas();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
        Connection con = null;
        
        try{
            con = getConection();
            ps = con.prepareStatement("SELECT * FROM medicamento WHERE codigo = ? OR nombre = ?");
            ps.setString(1, txt_codigo.getText());
            ps.setString(2, txt_nombre.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                txt_codigo.setText(rs.getString("codigo"));
                txt_nombre.setText(rs.getString("nombre"));
                txt_dosis.setText(rs.getString("dosis"));
                cbx_forma.setSelectedItem(rs.getString("forma"));
                
            } else{
                JOptionPane.showMessageDialog(null, "El medicamento no fue encontrado.");
            }
            
        } catch (Exception e){
            System.err.println(e);
        }

        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        Connection con = null;
        
        try{
            con = getConection();
            ps = con.prepareStatement("DELETE FROM medicamento WHERE codigo = ?");
            ps.setInt(1, Integer.parseInt(txt_codigo.getText()));
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Medicamento eliminado.");
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

    private void bGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGeneralActionPerformed
        MedicinaBGeneral mbg = new MedicinaBGeneral();
        mbg.setVisible(true);
    }//GEN-LAST:event_bGeneralActionPerformed

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
            java.util.logging.Logger.getLogger(MedicinaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicinaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicinaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicinaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicinaBuscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bGeneral;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox<String> cbx_forma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JMenuItem menu_principal;
    private javax.swing.JMenuItem regresar;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_dosis;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
