package CustomerItem;

import static CustomerItem.Person2.id;
import static CustomerItem.Person2.user;
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
import net.proteanit.sql.DbUtils;


public class AllPersonAdmin extends javax.swing.JFrame {

    Connection con=null;
    Statement stmt=null;
    ResultSet rs=null;
    
    
    public AllPersonAdmin() {
      //  setVisible(true);
      //  setLocationRelativeTo(null);
        initComponents();
        con= databaseConnection.Connect();
       // Updat_tb();
       
       jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32,136,203));
        jTable1.getTableHeader().setForeground(new Color(0,0,0));
        jTable1.setRowHeight(25);
    }
   
   /*public void Updat_tb(){
    int cc;
    
        try {
            
            stmt=con.createStatement();
            
            String quary="select * from person";
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
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}*/
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        id = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        post = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ids = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 600));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        id.setkEndColor(new java.awt.Color(215, 210, 204));
        id.setkStartColor(new java.awt.Color(48, 67, 82));
        id.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalis of All about Workers For Admins ");

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
                "id", "Reg__id", "fname", "lname", "Dob", "address", "contact", "catagory", "qualification"
            }
        ));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(jTable1);

        post.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Electronic Engineering", "Safety Engineering", "Electrical Engineering", "Desiner", "Mechanical Engineering", "Software Engineering" }));
        post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Admin mode");

        ids.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        ids.setForeground(new java.awt.Color(255, 255, 255));

        user.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setBorder(null);
        user.setOpaque(false);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reg No : ");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngwing.com (8) (1).png"))); // NOI18N

        javax.swing.GroupLayout idLayout = new javax.swing.GroupLayout(id);
        id.setLayout(idLayout);
        idLayout.setHorizontalGroup(
            idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, idLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(318, 318, 318))
            .addGroup(idLayout.createSequentialGroup()
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(idLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ids, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(158, 158, 158)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(idLayout.createSequentialGroup()
                                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, idLayout.createSequentialGroup()
                    .addGap(0, 1000, Short.MAX_VALUE)
                    .addComponent(jLabel11)))
        );
        idLayout.setVerticalGroup(
            idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idLayout.createSequentialGroup()
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(idLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ids, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(idLayout.createSequentialGroup()
                    .addComponent(jLabel11)
                    .addGap(0, 497, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(178, 178, 178))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(143, 143, 143))
            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postActionPerformed
       int cc;
       
        try {
            stmt=con.createStatement();
            if(post.getSelectedItem().equals("All")){
                
            String quary="select * from person";
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
            //item vise
            else if(post.getSelectedItem().equals("Electronic Engineering")){
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
        
        else if(post.getSelectedItem().equals("Safety Engineering")){
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
            
        else if(post.getSelectedItem().equals("Electrical Engineering")){
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
            
        else if(post.getSelectedItem().equals("Desiner")){
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
            
        else if(post.getSelectedItem().equals("Mechanical Engineering")){
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
        
        else if(post.getSelectedItem().equals("Software Engineering")){
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
        
    

    }//GEN-LAST:event_postActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        int i=Integer.parseInt(ids.getText());  
        
        if(user.getText().equals("Adminperson@123")){ //The user id adminperson@123 can only access this part
        
        setVisible(false);
        Person2 pr=new Person2();
        
        
        pr.user.setText(user.getText());  //setting again home userid as adminperson@123
        
        
        pr.id.setText(Integer.toString(i)); //parse id also to home
        
        pr.setVisible(true);
         }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        int responce=JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(responce==JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
            setVisible(true);
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

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
            java.util.logging.Logger.getLogger(AllPersonAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllPersonAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllPersonAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllPersonAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllPersonAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel id;
    public static javax.swing.JLabel ids;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private javax.swing.JComboBox<String> post;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
