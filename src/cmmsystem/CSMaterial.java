/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Imali Hansima
 */
public class CSMaterial extends javax.swing.JFrame {
    DBConnection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public CSMaterial() {
        initComponents();
        tupdate();
        getCategory();
        getSupplier(); 
    }

  public class CategoryItem{
        int id;
        String name;  
        
        public CategoryItem(int id, String name){
          this.id=id;
          this.name=name;
        }
        public String toString(){
        return name;
        }
}
  public class Supplier{
        int id;
        String name;  
        
        public Supplier(int id, String name){
          this.id=id;
          this.name=name;
        }
        public String toString(){
        return name;
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelMRN = new javax.swing.JLabel();
        jLabelCategory = new javax.swing.JLabel();
        jLabelMaterial = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelTopic = new javax.swing.JLabel();
        jLabeClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanelCategory = new javax.swing.JPanel();
        jLabeldis = new javax.swing.JLabel();
        jLabelStat = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jComboBoxStat = new javax.swing.JComboBox<>();
        jLabelMetName = new javax.swing.JLabel();
        jTextFieldMatName = new javax.swing.JTextField();
        jLabelCat = new javax.swing.JLabel();
        jLabelPerCost = new javax.swing.JLabel();
        jLabelQty = new javax.swing.JLabel();
        jLabelSupId = new javax.swing.JLabel();
        jTextFieldPerCost = new javax.swing.JTextField();
        jTextFieldQty = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDes = new javax.swing.JTextArea();
        jComboBoxSup = new javax.swing.JComboBox();
        jComboBoxCat = new javax.swing.JComboBox();
        jLabelMeasure = new javax.swing.JLabel();
        jComboBoxMeasure = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(149, 165, 166));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 600));

        jPanel2.setBackground(new java.awt.Color(26, 188, 156));

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
                                .addComponent(jLabelMaterial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelMRN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(190, 190, 190))
        );

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
        jPanelCategory.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Material", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(25, 42, 86))); // NOI18N

        jLabeldis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabeldis.setText("description");

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

        jLabelMetName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMetName.setText("material name");

        jLabelCat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCat.setText("category");

        jLabelPerCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPerCost.setText("cost of per unit");

        jLabelQty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelQty.setText("quentity");

        jLabelSupId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSupId.setText("supplier Company ");

        jTextFieldPerCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPerCostActionPerformed(evt);
            }
        });

        jTextFieldQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQtyActionPerformed(evt);
            }
        });

        jTextAreaDes.setColumns(20);
        jTextAreaDes.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDes);

        jComboBoxSup.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxSup.setForeground(new java.awt.Color(25, 42, 86));
        jComboBoxSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSupActionPerformed(evt);
            }
        });

        jComboBoxCat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxCat.setForeground(new java.awt.Color(25, 42, 86));
        jComboBoxCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCatActionPerformed(evt);
            }
        });

        jLabelMeasure.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMeasure.setText("measure type");

        jComboBoxMeasure.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxMeasure.setForeground(new java.awt.Color(25, 42, 86));
        jComboBoxMeasure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bag", "CUM", "SQM", "RM", "Kg", "Each" }));
        jComboBoxMeasure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMeasureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCategoryLayout = new javax.swing.GroupLayout(jPanelCategory);
        jPanelCategory.setLayout(jPanelCategoryLayout);
        jPanelCategoryLayout.setHorizontalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoryLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCat)
                    .addComponent(jLabelMetName)
                    .addComponent(jLabeldis)
                    .addComponent(jLabelSupId))
                .addGap(15, 15, 15)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jComboBoxCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxSup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldMatName))
                .addGap(30, 30, 30)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCategoryLayout.createSequentialGroup()
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
                                .addComponent(jButtonDelete)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelCategoryLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxStat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldQty, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(jTextFieldPerCost))
                                    .addComponent(jComboBoxMeasure, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 67, Short.MAX_VALUE))))
                    .addGroup(jPanelCategoryLayout.createSequentialGroup()
                        .addComponent(jLabelMeasure)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelCategoryLayout.setVerticalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoryLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMetName)
                    .addComponent(jTextFieldMatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPerCost)
                    .addComponent(jTextFieldPerCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCat)
                    .addComponent(jComboBoxCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQty)
                    .addComponent(jTextFieldQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSupId)
                    .addComponent(jComboBoxSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMeasure)
                    .addComponent(jComboBoxMeasure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCategoryLayout.createSequentialGroup()
                        .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeldis))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(jPanelCategoryLayout.createSequentialGroup()
                        .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelStat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDelete)
                            .addComponent(jButtonEdit)
                            .addComponent(jButtonAdd))
                        .addGap(33, 33, 33))))
        );

        jTable1.setBackground(new java.awt.Color(189, 195, 199));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "material code", "material name", "description", "category", "supplier company", "cost of per unit", "quantity", "measure type", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTopic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabeClose)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTopic)
                    .addComponent(jLabeClose)
                    .addComponent(jLabelMin))
                .addGap(18, 18, 18)
                .addComponent(jPanelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

     private void getCategory(){

        String query = "SELECT * FROM category";
        
        try { 
            ps = DBConnection.getConnection().prepareStatement(query);       
            rs = ps.executeQuery();
            jComboBoxCat.removeAllItems();
            
            while(rs.next()){
              jComboBoxCat.addItem(new CategoryItem(rs.getInt(1),rs.getString(2)));
       
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     }  
      private void getSupplier(){

        String query = "SELECT * FROM supplier";
        
        try { 
            ps = DBConnection.getConnection().prepareStatement(query);       
            rs = ps.executeQuery();
            jComboBoxSup.removeAllItems();
            
            while(rs.next()){
              jComboBoxSup.addItem(new Supplier(rs.getInt(1),rs.getString(3)));
       
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     }  
     
     private void tupdate(){
        int a ;
    
        String query = "SELECT m.mat_code,m.mat_name, m.description,c.category, s.sup_company, m.per_cost, m.quantity, m.measure_type, m.status FROM material m, category c, supplier s WHERE m.cat_id=c.cat_id &&m.sup_id=s.sup_id";
        
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
             v2.add(rs.getInt("mat_code"));   
             v2.add(rs.getString("mat_name"));
             v2.add(rs.getString("description")); 
             v2.add(rs.getString("category")); 
             v2.add(rs.getString("sup_company")); 
             v2.add(rs.getFloat("per_cost")); 
             v2.add(rs.getString("quantity"));
             v2.add(rs.getString("measure_type"));
             v2.add(rs.getString("status")); 
            }
            d.addRow(v2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
    
     
    private void jLabelCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCategoryMouseClicked
        CSCategory c = new CSCategory();
        c.setVisible(true);
        c.pack();
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.dispose();
    }//GEN-LAST:event_jLabelCategoryMouseClicked

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabeCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabeCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed

        String mname=jTextFieldMatName.getText();
        String des=jTextAreaDes.getText();
        CategoryItem item=(CategoryItem)jComboBoxCat.getSelectedItem();
        Supplier supplier=(Supplier)jComboBoxSup.getSelectedItem();
        String percost=jTextFieldPerCost.getText();
        String qty=jTextFieldQty.getText();
        String measure=jComboBoxMeasure.getSelectedItem().toString();
        String status=jComboBoxStat.getSelectedItem().toString();

        String query = "INSERT INTO material(mat_name, description, cat_id, sup_id, per_cost, quantity, measure_type, status) VALUES (?,?,?,?,?,?,?,?)";

        try {
            ps = DBConnection.getConnection().prepareStatement(query);
            ps.setString(1, mname);
            ps.setString(2, des);
            ps.setInt(3, item.id);
            ps.setInt(4, supplier.id);
            ps.setString(5, percost);
            ps.setString(6, qty);
            ps.setString(7, measure);
            ps.setString(8, status);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "material added");
            tupdate();
            jTextFieldMatName.setText("");
            jTextAreaDes.setText("");
            jComboBoxCat.setSelectedIndex(-1);
            jComboBoxSup.setSelectedIndex(-1);
            jTextFieldPerCost.setText("");
            jTextFieldQty.setText("");
            jComboBoxMeasure.setSelectedIndex(-1);
            jComboBoxStat.setSelectedIndex(-1);

        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        DefaultTableModel d1=(DefaultTableModel)jTable1.getModel();
        int selectIndex =jTable1.getSelectedRow();
        int mat_code=Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
       
        String mname=jTextFieldMatName.getText();
        String des=jTextAreaDes.getText();
        CategoryItem item=(CategoryItem)jComboBoxCat.getSelectedItem();
        Supplier supplier=(Supplier)jComboBoxSup.getSelectedItem();
        String percode=jTextFieldPerCost.getText();
        String qty=jTextFieldQty.getText();
        String measure=jComboBoxMeasure.getSelectedItem().toString();
        String status=jComboBoxStat.getSelectedItem().toString();

        String query = "UPDATE material SET mat_name=?,description=?,cat_Id=?,sup_id=?,per_cost=?,quantity=?,measure_type=?,status=? WHERE mat_code=?";

        try {
            ps = DBConnection.getConnection().prepareStatement(query);
           
            ps.setString(1, mname);
            ps.setString(2, des);
            ps.setInt(3, item.id);
            ps.setInt(4, supplier.id);
            ps.setString(5, percode);
            ps.setString(6, qty);
            ps.setString(7, measure);
            ps.setString(8, status);
            ps.setInt(9, mat_code);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "material updated");
            tupdate();

            jTextFieldMatName.setText("");
            jTextAreaDes.setText("");
            jComboBoxCat.setSelectedIndex(-1);
            jComboBoxSup.setSelectedIndex(-1);
            jTextFieldPerCost.setText("");
            jTextFieldQty.setText("");
            jComboBoxMeasure.setSelectedIndex(-1);
            jComboBoxStat.setSelectedIndex(-1);
 
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
            String query = "DELETE FROM material WHERE mat_code=?";

            try {
                ps = DBConnection.getConnection().prepareStatement(query);
                ps.setInt(1, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "material deleted");
                tupdate();
         
            jTextFieldMatName.setText("");
            jTextAreaDes.setText("");
            jComboBoxCat.setSelectedIndex(-1);
            jComboBoxSup.setSelectedIndex(-1);
            jTextFieldPerCost.setText("");
            jTextFieldQty.setText("");
            jComboBoxMeasure.setSelectedIndex(-1);
            jComboBoxStat.setSelectedIndex(-1);

            } catch (SQLException ex) {
                Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed
    private void jComboBoxStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxStatActionPerformed

    private void jTextFieldPerCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPerCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPerCostActionPerformed

    private void jTextFieldQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQtyActionPerformed

    private void jComboBoxSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSupActionPerformed

    private void jLabelMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMaterialMouseClicked
        
        CSMaterial c = new CSMaterial();
        c.setVisible(true);
        c.pack();
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.dispose();
    }//GEN-LAST:event_jLabelMaterialMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel d1=(DefaultTableModel)jTable1.getModel();
         int selectIndex =jTable1.getSelectedRow();
 
         jTextFieldMatName.setText(d1.getValueAt(selectIndex,1).toString());
         jTextAreaDes.setText(d1.getValueAt(selectIndex,2).toString());   
          String category=d1.getValueAt(selectIndex, 3).toString();
            switch(category){
                    case "floor":
                    jComboBoxCat.setSelectedIndex(0);
                    break;
                    case "walls":
                    jComboBoxCat.setSelectedIndex(1);
                    break;
                    case "opening":
                    jComboBoxCat.setSelectedIndex(2);
                    break;
                    case "roof":
                    jComboBoxCat.setSelectedIndex(3);
                    break;       
            }
          String supplier=d1.getValueAt(selectIndex,4).toString();
            switch(supplier){
                    case "Building Materials Corporation (BMC)":
                    jComboBoxSup.setSelectedIndex(0);
                    break;
                    case "Shan Construction (pvt) Ltd.":
                    jComboBoxSup.setSelectedIndex(1);
                    break;
                    case "Eco Ceylon Holdings (Pvt) Ltd":
                    jComboBoxSup.setSelectedIndex(2);
                    break;
                    case "Mascons (Pvt) Limited":
                    jComboBoxSup.setSelectedIndex(3);
                    break;       
                    case "Kesara Building Material Suppliers":
                    jComboBoxSup.setSelectedIndex(4);
                    break; 
                    case "Amano Lanka Engineering (Pvt) Ltd":
                    jComboBoxSup.setSelectedIndex(5);
                    break; 
                    case "Rhino Roofing Products Limited":
                    jComboBoxSup.setSelectedIndex(6);
                    break; 
                    case "El-Toro Roofing Products Ltd.":
                    jComboBoxSup.setSelectedIndex(7);
                    break; 
                    case "Ranjanas Ceramic (Pvt) Ltd":
                    jComboBoxSup.setSelectedIndex(8);
                    break; 
                    case "Rocell":
                    jComboBoxSup.setSelectedIndex(9);
                    break; 
                    case "Lanka Tiles":
                    jComboBoxSup.setSelectedIndex(10);
                    break; 
                    case "FIBERTECH":
                    jComboBoxSup.setSelectedIndex(11);
                    break; 
                    case "Lanka Aluminum PLC":
                    jComboBoxSup.setSelectedIndex(12);
                    break; 
                    case "Luminex Aluminium Fabricators":
                    jComboBoxSup.setSelectedIndex(13);
                    break; 
            }
         jTextFieldPerCost.setText(d1.getValueAt(selectIndex,5).toString());
         jTextFieldQty.setText(d1.getValueAt(selectIndex,6).toString());
         jComboBoxMeasure.setSelectedItem(d1.getValueAt(selectIndex,7).toString());
         jComboBoxStat.setSelectedItem(d1.getValueAt(selectIndex,8).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBoxCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCatActionPerformed

    private void jComboBoxMeasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMeasureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMeasureActionPerformed

    private void jLabelMRNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMRNMouseClicked
       
        CSStockHandle c = new CSStockHandle();
        c.setVisible(true);
        c.pack();
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jLabelMRNMouseClicked

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
            java.util.logging.Logger.getLogger(CSMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CSMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CSMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CSMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CSMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JComboBox jComboBoxCat;
    private javax.swing.JComboBox<String> jComboBoxMeasure;
    private javax.swing.JComboBox<String> jComboBoxStat;
    private javax.swing.JComboBox jComboBoxSup;
    private javax.swing.JLabel jLabeClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCat;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelMRN;
    private javax.swing.JLabel jLabelMaterial;
    private javax.swing.JLabel jLabelMeasure;
    private javax.swing.JLabel jLabelMetName;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelPerCost;
    private javax.swing.JLabel jLabelQty;
    private javax.swing.JLabel jLabelStat;
    private javax.swing.JLabel jLabelSupId;
    private javax.swing.JLabel jLabelTopic;
    private javax.swing.JLabel jLabeldis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCategory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaDes;
    private javax.swing.JTextField jTextFieldMatName;
    private javax.swing.JTextField jTextFieldPerCost;
    private javax.swing.JTextField jTextFieldQty;
    // End of variables declaration//GEN-END:variables
}
