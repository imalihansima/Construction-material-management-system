
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


public class CSCategory extends javax.swing.JFrame {
    DBConnection con;
    PreparedStatement ps;
    ResultSet rs;
  
    public CSCategory() {
        initComponents();
        tupdate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTopic = new javax.swing.JLabel();
        jLabeClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanelCategory = new javax.swing.JPanel();
        jLabelCat = new javax.swing.JLabel();
        jLabelStat = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jTextFieldCat = new javax.swing.JTextField();
        jComboBoxStat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabelMRN = new javax.swing.JLabel();
        jLabelCategory = new javax.swing.JLabel();
        jLabelMaterial = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(149, 165, 166));

        jLabelTopic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTopic.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTopic.setText("CONSTRUCTION MATERIAL MANAGEMENT SYSTEM");

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

        jPanelCategory.setBackground(new java.awt.Color(149, 165, 166));
        jPanelCategory.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(25, 42, 86))); // NOI18N

        jLabelCat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCat.setText("category");

        jLabelStat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelStat.setText("Status");

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

        jComboBoxStat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxStat.setForeground(new java.awt.Color(25, 42, 86));
        jComboBoxStat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "available", "not_available" }));
        jComboBoxStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCategoryLayout = new javax.swing.GroupLayout(jPanelCategory);
        jPanelCategory.setLayout(jPanelCategoryLayout);
        jPanelCategoryLayout.setHorizontalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoryLayout.createSequentialGroup()
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCategoryLayout.createSequentialGroup()
                        .addContainerGap(70, Short.MAX_VALUE)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCategoryLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCat)
                            .addComponent(jLabelStat))
                        .addGap(52, 52, 52)
                        .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxStat, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldCat))))
                .addContainerGap())
        );
        jPanelCategoryLayout.setVerticalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoryLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCat)
                    .addComponent(jTextFieldCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStat)
                    .addComponent(jComboBoxStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonDelete))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(189, 195, 199));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Category", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jPanel2.setBackground(new java.awt.Color(26, 188, 156));
        jPanel2.setPreferredSize(new java.awt.Dimension(219, 600));

        jLabelMRN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMRN.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMRN.setText("Stock Handle");
        jLabelMRN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMRNMouseClicked(evt);
            }
        });

        jLabelCategory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCategory.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategory.setText("Category");
        jLabelCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCategoryMouseClicked(evt);
            }
        });

        jLabelMaterial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMaterial.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMaterial.setText("Material");
        jLabelMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMaterialMouseClicked(evt);
            }
        });

        jLabelExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExit.setText("Exit");
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cmmsystem/logo.png"))); // NOI18N
        jLabel1.setText("RI Construction");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addComponent(jLabelMaterial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelMRN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabelMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabelMRN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabelTopic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabeClose))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTopic)
                    .addComponent(jLabeClose)
                    .addComponent(jLabelMin))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void tupdate(){
        int a ;
 
        String query = "SELECT * FROM category";
        
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
             v2.add(rs.getString("cat_id"));   
             v2.add(rs.getString("category"));
             v2.add(rs.getString("status")); 
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

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed

        String category=jTextFieldCat.getText();
        String status=jComboBoxStat.getSelectedItem().toString();
        
        String query = "INSERT INTO category(category,status) VALUES (?,?)";
        
        try {
            ps = DBConnection.getConnection().prepareStatement(query);

            ps.setString(1, category);
            ps.setString(2, status);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "category added");
            tupdate();
            jTextFieldCat.setText("");
            jComboBoxStat.setSelectedIndex(-1);
            jTextFieldCat.requestFocus();
            
        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
         DefaultTableModel d1=(DefaultTableModel)jTable1.getModel();
         int selectIndex =jTable1.getSelectedRow();
         int cat_id=Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
       
         String category=jTextFieldCat.getText();
         String status=jComboBoxStat.getSelectedItem().toString();

         String query = "UPDATE category SET category=?,status=? WHERE cat_id=?";
        
        try {   
            ps = DBConnection.getConnection().prepareStatement(query);
            ps.setString(1, category);
            ps.setString(2, status);
            ps.setInt(3, cat_id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "category updated");
            tupdate();
            jTextFieldCat.setText("");
            jComboBoxStat.setSelectedIndex(-1);
            jTextFieldCat.requestFocus();
               
        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         DefaultTableModel d1=(DefaultTableModel)jTable1.getModel();
         int selectIndex =jTable1.getSelectedRow();

         jTextFieldCat.setText(d1.getValueAt(selectIndex,1).toString());
         jComboBoxStat.setSelectedItem(d1.getValueAt(selectIndex,2).toString());
         
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBoxStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxStatActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
         DefaultTableModel d1=(DefaultTableModel)jTable1.getModel();
         int selectIndex =jTable1.getSelectedRow();
         int cat_id=Integer.parseInt(d1.getValueAt(selectIndex, 0).toString()); 
         
         int dialogResult=JOptionPane.showConfirmDialog(null, "Do you want to delete the record","Warning",JOptionPane.YES_NO_OPTION);
         
         if(dialogResult==JOptionPane.YES_OPTION){
             
         PreparedStatement ps;
         String query = "DELETE FROM category WHERE cat_id=?";
        
        try {   
            ps = DBConnection.getConnection().prepareStatement(query);
            ps.setInt(1, cat_id);  
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "category deleted");
            tupdate();
            jTextFieldCat.setText("");
            jComboBoxStat.setSelectedIndex(-1);
            jTextFieldCat.requestFocus();
               
        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMaterialMouseClicked
        CSMaterial c = new CSMaterial();
        c.setVisible(true);
        c.pack();
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.dispose();
    }//GEN-LAST:event_jLabelMaterialMouseClicked

    private void jLabelCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCategoryMouseClicked
        CSCategory c = new CSCategory();
        c.setVisible(true);
        c.pack();
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.dispose();
    }//GEN-LAST:event_jLabelCategoryMouseClicked

    private void jLabelMRNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMRNMouseClicked

        CSStockHandle c = new CSStockHandle();
        c.setVisible(true);
        c.pack();
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//GEN-LAST:event_jLabelMRNMouseClicked

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CSCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JComboBox<String> jComboBoxStat;
    private javax.swing.JLabel jLabeClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCat;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelMRN;
    private javax.swing.JLabel jLabelMaterial;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelStat;
    private javax.swing.JLabel jLabelTopic;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCategory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCat;
    // End of variables declaration//GEN-END:variables
}
