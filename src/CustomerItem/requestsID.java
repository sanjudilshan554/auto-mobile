
package CustomerItem;

import static CustomerItem.Home.fromlogid;
import static CustomerItem.Home.jTextField1;
import static CustomerItem.Report.idk;
import static CustomerItem.Report.user;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


//import adminItem.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class requestsID extends javax.swing.JFrame {

    public ResultSet rs=null;
    public Connection con=null;
    public Statement stmt=null;
    
    
    public requestsID() {
        initComponents();
        con=databaseConnection.Connect();
        
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        error.setVisible(false);
        lableEroor.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        SellerId = new javax.swing.JTextField();
        kButton1 = new com.k33ptoo.components.KButton();
        error = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        makerequest = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        kButton2 = new com.k33ptoo.components.KButton();
        lableEroor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kButton3 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setForeground(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkEndColor(new java.awt.Color(65, 67, 69));
        kGradientPanel1.setkStartColor(new java.awt.Color(35, 37, 38));

        SellerId.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        SellerId.setText("Enter Seller ID ");
        SellerId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SellerIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SellerIdFocusLost(evt);
            }
        });
        SellerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerIdActionPerformed(evt);
            }
        });

        kButton1.setBorder(null);
        kButton1.setText("Go");
        kButton1.setToolTipText("Goto the your seller account");
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        kButton1.setkSelectedColor(new java.awt.Color(0, 102, 51));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        error.setForeground(new java.awt.Color(255, 0, 51));
        error.setText("Error");

        user.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        user.setBorder(null);
        user.setOpaque(false);

        id.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(204, 204, 204));
        id.setBorder(null);
        id.setOpaque(false);

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Reg No : ");

        makerequest.setBorder(null);
        makerequest.setText("Make Request");
        makerequest.setToolTipText("If You Like to beign a Seller you can make a request");
        makerequest.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        makerequest.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        makerequest.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        makerequest.setkSelectedColor(new java.awt.Color(255, 255, 255));
        makerequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makerequestActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(error))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(makerequest, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(SellerId, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel2)))
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel19)
                    .addContainerGap(550, Short.MAX_VALUE)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(SellerId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(makerequest, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(51, 51, 51))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabel19)
                    .addContainerGap(388, Short.MAX_VALUE)))
        );

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(204, 204, 204));

        kButton2.setBackground(new java.awt.Color(0, 0, 0));
        kButton2.setBorder(null);
        kButton2.setForeground(new java.awt.Color(51, 51, 51));
        kButton2.setText("Admin Login");
        kButton2.setToolTipText("Admin only");
        kButton2.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton2.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton2.setkIndicatorColor(new java.awt.Color(0, 0, 0));
        kButton2.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(0, 0, 0));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        lableEroor.setForeground(new java.awt.Color(255, 102, 102));
        lableEroor.setText("Access Denied ");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        jLabel1.setText("To Create Sailer ACCOUNT");

        kButton3.setText("Back");
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        kButton3.setkSelectedColor(new java.awt.Color(0, 102, 51));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lableEroor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(166, 166, 166)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lableEroor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SellerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellerIdActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        try {
            stmt=con.createStatement();
            
            int ID=Integer.parseInt(SellerId.getText());
            
            String query="select Sid,reg_id from saileracc";
            PreparedStatement pprstmt=con.prepareStatement(query);
            //ResultSet rs= stmt.executeQuery(query);
            
           
            //rs=stmt.executeQuery(query); ????????????????????????????????????
            
            ResultSet rs= stmt.executeQuery(query);
            
            while(rs.next()){
                
                int regid=Integer.parseInt(id.getText());
                
                if(ID==(rs.getInt(1)) && regid==rs.getInt(2)){
                    Home ho=new Home();
                    ho.setVisible(false);
                    
                    setVisible(false);
                    SellerItemViaSellerACC se=new SellerItemViaSellerACC();
                    se.setVisible(true);
                    
                    se.sid.setText(Integer.toString(ID));
                    
                    int idl=Integer.parseInt(id.getText());
                    se.ids.setText(Integer.toString(idl));
                    se.user.setText(user.getText());
                }
                else{
                    error.setVisible(true);
                    error.setText("You might not have a sailer account or incorrct Id");
                }
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(requestsID.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
                  
      if(user.getText().equals("Adminperson@123")){
         lableEroor.setVisible(true);
         lableEroor.setText("Access Denied");
        }
      else if (user.getText().equals("AdminBuy@123"))
      {
          lableEroor.setVisible(true);
         lableEroor.setText("Access Denied");
        }
      else if (user.getText().equals("AdminSelling@123"))
      {
        Home ho=new Home();
        ho.setVisible(false);
                    
        setVisible(false);
        Selling sel=new Selling();
        sel.setVisible(true);
        
        sel.userks.setText(user.getText());
        int i=Integer.parseInt(id.getText());
        sel.id.setText(Integer.toString(i));
        
        }
      
      else if (user.getText().equals("AdminService@123"))
      {
          lableEroor.setVisible(true);
         lableEroor.setText("Access Denied");
        }
      else if (user.getText().equals("AdminReport@123"))
      {
          lableEroor.setVisible(true);
         lableEroor.setText("Access Denied");
        }
      else{
          lableEroor.setVisible(true);
         lableEroor.setText("Access Denied");
      }
      
      
      
      
    }//GEN-LAST:event_kButton2ActionPerformed

    private void SellerIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SellerIdFocusGained
       
        if(SellerId.getText().equals("Enter Seller ID ")){
            SellerId.setText("");
        }
    }//GEN-LAST:event_SellerIdFocusGained

    private void SellerIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SellerIdFocusLost
        
            if(SellerId.getText().equals("")){
            SellerId.setText("Enter Seller ID");
        }
        
    }//GEN-LAST:event_SellerIdFocusLost

    private void makerequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makerequestActionPerformed
        setVisible(false);
        MakeRequest mrq=new MakeRequest();
        mrq.setVisible(true);
        
        mrq.user.setText(user.getText());
        
        int i=Integer.parseInt(id.getText());
        mrq.id.setText(Integer.toString(i));
    }//GEN-LAST:event_makerequestActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        Home h=new Home();
        
        
       
        setVisible(false);
        
        h.jTextField1.setText(user.getText());
        
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
    }//GEN-LAST:event_kButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(requestsID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(requestsID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(requestsID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(requestsID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new requestsID().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SellerId;
    private javax.swing.JLabel error;
    public static javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lableEroor;
    private com.k33ptoo.components.KButton makerequest;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
    byte[] photo=null;
    String filename=null;
}
