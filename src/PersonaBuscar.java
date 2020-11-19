
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PersonaBuscar extends javax.swing.JFrame {

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
        txt_apellidos.setText(null);
        txt_telefono.setText(null);
        txt_edad.setText(null);
        txt_peso.setText(null);
        
    }
    
    public PersonaBuscar() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        txt_peso = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        lbl_fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        b_general = new javax.swing.JMenuItem();
        medicinas = new javax.swing.JMenuItem();
        menu_principal = new javax.swing.JMenuItem();
        regresar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("Código:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Apellidos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Teléfono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Edad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setText("Peso:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel7.setText("kg.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        txt_codigo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 30, -1));

        txt_nombre.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 100, -1));

        txt_apellidos.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txt_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidosKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 130, -1));

        txt_telefono.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 110, -1));

        txt_edad.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txt_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edadKeyTyped(evt);
            }
        });
        getContentPane().add(txt_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 40, -1));

        txt_peso.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txt_peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pesoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 40, -1));

        btn_buscar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        btn_limpiar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        btn_modificar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        btn_eliminar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/med3.jpg"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 310));

        jMenu1.setText("Opciones");

        b_general.setText("Busqueda general");
        b_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_generalActionPerformed(evt);
            }
        });
        jMenu1.add(b_general);

        medicinas.setText("Medicinas");
        medicinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicinasActionPerformed(evt);
            }
        });
        jMenu1.add(medicinas);

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

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        char c =evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
        Connection con = null;
        
        try{
            con = getConection();
            ps = con.prepareStatement("SELECT * FROM persona WHERE codigo = ? OR nombre = ?");
            ps.setString(1, txt_codigo.getText());
            ps.setString(2, txt_nombre.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                txt_codigo.setText(rs.getString("codigo"));
                txt_nombre.setText(rs.getString("nombre"));
                txt_apellidos.setText(rs.getString("apellidos"));
                txt_telefono.setText(rs.getString("telefono"));
                txt_edad.setText(rs.getString("edad"));
                txt_peso.setText(rs.getString("peso"));
                
            } else{
                JOptionPane.showMessageDialog(null, "La persona no fue encontrada.");
            }
            
        } catch (Exception e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Personas p = new Personas();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void menu_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_principalActionPerformed
        MenuPrincipal mn = new MenuPrincipal();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_principalActionPerformed

    private void b_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_generalActionPerformed
        PersonaBGeneral pbg = new PersonaBGeneral();
        pbg.setVisible(true);
    }//GEN-LAST:event_b_generalActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        
        Connection con = null;
        
        try{
            con = getConection();
            ps = con.prepareStatement("UPDATE persona set nombre=?, apellidos=?, telefono=?, edad=?, peso=? WHERE codigo = ?");
            ps.setString(1, txt_nombre.getText());
            ps.setString(2, txt_apellidos.getText());
            ps.setString(3, txt_telefono.getText());
            ps.setString(4, txt_edad.getText());
            ps.setString(5, txt_peso.getText());
            ps.setString(6, txt_codigo.getText());
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Persona modificada.");
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

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        Connection con = null;
        
        try{
            con = getConection();
            ps = con.prepareStatement("DELETE FROM persona WHERE codigo = ?");
            ps.setInt(1, Integer.parseInt(txt_codigo.getText()));
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Persona eliminada.");
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

    private void txt_apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidosKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txt_apellidosKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        char c =evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadKeyTyped
        char c =evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txt_edadKeyTyped

    private void txt_pesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pesoKeyTyped
        char c =evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txt_pesoKeyTyped

    private void medicinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicinasActionPerformed
        PersonaMedicina pm = new PersonaMedicina();
        pm.setVisible(true);
    }//GEN-LAST:event_medicinasActionPerformed

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
            java.util.logging.Logger.getLogger(PersonaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonaBuscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem b_general;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JMenuItem medicinas;
    private javax.swing.JMenuItem menu_principal;
    private javax.swing.JMenuItem regresar;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
