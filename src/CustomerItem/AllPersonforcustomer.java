package CustomerItem;

import static CustomerItem.Home.jTextField1;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class AllPersonforcustomer extends javax.swing.JFrame {

    Connection con=null;
    Statement stmt=null;
    ResultSet rs=null;
    
    
    public AllPersonforcustomer() {
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
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        post = new javax.swing.JComboBox<>();
        user = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
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

        kGradientPanel1.setkEndColor(new java.awt.Color(215, 210, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(48, 67, 82));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalis of All about Workers ");

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
                "id", "fname", "lname", "address", "contact", "email", "catagory", "qualification"
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

        user.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setBorder(null);
        user.setOpaque(false);

        id.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setBorder(null);
        id.setOpaque(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reg No : ");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngwing.com (8) (1).png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(14, 14, 14)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(user))
                        .addGap(283, 283, 283)
                        .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel1)))
                .addContainerGap(36, Short.MAX_VALUE))
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
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel11)
                    .addGap(0, 497, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
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
                
            String quary="select * from person p inner join registration r on p.reg_id=r.rid";
            
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
                    
                    v2.add(rs.getString("p.fname"));
                    v2.add(rs.getString("p.lname"));
                    v2.add(rs.getString("p.address"));
                    v2.add(rs.getString("p.contact"));
                    v2.add(rs.getString("r.email"));
                    v2.add(rs.getString("p.catagory"));
                    v2.add(rs.getString("p.qualification"));
                }
                dft.addRow(v2);
            }
            
          }
            //item vise
            
            else if(post.getSelectedItem().equals("Electronic Engineering")){
                
            String quary="select * from person p inner join registration r on p.reg_id=r.rid where p.catagory='Electronic Engineering'";
            
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
                    
                    v2.add(rs.getString("p.fname"));
                    v2.add(rs.getString("p.lname"));
                    v2.add(rs.getString("p.address"));
                    v2.add(rs.getString("p.contact"));
                    v2.add(rs.getString("r.email"));
                    v2.add(rs.getString("p.catagory"));
                    v2.add(rs.getString("p.qualification"));
                }
                dft.addRow(v2);
            }
            
          }
            
        //dc
        
       
            else if(post.getSelectedItem().equals("Safety Engineering")){
                
            String quary="select * from person p inner join registration r on p.reg_id=r.rid where p.catagory='Safety Engineering'";
            
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
                    
                    v2.add(rs.getString("p.fname"));
                    v2.add(rs.getString("p.lname"));
                    v2.add(rs.getString("p.address"));
                    v2.add(rs.getString("p.contact"));
                    v2.add(rs.getString("r.email"));
                    v2.add(rs.getString("p.catagory"));
                    v2.add(rs.getString("p.qualification"));
                }
                dft.addRow(v2);
            }
            
          }
            
       
           else if(post.getSelectedItem().equals("Electrical Engineering")){
                
            String quary="select * from person p inner join registration r on p.reg_id=r.rid where p.catagory='Electrical Engineering'";
            
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
                    
                    v2.add(rs.getString("p.fname"));
                    v2.add(rs.getString("p.lname"));
                    v2.add(rs.getString("p.address"));
                    v2.add(rs.getString("p.contact"));
                    v2.add(rs.getString("r.email"));
                    v2.add(rs.getString("p.catagory"));
                    v2.add(rs.getString("p.qualification"));
                }
                dft.addRow(v2);
            }
            
          }
            
        
         else if(post.getSelectedItem().equals("Desiner")){
                
            String quary="select * from person p inner join registration r on p.reg_id=r.rid where p.catagory='Desiner'";
            
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
                    
                    v2.add(rs.getString("p.fname"));
                    v2.add(rs.getString("p.lname"));
                    v2.add(rs.getString("p.address"));
                    v2.add(rs.getString("p.contact"));
                    v2.add(rs.getString("r.email"));
                    v2.add(rs.getString("p.catagory"));
                    v2.add(rs.getString("p.qualification"));
                }
                dft.addRow(v2);
            }
            
          }
            
        
        else if(post.getSelectedItem().equals("Mechanical Engineering")){
                
            String quary="select * from person p inner join registration r on p.reg_id=r.rid where p.catagory='Mechanical Engineering'";
            
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
                    
                    v2.add(rs.getString("p.fname"));
                    v2.add(rs.getString("p.lname"));
                    v2.add(rs.getString("p.address"));
                    v2.add(rs.getString("p.contact"));
                    v2.add(rs.getString("r.email"));
                    v2.add(rs.getString("p.catagory"));
                    v2.add(rs.getString("p.qualification"));
                }
                dft.addRow(v2);
            }
            
          }
               
        
        
        else if(post.getSelectedItem().equals("Software Engineering")){
                
            String quary="select * from person p inner join registration r on p.reg_id=r.rid where p.catagory='Software Engineering'";
            
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
                    
                    v2.add(rs.getString("p.fname"));
                    v2.add(rs.getString("p.lname"));
                    v2.add(rs.getString("p.address"));
                    v2.add(rs.getString("p.contact"));
                    v2.add(rs.getString("r.email"));
                    v2.add(rs.getString("p.catagory"));
                    v2.add(rs.getString("p.qualification"));
                }
                dft.addRow(v2);
            }
            
          }
            
        } catch (SQLException ex) {
            Logger.getLogger(AllPersonforcustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    

    }//GEN-LAST:event_postActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        setVisible(false);
       
        Home h=new Home();
        h.jTextField1.setText(user.getText());
        
        if(!user.getText().equals("Adminperson@123")){
        setVisible(false);
        
        
        int i=Integer.parseInt(id.getText());
        h.fromlogid.setText(Integer.toString(i));
        
        try {
            stmt=con.createStatement();
            
            String query="select * from registration";
            PreparedStatement pprstmt=con.prepareStatement(query);
            
            rs=stmt.executeQuery(query);
            
            while(rs.next()){
                
                if(user.getText().equals(rs.getString(15))){
                    
                BufferedImage image=ImageIO.read(rs.getBinaryStream("image"));
                h.imageicon.setIcon(new ImageIcon(image));
            
                }
            }
            h.setVisible(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(AllPersonforcustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AllPersonforcustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        }
      
        
        
        
        
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

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
            java.util.logging.Logger.getLogger(AllPersonforcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllPersonforcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllPersonforcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllPersonforcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllPersonforcustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JComboBox<String> post;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
