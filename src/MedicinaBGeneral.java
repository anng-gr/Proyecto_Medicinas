

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vaio
 */
public class MedicinaBGeneral extends javax.swing.JFrame {

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
    
    String titulos[] = {"Código","Nombre","Dosis","Forma"};
     String fila[] = new String [4];
     DefaultTableModel modelo;
    
    public MedicinaBGeneral() {
        initComponents();
        
        this.setTitle("Consulta medicinas");
        this.setLocation(350, 190);
        this.setResizable(false);
        ImageIcon icono = new ImageIcon("C:\\Users\\Vaio\\Documents\\FES Acatlan\\Cuarto semestre\\Data Base\\proyecto\\Medicinas\\src\\imagenes\\inyeccion.jpg");
        this.setIconImage(icono.getImage());
        
        Connection con = null;
        
        try{
            con = getConection();
            
            ps = con.prepareStatement("SELECT * FROM medicamento");
            rs = ps.executeQuery();
            
            modelo = new DefaultTableModel(null, titulos);
            
            while(rs.next()){
                fila[0] = rs.getString("codigo");
                fila[1] = rs.getString("nombre");
                fila[2] = rs.getString("dosis");
                fila[3] = rs.getString("forma");
                
                modelo.addRow(fila);
                
            }
            
            tabla_medicinas.setModel(modelo);
            
            
            TableColumnModel columnModel = tabla_medicinas.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(60);
            columnModel.getColumn(1).setPreferredWidth(140);
            columnModel.getColumn(2).setPreferredWidth(140);
            columnModel.getColumn(3).setPreferredWidth(140);
            
        }catch (SQLException e){
            System.err.println(e);
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_medicinas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_medicinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla_medicinas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MedicinaBGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicinaBGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicinaBGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicinaBGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicinaBGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_medicinas;
    // End of variables declaration//GEN-END:variables
}
