
package cmmsystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AD_SupDashboard extends javax.swing.JFrame {
    DBConnection con;
    PreparedStatement ps;
    ResultSet rs;
  
    public AD_SupDashboard() {
        initComponents();
        tupdate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabeClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelTopic = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelCategory = new javax.swing.JPanel();
        jLabeldis = new javax.swing.JLabel();
        jLabelStat = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jLabelMetName = new javax.swing.JLabel();
        jTextFieldSupName = new javax.swing.JTextField();
        jLabelCat = new javax.swing.JLabel();
        jLabelPerCost = new javax.swing.JLabel();
        jLabelQty = new javax.swing.JLabel();
        jTextFieldSupCompany = new javax.swing.JTextField();
        jTextFieldPhn = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jTextFieldNIC = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(149, 165, 166));

        jPanel3.setBackground(new java.awt.Color(26, 188, 156));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cmmsystem/logo.png"))); // NOI18N
        jLabel1.setText("RI Construction");

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

        jLabelTopic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTopic.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTopic.setText("CONSTRUCTION MATERIAL MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMIN PANEL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabelTopic))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel2)))
                .addGap(95, 95, 95)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabeClose)
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTopic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabeClose)
                            .addComponent(jLabelMin))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 42, 86));
        jLabel5.setText("<previous>");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jPanelCategory.setBackground(new java.awt.Color(149, 165, 166));
        jPanelCategory.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Supplier Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(25, 42, 86))); // NOI18N

        jLabeldis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabeldis.setText("Address");

        jLabelStat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelStat.setText("Email");

        jButtonAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(25, 42, 86));
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonEdit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonEdit.setForeground(new java.awt.Color(25, 42, 86));
        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(25, 42, 86));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabelMetName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMetName.setText("Supplier name");

        jLabelCat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCat.setText("NIC");

        jLabelPerCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPerCost.setText("Supplier Company");

        jLabelQty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelQty.setText("Phone Number");

        jTextFieldSupCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSupCompanyActionPerformed(evt);
            }
        });

        jTextFieldPhn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhnActionPerformed(evt);
            }
        });

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setRows(5);
        jScrollPane2.setViewportView(jTextAreaAddress);

        jTextFieldNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNICActionPerformed(evt);
            }
        });

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCategoryLayout = new javax.swing.GroupLayout(jPanelCategory);
        jPanelCategory.setLayout(jPanelCategoryLayout);
        jPanelCategoryLayout.setHorizontalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoryLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCat)
                    .addComponent(jLabelMetName)
                    .addComponent(jLabeldis))
                .addGap(43, 43, 43)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jTextFieldSupName)
                    .addComponent(jTextFieldNIC, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(50, 50, 50)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelQty)
                        .addComponent(jLabelPerCost)
                        .addComponent(jLabelStat))
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCategoryLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete))
                    .addGroup(jPanelCategoryLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPhn, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(jTextFieldSupCompany)
                            .addComponent(jTextFieldEmail))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanelCategoryLayout.setVerticalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoryLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMetName)
                    .addComponent(jTextFieldSupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPerCost)
                    .addComponent(jTextFieldSupCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCat)
                    .addComponent(jLabelQty)
                    .addComponent(jTextFieldPhn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeldis)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelStat)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonAdd))
                .addGap(33, 33, 33))
        );

        jTable1.setBackground(new java.awt.Color(189, 195, 199));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Supplier name", "Supplier Company", "NIC", "Phone No", "Address", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tupdate(){
        int a ;
    
        String query = "SELECT sup_id, sup_name, sup_company, sup_nic, phone_no, address, email FROM supplier";
        
        try {
              
            ps = DBConnection.getConnection().prepareStatement(query);       
            rs = ps.executeQuery();
            ResultSetMetaData rsd= rs.getMetaData();
            a=rsd.getColumnCount();
            DefaultTableModel d=(DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);
            
            while(rs.next()){
            Vector v2=new Vector();
            
            for(int i=1; i<=a; i++){
             v2.add(rs.getInt("sup_id"));   
             v2.add(rs.getString("sup_name"));
             v2.add(rs.getString("sup_company")); 
             v2.add(rs.getString("sup_nic")); 
             v2.add(rs.getString("phone_no")); 
             v2.add(rs.getString("address"));
             v2.add(rs.getString("email"));

            }
            d.addRow(v2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void jLabeCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabeCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        ADMIN_Dashboard d = new ADMIN_Dashboard();
        d.setVisible(true);
        d.pack();
        d.setLocationRelativeTo(null);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed

        String supName=jTextFieldSupName.getText();
        String supCompany=jTextFieldSupCompany.getText();
        String NIC=jTextFieldNIC.getText();
        String phn=jTextFieldPhn.getText();
        String address=jTextAreaAddress.getText();
        String email=jTextFieldEmail.getText();

        String query = "INSERT INTO supplier(sup_name, sup_company, sup_nic, phone_no, address, email) VALUES (?,?,?,?,?,?)";

        try {
            ps = DBConnection.getConnection().prepareStatement(query);
            ps.setString(1, supName);
            ps.setString(2, supCompany);
            ps.setString(3, NIC);
            ps.setString(4, phn);
            ps.setString(5, address);
            ps.setString(6, email);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "supplier added");
            tupdate();
            jTextFieldSupName.setText("");
            jTextFieldSupCompany.setText("");
            jTextFieldNIC.setText("");
            jTextFieldPhn.setText("");
            jTextAreaAddress.setText("");
            jTextFieldEmail.setText("");
            

        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        DefaultTableModel d1=(DefaultTableModel)jTable1.getModel();
        int selectIndex =jTable1.getSelectedRow();
        int sup_id=Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());

        String supName=jTextFieldSupName.getText();
        String supCompany=jTextFieldSupCompany.getText();
        String NIC=jTextFieldNIC.getText();
        String phn=jTextFieldPhn.getText();
        String address=jTextAreaAddress.getText();
        String email=jTextFieldEmail.getText();

        PreparedStatement ps;
        String query = "UPDATE supplier SET sup_name=?,sup_company=?,sup_nic=?,phone_no=?,address=?,email=? WHERE sup_id=?";

        try {
            ps = DBConnection.getConnection().prepareStatement(query);

            ps.setString(1, supName);
            ps.setString(2, supCompany);
            ps.setString(3, NIC);
            ps.setString(4, phn);
            ps.setString(5, address);
            ps.setString(6, email);
            ps.setInt(7, sup_id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "supplier details updated");
            tupdate();

            jTextFieldSupName.setText("");
            jTextFieldSupCompany.setText("");
            jTextFieldNIC.setText("");
            jTextFieldPhn.setText("");
            jTextAreaAddress.setText("");
            jTextFieldEmail.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        DefaultTableModel d1=(DefaultTableModel)jTable1.getModel();
        int selectIndex =jTable1.getSelectedRow();
        int id=Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());

        int dialogResult=JOptionPane.showConfirmDialog(null, "Do you want to delete the record","Warning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_OPTION){

            PreparedStatement ps;
            String query = "DELETE FROM supplier WHERE sup_id=?";

            try {
                ps = DBConnection.getConnection().prepareStatement(query);
                ps.setInt(1, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "supplier details deleted");
                tupdate();

                jTextFieldSupName.setText("");
                jTextFieldSupCompany.setText("");
                jTextFieldNIC.setText("");
                jTextFieldPhn.setText("");
                jTextAreaAddress.setText("");
                jTextFieldEmail.setText("");

            } catch (SQLException ex) {
                Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextFieldSupCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSupCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSupCompanyActionPerformed

    private void jTextFieldPhnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhnActionPerformed

    private void jTextFieldNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNICActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel d1=(DefaultTableModel)jTable1.getModel();
        int selectIndex =jTable1.getSelectedRow();

        jTextFieldSupName.setText(d1.getValueAt(selectIndex,1).toString());
        jTextFieldSupCompany.setText(d1.getValueAt(selectIndex,2).toString());
        jTextFieldNIC.setText(d1.getValueAt(selectIndex,3).toString());
        jTextFieldPhn.setText(d1.getValueAt(selectIndex,4).toString());
        jTextAreaAddress.setText(d1.getValueAt(selectIndex,5).toString());
        jTextFieldEmail.setText(d1.getValueAt(selectIndex,6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AD_SupDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JLabel jLabeClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCat;
    private javax.swing.JLabel jLabelMetName;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelPerCost;
    private javax.swing.JLabel jLabelQty;
    private javax.swing.JLabel jLabelStat;
    private javax.swing.JLabel jLabelTopic;
    private javax.swing.JLabel jLabeldis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCategory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNIC;
    private javax.swing.JTextField jTextFieldPhn;
    private javax.swing.JTextField jTextFieldSupCompany;
    private javax.swing.JTextField jTextFieldSupName;
    // End of variables declaration//GEN-END:variables
}
