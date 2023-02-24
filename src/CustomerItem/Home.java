package CustomerItem;
import static CustomerItem.viewProfile.regid;
import static CustomerItem.viewProfile.user2;
//import adminItem.*;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Home extends javax.swing.JFrame {
    
    Connection con=null;
    ResultSet rs=null;
    Statement stmt=null;
    public static  int jTextField2;
    
    public Home() {
        
        initComponents();
        dc();
       
        //ADD NEW
        con=databaseConnection.Connect();
       
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        kButton9.setVisible(false);
        
     }
    
    
    public void dc(){
        //not working :(
        //But we'll make it soon
        try{
            stmt=con.createStatement();
            ResultSetMetaData rsmd=rs.getMetaData();
            
            
            
            String s="sarith";
            
            String quary="select * from registration";
            rs=stmt.executeQuery(quary);
            
            while(rs.next()){
                if(s==rs.getString("fname")){
            BufferedImage image=ImageIO.read(rs.getBinaryStream("image"));
            imageicon.setIcon(new ImageIcon(image));
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }

    
    
        
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        componentResizerUtil1 = new com.k33ptoo.utils.ComponentResizerUtil();
        app1 = new com.k33ptoo.App();
        componentMoverUtil1 = new com.k33ptoo.utils.ComponentMoverUtil();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        jLabel19 = new javax.swing.JLabel();
        kButton3 = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        kButton6 = new com.k33ptoo.components.KButton();
        kButton7 = new com.k33ptoo.components.KButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        imageicon = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        fromlogid = new javax.swing.JTextField();
        fromlogid1 = new javax.swing.JTextField();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton9 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel3.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("About");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        kButton3.setBorder(null);
        kButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-buying-96.png"))); // NOI18N
        kButton3.setToolTipText("Buy something");
        kButton3.setAlignmentX(10.0F);
        kButton3.setAlignmentY(10.0F);
        kButton3.setAutoscrolls(true);
        kButton3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/CustomerItem/Lovepik_com-832305785-Vector office work people illustration elements (1) (1).png"))); // NOI18N
        kButton3.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        kButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        kButton3.setIconTextGap(30);
        kButton3.setInheritsPopupMenu(true);
        kButton3.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        kButton3.setkBorderRadius(15);
        kButton3.setkEndColor(new java.awt.Color(153, 153, 153));
        kButton3.setkForeGround(new java.awt.Color(102, 102, 102));
        kButton3.setkHoverColor(new java.awt.Color(102, 102, 102));
        kButton3.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        kButton3.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        kButton3.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        kButton3.setkIndicatorThickness(5);
        kButton3.setkSelectedColor(new java.awt.Color(102, 102, 255));
        kButton3.setkStartColor(new java.awt.Color(226, 226, 226));
        kButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        kButton3.setName("hggggggg"); // NOI18N
        kButton3.setOpaque(false);
        kButton3.setPreferredSize(new java.awt.Dimension(200, 200));
        kButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/CustomerItem/Lovepik_com-832305785-Vector office work people illustration elements (1) (1).png"))); // NOI18N
        kButton3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        kButton3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Mechanic");

        jLabel4.setBorder(null);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-mechanic-96.png"))); // NOI18N
        jLabel4.setToolTipText("You can get Mechanic's details From here");
        jLabel4.setAlignmentX(10.0F);
        jLabel4.setAlignmentY(10.0F);
        jLabel4.setAutoscrolls(true);
        jLabel4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/CustomerItem/Lovepik_com-832305785-Vector office work people illustration elements (1) (1).png"))); // NOI18N
        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel4.setIconTextGap(30);
        jLabel4.setInheritsPopupMenu(true);
        jLabel4.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        jLabel4.setkBorderRadius(15);
        jLabel4.setkEndColor(new java.awt.Color(153, 153, 153));
        jLabel4.setkForeGround(new java.awt.Color(102, 102, 102));
        jLabel4.setkHoverColor(new java.awt.Color(102, 102, 102));
        jLabel4.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        jLabel4.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        jLabel4.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        jLabel4.setkIndicatorThickness(5);
        jLabel4.setkSelectedColor(new java.awt.Color(102, 102, 255));
        jLabel4.setkStartColor(new java.awt.Color(226, 226, 226));
        jLabel4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jLabel4.setName("hggggggg"); // NOI18N
        jLabel4.setOpaque(false);
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 200));
        jLabel4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/CustomerItem/Lovepik_com-832305785-Vector office work people illustration elements (1) (1).png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabel4ActionPerformed(evt);
            }
        });

        kButton5.setBorder(null);
        kButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-car-service-96.png"))); // NOI18N
        kButton5.setToolTipText("Get services from us");
        kButton5.setAlignmentX(10.0F);
        kButton5.setAlignmentY(10.0F);
        kButton5.setAutoscrolls(true);
        kButton5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/CustomerItem/Lovepik_com-832305785-Vector office work people illustration elements (1) (1).png"))); // NOI18N
        kButton5.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        kButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kButton5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        kButton5.setIconTextGap(30);
        kButton5.setInheritsPopupMenu(true);
        kButton5.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        kButton5.setkBorderRadius(15);
        kButton5.setkEndColor(new java.awt.Color(153, 153, 153));
        kButton5.setkForeGround(new java.awt.Color(102, 102, 102));
        kButton5.setkHoverColor(new java.awt.Color(102, 102, 102));
        kButton5.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        kButton5.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        kButton5.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        kButton5.setkIndicatorThickness(5);
        kButton5.setkSelectedColor(new java.awt.Color(102, 102, 255));
        kButton5.setkStartColor(new java.awt.Color(226, 226, 226));
        kButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        kButton5.setName("hggggggg"); // NOI18N
        kButton5.setOpaque(false);
        kButton5.setPreferredSize(new java.awt.Dimension(200, 200));
        kButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/CustomerItem/Lovepik_com-832305785-Vector office work people illustration elements (1) (1).png"))); // NOI18N
        kButton5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        kButton5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });

        kButton6.setBorder(null);
        kButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-report-card-96 (1).png"))); // NOI18N
        kButton6.setToolTipText("Report anything");
        kButton6.setAlignmentX(10.0F);
        kButton6.setAlignmentY(10.0F);
        kButton6.setAutoscrolls(true);
        kButton6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/CustomerItem/Lovepik_com-832305785-Vector office work people illustration elements (1) (1).png"))); // NOI18N
        kButton6.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        kButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kButton6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        kButton6.setIconTextGap(30);
        kButton6.setInheritsPopupMenu(true);
        kButton6.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        kButton6.setkBorderRadius(15);
        kButton6.setkEndColor(new java.awt.Color(153, 153, 153));
        kButton6.setkForeGround(new java.awt.Color(102, 102, 102));
        kButton6.setkHoverColor(new java.awt.Color(102, 102, 102));
        kButton6.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        kButton6.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        kButton6.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        kButton6.setkIndicatorThickness(5);
        kButton6.setkSelectedColor(new java.awt.Color(102, 102, 255));
        kButton6.setkStartColor(new java.awt.Color(226, 226, 226));
        kButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        kButton6.setName("hggggggg"); // NOI18N
        kButton6.setOpaque(false);
        kButton6.setPreferredSize(new java.awt.Dimension(200, 200));
        kButton6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/CustomerItem/Lovepik_com-832305785-Vector office work people illustration elements (1) (1).png"))); // NOI18N
        kButton6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        kButton6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });

        kButton7.setBorder(null);
        kButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-sell-96.png"))); // NOI18N
        kButton7.setToolTipText("Selling accounts");
        kButton7.setAlignmentX(10.0F);
        kButton7.setAlignmentY(10.0F);
        kButton7.setAutoscrolls(true);
        kButton7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/CustomerItem/Lovepik_com-832305785-Vector office work people illustration elements (1) (1).png"))); // NOI18N
        kButton7.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        kButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kButton7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        kButton7.setIconTextGap(30);
        kButton7.setInheritsPopupMenu(true);
        kButton7.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        kButton7.setkBorderRadius(15);
        kButton7.setkEndColor(new java.awt.Color(153, 153, 153));
        kButton7.setkForeGround(new java.awt.Color(102, 102, 102));
        kButton7.setkHoverColor(new java.awt.Color(102, 102, 102));
        kButton7.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        kButton7.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        kButton7.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        kButton7.setkIndicatorThickness(5);
        kButton7.setkSelectedColor(new java.awt.Color(102, 102, 255));
        kButton7.setkStartColor(new java.awt.Color(226, 226, 226));
        kButton7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        kButton7.setName("hggggggg"); // NOI18N
        kButton7.setOpaque(false);
        kButton7.setPreferredSize(new java.awt.Dimension(200, 200));
        kButton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/CustomerItem/Lovepik_com-832305785-Vector office work people illustration elements (1) (1).png"))); // NOI18N
        kButton7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        kButton7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Buy");

        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Selling");

        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Service");

        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Report");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel19))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(119, 119, 119)
                .addComponent(jLabel12)
                .addGap(136, 136, 136)
                .addComponent(jLabel13)
                .addGap(124, 124, 124)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(116, 116, 116))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap())
        );

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 43, 94));
        kGradientPanel1.setkStartColor(new java.awt.Color(137, 33, 107));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-home-page-32.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-test-account-32.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-logout-32.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Home");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);

        fromlogid.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        fromlogid.setForeground(new java.awt.Color(255, 255, 255));
        fromlogid.setBorder(null);
        fromlogid.setOpaque(false);

        fromlogid1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        fromlogid1.setForeground(new java.awt.Color(255, 255, 255));
        fromlogid1.setText("Reg ID :");
        fromlogid1.setBorder(null);
        fromlogid1.setOpaque(false);

        kButton1.setBorder(null);
        kButton1.setText("Logout");
        kButton1.setToolTipText("Logout from the system");
        kButton1.setkEndColor(new java.awt.Color(137, 33, 107));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(204, 43, 94));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        kButton2.setBorder(null);
        kButton2.setText("Home");
        kButton2.setToolTipText("This is your Home");
        kButton2.setkEndColor(new java.awt.Color(137, 33, 107));
        kButton2.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        kButton2.setkHoverForeGround(new java.awt.Color(204, 204, 204));
        kButton2.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        kButton2.setkStartColor(new java.awt.Color(204, 43, 94));

        kButton4.setBorder(null);
        kButton4.setText("View Profile");
        kButton4.setToolTipText("View your profile");
        kButton4.setkEndColor(new java.awt.Color(137, 33, 107));
        kButton4.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton4.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton4.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton4.setkStartColor(new java.awt.Color(204, 43, 94));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });

        kButton9.setBorder(null);
        kButton9.setText("Main Admin");
        kButton9.setToolTipText("This is your Home");
        kButton9.setkEndColor(new java.awt.Color(137, 33, 107));
        kButton9.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        kButton9.setkHoverForeGround(new java.awt.Color(204, 204, 204));
        kButton9.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        kButton9.setkStartColor(new java.awt.Color(204, 43, 94));
        kButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addContainerGap())
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 25, Short.MAX_VALUE))))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(imageicon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fromlogid1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fromlogid, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(19, 19, 19)
                .addComponent(imageicon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromlogid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromlogid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(9, 9, 9))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    

getService gs=new getService();


  
    
    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        if(jTextField1.getText().equals("Adminperson@123")){

            JOptionPane.showMessageDialog(null, "Access Denied");

        }
        else if (jTextField1.getText().equals("AdminBuy@123"))
        {

            setVisible(false);
            Buy view=new Buy();
            view.setVisible(true);

            view.user.setText(jTextField1.getText());
            int i=Integer.parseInt(fromlogid.getText());
            view.id.setText(Integer.toString(i));
        }
        else if (jTextField1.getText().equals("AdminSelling@123"))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else if (jTextField1.getText().equals("AdminService@123"))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else if (jTextField1.getText().equals("AdminReport@123"))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else{
            setVisible(false);
            AllItemtoShopping view=new AllItemtoShopping();
            view.setVisible(true);

            view.user.setText(jTextField1.getText());
            int i=Integer.parseInt(fromlogid.getText());
            view.id.setText(Integer.toString(i));
        }
    }//GEN-LAST:event_kButton3ActionPerformed

    private void jLabel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabel4ActionPerformed
        if(jTextField1.getText().equals("Adminperson@123")){
            setVisible(false);
            Person2 view=new Person2();
            view.setVisible(true);

            view.user.setText(jTextField1.getText());
            int i=Integer.parseInt(fromlogid.getText());
            view.id.setText(Integer.toString(i));
        }
        else if (jTextField1.getText().equals("AdminBuy@123"))
        {
            //  lablemechanic.setVisible(true);
            //lablemechanic.setText("Access Denied");
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else if (jTextField1.getText().equals("AdminSelling@123"))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else if (jTextField1.getText().equals("AdminService@123"))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else if (jTextField1.getText().equals("AdminReport@123"))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else{
            setVisible(false);
            AllPersonforcustomer view=new AllPersonforcustomer();
            view.setVisible(true);

            view.user.setText(jTextField1.getText());
            int i=Integer.parseInt(fromlogid.getText());
            view.id.setText(Integer.toString(i));
        }
    }//GEN-LAST:event_jLabel4ActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        int x=Integer.parseInt(fromlogid.getText()); //Working

        gs.myids.setText(Integer.toString(x));//working SEND REGISTER ID TO GET SERVICE JFRAME

        if(jTextField1.getText().equals("Adminperson@123")){
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else if (jTextField1.getText().equals("AdminBuy@123"))
        {

            JOptionPane.showMessageDialog(null, "Access Denied");

        }
        else if (jTextField1.getText().equals("AdminSelling@123"))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");

        }
        else if (jTextField1.getText().equals("AdminService@123"))
        {
            setVisible(false);
            ServiceAdmin SA=new ServiceAdmin();
            SA.setVisible(true);

            SA.user.setText(jTextField1.getText());
            int i=Integer.parseInt(fromlogid.getText());
            SA.id.setText(Integer.toString(i));
        }
        else if (jTextField1.getText().equals("AdminReport@123"))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else{
            setVisible(false);
            AllServiceforcustomer view=new AllServiceforcustomer();
            view.setVisible(true);

            view.user.setText(jTextField1.getText());
            int i=Integer.parseInt(fromlogid.getText());
            view.id.setText(Integer.toString(i));
        }

        //new AllServiceforcustomer(x);
        //gs.getValue(x);
        //jLabel2.setText(String.valueOf(value));
        //jLabel2.setText(Integer.toString(value));
        /* AllServiceforcustomer asf=new AllServiceforcustomer();
        asf.setVisible(true);*/
        // AllServiceforcustomer.fromhome.setText(String.valueOf(x));
        /*AllServiceforcustomer asfc=new AllServiceforcustomer();
        asfc.setVisible(true);*/
    }//GEN-LAST:event_kButton5ActionPerformed

    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed

        int x=Integer.parseInt(fromlogid.getText()); //Working

        gs.myids.setText(Integer.toString(x));//working SEND REGISTER ID TO GET SERVICE JFRAME

        if(jTextField1.getText().equals("Adminperson@123")){
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else if (jTextField1.getText().equals("AdminBuy@123"))
        {

            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else if (jTextField1.getText().equals("AdminSelling@123"))
        {
            JOptionPane.showMessageDialog(null, "You can't use sailer service on this Account");

        }
        else if (jTextField1.getText().equals("AdminService@123"))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else if (jTextField1.getText().equals("AdminReport@123"))
        {

            setVisible(false);
            Report rp=new Report();
            rp.setVisible(true);

            rp.user.setText(jTextField1.getText());
            int i=Integer.parseInt(fromlogid.getText());
            rp.idk.setText(Integer.toString(i));
        }
        else{

            setVisible(false);
            ReportforCustomer view=new ReportforCustomer();
            view.setVisible(true);

            view.user.setText(jTextField1.getText());
            int i=Integer.parseInt(fromlogid.getText());
            view.id.setText(Integer.toString(i));

            try{
                stmt=con.createStatement();

                String query="select * from registration";

                rs=stmt.executeQuery(query);

                while(rs.next()){

                    if(jTextField1.getText().equals(rs.getString(15))){

                        BufferedImage image=ImageIO.read(rs.getBinaryStream("image"));
                        view.imageicon.setIcon(new ImageIcon(image));

                    }
                }
            }
            catch(Exception e){
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_kButton6ActionPerformed

    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed
        

        requestsID view=new requestsID();
        int i=Integer.parseInt(fromlogid.getText());

        if(jTextField1.getText().equals("Adminperson@123")){
            JOptionPane.showMessageDialog(null, "You can't use sailer service on this Account");
        }
        else if (jTextField1.getText().equals("AdminBuy@123"))
        {
            JOptionPane.showMessageDialog(null, "You can't use sailer service on this Account");
        }
        else if (jTextField1.getText().equals("AdminSelling@123"))
        {
            setVisible(false);
            
            view.setVisible(true);
            view.pack();
            view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            view.user.setText(jTextField1.getText());
            view.id.setText(Integer.toString(i));
        }
        else if (jTextField1.getText().equals("AdminService@123"))
        {
            JOptionPane.showMessageDialog(null, "You can't use sailer service on this Account");
        }
        else if (jTextField1.getText().equals("AdminReport@123"))
        {
            JOptionPane.showMessageDialog(null, "You can't use sailer service on this Account");
        }
        else{
            setVisible(false);
            requestsID views=new requestsID();
            views.setVisible(true);
            views.pack();
            views.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            views.user.setText(jTextField1.getText());
            view.id.setText(Integer.toString(i));

        }
    }//GEN-LAST:event_kButton7ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        viewProfile vpf=new viewProfile();
        vpf.user2.setText(jTextField1.getText());
        
        int i=Integer.parseInt(fromlogid.getText());
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
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
             
        int responce = JOptionPane.showConfirmDialog(this,"Do you want to Log out","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(responce == JOptionPane.YES_OPTION){
            setVisible(false);
            Login view=new Login();
            view.setVisible(true);
        }
        else{
            setVisible(true);
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        setVisible(false);
        AboutUs view=new AboutUs();
        int i=Integer.parseInt(fromlogid.getText());

        view.setVisible(true);
        view.user.setText(jTextField1.getText());
        view.id.setText(Integer.toString(i));
        

        
    }//GEN-LAST:event_jLabel19MouseClicked

    private void kButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton9ActionPerformed
        setVisible(false);
        MainAdmin view=new MainAdmin();
        int i=Integer.parseInt(fromlogid.getText());

        view.setVisible(true);
        view.user.setText(jTextField1.getText());
        view.id.setText(Integer.toString(i));
    }//GEN-LAST:event_kButton9ActionPerformed

    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.App app1;
    private com.k33ptoo.utils.ComponentMoverUtil componentMoverUtil1;
    private com.k33ptoo.utils.ComponentResizerUtil componentResizerUtil1;
    public static javax.swing.JTextField fromlogid;
    public static javax.swing.JTextField fromlogid1;
    public static javax.swing.JLabel imageicon;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    public static com.k33ptoo.components.KButton jLabel4;
    public static javax.swing.JTextField jTextField1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    public static com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    public static com.k33ptoo.components.KButton kButton5;
    public static com.k33ptoo.components.KButton kButton6;
    public static com.k33ptoo.components.KButton kButton7;
    public static com.k33ptoo.components.KButton kButton9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    // End of variables declaration//GEN-END:variables
byte [] photo =null;
    String filename=null;
}
