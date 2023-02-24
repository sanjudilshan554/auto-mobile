
package CustomerItem;

import static CustomerItem.Selling.id;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static CustomerItem.Selling.userks;


public class SailerDetail extends javax.swing.JFrame {

    
    public Statement stmt=null;
    public Connection con=null;
    public Resultset rs=null;
    
    public SailerDetail() {
        initComponents();
        con=databaseConnection.Connect();
        
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        sailCatagory = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        userk = new javax.swing.JTextField();
        userl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(215, 210, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(48, 67, 82));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalis of All about Sailer");

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
        kButton2.setText("Cansel");
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sid", "Reg_id", "fname", "lname", "address", "contact", "email", "catagory"
            }
        ));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(jTable1);

        sailCatagory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Side Skirts", "Fuel tank door", "Instrumetn panel", "Protective Side trims on door panels", "Seat Upholsery", "Window frames", "SIde view mirrors", "Wheel rims and hub caps", "Bumpers", "Enginer gaskets", "Headlamps", "Air vents", "Dashboard", "Door switchd panels", "Spoiler", "Parking sensor", "Boot bottom panel" }));
        sailCatagory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sailCatagoryActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Admin mode");

        user.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        user.setBorder(null);
        user.setOpaque(false);

        id.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        id.setBorder(null);
        id.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Reg No : ");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userk, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(346, 346, 346)
                                .addComponent(sailCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel12)
                    .addContainerGap(1024, Short.MAX_VALUE)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(userk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sailCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(jLabel12)
                    .addContainerGap(476, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        setVisible(false);
        Selling pr=new Selling();
        pr.setVisible(true);
        
        pr.userks.setText(user.getText());
            
        int i=Integer.parseInt(id.getText());
        pr.id.setText(Integer.toString(i));
            
        pr.setVisible(true);
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
//NEED TO ADD ALL CATAGARIES TO THIS
    private void sailCatagoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sailCatagoryActionPerformed
        int cc;

        try {
            stmt=con.createStatement();
            
            if(sailCatagory.getSelectedItem().equals("All")){

                String quary="select * from saileracc";
                PreparedStatement pprstmt=con.prepareStatement(quary);

                ResultSet rs=pprstmt.executeQuery();

                ResultSetMetaData rsmd=rs.getMetaData();
                cc=rsmd.getColumnCount();

                DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
                dft.setRowCount(0);

                while(rs.next()){
                    Vector v2=new Vector();

                    for(int i=0; i<cc; i++){
                        v2.add(rs.getInt("Sid"));
                        v2.add(rs.getInt("reg_id"));
                        v2.add(rs.getString("fname"));
                        v2.add(rs.getString("lname"));
                        v2.add(rs.getString("address"));
                        v2.add(rs.getString("contact"));
                        v2.add(rs.getString("email"));
                        v2.add(rs.getString("catagory"));
                    }
                    dft.addRow(v2);
                }

            }
            //item vise
            else if(sailCatagory.getSelectedItem().equals("Electronic Engineering")){
                String quary="select * from person where catagory = 'Electronic Engineering '";
                PreparedStatement pprstmt=con.prepareStatement(quary);

                ResultSet rs=pprstmt.executeQuery();

                ResultSetMetaData rsmd=rs.getMetaData();
                cc=rsmd.getColumnCount();

                DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
                dft.setRowCount(0);

                while(rs.next()){
                    Vector v2=new Vector();

                    for(int i=0; i<cc; i++){
                        v2.add(rs.getInt("id"));
                        v2.add(rs.getInt("reg_id"));
                        v2.add(rs.getString("fname"));
                        v2.add(rs.getString("lname"));
                        v2.add(rs.getString("address"));
                        v2.add(rs.getString("contact"));
                        v2.add(rs.getString("dob"));
                        v2.add(rs.getString("catagory"));
                        v2.add(rs.getString("qualification"));
                    }
                    dft.addRow(v2);
                }

            }

            //dc

            else if(sailCatagory.getSelectedItem().equals("Safety Engineering")){
                String quary="select * from person where catagory = 'Safety Engineering'";
                PreparedStatement pprstmt=con.prepareStatement(quary);

                ResultSet rs=pprstmt.executeQuery();

                ResultSetMetaData rsmd=rs.getMetaData();
                cc=rsmd.getColumnCount();

                DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
                dft.setRowCount(0);

                while(rs.next()){
                    Vector v2=new Vector();

                    for(int i=0; i<cc; i++){
                        v2.add(rs.getInt("id"));
                        v2.add(rs.getInt("reg_id"));
                        v2.add(rs.getString("fname"));
                        v2.add(rs.getString("lname"));
                        v2.add(rs.getString("dob"));
                        v2.add(rs.getString("address"));
                        v2.add(rs.getString("contact"));
                        v2.add(rs.getString("dob"));
                        v2.add(rs.getString("catagory"));
                        v2.add(rs.getString("qualification"));
                    }
                    dft.addRow(v2);
                }

            }

            else if(sailCatagory.getSelectedItem().equals("Electrical Engineering")){
                String quary="select * from person where catagory = 'Electrical Engineering'";
                PreparedStatement pprstmt=con.prepareStatement(quary);

                ResultSet rs=pprstmt.executeQuery();

                ResultSetMetaData rsmd=rs.getMetaData();
                cc=rsmd.getColumnCount();

                DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
                dft.setRowCount(0);

                while(rs.next()){
                    Vector v2=new Vector();

                    for(int i=0; i<cc; i++){
                        v2.add(rs.getInt("id"));
                        v2.add(rs.getInt("reg_id"));
                        v2.add(rs.getString("fname"));
                        v2.add(rs.getString("lname"));
                        v2.add(rs.getString("dob"));
                        v2.add(rs.getString("address"));
                        v2.add(rs.getString("contact"));
                        v2.add(rs.getString("dob"));
                        v2.add(rs.getString("catagory"));
                        v2.add(rs.getString("qualification"));
                    }
                    dft.addRow(v2);
                }

            }

            else if(sailCatagory.getSelectedItem().equals("Desiner")){
                String quary="select * from person where catagory = 'Desiner'";
                PreparedStatement pprstmt=con.prepareStatement(quary);

                ResultSet rs=pprstmt.executeQuery();

                ResultSetMetaData rsmd=rs.getMetaData();
                cc=rsmd.getColumnCount();

                DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
                dft.setRowCount(0);

                while(rs.next()){
                    Vector v2=new Vector();

                    for(int i=0; i<cc; i++){
                        v2.add(rs.getInt("id"));
                        v2.add(rs.getInt("reg_id"));
                        v2.add(rs.getString("fname"));
                        v2.add(rs.getString("lname"));
                        v2.add(rs.getString("dob"));
                        v2.add(rs.getString("address"));
                        v2.add(rs.getString("contact"));
                        v2.add(rs.getString("dob"));
                        v2.add(rs.getString("catagory"));
                        v2.add(rs.getString("qualification"));
                    }
                    dft.addRow(v2);
                }

            }

            else if(sailCatagory.getSelectedItem().equals("Mechanical Engineering")){
                String quary="select * from person where catagory = 'Mechanical Engineering'";
                PreparedStatement pprstmt=con.prepareStatement(quary);

                ResultSet rs=pprstmt.executeQuery();

                ResultSetMetaData rsmd=rs.getMetaData();
                cc=rsmd.getColumnCount();

                DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
                dft.setRowCount(0);

                while(rs.next()){
                    Vector v2=new Vector();

                    for(int i=0; i<cc; i++){
                        v2.add(rs.getInt("id"));
                        v2.add(rs.getInt("reg_id"));
                        v2.add(rs.getString("fname"));
                        v2.add(rs.getString("lname"));
                        v2.add(rs.getString("dob"));
                        v2.add(rs.getString("address"));
                        v2.add(rs.getString("contact"));
                        v2.add(rs.getString("dob"));
                        v2.add(rs.getString("catagory"));
                        v2.add(rs.getString("qualification"));
                    }
                    dft.addRow(v2);
                }

            }

            else if(sailCatagory.getSelectedItem().equals("Software Engineering")){
                String quary="select * from person where catagory = 'Software Engineering'";
                PreparedStatement pprstmt=con.prepareStatement(quary);

                ResultSet rs=pprstmt.executeQuery();

                ResultSetMetaData rsmd=rs.getMetaData();
                cc=rsmd.getColumnCount();

                DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
                dft.setRowCount(0);

                while(rs.next()){
                    Vector v2=new Vector();

                    for(int i=0; i<cc; i++){
                        v2.add(rs.getInt("id"));
                        v2.add(rs.getInt("reg_id"));
                        v2.add(rs.getString("fname"));
                        v2.add(rs.getString("lname"));
                        v2.add(rs.getString("dob"));
                        v2.add(rs.getString("address"));
                        v2.add(rs.getString("contact"));
                        v2.add(rs.getString("dob"));
                        v2.add(rs.getString("catagory"));
                        v2.add(rs.getString("qualification"));
                    }
                    dft.addRow(v2);
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(AllPersonAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_sailCatagoryActionPerformed

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
            java.util.logging.Logger.getLogger(SailerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SailerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SailerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SailerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SailerDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JComboBox<String> sailCatagory;
    public static javax.swing.JTextField user;
    public static javax.swing.JTextField userk;
    public static javax.swing.JLabel userl;
    // End of variables declaration//GEN-END:variables
}
