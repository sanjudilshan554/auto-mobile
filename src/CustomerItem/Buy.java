package CustomerItem;
import static CustomerItem.Person2.id;
import static CustomerItem.Person2.user;
//import adminItem.*;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Buy extends javax.swing.JFrame {
    
  public   Connection con=null;
  public   Statement stmt=null;
  public ResultSet rs=null;
  
    public Buy() {
        
        initComponents();
        con= databaseConnection.Connect();
    }
    
   
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        txtbname = new javax.swing.JTextField();
        txtAvb = new javax.swing.JTextField();
        txtbrand = new javax.swing.JTextField();
        Savek = new com.k33ptoo.components.KButton();
        Update = new com.k33ptoo.components.KButton();
        Deletek = new com.k33ptoo.components.KButton();
        ResetK = new com.k33ptoo.components.KButton();
        DetailK = new com.k33ptoo.components.KButton();
        Back = new com.k33ptoo.components.KButton();
        Cansel = new com.k33ptoo.components.KButton();
        kButton8 = new com.k33ptoo.components.KButton();
        boxcatagory = new javax.swing.JComboBox<>();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        imageicon = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        select = new com.k33ptoo.components.KButton();
        jLabel14 = new javax.swing.JLabel();
        Iid = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Rid = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Sid = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        scontact = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txttransport = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtitemname = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(1100, 630));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Buyer id");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel8.setText("Buyer Name");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel9.setText("Avaliability");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel10.setText("Brand");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel11.setText("Catagory");

        bid.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        bid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        bid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        bid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidActionPerformed(evt);
            }
        });

        txtbname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        txtbname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtbname.setMinimumSize(new java.awt.Dimension(8, 29));

        txtAvb.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        txtAvb.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtAvb.setMinimumSize(new java.awt.Dimension(8, 29));

        txtbrand.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        txtbrand.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtbrand.setMinimumSize(new java.awt.Dimension(8, 29));

        Savek.setBorder(null);
        Savek.setText("Save");
        Savek.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        Savek.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        Savek.setkSelectedColor(new java.awt.Color(0, 102, 51));
        Savek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavekActionPerformed(evt);
            }
        });

        Update.setBorder(null);
        Update.setText("Update");
        Update.setToolTipText("Only Selected some data Can be Change & Save");
        Update.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        Update.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        Update.setkSelectedColor(new java.awt.Color(0, 102, 51));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Deletek.setBorder(null);
        Deletek.setText("Delete");
        Deletek.setToolTipText("Delete fields");
        Deletek.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        Deletek.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        Deletek.setkSelectedColor(new java.awt.Color(0, 102, 51));
        Deletek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletekActionPerformed(evt);
            }
        });

        ResetK.setBorder(null);
        ResetK.setText("Reset");
        ResetK.setToolTipText("Reset the fields");
        ResetK.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetKActionPerformed(evt);
            }
        });

        DetailK.setBorder(null);
        DetailK.setText("View Detail");
        DetailK.setToolTipText("View All details of buyer");
        DetailK.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        DetailK.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        DetailK.setkSelectedColor(new java.awt.Color(0, 102, 51));
        DetailK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailKActionPerformed(evt);
            }
        });

        Back.setBorder(null);
        Back.setText("Back");
        Back.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        Back.setkHoverStartColor(new java.awt.Color(0, 102, 51));
        Back.setkSelectedColor(new java.awt.Color(0, 102, 51));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Cansel.setBorder(null);
        Cansel.setText("Cansel");
        Cansel.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        Cansel.setkHoverStartColor(new java.awt.Color(0, 102, 51));
        Cansel.setkSelectedColor(new java.awt.Color(0, 102, 51));
        Cansel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanselActionPerformed(evt);
            }
        });

        kButton8.setBorder(null);
        kButton8.setText("Search from id");
        kButton8.setToolTipText("Fill the fields with buyer id");
        kButton8.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton8.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        kButton8.setkSelectedColor(new java.awt.Color(0, 102, 51));
        kButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton8ActionPerformed(evt);
            }
        });

        boxcatagory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Side Skirts", "Fuel tank door", "Instrumetn panel", "Protective Side trims on door panels", "Seat Upholsery", "Window frames", "SIde view mirrors", "Wheel rims and hub caps", "Bumpers", "Enginer gaskets", "Headlamps", "Air vents", "Dashboard", "Door switchd panels", "Spoiler", "Parking sensor", "Boot bottom panel" }));

        kGradientPanel1.setkEndColor(new java.awt.Color(120, 255, 214));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 121, 145));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Buyer info");

        user.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setBorder(null);
        user.setOpaque(false);

        id.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("    ");
        id.setBorder(null);
        id.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reg No : ");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngwing.com (4) (1).png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(user))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageicon, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(imageicon, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24))
        );

        select.setBorder(null);
        select.setText("Select image");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel14.setText("Admin mode");

        Iid.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        Iid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        Iid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Item id");

        Rid.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        Rid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        Rid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Reg id");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Sailer id");

        Sid.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        Sid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        Sid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel18.setText("Price");

        txtprice.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        txtprice.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtprice.setMinimumSize(new java.awt.Dimension(8, 29));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel19.setText("Sailer Name");

        sname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        sname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        sname.setMinimumSize(new java.awt.Dimension(8, 29));

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel20.setText("Sailer Contact ");

        scontact.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        scontact.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        scontact.setMinimumSize(new java.awt.Dimension(8, 29));

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel21.setText("Transport");

        txttransport.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        txttransport.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txttransport.setMinimumSize(new java.awt.Dimension(8, 29));

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel22.setText("Buyer Mail Address ");

        txtmail.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        txtmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtmail.setMinimumSize(new java.awt.Dimension(8, 29));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel12.setText("Item Name");

        txtitemname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        txtitemname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtitemname.setMinimumSize(new java.awt.Dimension(8, 29));

        txtaddress.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        txtaddress.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtaddress.setMinimumSize(new java.awt.Dimension(8, 29));

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel23.setText("Buyer Home Address");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel21)
                            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addGap(35, 35, 35)
                                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Cansel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel18)
                                                        .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                                            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel10)
                                                                .addComponent(jLabel11)
                                                                .addComponent(jLabel19)
                                                                .addComponent(jLabel12))
                                                            .addGap(103, 103, 103)
                                                            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(txtitemname, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(scontact, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txtbname, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(Sid, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(Rid, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                                                        .addComponent(txtprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGap(3, 3, 3))
                                                                    .addComponent(boxcatagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(txtAvb, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(txtbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(Iid, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addGap(632, 632, 632)))
                                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addGap(602, 602, 602)))
                                        .addComponent(jLabel20))
                                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                            .addGap(122, 122, 122)
                                            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(kButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Deletek, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ResetK, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Savek, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(DetailK, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(44, 44, 44)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttransport, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(20, 20, 20))))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Iid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DetailK, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtitemname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(boxcatagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ResetK, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtAvb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Savek, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletek, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(scontact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txttransport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cansel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1144, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SavekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavekActionPerformed
        try {
          
          int bids=Integer.parseInt(bid.getText());
          int Iids=Integer.parseInt(Iid.getText());
          int Rids=Integer.parseInt(Rid.getText());
          int Sids=Integer.parseInt(Sid.getText());
          
          double price=Double.parseDouble(txtprice.getText());
          stmt=con.createStatement();
          String itemName,itemCatg,brand,avb,sailerName,contactSailer,Transport;
          
          //int bid=Integer.parsenInt(id.getText());
          itemName=txtitemname.getText();
          itemCatg=(String) boxcatagory.getSelectedItem();
          brand=txtbrand.getText();
          sailerName=sname.getText();
          contactSailer=scontact.getText();
          Transport=txttransport.getText();
          avb=txtAvb.getText();
          
          String query="insert into buycustomer (ItemId,regId,sailerId,itemName,itemCatg,brand,avb,price,sailerName,contactSailer,Transport) values (?,?,?,?,?,?,?,?,?,?,?)";
          PreparedStatement praparedStmt=con.prepareStatement(query);
          
          
          praparedStmt.setInt(1,Iids);
          praparedStmt.setInt(2, Rids);
          praparedStmt.setInt(3,Sids);
          praparedStmt.setString(4, itemName);
         
          praparedStmt.setString(5,itemCatg);
          praparedStmt.setString(6,brand);
          praparedStmt.setString(7,avb);
          praparedStmt.setDouble(8,price);
          praparedStmt.setString(9,sailerName);
          praparedStmt.setString(10,contactSailer);
          praparedStmt.setString(11,Transport);
          
          praparedStmt.execute();
          JOptionPane.showMessageDialog(null, "Save Successfully");
          
          
      } catch (SQLException ex) {
          Logger.getLogger(Buy.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_SavekActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        try {
            
          int bids=Integer.parseInt(bid.getText());
          int Iids=Integer.parseInt(Iid.getText());
          int Rids=Integer.parseInt(Rid.getText());
          int Sids=Integer.parseInt(Sid.getText());
          
          double price=Double.parseDouble(txtprice.getText());
          stmt=con.createStatement();
          String itemName,itemCatg,brand,avb,sailerName,contactSailer,Transport;
          
          //int bid=Integer.parsenInt(id.getText());
          itemName=txtitemname.getText();
          itemCatg=(String) boxcatagory.getSelectedItem();
          brand=txtbrand.getText();
          sailerName=sname.getText();
          contactSailer=scontact.getText();
          Transport=txttransport.getText();
          avb=txtAvb.getText();
          
          String query="update buycustomer set ItemId=?,regId=?,sailerId=?,itemName=?,itemCatg=?,brand=?,avb=?,price=?,sailerName=?,contactSailer=?,Transport=? where bid=?";
          PreparedStatement praparedStmt=con.prepareStatement(query);
          
          
          praparedStmt.setInt(1,Iids);
          praparedStmt.setInt(2,Rids);
          praparedStmt.setInt(3,Sids);
          praparedStmt.setString(4,itemName);
          praparedStmt.setString(5,itemCatg);
          praparedStmt.setString(6,brand);
          praparedStmt.setString(7,avb);
          praparedStmt.setDouble(8,price);
          praparedStmt.setString(9,sailerName);
          praparedStmt.setString(10,contactSailer);
          praparedStmt.setString(11,Transport);
          praparedStmt.setInt(12,bids);
          
          praparedStmt.execute();
          JOptionPane.showMessageDialog(null, "Update Successfully");
      } catch (SQLException ex) {
          Logger.getLogger(Buy.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeletekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletekActionPerformed
        try {
          stmt=con.createStatement();
          
          String query="delete from buycustomer where bid =?";
          PreparedStatement pprstmt=con.prepareStatement(query);
          
          int bids=Integer.parseInt(bid.getText());
          pprstmt.setInt(1,bids);
          
          pprstmt.executeUpdate();
          
          JOptionPane.showMessageDialog(this,"Recode Delete successfully");
          reset();
          
          
      } catch (SQLException ex) {
          Logger.getLogger(Buy.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_DeletekActionPerformed

    private void ResetKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetKActionPerformed
        reset();
    }//GEN-LAST:event_ResetKActionPerformed

    private void DetailKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailKActionPerformed
        setVisible(false);
        AllBuyer ap=new AllBuyer();
        ap.setVisible(true);
        
        ap.user.setText(user.getText());  //setting view detail userid as adminbuy@123
        int i=Integer.parseInt(id.getText());  
        ap.id.setText(Integer.toString(i)); //parse id also to view detail
        
    }//GEN-LAST:event_DetailKActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        setVisible(false);
        
      /* if(user.getText().equals("AdminBuy@123")){ //The user id AdminBuy@123 can only access this part
        Home view=new Home(); 
        view.setVisible(true);
        
        view.jTextField1.setText(user.getText());  //setting again home userid as adminperson@123
        int i=Integer.parseInt(id.getText());  
        view.fromlogid.setText(Integer.toString(i)); //parse id also to home
        }*/
        
        
        Home h=new Home();
        h.jTextField1.setText(user.getText());
        
        if(user.getText().equals("AdminBuy@123")){
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
        
    }//GEN-LAST:event_BackActionPerformed

    private void CanselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanselActionPerformed
        int responce = JOptionPane.showConfirmDialog(this,"Do you want to exit from the system","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(responce == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
            setVisible(true);
        }
    }//GEN-LAST:event_CanselActionPerformed

    private void kButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton8ActionPerformed
         try {
          stmt=con.createStatement();// this auto create try catch
          
          int bids=Integer.parseInt(bid.getText());
         /* int Iids=Integer.parseInt(Iid.getText());
          int Rids=Integer.parseInt(Rid.getText());
          int Sids=Integer.parseInt(Sid.getText());*/
          
          String quary="select * from buycustomer b inner join registration r on b.regId=r.rid";
          
          rs=stmt.executeQuery(quary);
          
          while(rs.next()){
              
              if(bids==rs.getInt("b.bid")){
                 
                  Iid.setText(rs.getString("b.ItemId"));
                  Rid.setText(rs.getString("b.regId"));
                  Sid.setText(rs.getString("b.sailerId"));
                  txtitemname.setText(rs.getString("b.itemName"));
                  
                  txtbname.setText(rs.getString("r.fname"));
                  
                  boxcatagory.setSelectedItem(rs.getString("b.itemCatg"));
                  txtbrand.setText(rs.getString("brand"));
                  txtAvb.setText(rs.getString("b.avb"));
                  txtprice.setText(rs.getString("b.price"));
                  sname.setText(rs.getString("b.sailerName"));
                  scontact.setText(rs.getString("b.contactSailer"));
                  txttransport.setText(rs.getString("b.Transport"));
                  txtmail.setText(rs.getString("r.email"));
                  txtaddress.setText(rs.getString("r.address"));
                  
                  BufferedImage image=ImageIO.read(rs.getBinaryStream("r.image"));
                  imageicon.setIcon(new ImageIcon(image));
              }
          
          }
          
      } catch (SQLException ex) {
          Logger.getLogger(Buy.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(Buy.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_kButton8ActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed

        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File file=chooser.getSelectedFile();
        imageicon.setIcon(new ImageIcon(file.toString()));
        filename=file.getAbsolutePath();

        try{
            File image=new File(filename);
            FileInputStream fis=new FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte [1024];
            for(int readnum; (readnum=fis.read(buf)) !=-1;){
                bos.write(buf,0,readnum);
            }
            photo =bos.toByteArray();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_selectActionPerformed

    private void bidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bidActionPerformed

    
    public void reset(){
                  bid.setText("");
                  txtbname.setText("");
                  txtAvb.setText("");
                  txtbrand.setText("");
                  boxcatagory.setSelectedItem("");
                  
                 
                  txtprice.setText("");
                  sname.setText("");
                  scontact.setText("");
                  txttransport.setText("");
                  txtmail.setText("");
                  txtaddress.setText("");
                  Iid.setText("");
                  Rid.setText("");
                  Sid.setText("");
                  txtitemname.setText("");
    }
   
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
            java.util.logging.Logger.getLogger(Buy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton Back;
    private com.k33ptoo.components.KButton Cansel;
    private com.k33ptoo.components.KButton Deletek;
    private com.k33ptoo.components.KButton DetailK;
    private javax.swing.JTextField Iid;
    private com.k33ptoo.components.KButton ResetK;
    private javax.swing.JTextField Rid;
    private com.k33ptoo.components.KButton Savek;
    private javax.swing.JTextField Sid;
    private com.k33ptoo.components.KButton Update;
    private javax.swing.JTextField bid;
    private javax.swing.JComboBox<String> boxcatagory;
    public static javax.swing.JTextField id;
    private javax.swing.JLabel imageicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KButton kButton8;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField scontact;
    private com.k33ptoo.components.KButton select;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField txtAvb;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtbrand;
    private javax.swing.JTextField txtitemname;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txttransport;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
    String filename=null;
    byte[] photo=null;
}
