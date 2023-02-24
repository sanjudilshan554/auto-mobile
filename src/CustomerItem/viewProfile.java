
package CustomerItem;

import static CustomerItem.Login.username;
import static CustomerItem.Report.user;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class viewProfile extends javax.swing.JFrame {

    Statement stmt=null;
    Connection con=null;
    ResultSet rs=null;
    
    public viewProfile() {
        initComponents();
        con=databaseConnection.Connect();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        regid = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        user2 = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        job = new javax.swing.JTextField();
        imageicon = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        postel = new javax.swing.JTextField();
        bday = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        ms = new javax.swing.JTextField();
        country = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        fromlogid1 = new javax.swing.JTextField();
        fromlogid2 = new javax.swing.JTextField();
        kButton3 = new com.k33ptoo.components.KButton();
        qrcode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(65, 67, 69));
        kGradientPanel1.setkStartColor(new java.awt.Color(35, 37, 38));

        regid.setEditable(false);
        regid.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        regid.setForeground(new java.awt.Color(255, 255, 255));
        regid.setBorder(null);
        regid.setOpaque(false);

        address.setEditable(false);
        address.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setBorder(null);
        address.setOpaque(false);

        user2.setEditable(false);
        user2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        user2.setForeground(new java.awt.Color(255, 255, 255));
        user2.setBorder(null);
        user2.setOpaque(false);
        user2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user2ActionPerformed(evt);
            }
        });

        email.setEditable(false);
        email.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(null);
        email.setOpaque(false);

        job.setEditable(false);
        job.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        job.setForeground(new java.awt.Color(255, 255, 255));
        job.setBorder(null);
        job.setOpaque(false);

        kButton1.setBorder(null);
        kButton1.setText("Edit Profile");
        kButton1.setToolTipText("Edit your profile");
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        kButton1.setkSelectedColor(new java.awt.Color(0, 102, 51));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Address :");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email : ");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Job : ");

        fullname.setEditable(false);
        fullname.setBackground(new java.awt.Color(204, 204, 204));
        fullname.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        fullname.setForeground(new java.awt.Color(204, 204, 204));
        fullname.setText("Sanju Dilshan");
        fullname.setBorder(null);
        fullname.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("City");

        city.setEditable(false);
        city.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        city.setForeground(new java.awt.Color(255, 255, 255));
        city.setBorder(null);
        city.setOpaque(false);
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Postel Code:");

        postel.setEditable(false);
        postel.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        postel.setForeground(new java.awt.Color(255, 255, 255));
        postel.setBorder(null);
        postel.setOpaque(false);

        bday.setEditable(false);
        bday.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        bday.setForeground(new java.awt.Color(255, 255, 255));
        bday.setBorder(null);
        bday.setOpaque(false);

        nic.setEditable(false);
        nic.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        nic.setForeground(new java.awt.Color(255, 255, 255));
        nic.setBorder(null);
        nic.setOpaque(false);

        ms.setEditable(false);
        ms.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        ms.setForeground(new java.awt.Color(255, 255, 255));
        ms.setBorder(null);
        ms.setOpaque(false);

        country.setEditable(false);
        country.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        country.setForeground(new java.awt.Color(255, 255, 255));
        country.setBorder(null);
        country.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Birt day: ");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NIC no:");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Matreial Status");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Country:");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CustomerItem/Lovepik_com-832305785-Vector office work people illustration elements (1) (1).png"))); // NOI18N

        kButton2.setBorder(null);
        kButton2.setText("Back");
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        kButton2.setkSelectedColor(new java.awt.Color(0, 102, 51));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        fromlogid1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        fromlogid1.setForeground(new java.awt.Color(255, 255, 255));
        fromlogid1.setText("Reg ID :");
        fromlogid1.setBorder(null);
        fromlogid1.setOpaque(false);

        fromlogid2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        fromlogid2.setForeground(new java.awt.Color(255, 255, 255));
        fromlogid2.setText("User Name :");
        fromlogid2.setBorder(null);
        fromlogid2.setOpaque(false);

        kButton3.setBorder(null);
        kButton3.setText("Genarate Qr");
        kButton3.setToolTipText("Genarate Qr code about your acoount details");
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        kButton3.setkSelectedColor(new java.awt.Color(0, 102, 51));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(imageicon, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bday, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(postel, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(508, 508, 508)
                                        .addComponent(qrcode, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(fromlogid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(user2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(fromlogid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(regid, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(user2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fromlogid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(regid, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fromlogid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(qrcode, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(imageicon, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(postel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        setVisible(false);
        
        
        
        try{
               registration vpf=new registration();  
         
        
                
                stmt=con.createStatement();
                
                String query="select * from registration";
                
                rs=stmt.executeQuery(query);
                
                int i=Integer.parseInt(regid.getText());
                
                vpf.rid.setText(Integer.toString(i));
                
                while(rs.next()){
                    if(i==rs.getInt(1)){
                        
                        vpf.txtFname.setText(rs.getString("fname"));
                        vpf.txtLname.setText(rs.getString("lname"));
                        vpf.txtGender.setSelectedItem(rs.getString("gender"));
                        vpf.txtOccupancy.setText(rs.getString("occuppancy"));
                        vpf.txtAddress.setText(rs.getString("address"));
                        vpf.txtPost.setText(rs.getString("post_code"));
                        vpf.txtcity.setText(rs.getString("city"));
                        vpf.txtcountry.setText(rs.getString("country"));
                        vpf.txtemail.setText(rs.getString("email"));
                        vpf.txtStatus.setText(rs.getString("material_status"));
                        vpf.txtDay.setText(rs.getString("bday"));
                        vpf.txtpostel.setText(rs.getString("post"));
                        vpf.txtNic.setText(rs.getString("nic"));
                        vpf.txtUser.setText(rs.getString("username"));
                        vpf.txtPassword.setText(rs.getString("password"));
                        
                        
                        
                        BufferedImage image=ImageIO.read(rs.getBinaryStream("image"));
                        vpf.imageicon.setIcon(new ImageIcon(image));
                        
                        
                    }
                }
                
                vpf.user.setText(user2.getText());
                
                vpf.show2.setVisible(false);
                vpf.show3.setVisible(false);
                vpf.Back1.setVisible(false);
                vpf.cansel1.setVisible(false);
                vpf.submit.setVisible(false); 
                vpf.setVisible(true);
                vpf.kButton2.setVisible(false);
                vpf.kButton3.setVisible(false); 
                vpf.Back3.setVisible(false);
                vpf.Back2.setVisible(true);
            }
            catch(Exception e){
                System.out.println(e);
            }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
         Home h=new Home();
        h.jTextField1.setText(user2.getText());
        
      
        setVisible(false);
        
        
        int i=Integer.parseInt(regid.getText());
        h.fromlogid.setText(Integer.toString(i));
        
        try {
            stmt=con.createStatement();
            
            String query="select * from registration";
            PreparedStatement pprstmt=con.prepareStatement(query);
            
            rs=stmt.executeQuery(query);
            
            while(rs.next()){
                
                if(user2.getText().equals(rs.getString(15))){
                    
                BufferedImage image=ImageIO.read(rs.getBinaryStream("image"));
                h.imageicon.setIcon(new ImageIcon(image));
            
                }
            }
            
            if(user2.getText().equals("Adminperson@123")){
                h.kButton9.setVisible(true);
                }
                 else{
              h.kButton9.setVisible(false);
            }
            h.setVisible(true);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AllPersonforcustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AllPersonforcustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_kButton2ActionPerformed

    private void user2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
      try{
          ByteArrayOutputStream out=QRCode.from("Name:   "+fullname.getText()+"\nAddress:   "+address.getText()+"\nE mail:   "+email.getText()+"\nJob:   "+job.getText()+"\nCurrent City:   "+city.getText()+"\nPostel Code:   "+postel.getText()+"\nBirth Day:   "+bday.getText()+"\nNIC No:   "+nic.getText()+"\nMaterial Status:   "+ms.getText()+"\nCountry:   "+country.getText()+"\n\n\n\n\nFrom Admin: Sanju").to(ImageType.PNG).stream();
          String full=fullname.getText();
          
          
          String path_name="D:\\";
          //JLabel path_name=qrcode.setIcon(new ImageIcon(image));;
          
          
          FileOutputStream fout=new FileOutputStream(new File(path_name + (full+".PNG")));
          fout.write(out.toByteArray());
          fout.flush();
          
        File file=new File(path_name+(full+".PNG"));
        
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
        Desktop desktop=Desktop.getDesktop();
        if(file.exists())
            desktop.open(file);
          
          
          
      }
      catch(Exception e){
          System.out.println(e);
      }
    }//GEN-LAST:event_kButton3ActionPerformed

  
    
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
            java.util.logging.Logger.getLogger(viewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField address;
    public static javax.swing.JTextField bday;
    public static javax.swing.JTextField city;
    public static javax.swing.JTextField country;
    public static javax.swing.JTextField email;
    public static javax.swing.JTextField fromlogid1;
    public static javax.swing.JTextField fromlogid2;
    public static javax.swing.JTextField fullname;
    public static javax.swing.JLabel imageicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField job;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    public static javax.swing.JTextField ms;
    public static javax.swing.JTextField nic;
    public static javax.swing.JTextField postel;
    private javax.swing.JLabel qrcode;
    public static javax.swing.JTextField regid;
    public static javax.swing.JTextField user2;
    // End of variables declaration//GEN-END:variables
}
