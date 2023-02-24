
package CustomerItem;

import static CustomerItem.Buy.id;
import static CustomerItem.Buy.user;
import static CustomerItem.Login.username;
import java.awt.image.BufferedImage;
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
import javax.swing.JOptionPane;


public class MainAdmin extends javax.swing.JFrame {

    Statement stmt=null;
    ResultSet rs=null;
    Connection con=null;
    
    public MainAdmin() {
        initComponents();
        con=databaseConnection.Connect();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        rid = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        Back1 = new com.k33ptoo.components.KButton();
        Back2 = new com.k33ptoo.components.KButton();
        ResetK2 = new com.k33ptoo.components.KButton();
        ResetK3 = new com.k33ptoo.components.KButton();
        ResetK4 = new com.k33ptoo.components.KButton();
        ResetK5 = new com.k33ptoo.components.KButton();
        ResetK6 = new com.k33ptoo.components.KButton();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        imageicon = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Aid = new javax.swing.JTextField();
        viewRequest = new com.k33ptoo.components.KButton();
        jLabel11 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        ResetK7 = new com.k33ptoo.components.KButton();
        ResetK8 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(957, 564));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel6.setText("Reg Id:");

        rid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        rid.setPreferredSize(new java.awt.Dimension(10, 29));

        txtfname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtfname.setPreferredSize(new java.awt.Dimension(10, 29));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel3.setText("First Name  : ");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel2.setText("Address  : ");

        txtAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtAddress.setPreferredSize(new java.awt.Dimension(10, 29));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel5.setText("Contact No  : ");

        txtContact.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtContact.setPreferredSize(new java.awt.Dimension(10, 29));

        Back1.setBorder(null);
        Back1.setText("Cansel");
        Back1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        Back1.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        Back1.setkSelectedColor(new java.awt.Color(0, 102, 51));
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        Back2.setBorder(null);
        Back2.setText("Back");
        Back2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        Back2.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        Back2.setkSelectedColor(new java.awt.Color(0, 102, 51));
        Back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back2ActionPerformed(evt);
            }
        });

        ResetK2.setBorder(null);
        ResetK2.setText("View Full");
        ResetK2.setToolTipText("View all Admins");
        ResetK2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK2.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK2.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetK2ActionPerformed(evt);
            }
        });

        ResetK3.setBorder(null);
        ResetK3.setText("Delete");
        ResetK3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK3.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK3.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetK3ActionPerformed(evt);
            }
        });

        ResetK4.setBorder(null);
        ResetK4.setText("Update");
        ResetK4.setToolTipText("Update seller account details");
        ResetK4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK4.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK4.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetK4ActionPerformed(evt);
            }
        });

        ResetK5.setBorder(null);
        ResetK5.setText("Search by Aid");
        ResetK5.setToolTipText("Search by Admin id");
        ResetK5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK5.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK5.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetK5ActionPerformed(evt);
            }
        });

        ResetK6.setBorder(null);
        ResetK6.setText("Reset");
        ResetK6.setToolTipText("Reset Fields");
        ResetK6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK6.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK6.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetK6ActionPerformed(evt);
            }
        });

        kGradientPanel4.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel4.setkStartColor(new java.awt.Color(0, 121, 145));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Main Admin");

        user.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setBorder(null);
        user.setOpaque(false);

        id.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setBorder(null);
        id.setOpaque(false);

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Reg No : ");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngwing.com (4) (1).png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imageicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel24)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(imageicon, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(jLabel24))
        );

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 51));
        jLabel16.setText("Main Admin mode");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel8.setText("Last Name  : ");

        txtlname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtlname.setPreferredSize(new java.awt.Dimension(10, 29));

        txtemail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtemail.setPreferredSize(new java.awt.Dimension(10, 29));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel9.setText("Email Address  : ");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel10.setText("Admin Id");

        Aid.setText("Give Already Created  Admin ACC  Id To Auto Fill");
        Aid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        Aid.setPreferredSize(new java.awt.Dimension(10, 29));
        Aid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AidFocusLost(evt);
            }
        });

        viewRequest.setBorder(null);
        viewRequest.setText("View All");
        viewRequest.setToolTipText("View All Registered Acc");
        viewRequest.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        viewRequest.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        viewRequest.setkSelectedColor(new java.awt.Color(0, 102, 51));
        viewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel11.setText("Password");

        txtpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtpassword.setPreferredSize(new java.awt.Dimension(10, 29));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        txtuser.setEditable(false);
        txtuser.setForeground(new java.awt.Color(102, 102, 102));
        txtuser.setText("Its unic dont try to update");
        txtuser.setToolTipText("its unic.you can password only. ");
        txtuser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtuser.setPreferredSize(new java.awt.Dimension(10, 29));
        txtuser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtuserFocusGained(evt);
            }
        });
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel12.setText("Username  : ");

        kButton1.setBorder(null);
        kButton1.setText("Save");
        kButton1.setToolTipText("Contact System Designer");
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        ResetK7.setBorder(null);
        ResetK7.setText("Search by Rid");
        ResetK7.setToolTipText("Search by Admin id");
        ResetK7.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK7.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK7.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetK7ActionPerformed(evt);
            }
        });

        ResetK8.setBorder(null);
        ResetK8.setText("Edit User detail");
        ResetK8.setToolTipText("Reset Fields");
        ResetK8.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK8.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK8.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetK8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(50, 50, 50)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResetK4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResetK3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(289, Short.MAX_VALUE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtpassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtuser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtContact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtlname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtfname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                    .addComponent(Aid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ResetK2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(viewRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(ResetK5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(ResetK6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(ResetK7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(ResetK8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(52, 52, 52))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addContainerGap())))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(51, 51, 51)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Aid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResetK5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResetK7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ResetK2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(13, 13, 13)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(5, 5, 5)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ResetK4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ResetK3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(82, 82, 82))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(ResetK8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(ResetK6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        int responce = JOptionPane.showConfirmDialog(this,"Do you want to exit from the system","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(responce == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
            setVisible(true);
        }
    }//GEN-LAST:event_Back1ActionPerformed

    private void Back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2ActionPerformed
        Home h=new Home();
        h.jTextField1.setText(user.getText());
        
       
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
            if(username.getText().equals("Adminperson@123")){
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
        
        
        

    }//GEN-LAST:event_Back2ActionPerformed

    private void ResetK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK2ActionPerformed

        //

        int i=Integer.parseInt(id.getText());
        
        AllAdminView sdk=new AllAdminView();
        sdk.user.setText(user.getText());
        sdk.id.setText(Integer.toString(i));
        

        setVisible(false);
        sdk.setVisible(true);
        //

        // int i=Integer.parseInt(id.getText());
        //  sdk.id.setText(Integer.toString(i));

        // sdk.setVisible(true);
    }//GEN-LAST:event_ResetK2ActionPerformed

    private void ResetK3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK3ActionPerformed
        try {
            String quary="delete from admin where id=?";
            PreparedStatement pprstmt=con.prepareStatement(quary);

            int aids=Integer.parseInt(Aid.getText());
            pprstmt.setInt(1,aids);
            pprstmt.executeUpdate();

            JOptionPane.showMessageDialog(this,"Recode delete successfully");
            //reset();

        } catch (SQLException ex) {
            Logger.getLogger(Selling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ResetK3ActionPerformed

    private void ResetK4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK4ActionPerformed
        try {
            //stmt=con.createStatement();

            String fname,lname,address,contact,email,catagoryd,usernames,passwords;
            int rids=Integer.parseInt(rid.getText());
            int aids=Integer.parseInt(Aid.getText());

            fname=txtfname.getText();
            lname=txtlname.getText();
            email=txtemail.getText();
            address=txtAddress.getText();
            contact=txtContact.getText();
            usernames=txtuser.getText();
            passwords=txtpassword.getText();
            
            //catagoryd=(String) catagory.getSelectedItem();

            String quary="update admin set reg_id=?,fname=?,lname=?,address=?,contact=?,email=?,username=?,password=? where id=?";
            PreparedStatement pprstmt=con.prepareStatement(quary);

            pprstmt.setInt(1, rids);
            pprstmt.setString(2,fname);
            pprstmt.setString(3, lname);
            pprstmt.setString(4,address);
            pprstmt.setString(5,contact);
            pprstmt.setString(6,email);
            pprstmt.setString(7,usernames);
            pprstmt.setString(8,passwords);
            pprstmt.setInt(9, aids);

            pprstmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"Recode Update Successfully");

        } catch (SQLException ex) {
            Logger.getLogger(Selling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ResetK4ActionPerformed

    private void ResetK5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK5ActionPerformed
        try {
            stmt=con.createStatement();
            int aids=Integer.parseInt(Aid.getText());
            String quary="select * from admin";
            //PreparedStatement pprstmt=con.prepareStatement(quary);

            rs=stmt.executeQuery(quary);

            while (rs.next()){

                if(aids==rs.getInt("id")){ //This curly bracket also wanted the execute program corrctly
                    rid.setText(rs.getString("reg_id"));
                    txtfname.setText(rs.getString("fname"));
                    txtlname.setText(rs.getString("lname"));
                    txtAddress.setText(rs.getString("address"));
                    txtContact.setText(rs.getString("contact"));
                    txtemail.setText(rs.getString("email"));
                    txtuser.setText(rs.getString("username"));
                    txtpassword.setText(rs.getString("password"));

                    }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Selling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ResetK5ActionPerformed

    private void ResetK6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK6ActionPerformed
        //reset();
    }//GEN-LAST:event_ResetK6ActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void AidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AidFocusGained

        if(Aid.getText().equals("Give Already Created  Admin ACC  Id To Auto Fill")){
            Aid.setText("");
        }
    }//GEN-LAST:event_AidFocusGained

    private void AidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AidFocusLost
        if(Aid.getText().equals("")){
            Aid.setText("Give Already Created  Admin ACC  Id To Auto Fill");
        }
    }//GEN-LAST:event_AidFocusLost

    private void viewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestActionPerformed

        setVisible(false);
        AllmemberinSystemView vrs=new AllmemberinSystemView();
        vrs.user.setText(user.getText());
        int i=Integer.parseInt(id.getText());
        vrs.id.setText(Integer.toString(i));
        vrs.setVisible(true);

    }//GEN-LAST:event_viewRequestActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        /*try {
            stmt=con.createStatement();

            String fname,lname,address,contact,email,username,password;
            int rids=Integer.parseInt(rid.getText());
            //int sids=Integer.parseInt(sid.getText());

            fname=txtfname.getText();
            lname=txtlname.getText();
            email=txtemail.getText();
            address=txtAddress.getText();
            contact=txtContact.getText();
            username=txtuser.getText();
            password=txtpassword.getText();

            String quary="insert into admin (reg_id,fname,lname,address,contact,email,username,password) values (?,?,?,?,?,?,?,?)";
            PreparedStatement pprstmt=con.prepareStatement(quary);

            pprstmt.setInt(1, rids);
            pprstmt.setString(2,fname);
            pprstmt.setString(3, lname);
            pprstmt.setString(4,address);
            pprstmt.setString(5,contact);
            pprstmt.setString(6,email);
            pprstmt.setString(7,username);
            pprstmt.setString(8,password);
            
            pprstmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"Recode Saved Successfully");

        } catch (SQLException ex) {
            Logger.getLogger(Selling.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        JOptionPane.showMessageDialog(null,"Contact System Designer");
    }//GEN-LAST:event_kButton1ActionPerformed

    private void ResetK7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK7ActionPerformed
       try {
            stmt=con.createStatement();
            int rids=Integer.parseInt(rid.getText());
            String quary="select * from registration";
            //PreparedStatement pprstmt=con.prepareStatement(quary);

            rs=stmt.executeQuery(quary);

            while (rs.next()){

                if(rids==rs.getInt("rid")){ //This curly bracket also wanted the execute program corrctly
                    
                    
                    txtfname.setText(rs.getString("fname"));
                    txtlname.setText(rs.getString("lname"));
                    txtAddress.setText(rs.getString("address"));
                    //txtContact.setText(rs.getString("contact"));
                    txtemail.setText(rs.getString("email"));
                    txtuser.setText(rs.getString("username"));
                    txtpassword.setText(rs.getString("password"));
                    }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Selling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ResetK7ActionPerformed

    private void txtuserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtuserFocusGained
        
    }//GEN-LAST:event_txtuserFocusGained

    private void ResetK8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK8ActionPerformed
        setVisible(false);
        registration rg=new registration();
        rg.lablereg.setVisible(false);
        //rg.rid.setVisible(false);
        rg.registerid.setVisible(true);
        rg.kButton1.setVisible(true);
        rg.Back1.setVisible(false);
        rg.submit.setVisible(false);
        rg.cansel1.setVisible(false);
        rg.saveupdate.setVisible(false);
        rg.Back2.setVisible(false);
        rg.cansel2.setVisible(false); 
        rg.Back3.setVisible(true);
        rg.show2.setVisible(false);
        rg.show3.setVisible(false);
        
        rg.user.setText(user.getText());
        int i=Integer.parseInt(id.getText());
        rg.rid.setText(Integer.toString(i));
        
        rg.setVisible(true);
        
    }//GEN-LAST:event_ResetK8ActionPerformed

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
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aid;
    private com.k33ptoo.components.KButton Back1;
    private com.k33ptoo.components.KButton Back2;
    private com.k33ptoo.components.KButton ResetK2;
    private com.k33ptoo.components.KButton ResetK3;
    private com.k33ptoo.components.KButton ResetK4;
    private com.k33ptoo.components.KButton ResetK5;
    private com.k33ptoo.components.KButton ResetK6;
    private com.k33ptoo.components.KButton ResetK7;
    private com.k33ptoo.components.KButton ResetK8;
    public static javax.swing.JTextField id;
    private javax.swing.JLabel imageicon;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private javax.swing.JTextField rid;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtuser;
    public static javax.swing.JTextField user;
    private com.k33ptoo.components.KButton viewRequest;
    // End of variables declaration//GEN-END:variables
}
