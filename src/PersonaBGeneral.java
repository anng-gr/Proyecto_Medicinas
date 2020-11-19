
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
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
public class PersonaBGeneral extends javax.swing.JFrame {

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
    
    String titulos[] = {"Código","Nombre","Apellidos","Telefono","Edad","Peso"};
     String fila[] = new String [6];
     DefaultTableModel modelo; 
     
    
    public PersonaBGeneral() {
        initComponents();
        
        this.setTitle("Consulta personas");
        this.setLocation(350, 190);
        this.setResizable(false);
        ImageIcon icono = new ImageIcon("C:\\Users\\Vaio\\Documents\\FES Acatlan\\Cuarto semestre\\Data Base\\proyecto\\Medicinas\\src\\imagenes\\inyeccion.jpg");
        this.setIconImage(icono.getImage());
        
        Connection con = null;
        
        try{
            con = getConection();
            
            ps = con.prepareStatement("SELECT * FROM persona");
            rs = ps.executeQuery();
            
            modelo = new DefaultTableModel(null, titulos);
            
            while(rs.next()){
                fila[0] = rs.getString("codigo");
                fila[1] = rs.getString("nombre");
                fila[2] = rs.getString("apellidos");
                fila[3] = rs.getString("telefono");
                fila[4] = rs.getString("edad");
                fila[5] = rs.getString("peso");
                
                modelo.addRow(fila);
                
            }
            
            tabla_personas.setModel(modelo);
            
            /*TableColumn ccod = tabla_personas.getColumn("Codigo");
            ccod.setMaxWidth(20);
            TableColumn cnom = tabla_personas.getColumn("Nombre");
            cnom.setMaxWidth(180);
            TableColumn cape = tabla_personas.getColumn("Apellidos");
            cape.setMaxWidth(180);
            TableColumn ctel = tabla_personas.getColumn("Telefono");
            ctel.setMaxWidth(50);
            TableColumn ced = tabla_personas.getColumn("Edad");
            ced.setMaxWidth(20);
            TableColumn cpe = tabla_personas.getColumn("Peso");
            cpe.setMaxWidth(20);*/
            
            TableColumnModel columnModel = tabla_personas.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(60);
            columnModel.getColumn(1).setPreferredWidth(140);
            columnModel.getColumn(2).setPreferredWidth(140);
            columnModel.getColumn(3).setPreferredWidth(100);
            columnModel.getColumn(4).setPreferredWidth(50);
            columnModel.getColumn(5).setPreferredWidth(50);
            
            
        }catch (SQLException e){
            System.err.println(e);
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_personas = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_personas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_personas);
        if (tabla_personas.getColumnModel().getColumnCount() > 0) {
            tabla_personas.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabla_personas.getColumnModel().getColumn(1).setPreferredWidth(145);
            tabla_personas.getColumnModel().getColumn(1).setMaxWidth(145);
            tabla_personas.getColumnModel().getColumn(2).setPreferredWidth(145);
            tabla_personas.getColumnModel().getColumn(2).setMaxWidth(145);
            tabla_personas.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabla_personas.getColumnModel().getColumn(3).setMaxWidth(100);
            tabla_personas.getColumnModel().getColumn(4).setPreferredWidth(30);
            tabla_personas.getColumnModel().getColumn(4).setMaxWidth(30);
            tabla_personas.getColumnModel().getColumn(5).setPreferredWidth(30);
            tabla_personas.getColumnModel().getColumn(5).setMaxWidth(30);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 240));
        setJMenuBar(jMenuBar1);

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
            java.util.logging.Logger.getLogger(PersonaBGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonaBGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonaBGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonaBGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonaBGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_personas;
    // End of variables declaration//GEN-END:variables
}
