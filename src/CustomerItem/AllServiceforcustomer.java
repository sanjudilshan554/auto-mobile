package CustomerItem;


import static CustomerItem.AllPersonforcustomer.id;
import static CustomerItem.AllPersonforcustomer.user;
import static CustomerItem.Home.fromlogid;
import static CustomerItem.Home.jTextField1;
import com.mysql.cj.protocol.Resultset;
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

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;







public class AllServiceforcustomer extends javax.swing.JFrame {

    public int value;
    public static int regid;
    public Statement stmt=null;
    public Connection con=null;
    public ResultSet rs=null; //Result Set capital should be initialize correct place
    
    getService th=new getService();

    public AllServiceforcustomer() {
        initComponents();
        con=databaseConnection.Connect();
        
    }
   
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        user = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(215, 210, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(48, 67, 82));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalis of All Service");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Test Transmission", "Electric Problem", "Alignment Problem", "New Modifier", "Scanning", "Body Wash" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service Id", "Person Id", "Servicer Register Id", "Servicer Name", "Location", "Catagory", "Price", "Time", "Contact", "email"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

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

        kButton3.setBorder(null);
        kButton3.setText("Get Service");
        kButton3.setToolTipText("Click here to get service");
        kButton3.setkBackGroundColor(new java.awt.Color(102, 102, 102));
        kButton3.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        kButton3.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton3.setkStartColor(new java.awt.Color(102, 102, 102));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
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

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reg No : ");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngwing.com (8) (1).png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(486, 486, 486))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(221, 221, 221)
                                .addComponent(jLabel1))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(843, 843, 843)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap(5, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 974, Short.MAX_VALUE)
                    .addComponent(jLabel11)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel11)
                    .addGap(0, 396, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int cc;
        //jLabel2.setText(Integer.toString(value));
        //jLabel2.setText(String.valueOf(value));
       
        try {

            stmt=con.createStatement();

            if(jComboBox1.getSelectedItem().equals("All")){

                String query="select * from ser";
                PreparedStatement pprstmt=con.prepareStatement(query);
                //int sid=Integer.parseInt(id.getText());
                
                //ResultSet rs= stmt.executeQuery(query);
                
                rs=pprstmt.executeQuery();

                ResultSetMetaData rsmd=rs.getMetaData();
                cc=rsmd.getColumnCount();

                DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();

                dft.setRowCount(0);

                while(rs.next()){
                    Vector v2=new Vector();
                    for(int i=0; i<cc; i++)
                    {
                        v2.add(rs.getInt("sId"));
                        v2.add(rs.getInt("pId"));
                        v2.add(rs.getInt("rId"));
                        v2.add(rs.getString("servicerName"));
                        v2.add(rs.getString("sLocation"));
                        v2.add(rs.getString("sCatagory"));
                        v2.add(rs.getString("sPrice"));
                        v2.add(rs.getString("sTime"));
                        v2.add(rs.getString("contact"));
                        v2.add(rs.getString("email"));
                    }
                    dft.addRow(v2);
                }
            }
            
            if(jComboBox1.getSelectedItem().equals("Test TransmissionD")){

                String query="select * from ser where sCatagory='Test TransmissionD'";
                PreparedStatement pprstmt=con.prepareStatement(query);
                //int sid=Integer.parseInt(id.getText());
                
                ResultSet rs= stmt.executeQuery(query);
                
                //rs=pprstmt.executeQuery();

                ResultSetMetaData rsmd=rs.getMetaData();
                cc=rsmd.getColumnCount();

                DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();

                dft.setRowCount(0);

                while(rs.next()){
                    Vector v2=new Vector();
                    for(int i=0; i<cc; i++)
                    {
                        v2.add(rs.getInt("sId"));
                        v2.add(rs.getInt("pId"));
                        v2.add(rs.getInt("rId"));
                        v2.add(rs.getString("servicerName"));
                        v2.add(rs.getString("sLocation"));
                        v2.add(rs.getString("sCatagory"));
                        v2.add(rs.getString("sPrice"));
                        v2.add(rs.getString("sTime"));
                        v2.add(rs.getString("contact"));
                        v2.add(rs.getString("email"));
                    }
                    dft.addRow(v2);
                }
            }
            
            if(jComboBox1.getSelectedItem().equals("Electric Problem")){
            String query="select * from ser where sCatagory='Electric Problem'";
            
            PreparedStatement pprstmt=con.prepareStatement(query);
            //int sid=Integer.parseInt(id.getText());
            
            ResultSet rs=stmt.executeQuery(query);
            rs=pprstmt.executeQuery();
            
            ResultSetMetaData rsmd=rs.getMetaData();
            cc=rsmd.getColumnCount();
            
            DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
            
            dft.setRowCount(0);
            
            while(rs.next()){
                Vector v2=new Vector();
                for(int i=0; i<cc; i++)
                {
                    v2.add(rs.getInt("sId"));
                    v2.add(rs.getInt("pId"));
                    v2.add(rs.getInt("rId"));
                    v2.add(rs.getString("servicerName"));
                    v2.add(rs.getString("sLocation"));
                    v2.add(rs.getString("sCatagory"));
                    v2.add(rs.getString("sPrice"));
                    v2.add(rs.getString("sTime"));
                    v2.add(rs.getString("contact"));
                    v2.add(rs.getString("email"));
                    v2.add(rs.getString("email"));
                }
                dft.addRow(v2);
            }
           }
            
           if(jComboBox1.getSelectedItem().equals("Alignment Problem")){
            String query="select * from ser where sCatagory='Alignment Problem'";
            PreparedStatement pprstmt=con.prepareStatement(query);
            //int sid=Integer.parseInt(id.getText());
            
            rs=pprstmt.executeQuery();
            //ResultSet rs= stmt.executeQuery(query);
            
            ResultSetMetaData rsmd=rs.getMetaData();
            cc=rsmd.getColumnCount();
            
            DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
            
            dft.setRowCount(0);
            
            while(rs.next()){
                Vector v2=new Vector();
                for(int i=0; i<cc; i++)
                {
                    v2.add(rs.getInt("sId"));
                    v2.add(rs.getInt("pId"));
                    v2.add(rs.getInt("rId"));
                    v2.add(rs.getString("servicerName"));
                    v2.add(rs.getString("sLocation"));
                    v2.add(rs.getString("sCatagory"));
                    v2.add(rs.getString("sPrice"));
                    v2.add(rs.getString("sTime"));
                    v2.add(rs.getString("contact"));
                    v2.add(rs.getString("email"));
                    v2.add(rs.getString("email"));
                }
                dft.addRow(v2);
            }
           }
           
           
           if(jComboBox1.getSelectedItem().equals("New Modifier")){
            String query="select * from ser where sCatagory='New Modifier'";
           PreparedStatement pprstmt=con.prepareStatement(query);
            //int sid=Integer.parseInt(id.getText());
            
            rs=pprstmt.executeQuery();
            
            ResultSetMetaData rsmd=rs.getMetaData();
            cc=rsmd.getColumnCount();
            
            DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
            
            dft.setRowCount(0);
            
            while(rs.next()){
                Vector v2=new Vector();
                for(int i=0; i<cc; i++)
                {
                    v2.add(rs.getInt("sId"));
                    v2.add(rs.getInt("pId"));
                    v2.add(rs.getInt("rId"));
                    v2.add(rs.getString("servicerName"));
                    v2.add(rs.getString("sLocation"));
                    v2.add(rs.getString("sCatagory"));
                    v2.add(rs.getString("sPrice"));
                    v2.add(rs.getString("sTime"));
                    v2.add(rs.getString("contact"));
                    v2.add(rs.getString("email"));
                }
                dft.addRow(v2);
            }
           }
           
           
           if(jComboBox1.getSelectedItem().equals("Scanning")){
            String query="select * from ser where sCatagory='Scanning'";
           PreparedStatement pprstmt=con.prepareStatement(query);
            //int sid=Integer.parseInt(id.getText());
            
            rs=pprstmt.executeQuery();
            
            ResultSetMetaData rsmd=rs.getMetaData();
            cc=rsmd.getColumnCount();
            
            DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
            
            dft.setRowCount(0);
            
            while(rs.next()){
                Vector v2=new Vector();
                for(int i=0; i<cc; i++)
                {
                    v2.add(rs.getInt("sId"));
                    v2.add(rs.getInt("pId"));
                    v2.add(rs.getInt("rId"));
                    v2.add(rs.getString("servicerName"));
                    v2.add(rs.getString("sLocation"));
                    v2.add(rs.getString("sCatagory"));
                    v2.add(rs.getString("sPrice"));
                    v2.add(rs.getString("sTime"));
                    v2.add(rs.getString("contact"));
                    v2.add(rs.getString("email"));
                }
                dft.addRow(v2);
            }
           }
           
           
           if(jComboBox1.getSelectedItem().equals("Body Wash")){
            String query="select * from ser where sCatagory='Body Wash'";
             PreparedStatement pprstmt=con.prepareStatement(query);
            //int sid=Integer.parseInt(id.getText());
            
            rs=pprstmt.executeQuery();
            
            ResultSetMetaData rsmd=rs.getMetaData();
            cc=rsmd.getColumnCount();
            
            DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
            
            dft.setRowCount(0);
            
            while(rs.next()){
                Vector v2=new Vector();
                for(int i=0; i<cc; i++)
                {
                    v2.add(rs.getInt("sId"));
                    v2.add(rs.getInt("pId"));
                    v2.add(rs.getInt("rId"));
                    v2.add(rs.getString("servicerName"));
                    v2.add(rs.getString("sLocation"));
                    v2.add(rs.getString("sCatagory"));
                    v2.add(rs.getString("sPrice"));
                    v2.add(rs.getString("sTime"));
                    v2.add(rs.getString("contact"));
                    v2.add(rs.getString("email"));
                }
                dft.addRow(v2);
            }
           }
            

        } catch (SQLException ex) {
            Logger.getLogger(AllService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
       /* setVisible(false);
       
        Home h=new Home();
        h.jTextField1.setText(user.getText());
        
        if(!user.getText().equals("AdminService@123")){
        setVisible(false);
        
        h.setVisible(true);
        int i=Integer.parseInt(id.getText());
        h.fromlogid.setText(Integer.toString(i));
        }
        */
       Home h=new Home();
         setVisible(false);
       
       
        h.jTextField1.setText(user.getText());
        
        if(!user.getText().equals("AdminService@123")){
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

    getService gs=new getService();
    
   
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index=jTable1.getSelectedRow();
        DefaultTableModel dft=(DefaultTableModel) jTable1.getModel();
        //gs.myid.setText(dft.getValueAt(index,2).toString());
        
        
        gs.sid.setText(dft.getValueAt(index,0).toString());
        gs.pid.setText(dft.getValueAt(index,1).toString());
        
        gs.txtemail.setText(dft.getValueAt(index,9).toString());
        
         
    }//GEN-LAST:event_jTable1MouseClicked

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        gs.setVisible(true);
        gs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
          gs.user.setText(jTextField1.getText());
          int i=Integer.parseInt(fromlogid.getText());
          gs.id.setText(Integer.toString(i));
    }//GEN-LAST:event_kButton3ActionPerformed

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

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
            java.util.logging.Logger.getLogger(AllServiceforcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllServiceforcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllServiceforcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllServiceforcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllServiceforcustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField id;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

   
}
