package CustomerItem;

import static CustomerItem.ServiceAdmin.id;
import static CustomerItem.ServiceAdmin.user;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AllService extends javax.swing.JFrame {
    
    public Connection con=null;
    public Statement stmt=null;
    public ResultSet rs=null;
            
   
    public AllService() {
       // setVisible(true);
       // setLocationRelativeTo(null);
        initComponents();
        con=databaseConnection.Connect();
        
    /*    jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32,136,203));
        jTable1.getTableHeader().setForeground(new Color(255,255,255));
        jTable1.setRowHeight(25);*/
        
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel15 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(215, 210, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(48, 67, 82));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalis of All Service For Admins");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Test Transmission", "Electric Problem", "Alignment Problem", "New Modifier", "Scanning", "Body Wash" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service Id", "Person Id", "Register Id", "Servicer Name", "Location", "Catagory", "Price", "Time", "Contact", "email"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        kButton1.setBorder(null);
        kButton1.setText("Back");
        kButton1.setkBackGroundColor(new java.awt.Color(102, 102, 102));
        kButton1.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        kButton1.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton1.setkStartColor(new java.awt.Color(102, 102, 102));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        kButton2.setBorder(null);
        kButton2.setText("Back");
        kButton2.setkBackGroundColor(new java.awt.Color(102, 102, 102));
        kButton2.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        kButton2.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton2.setkStartColor(new java.awt.Color(102, 102, 102));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Admin mode");

        user.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setBorder(null);
        user.setOpaque(false);

        id.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setBorder(null);
        id.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reg No : ");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngwing.com (8) (1).png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(user))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(472, 472, 472))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(280, 280, 280))))))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1001, Short.MAX_VALUE)))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 1000, Short.MAX_VALUE)
                    .addComponent(jLabel11)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(565, Short.MAX_VALUE)))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel11)
                    .addGap(0, 503, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int cc;
        try {
            
            stmt=con.createStatement();
            
            if(jComboBox1.getSelectedItem().equals("All")){
                
            String query="select * from ser";
            PreparedStatement pprstmt=con.prepareStatement(query);
            //int sid=Integer.parseInt(id.getText());
            
            rs=pprstmt.executeQuery();
            
           ResultSetMetaData rsmd=rs.getMetaData();
            cc=rsmd.getColumnCount();
            
            DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
            
            dft.setRowCount(0);
            
            while(rs.next()){
                Vector v2=new Vector();
                for(int i=0; i<cc; i++)
                {
                    v2.add(rs.getInt("sId"));
                    v2.add(rs.getInt("pId"));
                    v2.add(rs.getInt("rId"));
                    v2.add(rs.getString("servicerName"));
                    v2.add(rs.getString("sLocation"));
                    v2.add(rs.getString("sCatagory"));
                    v2.add(rs.getString("sPrice"));
                    v2.add(rs.getString("sTime"));
                    v2.add(rs.getString("contact"));
                    v2.add(rs.getString("email"));
                }
                dft.addRow(v2);
            }
           }
            
            
            
           if(jComboBox1.getSelectedItem().equals("Test Transmission")){
            String query="select * from ser where sCatagory='Test TransmissionD'";
             PreparedStatement pprstmt=con.prepareStatement(query);
            //int sid=Integer.parseInt(id.getText());
            
            rs=pprstmt.executeQuery();
            
            ResultSetMetaData rsmd=rs.getMetaData();
            cc=rsmd.getColumnCount();
            
            DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
            
            dft.setRowCount(0);
            
            while(rs.next()){
                Vector v2=new Vector();
                for(int i=0; i<cc; i++)
                {
                    v2.add(rs.getInt("sId"));
                    v2.add(rs.getInt("pId"));
                    v2.add(rs.getInt("rId"));
                    v2.add(rs.getString("servicerName"));
                    v2.add(rs.getString("sLocation"));
                    v2.add(rs.getString("sCatagory"));
                    v2.add(rs.getString("sPrice"));
                    v2.add(rs.getString("sTime"));
                    v2.add(rs.getString("contact"));
                    v2.add(rs.getString("email"));
                }
                dft.addRow(v2);
            }
           }
           
           
           if(jComboBox1.getSelectedItem().equals("Electric Problem")){
            String query="select * from ser where sCatagory='Electric Problem'";
            
            PreparedStatement pprstmt=con.prepareStatement(query);
            //int sid=Integer.parseInt(id.getText());
            
            rs=pprstmt.executeQuery();
            
            ResultSetMetaData rsmd=rs.getMetaData();
            cc=rsmd.getColumnCount();
            
            DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
            
            dft.setRowCount(0);
            
            while(rs.next()){
                Vector v2=new Vector();
                for(int i=0; i<cc; i++)
                {
                    v2.add(rs.getInt("sId"));
                    v2.add(rs.getInt("pId"));
                    v2.add(rs.getInt("rId"));
                    v2.add(rs.getString("servicerName"));
                    v2.add(rs.getString("sLocation"));
                    v2.add(rs.getString("sCatagory"));
                    v2.add(rs.getString("sPrice"));
                    v2.add(rs.getString("sTime"));
                    v2.add(rs.getString("contact"));
                    v2.add(rs.getString("email"));
                }
                dft.addRow(v2);
            }
           }
           
           
           if(jComboBox1.getSelectedItem().equals("Alignment Problem")){
            String query="select * from ser where sCatagory='Alignment Problem'";
            PreparedStatement pprstmt=con.prepareStatement(query);
            //int sid=Integer.parseInt(id.getText());
            
            rs=pprstmt.executeQuery();
            
            ResultSetMetaData rsmd=rs.getMetaData();
            cc=rsmd.getColumnCount();
            
            DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
            
            dft.setRowCount(0);
            
            while(rs.next()){
                Vector v2=new Vector();
                for(int i=0; i<cc; i++)
                {
                    v2.add(rs.getInt("sId"));
                    v2.add(rs.getInt("pId"));
                    v2.add(rs.getInt("rId"));
                    v2.add(rs.getString("servicerName"));
                    v2.add(rs.getString("sLocation"));
                    v2.add(rs.getString("sCatagory"));
                    v2.add(rs.getString("sPrice"));
                    v2.add(rs.getString("sTime"));
                    v2.add(rs.getString("contact"));
                    v2.add(rs.getString("email"));
                }
                dft.addRow(v2);
            }
           }
           
           
           if(jComboBox1.getSelectedItem().equals("New Modifier")){
            String query="select * from ser where sCatagory='New Modifier'";
           PreparedStatement pprstmt=con.prepareStatement(query);
            //int sid=Integer.parseInt(id.getText());
            
            rs=pprstmt.executeQuery();
            
            ResultSetMetaData rsmd=rs.getMetaData();
            cc=rsmd.getColumnCount();
            
            DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
            
            dft.setRowCount(0);
            
            while(rs.next()){
                Vector v2=new Vector();
                for(int i=0; i<cc; i++)
                {
                    v2.add(rs.getInt("sId"));
                    v2.add(rs.getInt("pId"));
                    v2.add(rs.getInt("rId"));
                    v2.add(rs.getString("servicerName"));
                    v2.add(rs.getString("sLocation"));
                    v2.add(rs.getString("sCatagory"));
                    v2.add(rs.getString("sPrice"));
                    v2.add(rs.getString("sTime"));
                    v2.add(rs.getString("contact"));
                    v2.add(rs.getString("email"));
                }
                dft.addRow(v2);
            }
           }
           
           
           if(jComboBox1.getSelectedItem().equals("Scanning")){
            String query="select * from ser where sCatagory='Scanning'";
           PreparedStatement pprstmt=con.prepareStatement(query);
            //int sid=Integer.parseInt(id.getText());
            
            rs=pprstmt.executeQuery();
            
            ResultSetMetaData rsmd=rs.getMetaData();
            cc=rsmd.getColumnCount();
            
            DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
            
            dft.setRowCount(0);
            
            while(rs.next()){
                Vector v2=new Vector();
                for(int i=0; i<cc; i++)
                {
                    v2.add(rs.getInt("sId"));
                    v2.add(rs.getInt("pId"));
                    v2.add(rs.getInt("rId"));
                    v2.add(rs.getString("servicerName"));
                    v2.add(rs.getString("sLocation"));
                    v2.add(rs.getString("sCatagory"));
                    v2.add(rs.getString("sPrice"));
                    v2.add(rs.getString("sTime"));
                    v2.add(rs.getString("contact"));
                    v2.add(rs.getString("email"));
                }
                dft.addRow(v2);
            }
           }
           
           
           if(jComboBox1.getSelectedItem().equals("Body Wash")){
            String query="select * from ser where sCatagory='Body Wash'";
             PreparedStatement pprstmt=con.prepareStatement(query);
            //int sid=Integer.parseInt(id.getText());
            
            rs=pprstmt.executeQuery();
            
            ResultSetMetaData rsmd=rs.getMetaData();
            cc=rsmd.getColumnCount();
            
            DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
            
            dft.setRowCount(0);
            
            while(rs.next()){
                Vector v2=new Vector();
                for(int i=0; i<cc; i++)
                {
                    v2.add(rs.getInt("sId"));
                    v2.add(rs.getInt("pId"));
                    v2.add(rs.getInt("rId"));
                    v2.add(rs.getString("servicerName"));
                    v2.add(rs.getString("sLocation"));
                    v2.add(rs.getString("sCatagory"));
                    v2.add(rs.getString("sPrice"));
                    v2.add(rs.getString("sTime"));
                    v2.add(rs.getString("contact"));
                    v2.add(rs.getString("email"));
                }
                dft.addRow(v2);
            }
           }
           
        } catch (SQLException ex) {
            Logger.getLogger(AllService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        setVisible(false);
        ServiceAdmin s=new ServiceAdmin();
        s.user.setText(user.getText());  //setting view detail userid as adminperson@123
        int i=Integer.parseInt(id.getText());  
        s.id.setText(Integer.toString(i)); //parse id also to view detail
        
        s.setVisible(true);
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
         int responce=JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
          if(responce==JOptionPane.YES_OPTION){
              System.exit(0);
          }
          else{
              setVisible(true);
          }
    }//GEN-LAST:event_kButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AllService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField id;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
