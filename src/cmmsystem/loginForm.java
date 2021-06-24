
package cmmsystem;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class loginForm extends javax.swing.JFrame {
    DBConnection con;
    PreparedStatement ps;
    ResultSet rs;

    public loginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        getUserType();
    }

    public class UserType {
        int id;
        String userType;
       
        public UserType(int id, String userType){
            this.id=id;
            this.userType=userType;
        }
        public String toString(){
            return userType;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabeClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jButtonCancel = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jLabelUserType = new javax.swing.JLabel();
        jComboBoxUserType = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(149, 165, 166));

        jPanel2.setBackground(new java.awt.Color(26, 188, 156));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login Form");

        jLabeClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabeClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabeClose.setText("x");
        jLabeClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabeClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabeCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabeClose)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabeClose)
                    .addComponent(jLabelMin))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabelUserName.setBackground(new java.awt.Color(204, 204, 255));
        jLabelUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUserName.setForeground(new java.awt.Color(25, 42, 86));
        jLabelUserName.setText("UserName:");

        jLabelPassword.setBackground(new java.awt.Color(204, 204, 255));
        jLabelPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(25, 42, 86));
        jLabelPassword.setText("Password :");

        jTextFieldUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPasswordFieldPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonCancel.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(25, 42, 86));
        jButtonCancel.setText("Cancel");
        jButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonLogin.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(25, 42, 86));
        jButtonLogin.setText("Login");
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jLabelUserType.setBackground(new java.awt.Color(204, 204, 255));
        jLabelUserType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUserType.setForeground(new java.awt.Color(25, 42, 86));
        jLabelUserType.setText("UserType :");

        jComboBoxUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUserTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jButtonCancel)
                .addGap(59, 59, 59)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxUserType, 0, 226, Short.MAX_VALUE)
                    .addComponent(jTextFieldUserName)
                    .addComponent(jPasswordFieldPass))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonLogin))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabeCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabeCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void getUserType(){
       
        String query = "SELECT * FROM Roles";
        
        try {
            ps = DBConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            jComboBoxUserType.removeAllItems();
            
            while(rs.next()){
                jComboBoxUserType.addItem(new UserType(rs.getInt(1),rs.getString(2)));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        
        String uname = jTextFieldUserName.getText().toLowerCase();
        String utype= jComboBoxUserType.getSelectedItem().toString();
        String pass = String.valueOf(jPasswordFieldPass.getPassword());
  
        if(uname.equals("")||pass.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Some Fields are Empty...","Error",1);
        }else{
            try {
                String query = "SELECT * FROM users WHERE user_name=? AND password =?";
                ps = DBConnection.getConnection().prepareStatement(query);
                ps.setString(1, uname);
                ps.setString(2, pass);
                rs = ps.executeQuery();

            if(rs.next()) {
                String s1=rs.getString("role");
                
                if (utype.equalsIgnoreCase("admin")&&s1.equalsIgnoreCase("admin")) {
                    
                    JOptionPane.showMessageDialog(rootPane, "User name and Password is correct...welcome to Admin Panel","Successfully",1);
                    ADMIN_Dashboard a = new ADMIN_Dashboard();
                    a.setVisible(true);
                    a.pack();
                    a.setLocationRelativeTo(null);
                    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                    this.dispose();
                    
                }
                else if (utype.equalsIgnoreCase("manager")&&s1.equalsIgnoreCase("manager")) {
                    
                    JOptionPane.showMessageDialog(rootPane, "User name and Password is correct...welcome to Manager Panel","Successfully",1);
                    DashboardForm md = new DashboardForm();
                    md.setVisible(true);
                    md.pack();
                    md.setLocationRelativeTo(null);
                    md.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
                    this.dispose();
                    
                }
                else if(utype.equalsIgnoreCase("center_store")&&s1.equalsIgnoreCase("center_store")) {
                    
                    JOptionPane.showMessageDialog(rootPane, "User name and Password is correct...welcome to Center Stock Panel","Successfully",1);
                    CSCategory cd = new CSCategory();
                    cd.setVisible(true);
                    cd.pack();
                    cd.setLocationRelativeTo(null);
                    cd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                    this.dispose();
                    
                }
                else if(utype.equalsIgnoreCase("account_dept")&&s1.equalsIgnoreCase("account_dept")) {
                    
                    JOptionPane.showMessageDialog(rootPane, "User name and Password is correct...welcome to Account Department","Successfully",1);
                    AC_Dashboard ac = new AC_Dashboard();
                    ac.setVisible(true);
                    ac.pack();
                    ac.setLocationRelativeTo(null);
                    ac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                    this.dispose();
                    
                }
                else if(utype.equalsIgnoreCase("site")&&s1.equalsIgnoreCase("site")) {
                    
                    JOptionPane.showMessageDialog(rootPane, "User name and Password is correct...welcome to Center Stock Panel","Successfully",1);
                    SiteDashboard sd = new SiteDashboard();
                    sd.setVisible(true);
                    sd.pack();
                    sd.setLocationRelativeTo(null);
                    sd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                    this.dispose();
                }
                else if(utype.equalsIgnoreCase("supplier")&&s1.equalsIgnoreCase("supplier")) {
                    
                   
                    
                }	
                else if(utype.equalsIgnoreCase("agent")&&s1.equalsIgnoreCase("agent")) {
                    
                   
                    
                }	
                 else if(utype.equalsIgnoreCase("driver")&&s1.equalsIgnoreCase("driver")) {
                 
                     
                    
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        
        
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jComboBoxUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUserTypeActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JComboBox jComboBoxUserType;
    private javax.swing.JLabel jLabeClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelUserType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
