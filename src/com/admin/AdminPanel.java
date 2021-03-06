/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.admin;

import com.connection.ConnectionProvider;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class AdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
        initComponents();
        
         table();
         table2();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        logout = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Admin Panel");

        Table1.setBackground(new java.awt.Color(0, 204, 204));
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Age", "UserName", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table1);

        logout.setBackground(new java.awt.Color(0, 204, 204));
        logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logout.setText("LogOut");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Age");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        table2.setBackground(new java.awt.Color(0, 204, 204));
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "UserName", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(logout)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(logout))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void table(){
        
       int cl;
    
    try{
            
            Connection con1 = ConnectionProvider.getConn();
            Statement stm = con1.createStatement();
            ResultSet rst = stm.executeQuery("select * from register");
            ResultSetMetaData rstm = rst.getMetaData();
            
            cl = rstm.getColumnCount();
            
            DefaultTableModel dtm2 = (DefaultTableModel)Table1.getModel();
            dtm2.setRowCount(0);
            
           while (rst.next()){
               
               Vector vec = new Vector();
               
               for(int a =1 ; a<=cl; a++)
               {
                  
                   vec.add(rst.getString("UName"));
                   vec.add(rst.getString("Age"));
                   vec.add(rst.getString("UserName"));
                   vec.add(rst.getString("Password1"));
                   
                    
                  
                 
                  
               }
               
               dtm2.addRow(vec);
           }
            
        }
        catch(Exception e)
        {
          
        }
   
   
    }
     
      private void table2(){
        
       int cl;
    
    try{
            
            Connection con1 = ConnectionProvider.getConn();
            Statement stm = con1.createStatement();
            ResultSet rst = stm.executeQuery("select * from login");
            ResultSetMetaData rstm = rst.getMetaData();
            
            cl = rstm.getColumnCount();
            
            DefaultTableModel dtm2 = (DefaultTableModel)table2.getModel();
            dtm2.setRowCount(0);
            
           while (rst.next()){
               
               Vector vec = new Vector();
               
               for(int a =1 ; a<=cl; a++)
               {
                  
                   vec.add(rst.getString("Uname"));
                  
                    
                 
                
                    
                  
                 
                  
               }
               
               dtm2.addRow(vec);
           }
            
        }
        catch(Exception e)
        {
          
        }
   
   
    }
      
      
    
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        
        int a = JOptionPane.showConfirmDialog(jf, "Do you really want to Logout","select",JOptionPane.YES_NO_OPTION);
        
        if(a==0)
        {
            setVisible(false);
            new AdminLogin().setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_logoutMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try {
            
            //database connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user1", "root", "1234");
           
            String data1 = "", data2 = "", data3 = "", data4 = "", link1 = "";
            //making variables
            BufferedImage image = null;
            //quary to select and count age
            String sql1 = "SELECT COUNT(`Age`) FROM `register` WHERE `Age` < 18";
            try {
                PreparedStatement pst = con.prepareStatement(sql1);
                //ResultSet type variable as we are running a select statement in query
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    data1 = rs.getString(1);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "ERROR:");

            }
            String sql2 = "SELECT COUNT(`Age`) FROM `register` WHERE Age BETWEEN 18 AND 25";
            try {
                PreparedStatement pst = con.prepareStatement(sql2);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    data2 = rs.getString(1);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "ERROR:");

            }
            String sql3 = "SELECT COUNT(`Age`) FROM `register` WHERE Age BETWEEN 25 AND 45";
            try {
                PreparedStatement pst = con.prepareStatement(sql3);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    data3 = rs.getString(1);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "ERROR:");

            }
            String sql4 = "SELECT COUNT(`Age`) FROM `register` WHERE `Age` > 45";
            try {
                PreparedStatement pst = con.prepareStatement(sql4);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    data4 = rs.getString(1);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "ERROR:");

            }

            /**
             * Quick chart API Connection
             */
            try {
                //Building the URL to contact the API
                link1 = "https://quickchart.io/chart?bkg=white&c={ type: 'doughnut', data: { datasets: [ { data: [\'" + data1 + "\',\'" + data2 + "\', \'" + data3 + "\',\'" + data4 + "\',], backgroundColor: [ 'rgb(0, 255, 3 )', 'rgb(226, 216, 15 )', 'rgb(0, 168, 255 )', 'rgb(255, 0, 92 )', ], label: '', }, ], labels: ['Under 18', '18 - 25', '25 - 45', 'Above 45'], },}";

                link1 = link1.replace(" ", "");

                URL url1 = new URL(link1);

                HttpURLConnection urlcon = (HttpURLConnection) url1.openConnection();
                //Setting up chrome to contact the API
                urlcon.setRequestProperty("User-Agent",
                        "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");

                //Telling application to get the image from the url
                image = ImageIO.read(urlcon.getInputStream());
                

                JFrame frame = new JFrame();
                //Setting image to a new jframe inorder to show the user
                frame.setForeground(Color.WHITE);

                frame.setResizable(false);
                frame.setBackground(Color.WHITE);
                frame.setSize(3100, 2750);
                JLabel label = new JLabel(new ImageIcon(image));
                frame.getContentPane().add(label);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            } catch (MalformedURLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();

            } catch (IOException e1) {
                JOptionPane.showMessageDialog(null, "Not Internet Connection", "ALERT", JOptionPane.WARNING_MESSAGE);
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error...");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
