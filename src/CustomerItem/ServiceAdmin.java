package CustomerItem;
import static CustomerItem.Home.jTextField1;
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

public class ServiceAdmin extends javax.swing.JFrame {
    
    
    public Statement stmt=null;
    public Connection con=null;
    public ResultSet rs=null;
    
    public ServiceAdmin() {
     
        initComponents();
        con=databaseConnection.Connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        locationdc = new javax.swing.JComboBox<>();
        catagorybox = new javax.swing.JComboBox<>();
        Back2 = new com.k33ptoo.components.KButton();
        ResetK5 = new com.k33ptoo.components.KButton();
        ResetK6 = new com.k33ptoo.components.KButton();
        ResetK7 = new com.k33ptoo.components.KButton();
        ResetK8 = new com.k33ptoo.components.KButton();
        ResetK9 = new com.k33ptoo.components.KButton();
        ResetK10 = new com.k33ptoo.components.KButton();
        Back3 = new com.k33ptoo.components.KButton();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        imageicon = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        select = new com.k33ptoo.components.KButton();
        jLabel18 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        rid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        txttime = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ResetK11 = new com.k33ptoo.components.KButton();
        jLabel23 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(957, 564));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel4.setText("Serviser id:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel3.setText("Servicer First Name:");

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel16.setText("Service Location");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel17.setText("Service Price");

        sid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        sid.setPreferredSize(new java.awt.Dimension(10, 29));
        sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidActionPerformed(evt);
            }
        });

        txtprice.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtprice.setPreferredSize(new java.awt.Dimension(10, 29));

        locationdc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Embilipitiya", "Colombo", "Anuradhapura", "Kandy", "Jaffna", "Galle", "Matara", "Vavuniya", "Ratnapura", "Kurunegala" }));

        catagorybox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Test Transmission", "Electric Problem", "Alignment Problem", "New Modifier", "Scanning", "Body Wash" }));
        catagorybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catagoryboxActionPerformed(evt);
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

        ResetK5.setBorder(null);
        ResetK5.setText("Delete");
        ResetK5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK5.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK5.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetK5ActionPerformed(evt);
            }
        });

        ResetK6.setBorder(null);
        ResetK6.setText("Save");
        ResetK6.setToolTipText("Create new service");
        ResetK6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK6.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK6.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetK6ActionPerformed(evt);
            }
        });

        ResetK7.setBorder(null);
        ResetK7.setText("Search by id");
        ResetK7.setToolTipText("Search by servicer id");
        ResetK7.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK7.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK7.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetK7ActionPerformed(evt);
            }
        });

        ResetK8.setBorder(null);
        ResetK8.setText("Update");
        ResetK8.setToolTipText("Update created service");
        ResetK8.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK8.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK8.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetK8ActionPerformed(evt);
            }
        });

        ResetK9.setBorder(null);
        ResetK9.setText("View Full About Service");
        ResetK9.setToolTipText("View full details about all service");
        ResetK9.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK9.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK9.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetK9ActionPerformed(evt);
            }
        });

        ResetK10.setBorder(null);
        ResetK10.setText("Reset");
        ResetK10.setToolTipText("Reset Fields");
        ResetK10.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK10.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK10.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetK10ActionPerformed(evt);
            }
        });

        Back3.setBorder(null);
        Back3.setText("Cansel");
        Back3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        Back3.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        Back3.setkSelectedColor(new java.awt.Color(0, 102, 51));
        Back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back3ActionPerformed(evt);
            }
        });

        kGradientPanel4.setkEndColor(new java.awt.Color(120, 255, 214));
        kGradientPanel4.setkStartColor(new java.awt.Color(0, 121, 145));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Service info");

        user.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setBorder(null);
        user.setOpaque(false);

        id.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setBorder(null);
        id.setOpaque(false);

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Reg No : ");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngwing.com (4) (1).png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(imageicon, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user)
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(imageicon, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addContainerGap())
        );

        select.setBorder(null);
        select.setText("Select image");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Admin mode");

        pid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        pid.setPreferredSize(new java.awt.Dimension(10, 29));
        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });

        rid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        rid.setPreferredSize(new java.awt.Dimension(10, 29));
        rid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ridActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel5.setText("Registration id:");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel6.setText("Person id:");

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel20.setText("Service Catagory");

        txtFirstname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtFirstname.setPreferredSize(new java.awt.Dimension(10, 29));

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel21.setText("Service Time");

        txtcontact.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtcontact.setPreferredSize(new java.awt.Dimension(10, 29));

        txttime.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txttime.setPreferredSize(new java.awt.Dimension(10, 29));

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel22.setText("Contact ");

        ResetK11.setBorder(null);
        ResetK11.setText("View  get Service");
        ResetK11.setToolTipText("view about who get service");
        ResetK11.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ResetK11.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        ResetK11.setkSelectedColor(new java.awt.Color(0, 102, 51));
        ResetK11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetK11ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel23.setText("Email");

        txtemail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtemail.setPreferredSize(new java.awt.Dimension(10, 29));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel2.setText("Create And View ");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Back3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(locationdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(catagorybox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(137, 137, 137)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(ResetK9, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                            .addComponent(ResetK7, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                            .addComponent(ResetK10, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                            .addComponent(ResetK11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                    .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(ResetK6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ResetK8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ResetK5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 11, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(ResetK7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ResetK9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ResetK11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ResetK10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(locationdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(catagorybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(27, 27, 27)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResetK6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetK8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetK5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void catagoryboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catagoryboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catagoryboxActionPerformed

    
    public void reset(){
        sid.setText("");
        pid.setText("");
        rid.setText("");
        txtprice.setText("");
        txtFirstname.setText("");
        locationdc.setSelectedItem("");
        catagorybox.setSelectedItem("");
        txttime.setText("");
        txtcontact.setText("");
    }
    private void Back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2ActionPerformed
       setVisible(false);
      /* Home view=new Home();
       
       
        view.jTextField1.setText(user.getText());  //setting view detail userid as adminperson@123
        int i=Integer.parseInt(id.getText());  
        view.fromlogid.setText(Integer.toString(i)); //parse id also to view detail
        view.setVisible(true);*/
      
      Home h=new Home();
        h.jTextField1.setText(user.getText());
        
        if(user.getText().equals("AdminService@123")){
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
      
    }//GEN-LAST:event_Back2ActionPerformed

    private void ResetK5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK5ActionPerformed
      try {
            
            int sids=Integer.parseInt(sid.getText());
            
            
            String query="delete from ser where sId=?";
            PreparedStatement pprstmt=con.prepareStatement(query);
            
            pprstmt.setInt(1,sids);
            pprstmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"Recode Delete Successfully");
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ResetK5ActionPerformed

    private void ResetK6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK6ActionPerformed
        try {
            stmt=con.createStatement();
            
            int pids=Integer.parseInt(pid.getText());
            int rids=Integer.parseInt(rid.getText());
            Double price=Double.parseDouble(txtprice.getText());
            
            String fname,location,catagory,time,contact,email;
            
            fname=txtFirstname.getText();
            time=txttime.getText();
            contact=txtcontact.getText();
            location=(String) locationdc.getSelectedItem();
            catagory=(String) catagorybox.getSelectedItem();
            email=txtemail.getText();
            
            String quary="insert into ser (pid,rid,servicerName,sLocation,sCatagory,sPrice,sTime,contact,email) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pprStmt=con.prepareStatement(quary);  //Upper and Lower 
            
            pprStmt.setInt(1, pids);
            pprStmt.setInt(2, rids);
            pprStmt.setString(3, fname);
            pprStmt.setString(4, location);
            pprStmt.setString(5, catagory);
            pprStmt.setDouble(6,price);
            pprStmt.setString(7,time);
            pprStmt.setString(8,contact);
            pprStmt.setString(9,email);
            
            
            pprStmt.execute();
            JOptionPane.showMessageDialog(null,"Save Successfully");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ServiceAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ResetK6ActionPerformed

    private void ResetK7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK7ActionPerformed
        try {
            
            stmt=con.createStatement();
            
            int sids=Integer.parseInt(sid.getText());
            
            //int pids=Integer.parseInt(pid.getText());
            //int rids=Integer.parseInt(rid.getText());
            
            String quary="select * from ser";
            //PreparedStatement pprstmt=con.prepareStatement(quary);
            
            rs=stmt.executeQuery(quary);
            
          while(rs.next()){
                if(sids==rs.getInt("sId")){
                    
                
                pid.setText(rs.getString("pId"));
                rid.setText(rs.getString("rId"));
                txtFirstname.setText(rs.getString("servicerName"));
                locationdc.setSelectedItem(rs.getString("sLocation"));
                catagorybox.setSelectedItem(rs.getString("sCatagory"));
                txtprice.setText(rs.getString("sPrice"));
                txttime.setText(rs.getString("sTime"));
                txtcontact.setText(rs.getString("contact"));
                txtemail.setText(rs.getString("email"));
                //BufferedImage image=ImageIO.read(rs.getBinaryStream("image"));
                //imageicon.setIcon(new ImageIcon(image));
            }
          }
          
          
        } catch (SQLException ex) {
            Logger.getLogger(ServiceAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } 
        /*catch (IOException ex) {
            Logger.getLogger(ServiceAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_ResetK7ActionPerformed

    private void ResetK8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK8ActionPerformed
         try {
             
            
            String fname,location,catagory,time,contact,email;
            
            int pids=Integer.parseInt(pid.getText());
            int rids=Integer.parseInt(rid.getText());
            fname=txtFirstname.getText();
            location=(String) locationdc.getSelectedItem();
            catagory=(String) catagorybox.getSelectedItem();
            Double price=Double.parseDouble(txtprice.getText());
            time=txttime.getText();
            contact=txtcontact.getText();
            int sids=Integer.parseInt(sid.getText());
            email=txtemail.getText();
            
            String quary="update ser set pId=?,rId=?,servicerName=?,sLocation=?,sCatagory=?,sPrice=?,sTime=?,contact=?,email=? where sId=?";
            PreparedStatement pprstmt=con.prepareStatement(quary);
            
            pprstmt.setInt(1,pids);
            pprstmt.setInt(2,rids);
            pprstmt.setString(3,fname);
            pprstmt.setString(4,location);
            pprstmt.setString(5,catagory);
            pprstmt.setDouble(6,price);
            pprstmt.setString(7,time);
            pprstmt.setString(8,contact);
            pprstmt.setString(9,email);
            
            pprstmt.setInt(10,sids);
            
            pprstmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"Recode Update Success");
        } catch (SQLException ex) {
            Logger.getLogger(ServiceAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ResetK8ActionPerformed

    private void ResetK9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK9ActionPerformed
        setVisible(false);
        
        AllService ap=new AllService();
        ap.setVisible(true);
        
        ap.user.setText(user.getText());  //setting view detail userid as adminperson@123
        int i=Integer.parseInt(id.getText());  
        ap.id.setText(Integer.toString(i)); //parse id also to view detail
    }//GEN-LAST:event_ResetK9ActionPerformed

    private void ResetK10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK10ActionPerformed
       reset();
    }//GEN-LAST:event_ResetK10ActionPerformed

    private void Back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back3ActionPerformed
         int responce = JOptionPane.showConfirmDialog(this,"Do you want to exit from the system","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(responce == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
            setVisible(true);
        }
    }//GEN-LAST:event_Back3ActionPerformed

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

    private void sidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidActionPerformed

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

    private void ridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ridActionPerformed

    private void ResetK11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetK11ActionPerformed
         setVisible(false);
        
        AlreadygetService as=new AlreadygetService();
        
        as.setVisible(true);
        
        as.user.setText(user.getText());  //setting view detail userid as adminperson@123
        int i=Integer.parseInt(id.getText());  
        as.id.setText(Integer.toString(i)); //parse id also to view detail
    }//GEN-LAST:event_ResetK11ActionPerformed

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
            java.util.logging.Logger.getLogger(ServiceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton Back2;
    private com.k33ptoo.components.KButton Back3;
    private com.k33ptoo.components.KButton ResetK10;
    private com.k33ptoo.components.KButton ResetK11;
    private com.k33ptoo.components.KButton ResetK5;
    private com.k33ptoo.components.KButton ResetK6;
    private com.k33ptoo.components.KButton ResetK7;
    private com.k33ptoo.components.KButton ResetK8;
    private com.k33ptoo.components.KButton ResetK9;
    private javax.swing.JComboBox<String> catagorybox;
    public static javax.swing.JTextField id;
    private javax.swing.JLabel imageicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private javax.swing.JComboBox<String> locationdc;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField rid;
    private com.k33ptoo.components.KButton select;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txttime;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
    byte [] photo =null;
    String filename=null;
}
