package CustomerItem;
import static CustomerItem.SellerItemViaSellerACC.user;
import static CustomerItem.requestsID.id;
import static CustomerItem.requestsID.user;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
//import adminItem.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
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
public class Selling extends javax.swing.JFrame {
    
       public Connection con=null;
       public Statement stmt=null;
       public ResultSet rs=null;
    public Selling() {
       
        initComponents();
        con=databaseConnection.Connect();
        jLabel12.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rid = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        catagory = new javax.swing.JComboBox<>();
        ResetK1 = new com.k33ptoo.components.KButton();
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
        userks = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        select = new com.k33ptoo.components.KButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        viewRequest = new com.k33ptoo.components.KButton();
        viewRequest1 = new com.k33ptoo.components.KButton();
        reqid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(957, 564));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Enter Sailer Details To Create A Seller Account");

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

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel4.setText("Sail Catagory : ");

        catagory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Side Skirts", "Fuel tank door", "Instrumetn panel", "Protective Side trims on door panels", "Seat Upholsery", "Window frames", "SIde view mirrors", "Wheel rims and hub caps", "Bumpers", "Enginer gaskets", "Headlamps", "Air vents", "Dashboard", "Door switchd panels", "Spoiler", "Parking sensor", "Boot bottom panel" }));

        ResetK1.setBorder(null);
        ResetK1.setText("Create");
        ResetK1.setToolTipText("Create new Seller account");
        ResetK1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK1.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK1.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetK1ActionPerformed(evt);
            }
        });

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
        ResetK2.setToolTipText("View all seller in the system");
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
        ResetK5.setText("Search by Sid");
        ResetK5.setToolTipText("Search by seller id");
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

        kGradientPanel4.setkEndColor(new java.awt.Color(120, 255, 214));
        kGradientPanel4.setkStartColor(new java.awt.Color(0, 121, 145));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sailer info");

        userks.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        userks.setForeground(new java.awt.Color(255, 255, 255));
        userks.setBorder(null);
        userks.setOpaque(false);

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
                    .addComponent(userks)
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
                        .addComponent(jLabel24)))
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
                .addComponent(userks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
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

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Admin mode");

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
        jLabel10.setText("Sid");

        sid.setText("Give Already Created ACC Sailer Id To Auto Fill");
        sid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        sid.setPreferredSize(new java.awt.Dimension(10, 29));
        sid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sidFocusLost(evt);
            }
        });

        viewRequest.setText("View Request");
        viewRequest.setToolTipText("View all customer request");
        viewRequest.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        viewRequest.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        viewRequest.setkSelectedColor(new java.awt.Color(0, 102, 51));
        viewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestActionPerformed(evt);
            }
        });

        viewRequest1.setText("Search by Rid");
        viewRequest1.setToolTipText("Fill the fields by request id");
        viewRequest1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        viewRequest1.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        viewRequest1.setkSelectedColor(new java.awt.Color(0, 102, 51));
        viewRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequest1ActionPerformed(evt);
            }
        });

        reqid.setText("Request id");
        reqid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reqidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                reqidFocusLost(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel11.setText("Req Id: ");

        kButton1.setBorder(null);
        kButton1.setText("Send a Mail");
        kButton1.setToolTipText("Send mail to seller");
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        kButton1.setkSelectedColor(new java.awt.Color(0, 102, 51));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kButton1MouseEntered(evt);
            }
        });
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("You can send a mail via browser on this button ");

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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel16)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(75, 75, 75))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(catagory, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(433, 433, 433))
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtfname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtlname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(rid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                            .addComponent(sid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(54, 54, 54)
                                    .addComponent(ResetK2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ResetK5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reqid, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ResetK6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(viewRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(kButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(ResetK1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResetK4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResetK3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12))
                        .addGap(0, 71, Short.MAX_VALUE))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addGap(28, 28, 28)
                        .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResetK2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResetK5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(8, 8, 8)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(9, 9, 9)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reqid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ResetK6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResetK3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetK1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetK4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(43, 43, 43)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void reset(){
        rid.setText("");
        sid.setText("");
        txtfname.setText("");
        txtlname.setText("");
        txtAddress.setText("");
        txtContact.setText("");
        catagory.setSelectedItem("");
        txtemail.setText("");
        imageicon.setText("");
    }
    private void ResetK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK1ActionPerformed
            try {
               stmt=con.createStatement();
               
               int id= Integer.parseInt(rid.getText());
               
               String fname,lname,address,contact,email,catagoryd;
               
               fname=txtfname.getText();
               lname=txtlname.getText();
               email=txtemail.getText();
               address=txtAddress.getText();
               contact=txtContact.getText();
               catagoryd=(String) catagory.getSelectedItem();
               
               String quary="insert into saileracc (reg_id,fname,lname,address,contact,email,catagory) values (?,?,?,?,?,?,?)";
               PreparedStatement pprStmt=con.prepareStatement(quary); //Default
               
               pprStmt.setInt(1, id);
               pprStmt.setString(2, fname);
               pprStmt.setString(3, lname);
               pprStmt.setString(4, address);
               pprStmt.setString(5, contact);
               pprStmt.setString(6, email);
               pprStmt.setString(7, catagoryd);
               //pprStmt.setBytes(8,photo);
               
               pprStmt.execute();
               JOptionPane.showMessageDialog(null,"Save SuccessFully");
               
           } catch (SQLException ex) {
               Logger.getLogger(Selling.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_ResetK1ActionPerformed

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
        requestsID h=new requestsID();
        
        
        //and also buyer account id should check that
        setVisible(false);
        
        h.user.setText(userks.getText());
        
        int i=Integer.parseInt(id.getText());
        h.id.setText(Integer.toString(i));
        
        h.setVisible(true);
        
        
    }//GEN-LAST:event_Back2ActionPerformed

    private void ResetK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK2ActionPerformed
            
           // 
            
           System.out.println(userks.getText());
           
           
           SailerDetail sdk=new SailerDetail();
           sdk.user.setText(userks.getText());
           
           //int i=Integer.parseInt(id.getText());
           //sdk.id.setText(Integer.toString(i));
           
           
           setVisible(false);
           sdk.setVisible(true);
           // 
            
           // int i=Integer.parseInt(id.getText());
          //  sdk.id.setText(Integer.toString(i));
            
           // sdk.setVisible(true);
    }//GEN-LAST:event_ResetK2ActionPerformed

    private void ResetK3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK3ActionPerformed
         try {
               String quary="delete from saileracc where Sid=?";
               PreparedStatement pprstmt=con.prepareStatement(quary);
               
               int sids=Integer.parseInt(sid.getText());
               pprstmt.setInt(1,sids);
               pprstmt.executeUpdate();
               
               JOptionPane.showMessageDialog(this,"Recode delete successfully");
               reset();
               
           } catch (SQLException ex) {
               Logger.getLogger(Selling.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_ResetK3ActionPerformed

    private void ResetK4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK4ActionPerformed
          try {
               //stmt=con.createStatement();
               
               String fname,lname,address,contact,email,catagoryd;
               int rids=Integer.parseInt(rid.getText());
               int sids=Integer.parseInt(sid.getText());
               
               fname=txtfname.getText();
               lname=txtlname.getText();
               email=txtemail.getText();
               address=txtAddress.getText();
               contact=txtContact.getText();
               catagoryd=(String) catagory.getSelectedItem();
               
               
               String quary="update saileracc set reg_id=?,fname=?,lname=?,address=?,contact=?,email=?,catagory=? where Sid=?";
               PreparedStatement pprstmt=con.prepareStatement(quary);
               
               pprstmt.setInt(1, rids);
               pprstmt.setString(2,fname);
               pprstmt.setString(3, lname);
               
               pprstmt.setString(4,address);
               pprstmt.setString(5,contact);
               pprstmt.setString(6,email);
                
               pprstmt.setString(7,catagoryd);
               //pprstmt.setBytes(8,(new ImageIcon(photo)));
               pprstmt.setInt(8, sids);
               
               
               
               pprstmt.executeUpdate();
               JOptionPane.showMessageDialog(this,"Recode Update Successfully");
               
           } catch (SQLException ex) {
               Logger.getLogger(Selling.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_ResetK4ActionPerformed

    private void ResetK5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK5ActionPerformed
         try {
               stmt=con.createStatement();
               int sids=Integer.parseInt(sid.getText());
               String quary="select * from saileracc sc inner join registration rg on sc.reg_id=rg.rid";
               //PreparedStatement pprstmt=con.prepareStatement(quary);
               
               rs=stmt.executeQuery(quary);
               
               while (rs.next()){
                   
                   if(sids==rs.getInt("sc.Sid")){ //This curly bracket also wanted the execute program corrctly
                    rid.setText(rs.getString("sc.reg_id")); 
                    txtfname.setText(rs.getString("sc.fname"));
                    txtlname.setText(rs.getString("sc.lname"));
                    txtAddress.setText(rs.getString("sc.address"));
                    txtContact.setText(rs.getString("sc.contact"));
                    txtemail.setText(rs.getString("sc.email"));
                    catagory.setSelectedItem(rs.getString("sc.catagory"));
                    
                    
                   
                    BufferedImage image=ImageIO.read(rs.getBinaryStream("rg.image"));
                    imageicon.setIcon(new ImageIcon(image));
                   
                   }
               }
               
           } catch (SQLException ex) {
               Logger.getLogger(Selling.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(Selling.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_ResetK5ActionPerformed

    private void ResetK6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK6ActionPerformed
        reset();
    }//GEN-LAST:event_ResetK6ActionPerformed

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

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void viewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestActionPerformed
        
        setVisible(false);
        viewRequestSelling vrs=new viewRequestSelling();
        
        vrs.user.setText(userks.getText());
        
        int i=Integer.parseInt(id.getText());
        vrs.id.setText(Integer.toString(i));
        
        vrs.setVisible(true);
        
        
        
    }//GEN-LAST:event_viewRequestActionPerformed

    private void viewRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequest1ActionPerformed
       int idrq=Integer.parseInt(reqid.getText());
                    
       try{
            stmt=con.createStatement();
            String query="select * from requestedmakesail rq inner join registration rg on rq.reg_id=rg.rid";
            
            rs=stmt.executeQuery(query);
            
            while(rs.next()){
                
                if(idrq == rs.getInt("rq.Req_id")){
                
                rid.setText(Integer.toString(rs.getInt("reg_id")));
                txtfname.setText(rs.getString("rg.fname"));
                txtlname.setText(rs.getString("rg.lname"));
                txtemail.setText(rs.getString("rq.reg_id"));
                catagory.setSelectedItem(rs.getString("rq.LTsell"));
                txtContact.setText(rs.getString("rq.telno"));
                txtAddress.setText(rs.getString("rg.address"));
                
                BufferedImage image=ImageIO.read(rs.getBinaryStream("rg.image"));
                imageicon.setIcon(new ImageIcon(image));
                
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_viewRequest1ActionPerformed

    private void reqidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reqidFocusGained
        if(reqid.getText().equals("Request id")){
               reqid.setText("");
        }
    }//GEN-LAST:event_reqidFocusGained

    private void reqidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reqidFocusLost
      if(reqid.getText().equals("")){
               reqid.setText("Request id");
        }
    }//GEN-LAST:event_reqidFocusLost

    private void sidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sidFocusGained

        if(sid.getText().equals("Give Already Created ACC Sailer Id To Auto Fill")){
               sid.setText("");
        }
    }//GEN-LAST:event_sidFocusGained

    private void sidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sidFocusLost
        if(sid.getText().equals("")){
               sid.setText("Give Already Created ACC Sailer Id To Auto Fill");
        }
    }//GEN-LAST:event_sidFocusLost

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://mail.google.com/mail/u/0/#inbox").toURI());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseEntered
       jLabel12.setVisible(true);
    }//GEN-LAST:event_kButton1MouseEntered

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton Back1;
    private com.k33ptoo.components.KButton Back2;
    private com.k33ptoo.components.KButton ResetK1;
    private com.k33ptoo.components.KButton ResetK2;
    private com.k33ptoo.components.KButton ResetK3;
    private com.k33ptoo.components.KButton ResetK4;
    private com.k33ptoo.components.KButton ResetK5;
    private com.k33ptoo.components.KButton ResetK6;
    private javax.swing.JComboBox<String> catagory;
    public static javax.swing.JTextField id;
    private javax.swing.JLabel imageicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private javax.swing.JTextField reqid;
    private javax.swing.JTextField rid;
    private com.k33ptoo.components.KButton select;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    public static javax.swing.JTextField userks;
    private com.k33ptoo.components.KButton viewRequest;
    private com.k33ptoo.components.KButton viewRequest1;
    // End of variables declaration//GEN-END:variables
byte [] photo =null;
    String filename=null;
}
