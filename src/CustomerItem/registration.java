package CustomerItem;

import static CustomerItem.Home.fromlogid;
import static CustomerItem.Home.jTextField1;
import static CustomerItem.viewProfile.fullname;
import static com.barcodelib.barcode.a.b.h.h;
//import adminItem.*;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;


public class registration extends javax.swing.JFrame {

  public   Connection con=null;
  public   Statement stmt=null;
  public   ResultSet rs=null;
  
  
    public registration() {
       
       initComponents();
       con= databaseConnection.Connect();
       imageicon.setVisible(true);
       
       registerid.setVisible(false);
       kButton1.setVisible(false);
       
        //jLabel3.setVisible(false);
        
        
       Errormsgfname.setForeground(new Color(255,255,255));
       starfirstname.setForeground(new Color(255,255,255));
       
       ErrormsgLname.setForeground(new Color(255,255,255));
       starlastname.setForeground(new Color(255,255,255));
       
       Errormsggender.setForeground(new Color(255,255,255));
      // stargender.setVisible(false);
       
       Errormsgocc.setForeground(new Color(255,255,255));
       starocc.setForeground(new Color(255,255,255));
       
       Errormsgadd.setForeground(new Color(255,255,255));
       staradd.setForeground(new Color(255,255,255));
       
       Errormsgme.setForeground(new Color(255,255,255));
       starme.setForeground(new Color(255,255,255));
       
       Errormsgbd.setForeground(new Color(255,255,255));
       starbd.setForeground(new Color(255,255,255));
       
       Errormsguser.setForeground(new Color(255,255,255));
       staruser.setForeground(new Color(255,255,255));
       
       Errormsgpw.setForeground(new Color(255,255,255));
       starpw.setForeground(new Color(255,255,255));
       
       Errormsgpost.setForeground(new Color(255,255,255));
       starpost.setForeground(new Color(255,255,255));
       
       
       Errormsgnic.setForeground(new Color(255,255,255));
       starnic.setForeground(new Color(255,255,255));
       
       
       starconfirm.setForeground(new Color(255,255,255));
       Errormsgconfirm.setForeground(new Color(255,255,255));
       
       CheckedMsg.setForeground(new Color(255,255,255));
       
       confirms.setForeground(new Color(255,255,255));
       
       Errormsgpostel.setForeground(new Color(255,255,255));
       starpostel.setForeground(new Color(255,255,255));
       
       
       starcity.setForeground(new Color(255,255,255));
       Errormsgcity.setForeground(new Color(255,255,255));
       
       Errormsgcountry.setForeground(new Color(255,255,255));
       starcountry.setForeground(new Color(255,255,255));
       
       Errormsgemail.setForeground(new Color(255,255,255));
       staremail.setForeground(new Color(255,255,255));
       
       jLabel3.setForeground(new Color(255,255,255));
       
       
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel16 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtGender = new javax.swing.JComboBox<>();
        txtOccupancy = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtDay = new javax.swing.JTextField();
        txtPost = new javax.swing.JTextField();
        txtNic = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        ConfirmPassword = new javax.swing.JPasswordField();
        Back1 = new com.k33ptoo.components.KButton();
        submit = new com.k33ptoo.components.KButton();
        cansel1 = new com.k33ptoo.components.KButton();
        jLabel28 = new javax.swing.JLabel();
        select = new com.k33ptoo.components.KButton();
        Errormsgfname = new javax.swing.JLabel();
        ErrormsgLname = new javax.swing.JLabel();
        Errormsggender = new javax.swing.JLabel();
        Errormsgocc = new javax.swing.JLabel();
        Errormsgadd = new javax.swing.JLabel();
        Errormsgme = new javax.swing.JLabel();
        Errormsgbd = new javax.swing.JLabel();
        Errormsgpost = new javax.swing.JLabel();
        Errormsgnic = new javax.swing.JLabel();
        Errormsguser = new javax.swing.JLabel();
        Errormsgpw = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        starfirstname = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        starlastname = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        starocc = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        staradd = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        starme = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        starbd = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        starpost = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        starnic = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        staruser = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        starpw = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        Errormsgconfirm = new javax.swing.JLabel();
        starconfirm = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        imageicon = new javax.swing.JLabel();
        CheckedMsg = new javax.swing.JLabel();
        confirms = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtpostel = new javax.swing.JTextField();
        Errormsgpostel = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        txtcountry = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        Errormsgcity = new javax.swing.JLabel();
        Errormsgcountry = new javax.swing.JLabel();
        Errormsgemail = new javax.swing.JLabel();
        starpostel = new javax.swing.JLabel();
        starcity = new javax.swing.JLabel();
        starcountry = new javax.swing.JLabel();
        staremail = new javax.swing.JLabel();
        saveupdate = new com.k33ptoo.components.KButton();
        rid = new javax.swing.JTextField();
        Back2 = new com.k33ptoo.components.KButton();
        cansel2 = new com.k33ptoo.components.KButton();
        hide = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        hide1 = new javax.swing.JLabel();
        show1 = new javax.swing.JLabel();
        lablereg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hide2 = new javax.swing.JLabel();
        show2 = new javax.swing.JLabel();
        hide3 = new javax.swing.JLabel();
        show3 = new javax.swing.JLabel();
        select1 = new com.k33ptoo.components.KButton();
        kButton1 = new com.k33ptoo.components.KButton();
        registerid = new javax.swing.JTextField();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        Back3 = new com.k33ptoo.components.KButton();
        user = new javax.swing.JTextField();
        lablereg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1000, 1300));

        kGradientPanel2.setAlignmentX(0.0F);
        kGradientPanel2.setAlignmentY(0.0F);
        kGradientPanel2.setEnabled(false);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setMaximumSize(new java.awt.Dimension(32767, 4000));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(1000, 1300));

        txtFname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtFname.setText("Enter Firstname"); // NOI18N
        txtFname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFname.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFname.setPreferredSize(new java.awt.Dimension(10, 29));
        txtFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFnameFocusLost(evt);
            }
        });
        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });

        txtLname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtLname.setText("Enter Lastname");
        txtLname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtLname.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtLname.setPreferredSize(new java.awt.Dimension(10, 29));
        txtLname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLnameFocusLost(evt);
            }
        });
        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });

        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        txtOccupancy.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtOccupancy.setText("Enter Occupancy");
        txtOccupancy.setAlignmentY(0.0F);
        txtOccupancy.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtOccupancy.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtOccupancy.setPreferredSize(new java.awt.Dimension(10, 29));
        txtOccupancy.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOccupancyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOccupancyFocusLost(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtAddress.setText("Enter your Current Address");
        txtAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtAddress.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtAddress.setPreferredSize(new java.awt.Dimension(10, 29));
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });

        txtStatus.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtStatus.setText("Enter Material Status");
        txtStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtStatus.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtStatus.setPreferredSize(new java.awt.Dimension(10, 29));
        txtStatus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStatusFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStatusFocusLost(evt);
            }
        });

        txtDay.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtDay.setText("Enter your Born day");
        txtDay.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtDay.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtDay.setPreferredSize(new java.awt.Dimension(10, 29));
        txtDay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDayFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDayFocusLost(evt);
            }
        });

        txtPost.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtPost.setText("What is your post on your occupation");
        txtPost.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtPost.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtPost.setPreferredSize(new java.awt.Dimension(10, 29));
        txtPost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPostFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPostFocusLost(evt);
            }
        });

        txtNic.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtNic.setText("Enter your National Identity Card Number");
        txtNic.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtNic.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtNic.setPreferredSize(new java.awt.Dimension(10, 29));
        txtNic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNicFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNicFocusLost(evt);
            }
        });

        txtUser.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtUser.setText("Enter Username for Log in to the System");
        txtUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtUser.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtUser.setPreferredSize(new java.awt.Dimension(10, 29));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        ConfirmPassword.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        ConfirmPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        ConfirmPassword.setPreferredSize(new java.awt.Dimension(10, 29));

        Back1.setBorder(null);
        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        submit.setBorder(null);
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        cansel1.setBorder(null);
        cansel1.setText("Cansel");
        cansel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cansel1ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel28.setText("New Account Registration");

        select.setBorder(null);
        select.setText("Select image");
        select.setToolTipText("before uploaded please resize your image as 100px,100px");
        select.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        select.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        select.setkSelectedColor(new java.awt.Color(0, 102, 51));
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        Errormsgfname.setForeground(new java.awt.Color(255, 0, 0));
        Errormsgfname.setText("Error");

        ErrormsgLname.setForeground(new java.awt.Color(255, 0, 0));
        ErrormsgLname.setText("Error");

        Errormsggender.setForeground(new java.awt.Color(255, 0, 0));
        Errormsggender.setText("Error");

        Errormsgocc.setForeground(new java.awt.Color(255, 0, 0));
        Errormsgocc.setText("Error");
        Errormsgocc.setAlignmentY(0.0F);
        Errormsgocc.setAutoscrolls(true);

        Errormsgadd.setForeground(new java.awt.Color(255, 0, 0));
        Errormsgadd.setText("Error");

        Errormsgme.setForeground(new java.awt.Color(255, 0, 0));
        Errormsgme.setText("Error");

        Errormsgbd.setForeground(new java.awt.Color(255, 0, 0));
        Errormsgbd.setText("Error");

        Errormsgpost.setForeground(new java.awt.Color(255, 0, 0));
        Errormsgpost.setText("Error");

        Errormsgnic.setForeground(new java.awt.Color(255, 0, 0));
        Errormsgnic.setText("Error");

        Errormsguser.setForeground(new java.awt.Color(255, 0, 0));
        Errormsguser.setText("Error");

        Errormsgpw.setForeground(new java.awt.Color(255, 0, 0));
        Errormsgpw.setText("Error");

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel27.setText("First name");

        starfirstname.setForeground(new java.awt.Color(255, 0, 0));
        starfirstname.setText("*");

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel26.setText("Last name");

        starlastname.setForeground(new java.awt.Color(255, 0, 0));
        starlastname.setText("*");

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel25.setText("Gender");

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel24.setText("Occupancy");
        jLabel24.setAlignmentY(0.0F);
        jLabel24.setAutoscrolls(true);

        starocc.setForeground(new java.awt.Color(255, 0, 0));
        starocc.setText("*");
        starocc.setAlignmentY(0.0F);
        starocc.setAutoscrolls(true);

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel23.setText("Current Address");

        staradd.setForeground(new java.awt.Color(255, 0, 0));
        staradd.setText("*");

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel22.setText("Material Status");

        starme.setForeground(new java.awt.Color(255, 0, 0));
        starme.setText("*");

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel21.setText("Birth day");

        starbd.setForeground(new java.awt.Color(255, 0, 0));
        starbd.setText("*");

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel20.setText("Post");

        starpost.setForeground(new java.awt.Color(255, 0, 0));
        starpost.setText("*");

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel17.setText("NIC no");

        starnic.setForeground(new java.awt.Color(255, 0, 0));
        starnic.setText("*");

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel18.setText("User Name");

        staruser.setForeground(new java.awt.Color(255, 0, 0));
        staruser.setText("*");

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel19.setText("Create new Password");

        starpw.setForeground(new java.awt.Color(255, 0, 0));
        starpw.setText("*");

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel29.setText("Confirm Password");

        txtPassword.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtPassword.setPreferredSize(new java.awt.Dimension(10, 29));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });

        Errormsgconfirm.setForeground(new java.awt.Color(255, 0, 0));
        Errormsgconfirm.setText("Error");

        starconfirm.setForeground(new java.awt.Color(255, 0, 0));
        starconfirm.setText("*");

        jLabel13.setText("1 )");

        jLabel14.setText("2 )");

        jLabel15.setText("3 )");

        jLabel30.setText("4 )");

        jLabel31.setText("5 )");

        jLabel32.setText("10 )");

        jLabel33.setText("11 )");

        jLabel34.setText("12 )");

        jLabel35.setText("13 )");

        jLabel36.setText("14 )");

        jLabel37.setText("15 )");

        jLabel38.setText("16 )");

        CheckedMsg.setForeground(new java.awt.Color(51, 255, 51));
        CheckedMsg.setText("Checked");

        confirms.setForeground(new java.awt.Color(51, 255, 51));
        confirms.setText("Checked");

        txtpostel.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtpostel.setText("Enter Postel code");
        txtpostel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtpostel.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtpostel.setPreferredSize(new java.awt.Dimension(10, 29));
        txtpostel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpostelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpostelFocusLost(evt);
            }
        });

        Errormsgpostel.setForeground(new java.awt.Color(255, 0, 0));
        Errormsgpostel.setText("Error");

        jLabel39.setBackground(new java.awt.Color(0, 0, 0));
        jLabel39.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel39.setText("Postel Code");

        jLabel40.setText("6 )");

        txtcity.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtcity.setText("Enter your current City");
        txtcity.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtcity.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtcity.setPreferredSize(new java.awt.Dimension(10, 29));
        txtcity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcityFocusLost(evt);
            }
        });

        txtcountry.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtcountry.setText("Enter your country");
        txtcountry.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtcountry.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtcountry.setPreferredSize(new java.awt.Dimension(10, 29));
        txtcountry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcountryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcountryFocusLost(evt);
            }
        });

        txtemail.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtemail.setText("enter your email address");
        txtemail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtemail.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtemail.setPreferredSize(new java.awt.Dimension(10, 29));
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });

        jLabel41.setText("7 )");

        jLabel42.setBackground(new java.awt.Color(0, 0, 0));
        jLabel42.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel42.setText("City");

        jLabel43.setBackground(new java.awt.Color(0, 0, 0));
        jLabel43.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel43.setText("Country");

        jLabel44.setText("8 )");

        jLabel45.setText("9 )");

        jLabel46.setBackground(new java.awt.Color(0, 0, 0));
        jLabel46.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel46.setText("Email Address");

        Errormsgcity.setForeground(new java.awt.Color(255, 0, 0));
        Errormsgcity.setText("Error");

        Errormsgcountry.setForeground(new java.awt.Color(255, 0, 0));
        Errormsgcountry.setText("Error");

        Errormsgemail.setForeground(new java.awt.Color(255, 0, 0));
        Errormsgemail.setText("Error");

        starpostel.setForeground(new java.awt.Color(255, 0, 0));
        starpostel.setText("*");

        starcity.setForeground(new java.awt.Color(255, 0, 0));
        starcity.setText("*");

        starcountry.setForeground(new java.awt.Color(255, 0, 0));
        starcountry.setText("*");

        staremail.setForeground(new java.awt.Color(255, 0, 0));
        staremail.setText("*");

        saveupdate.setText("Save Changes");
        saveupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveupdateActionPerformed(evt);
            }
        });

        rid.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        rid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ridActionPerformed(evt);
            }
        });

        Back2.setBorder(null);
        Back2.setText("Back");
        Back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back2ActionPerformed(evt);
            }
        });

        cansel2.setBorder(null);
        cansel2.setText("Cansel");
        cansel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cansel2ActionPerformed(evt);
            }
        });

        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hideMouseReleased(evt);
            }
        });

        hide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hide1MouseReleased(evt);
            }
        });

        lablereg.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        lablereg.setText("Reg No:");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Error");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-test-account-32.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/palm-png-43080 (1) (1) (1).png"))); // NOI18N

        hide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-hide-16.png"))); // NOI18N
        hide2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hide2MouseReleased(evt);
            }
        });

        show2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-eye-16 (1).png"))); // NOI18N

        hide3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-hide-16.png"))); // NOI18N
        hide3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hide3MouseReleased(evt);
            }
        });

        show3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-eye-16 (1).png"))); // NOI18N

        select1.setBorder(null);
        select1.setText("Image resizer");
        select1.setToolTipText("Go to online resizer ");
        select1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        select1.setkHoverStartColor(new java.awt.Color(0, 102, 0));
        select1.setkSelectedColor(new java.awt.Color(0, 102, 51));
        select1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select1ActionPerformed(evt);
            }
        });

        kButton1.setText("Search by regid");
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        kButton2.setText("Update");
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        kButton3.setText("Delete");
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        Back3.setBorder(null);
        Back3.setText("Back");
        Back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back3ActionPerformed(evt);
            }
        });

        lablereg1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        lablereg1.setText("User name");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(starbd)
                                    .addComponent(starme)
                                    .addComponent(staremail)
                                    .addComponent(starcountry)
                                    .addComponent(starcity)
                                    .addComponent(starpostel)
                                    .addComponent(staradd)
                                    .addComponent(starocc)
                                    .addComponent(starlastname)
                                    .addComponent(starpost)
                                    .addComponent(starnic)
                                    .addComponent(staruser)
                                    .addComponent(starpw)))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(starconfirm))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(starfirstname))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel32)
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel45)
                                            .addComponent(jLabel44)
                                            .addComponent(jLabel41)
                                            .addComponent(jLabel40)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel37)
                                            .addComponent(jLabel36)
                                            .addComponent(jLabel35)
                                            .addComponent(jLabel34))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel39)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(jLabel46)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel29)
                            .addComponent(jLabel23)
                            .addComponent(jLabel27)))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lablereg)
                                    .addComponent(lablereg1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(rid))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Errormsgadd)
                            .addComponent(Errormsgocc)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cansel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Errormsgpost, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Errormsgemail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Errormsgcountry, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Errormsgcity, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Errormsgpostel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Errormsgme, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Errormsgbd, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                                    .addComponent(txtNic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                                    .addComponent(Errormsgnic, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                                    .addComponent(Errormsguser, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(Errormsgpw)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CheckedMsg))
                                    .addComponent(ConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(Errormsgconfirm)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(confirms))
                                    .addComponent(txtDay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(hide2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(show2))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(hide3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(show3))))
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtOccupancy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtpostel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtcity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 133, Short.MAX_VALUE)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(hide)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(show))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(hide1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(show1))))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(select1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(registerid, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Errormsggender)
                                    .addComponent(ErrormsgLname)
                                    .addComponent(Errormsgfname)
                                    .addComponent(txtLname, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                                    .addComponent(txtFname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6))
                            .addComponent(imageicon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(saveupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cansel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Back3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(197, 197, 197))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel28)
                                    .addComponent(imageicon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lablereg)
                                        .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lablereg1))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(starfirstname)
                    .addComponent(jLabel27)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Errormsgfname)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel14)
                    .addComponent(starlastname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrormsgLname)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel15))
                        .addGap(26, 26, 26)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOccupancy, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30)
                            .addComponent(starocc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Errormsgocc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel31))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(staradd)
                                            .addComponent(jLabel23))))
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel40)
                                            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(starpostel)
                                                .addComponent(jLabel39)))
                                        .addGap(6, 6, 6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Errormsgadd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtpostel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel42)
                                            .addComponent(jLabel41)
                                            .addComponent(starcity)))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Errormsgpostel)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Errormsgcity)
                                .addGap(18, 18, 18)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel44)
                                    .addComponent(starcountry))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Errormsgcountry)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel45)
                                    .addComponent(staremail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Errormsgemail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel32)
                                    .addComponent(starme))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Errormsgme)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel33)
                                    .addComponent(starbd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(Errormsgbd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel34)
                                            .addComponent(starpost))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Errormsgpost)
                                        .addGap(6, 6, 6)
                                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtNic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel35)
                                            .addComponent(starnic))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Errormsgnic)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel36)
                                            .addComponent(staruser))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Errormsguser)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel19)
                                                .addComponent(jLabel37)
                                                .addComponent(starpw))
                                            .addComponent(hide, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(hide2)))
                            .addComponent(show)
                            .addComponent(show2))
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Errormsgpw)
                                    .addComponent(CheckedMsg))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel29)
                                        .addComponent(jLabel38)
                                        .addComponent(starconfirm))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(hide1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(show3))
                                    .addComponent(show1)
                                    .addComponent(hide3))
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Errormsgconfirm)
                                    .addComponent(confirms))
                                .addGap(37, 37, 37)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cansel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(saveupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cansel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Back3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(22, Short.MAX_VALUE))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Errormsggender)
                        .addContainerGap())))
        );

        jScrollPane2.setViewportView(kGradientPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFnameFocusGained
        if(txtFname.getText().equals("Enter Firstname")){

            txtFname.setText("");
            //txtFname.setForeground(new Color(153,153,153));
            
            //Error msg turn White while typing
        Errormsgfname.setForeground(new Color(255,255,255));
        starfirstname.setForeground(new Color(255,255,255));
        }

        
    }//GEN-LAST:event_txtFnameFocusGained

    private void txtFnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFnameFocusLost

        if(txtFname.getText().equals("")){

            txtFname.setText("Enter Firstname");
            txtFname.setForeground(new Color(153,153,153));
        }
        if(txtFname.getText().length()<0){
            Errormsgfname.setVisible(true);
            starfirstname.setVisible(true);
            Errormsgfname.setText("Please Enter First name");
        }

    }//GEN-LAST:event_txtFnameFocusLost

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameActionPerformed

    private void txtLnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLnameFocusGained
        if(txtLname.getText().equals("Enter Lastname")){
            txtLname.setText("");
            //txtLname.setForeground(new Color(153,153,153));
        }

        ErrormsgLname.setForeground(new Color(255,255,255));
        starlastname.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtLnameFocusGained

    private void txtLnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLnameFocusLost
        if(txtLname.getText().equals("")){
            txtLname.setText("Enter Lastname");
            txtLname.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtLnameFocusLost

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLnameActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtOccupancyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOccupancyFocusGained

        if(txtOccupancy.getText().equals("Enter Occupancy")){
            txtOccupancy.setText("");
            //txtOccupancy.setForeground(new Color(153,153,153));
        }
        Errormsgocc.setForeground(new Color(255,255,255));
        starocc.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtOccupancyFocusGained

    private void txtOccupancyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOccupancyFocusLost

        if(txtOccupancy.getText().equals("")){
            txtOccupancy.setText("Enter Occupancy");
            txtOccupancy.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_txtOccupancyFocusLost

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained

        if(txtAddress.getText().equals("Enter your Current Address")){
            txtAddress.setText("");
            //txtAddress.setForeground(new Color(153,153,153));
        }
        Errormsgadd.setForeground(new Color(255,255,255));
        staradd.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
        if(txtAddress.getText().equals("")){
            txtAddress.setText("Enter your Current Address");
            txtAddress.setForeground(new Color(153,153,153));

        }
    }//GEN-LAST:event_txtAddressFocusLost

    private void txtStatusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStatusFocusGained
        if(txtStatus.getText().equals("Enter Material Status")){
            txtStatus.setText("");
            //txtStatus.setForeground(new Color(153,153,153));
        }

        Errormsgme.setForeground(new Color(255,255,255));
        starme.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtStatusFocusGained

    private void txtStatusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStatusFocusLost
        if(txtStatus.getText().equals("")){
            txtStatus.setText("Enter Material Status");
            txtStatus.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtStatusFocusLost

    private void txtDayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDayFocusGained
        if(txtDay.getText().equals("Enter your Born day")){
            txtDay.setText("");
            // txtDay.setForeground(new Color(153,153,153));
        }
        Errormsgbd.setForeground(new Color(255,255,255));
        starbd.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtDayFocusGained

    private void txtDayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDayFocusLost
        if(txtDay.getText().equals("")){
            txtDay.setText("Enter your Born day");
            txtDay.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_txtDayFocusLost

    private void txtPostFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPostFocusGained
        if(txtPost.getText().equals("What is your post on your occupation")){
            txtPost.setText("");
            //txtPost.setForeground(new Color(153,153,153));
        }
        Errormsgpost.setForeground(new Color(255,255,255));
        starpost.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtPostFocusGained

    private void txtPostFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPostFocusLost
        if(txtPost.getText().equals("")){
            txtPost.setText("What is your post on your occupation");
            txtPost.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtPostFocusLost

    private void txtNicFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNicFocusGained
        if(txtNic.getText().equals("Enter your National Identity Card Number")){
            txtNic.setText("");
            //txtNic.setForeground(new Color(153,153,153));
        }
        Errormsgnic.setForeground(new Color(255,255,255));
        starnic.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtNicFocusGained

    private void txtNicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNicFocusLost
        if(txtNic.getText().equals("")){
            txtNic.setText("Enter your National Identity Card Number");
            txtNic.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNicFocusLost

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if(txtUser.getText().equals("Enter Username for Log in to the System")){
            txtUser.setText("");
            //txtUser.setForeground(new Color(153,153,153));
        }
        Errormsguser.setForeground(new Color(255,255,255));
        staruser.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if(txtUser.getText().equals("")){
            txtUser.setText("Enter Username for Log in to the System");
            txtUser.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtUserFocusLost

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        setVisible(false);
        Login log=new Login();
        log.setVisible(true);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_Back1ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String passd=txtPassword.getText();

        try {

            stmt=con.createStatement();
            String fname,lname,gender,address,occuppancy,postel_code,email,city,country,material_status,bday,post,nic,username,password;

            fname=txtFname.getText();
            lname=txtLname.getText();
            gender=(String) txtGender.getSelectedItem();
            occuppancy=txtOccupancy.getText();
            address=txtAddress.getText();
            material_status=txtStatus.getText();
            bday=txtDay.getText();
            post=txtPost.getText();
            nic=txtNic.getText();
            username=txtUser.getText();
            password=ConfirmPassword.getText();
            postel_code=txtpostel.getText();
            email=txtemail.getText();
            city=txtcity.getText();
            country=txtcountry.getText();

            //can use .isEmpty()

            if(txtFname.getText().equals("Enter Firstname")){
                Errormsgfname.setForeground(new Color(255,0,0));
                starfirstname.setForeground(new Color(255,0,0));
                Errormsgfname.setText("Please Enter First name");

            }
            
           
          if(txtLname.getText().equals("Enter Lastname"))
            {
                ErrormsgLname.setForeground(new Color(255,0,0));
                starlastname.setForeground(new Color(255,0,0));
                ErrormsgLname.setText("Please Enter Last name");

            }
          if(txtGender.getSelectedItem().toString().length()<=0){
                Errormsggender.setForeground(new Color(255,0,0));
                starocc.setForeground(new Color(255,0,0));
                Errormsggender.setText("Please Select the gender from above selection box");

            }

          if(txtOccupancy.getText().equals("Enter Occupancy")){
                Errormsgocc.setForeground(new Color(255,0,0));
                starocc.setForeground(new Color(255,0,0));
                Errormsgocc.setText("Please Enter the Occupation");

            }

          if(txtAddress.getText().equals("Enter your Current Address")){
                Errormsgadd.setForeground(new Color(255,0,0));
                staradd.setForeground(new Color(255,0,0));
                Errormsgadd.setText("Please Enter the Current Address");

            }

          if(txtStatus.getText().equals("Enter Material Status")){
                Errormsgme.setForeground(new Color(255,0,0));
                starme.setForeground(new Color(255,0,0));
                Errormsgme.setText("Please Enter the Material Status");

            }

          if(txtDay.getText().equals("Enter your Born day")){
                Errormsgbd.setForeground(new Color(255,0,0));
                starbd.setForeground(new Color(255,0,0));
                Errormsgbd.setText("Please Enter Your Born day");

            }

          if(txtPost.getText().equals("What is your post on your occupation")){
                Errormsgpost.setForeground(new Color(255,0,0));
                starpost.setForeground(new Color(255,0,0));
                Errormsgpost.setText("Please Enter the post ");

            }

          if(txtNic.getText().equals("Enter your National Identity Card Number")){
                Errormsgnic.setForeground(new Color(255,0,0));
                starnic.setForeground(new Color(255,0,0));
                Errormsgnic.setText("Please Enter the Nic ");

            }

          if(txtUser.getText().equals("Enter Username for Log in to the System")){
                Errormsguser.setForeground(new Color(255,0,0));
                staruser.setForeground(new Color(255,0,0));
                Errormsguser.setText("Please Enter the User name");

            }

          if(txtPassword.getText().length()<=0 ){
                Errormsgpw.setForeground(new Color(255,0,0));
                starpw.setForeground(new Color(255,0,0));
                Errormsgpw.setText("Please Enter new Password");
                
              }
  
                
            /*
          if(ConfirmPassword.getText()!= txtPassword.getText()){
                Errormsgconfirm.setVisible(true);
                starconfirm.setVisible(true);
                Errormsgconfirm.setText("Re enter your previous password correctly");

            }*/
          
          if(txtpostel.getText().equals("Enter Postel code")){
                Errormsgpostel.setForeground(new Color(255,0,0));
                starpostel.setForeground(new Color(255,0,0));
                Errormsgpostel.setText("Enter your postel code");

            }
          
          if(txtcity.getText().equals("Enter your current City")){
                Errormsgcity.setForeground(new Color(255,0,0));
                starcity.setForeground(new Color(255,0,0));
                Errormsgcity.setText("Enter your Enter your current City");

            }
          
          if(txtcountry.getText().equals("Enter your country")){
                Errormsgcountry.setForeground(new Color(255,0,0));
                starcountry.setForeground(new Color(255,0,0));
                Errormsgcountry.setText("Enter your country");

            }
          
          if(txtemail.getText().equals("enter your email address")){
                Errormsgemail.setForeground(new Color(255,0,0));
                staremail.setForeground(new Color(255,0,0));
                Errormsgemail.setText("Enter your email address");

            }
            
       /*   if(ConfirmPassword.getText().equals(txtPassword.getText()) && ConfirmPassword.getText().length()>0){
                Errormsgconfirm.setVisible(false);
                starconfirm.setVisible(false);
                confirms.setVisible(true);
                confirms.setText("Password confirm successfully");

            }*/
          
           if(!ConfirmPassword.getText().equals(txtPassword.getText())){
               jLabel3.setForeground(new Color(255,0,0));
               jLabel3.setText("Not match previous");
           }

            else {

                jLabel3.setText("Confirm OK");
                jLabel3.setForeground(new Color(102,255,0));

                String query = "insert into registration (fname,lname,gender,occuppancy,address,post_code,city,country,email,material_status,bday,post,nic,username,password,image) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement praparedStmt=con.prepareStatement(query);

                //int rid=Integer.parseInt(id.getText()); //id is auto increment or genarate

                praparedStmt.setString(1,fname);
                praparedStmt.setString(2,lname);
                praparedStmt.setString(3,gender);
                praparedStmt.setString(4,occuppancy);
                praparedStmt.setString(5,address);

                praparedStmt.setString(6,postel_code);
                praparedStmt.setString(7,city);
                praparedStmt.setString(8,country);
                praparedStmt.setString(9,email);
                praparedStmt.setString(10,material_status);

                praparedStmt.setString(11,bday);
                praparedStmt.setString(12,post);
                praparedStmt.setString(13,nic);
                praparedStmt.setString(14,username);
                praparedStmt.setString(15,password);

                praparedStmt.setBytes(16,photo);

                praparedStmt.execute();
                JOptionPane.showMessageDialog(null, "Save Successfully");

                reset();
            }

        } catch (SQLException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void cansel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cansel1ActionPerformed
        int responce = JOptionPane.showConfirmDialog(this,"Do you want to exit from the system","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(responce == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
            setVisible(true);
        }
    }//GEN-LAST:event_cansel1ActionPerformed

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

    private void txtpostelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpostelFocusGained
        if(txtpostel.getText().equals("Enter Postel code")){
            txtpostel.setText("");

            //txtpostel.setForeground(new Color(153,153,153));
            Errormsgpostel.setForeground(new Color(255,255,255));
            starpostel.setForeground(new Color(255,255,255));
            
        }
        
    }//GEN-LAST:event_txtpostelFocusGained

    private void txtpostelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpostelFocusLost
        if(txtpostel.getText().equals("")){
            txtpostel.setText("Enter Postel code");

            txtpostel.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtpostelFocusLost

    private void txtcityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcityFocusGained
        if(txtcity.getText().equals("Enter your current City")){
            txtcity.setText("");

            //txtcity.setForeground(new Color(153,153,153));
            Errormsgcity.setForeground(new Color(255,255,255));
            starcity.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtcityFocusGained

    private void txtcityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcityFocusLost
        if(txtcity.getText().equals("")){
            txtcity.setText("Enter your current City");

            txtcity.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtcityFocusLost

    private void txtcountryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcountryFocusGained
        if(txtcountry.getText().equals("Enter your country")){
            txtcountry.setText("");

            //txtcountry.setForeground(new Color(153,153,153));
            Errormsgcountry.setForeground(new Color(255,255,255));
            starcountry.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtcountryFocusGained

    private void txtcountryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcountryFocusLost
        if(txtcountry.getText().equals("")){
            txtcountry.setText("Enter your country");

            txtcountry.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtcountryFocusLost

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
        if(txtemail.getText().equals("enter your email address")){
            txtemail.setText("");

            //txtemail.setForeground(new Color(153,153,153));
            Errormsgemail.setForeground(new Color(255,255,255));
            staremail.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtemailFocusGained

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
        if(txtemail.getText().equals("")){
            txtemail.setText("enter your email address");

            txtemail.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtemailFocusLost

    private void saveupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveupdateActionPerformed

        try{
            String firstname,lastname,gender,occupation,address,post,city,country,email,status,day,postel,nic,user,pass,image;

            firstname=txtFname.getText();
            lastname=txtLname.getText();
            gender=(String) txtGender.getSelectedItem();
            occupation=txtOccupancy.getText();
            address=txtAddress.getText();
            post=txtPost.getText();
            city=txtcity.getText();
            country=txtcountry.getText();
            email=txtemail.getText();
            status=txtStatus.getText();
            day=txtDay.getText();
            postel=txtpostel.getText();
            nic=txtNic.getText();
            user=txtUser.getText();
            pass=ConfirmPassword.getText();

            String query="update registration set fname=?,lname=?,gender=?,occuppancy=?,address=?,post_code=?,city=?,country=?,email=?,material_status=?,bday=?,post=?,nic=?,username=?,password=?,image=? where rid=?";

            PreparedStatement pprstmt=con.prepareStatement(query);

            int i=Integer.parseInt(rid.getText());

            pprstmt.setString(1, firstname);
            pprstmt.setString(2, lastname);
            pprstmt.setString(3, gender);
            pprstmt.setString(4, occupation);
            pprstmt.setString(5, address);
            pprstmt.setString(6, post);
            pprstmt.setString(7, city);
            pprstmt.setString(8, country);
            pprstmt.setString(9, email);
            pprstmt.setString(10, status);
            pprstmt.setString(11, day);
            pprstmt.setString(12, postel);
            pprstmt.setString(13, nic);
            pprstmt.setString(14, user);
            pprstmt.setString(15, pass);
            pprstmt.setBytes(16,photo);
            pprstmt.setInt(17,i);

            pprstmt.executeUpdate(); //This should be executeUpdate not executeQuery
            JOptionPane.showMessageDialog(this,"Update Complete.please log in to system again");
            
            
            Login lg=new Login();
            lg.setVisible(true);
            setVisible(false);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_saveupdateActionPerformed

    private void Back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2ActionPerformed
        viewProfile vpf=new viewProfile();
        vpf.user2.setText(user.getText());

        int i=Integer.parseInt(rid.getText());
        vpf.regid.setText(Integer.toString(i));

        try{
            stmt=con.createStatement();

            String query="select * from registration";

            rs=stmt.executeQuery(query);

            //int i=Integer.parseInt(regid.getText());

            while(rs.next()){
                if(vpf.user2.getText().equals(rs.getString(15)) && i==(rs.getInt(1))){

                    vpf.address.setText(rs.getString("address"));
                    // contact.setText(rs.getString(""));
                    vpf.email.setText(rs.getString("email"));
                    vpf.job.setText(rs.getString("occuppancy"));
                    vpf.fullname.setText(rs.getString("fname") +" "+ rs.getString("lname"));
                    vpf.city.setText(rs.getString("city"));
                    vpf.postel.setText(rs.getString("post_code"));
                    vpf.bday.setText(rs.getString("bday"));
                    vpf.nic.setText(rs.getString("nic"));
                    vpf.ms.setText(rs.getString("material_status"));
                    vpf.country.setText(rs.getString("country"));

                    BufferedImage image=ImageIO.read(rs.getBinaryStream("image"));
                    vpf.imageicon.setIcon(new ImageIcon(image));
                }
            }
            setVisible(false);
        }

        catch(Exception e){
            System.out.println(e);
        }

        vpf.setVisible(true);
    }//GEN-LAST:event_Back2ActionPerformed

    private void cansel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cansel2ActionPerformed
        int responce = JOptionPane.showConfirmDialog(this,"Do you want to exit from the system","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(responce == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
            setVisible(true);
        }
    }//GEN-LAST:event_cansel2ActionPerformed

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        show.setVisible(true);
        hide.setVisible(false);
        txtPassword.setEchoChar((char)0);
    }//GEN-LAST:event_hideMousePressed

    private void hideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseReleased
        show.setVisible(false);
        hide.setVisible(true);
        txtPassword.setEchoChar('*');
    }//GEN-LAST:event_hideMouseReleased

    private void hide1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide1MousePressed
        show1.setVisible(true);
        hide1.setVisible(false);
        ConfirmPassword.setEchoChar((char)0);
    }//GEN-LAST:event_hide1MousePressed

    private void hide1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide1MouseReleased
        show1.setVisible(false);
        hide1.setVisible(true);
        ConfirmPassword.setEchoChar('*');
    }//GEN-LAST:event_hide1MouseReleased

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        Errormsgpw.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtPasswordFocusGained

    private void hide2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide2MousePressed
        show2.setVisible(true);
        hide2.setVisible(false);
        txtPassword.setEchoChar((char)0);
    }//GEN-LAST:event_hide2MousePressed

    private void hide2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide2MouseReleased
        show2.setVisible(false);
        hide2.setVisible(true);
        txtPassword.setEchoChar('*');
    }//GEN-LAST:event_hide2MouseReleased

    private void hide3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide3MousePressed
        show3.setVisible(true);
        hide3.setVisible(false);
        ConfirmPassword.setEchoChar((char)0);
    }//GEN-LAST:event_hide3MousePressed

    private void hide3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide3MouseReleased
        show3.setVisible(false);
        hide3.setVisible(true);
        ConfirmPassword.setEchoChar('*');
    }//GEN-LAST:event_hide3MouseReleased

    private void select1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select1ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.iloveimg.com/resize-image/resize-png#resize-options,pixels").toURI());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_select1ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        try{
        stmt=con.createStatement();
        String query="select * from registration";
        
        rs=stmt.executeQuery(query);
        
        int rgid=Integer.parseInt(registerid.getText());
        while(rs.next()){
            if(rgid==rs.getInt(1)){
                
            txtFname.setText(rs.getString("fname"));
            txtLname.setText(rs.getString("lname"));
            txtGender.setSelectedItem(rs.getString("gender"));
            txtOccupancy.setText(rs.getString("occuppancy"));
            txtAddress.setText(rs.getString("address"));
            txtpostel.setText(rs.getString("post_code"));
            txtcity.setText(rs.getString("city"));
            txtcountry.setText(rs.getString("country"));
            txtemail.setText(rs.getString("email"));
            txtStatus.setText(rs.getString("material_status"));
            txtDay.setText(rs.getString("bday"));
            txtPost.setText(rs.getString("post"));
            txtNic.setText(rs.getString("nic"));
            txtUser.setText(rs.getString("username"));
            txtPassword.setText(rs.getString("password"));
            
            BufferedImage image=ImageIO.read(rs.getBinaryStream("image"));
            imageicon.setIcon(new ImageIcon(image));
            
            }
        }
        
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        try{
            String firstname,lastname,gender,occupation,address,post,city,country,email,status,day,postel,nic,user,pass,image;

            firstname=txtFname.getText();
            lastname=txtLname.getText();
            gender=(String) txtGender.getSelectedItem();
            occupation=txtOccupancy.getText();
            address=txtAddress.getText();
            post=txtPost.getText();
            city=txtcity.getText();
            country=txtcountry.getText();
            email=txtemail.getText();
            status=txtStatus.getText();
            day=txtDay.getText();
            postel=txtpostel.getText();
            nic=txtNic.getText();
            user=txtUser.getText();
            pass=ConfirmPassword.getText();

            String query="update registration set fname=?,lname=?,gender=?,occuppancy=?,address=?,post_code=?,city=?,country=?,email=?,material_status=?,bday=?,post=?,nic=?,username=?,password=?,image=? where rid=?";

            PreparedStatement pprstmt=con.prepareStatement(query);

            int i=Integer.parseInt(registerid.getText());

            pprstmt.setString(1, firstname);
            pprstmt.setString(2, lastname);
            pprstmt.setString(3, gender);
            pprstmt.setString(4, occupation);
            pprstmt.setString(5, address);
            pprstmt.setString(6, postel);
            pprstmt.setString(7, city);
            pprstmt.setString(8, country);
            pprstmt.setString(9, email);
            pprstmt.setString(10, status);
            pprstmt.setString(11, day);
            pprstmt.setString(12, post);
            pprstmt.setString(13, nic);
            pprstmt.setString(14, user);
            pprstmt.setString(15, pass);
            pprstmt.setBytes(16,photo);
            pprstmt.setInt(17,i);

            pprstmt.executeUpdate(); //This should be executeUpdate not executeQuery
            JOptionPane.showMessageDialog(this,"Update Successfully ");
            
            

        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        
        try{
        String query="delete from registration where rid=?";
        
        int rids=Integer.parseInt(registerid.getText());
        
        PreparedStatement pprstmt=con.prepareStatement(query);
        
        pprstmt.setInt(1, rids);
        
        pprstmt.executeUpdate();
        JOptionPane.showMessageDialog(this, "Recode delete successfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_kButton3ActionPerformed

    private void Back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back3ActionPerformed
       setVisible(false);
        MainAdmin ma=new MainAdmin();
        
        ma.user.setText(user.getText());
        int i=Integer.parseInt(rid.getText());
        ma.id.setText(Integer.toString(i));
       ma.setVisible(true);
       
    }//GEN-LAST:event_Back3ActionPerformed

    private void ridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ridActionPerformed
 
          
          
          
      
      
    
    public void reset(){
            txtFname.setText("Enter Firstname");
            txtLname.setText("Enter Lastname");
            txtOccupancy.setText("Enter Occupancy");
            txtAddress.setText("Enter your Current Address");
            txtStatus.setText("Enter Material Status");
            txtDay.setText("Enter your Born day");
            txtPost.setText("What is your post on your occupation");
            txtNic.setText("Enter your National Identity Card Number");
            txtUser.setText("Enter Username for Log in to the System");
            ConfirmPassword.setText("");
            txtPassword.setText("");
            
            txtpostel.setText("Enter Postel code");
            txtcity.setText("Enter your current City");
            txtcountry.setText("Enter your country");
            txtemail.setText("enter your email address");
            imageicon.setVisible(false);
            
            Errormsgfname.setForeground(new Color(255,255,255));
       starfirstname.setForeground(new Color(255,255,255));
       
       ErrormsgLname.setForeground(new Color(255,255,255));
       starlastname.setForeground(new Color(255,255,255));
       
       Errormsggender.setForeground(new Color(255,255,255));
      // stargender.setVisible(false);
       
       Errormsgocc.setForeground(new Color(255,255,255));
       starocc.setForeground(new Color(255,255,255));
       
       Errormsgadd.setForeground(new Color(255,255,255));
       staradd.setForeground(new Color(255,255,255));
       
       Errormsgme.setForeground(new Color(255,255,255));
       starme.setForeground(new Color(255,255,255));
       
       Errormsgbd.setForeground(new Color(255,255,255));
       starbd.setForeground(new Color(255,255,255));
       
       Errormsguser.setForeground(new Color(255,255,255));
       staruser.setForeground(new Color(255,255,255));
       
       Errormsgpw.setForeground(new Color(255,255,255));
       starpw.setForeground(new Color(255,255,255));
       
       Errormsgpost.setForeground(new Color(255,255,255));
       starpost.setForeground(new Color(255,255,255));
       
       
       Errormsgnic.setForeground(new Color(255,255,255));
       starnic.setForeground(new Color(255,255,255));
       
       
       starconfirm.setForeground(new Color(255,255,255));
       Errormsgconfirm.setForeground(new Color(255,255,255));
       
       CheckedMsg.setForeground(new Color(255,255,255));
       
       confirms.setForeground(new Color(255,255,255));
       
       Errormsgpostel.setForeground(new Color(255,255,255));
       starpostel.setForeground(new Color(255,255,255));
       
       
       starcity.setForeground(new Color(255,255,255));
       Errormsgcity.setForeground(new Color(255,255,255));
       
       Errormsgcountry.setForeground(new Color(255,255,255));
       starcountry.setForeground(new Color(255,255,255));
       
       Errormsgemail.setForeground(new Color(255,255,255));
       staremail.setForeground(new Color(255,255,255));
       
       jLabel3.setForeground(new Color(255,255,255));
       
    }
    
    
       
    
    
    
    
  
    
  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.k33ptoo.components.KButton Back1;
    public static com.k33ptoo.components.KButton Back2;
    public static com.k33ptoo.components.KButton Back3;
    private javax.swing.JLabel CheckedMsg;
    public static javax.swing.JPasswordField ConfirmPassword;
    private javax.swing.JLabel ErrormsgLname;
    private javax.swing.JLabel Errormsgadd;
    private javax.swing.JLabel Errormsgbd;
    private javax.swing.JLabel Errormsgcity;
    private javax.swing.JLabel Errormsgconfirm;
    private javax.swing.JLabel Errormsgcountry;
    private javax.swing.JLabel Errormsgemail;
    private javax.swing.JLabel Errormsgfname;
    private javax.swing.JLabel Errormsggender;
    private javax.swing.JLabel Errormsgme;
    private javax.swing.JLabel Errormsgnic;
    private javax.swing.JLabel Errormsgocc;
    private javax.swing.JLabel Errormsgpost;
    private javax.swing.JLabel Errormsgpostel;
    private javax.swing.JLabel Errormsgpw;
    private javax.swing.JLabel Errormsguser;
    public static com.k33ptoo.components.KButton cansel1;
    public static com.k33ptoo.components.KButton cansel2;
    private javax.swing.JLabel confirms;
    public static javax.swing.JLabel hide;
    public static javax.swing.JLabel hide1;
    public static javax.swing.JLabel hide2;
    public static javax.swing.JLabel hide3;
    public static javax.swing.JLabel imageicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    public static com.k33ptoo.components.KButton kButton1;
    public static com.k33ptoo.components.KButton kButton2;
    public static com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    public static javax.swing.JLabel lablereg;
    public static javax.swing.JLabel lablereg1;
    public static javax.swing.JTextField registerid;
    public static javax.swing.JTextField rid;
    public static com.k33ptoo.components.KButton saveupdate;
    public static com.k33ptoo.components.KButton select;
    public static com.k33ptoo.components.KButton select1;
    public static javax.swing.JLabel show;
    public static javax.swing.JLabel show1;
    public static javax.swing.JLabel show2;
    public static javax.swing.JLabel show3;
    private javax.swing.JLabel staradd;
    private javax.swing.JLabel starbd;
    private javax.swing.JLabel starcity;
    private javax.swing.JLabel starconfirm;
    private javax.swing.JLabel starcountry;
    private javax.swing.JLabel staremail;
    private javax.swing.JLabel starfirstname;
    private javax.swing.JLabel starlastname;
    private javax.swing.JLabel starme;
    private javax.swing.JLabel starnic;
    private javax.swing.JLabel starocc;
    private javax.swing.JLabel starpost;
    private javax.swing.JLabel starpostel;
    private javax.swing.JLabel starpw;
    private javax.swing.JLabel staruser;
    public static com.k33ptoo.components.KButton submit;
    public static javax.swing.JTextField txtAddress;
    public static javax.swing.JTextField txtDay;
    public static javax.swing.JTextField txtFname;
    public static javax.swing.JComboBox<String> txtGender;
    public static javax.swing.JTextField txtLname;
    public static javax.swing.JTextField txtNic;
    public static javax.swing.JTextField txtOccupancy;
    public static javax.swing.JPasswordField txtPassword;
    public static javax.swing.JTextField txtPost;
    public static javax.swing.JTextField txtStatus;
    public static javax.swing.JTextField txtUser;
    public static javax.swing.JTextField txtcity;
    public static javax.swing.JTextField txtcountry;
    public static javax.swing.JTextField txtemail;
    public static javax.swing.JTextField txtpostel;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    byte[] photo=null;
    String filename=null;
    
}
