
package cmmsystem;

import com.sun.glass.events.KeyEvent;
import com.sun.javafx.tk.PrintPipeline;
import java.awt.print.PrinterException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Site_MaterialRequest extends javax.swing.JFrame {
    DBConnection con;
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel model =new DefaultTableModel();
  
    public Site_MaterialRequest() {
        initComponents();
        CheckQty();
      //  tupdate();
    }

    public class Category{
        int id;
        String name;  
        
        public Category(int id, String name){
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
  public class Material{
        int id;
        String name;  
        
        public Material(int id, String name){
          this.id=id;
          this.name=name;
        }
        public String toString(){
        return name;
        }
}
    public class Users{
        int id;
        String name;  
        
        public Users(int id, String name){
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabeClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelTopic = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelMatCode = new javax.swing.JLabel();
        jTextFieldMatName = new javax.swing.JTextField();
        jLabelMatName = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jTextFieldMatCode = new javax.swing.JTextField();
        jTextFieldQuantity = new javax.swing.JTextField();
        jLabelQuantity = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelMatCode1 = new javax.swing.JLabel();
        jTextFieldSubTotal = new javax.swing.JTextField();
        jLabelMatCode2 = new javax.swing.JLabel();
        jTextFieldBalanace = new javax.swing.JTextField();
        jTextFieldPay = new javax.swing.JTextField();
        jLabelMatCode3 = new javax.swing.JLabel();
        jButtonPay = new javax.swing.JButton();

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Site Panel");

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
                        .addGap(252, 252, 252)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabeClose)
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeClose)
                    .addComponent(jLabelMin))
                .addGap(60, 60, 60))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTopic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material Code", "Material name", "Price", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(149, 165, 166));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 42, 86));
        jLabel5.setText("<previous>");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(149, 165, 166));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Material", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(25, 42, 86))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(25, 42, 86));

        jLabelMatCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMatCode.setForeground(new java.awt.Color(25, 42, 86));
        jLabelMatCode.setText("Material Code");

        jLabelMatName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMatName.setForeground(new java.awt.Color(25, 42, 86));
        jLabelMatName.setText("Material Name");

        jLabelPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPrice.setForeground(new java.awt.Color(25, 42, 86));
        jLabelPrice.setText("Price");

        jTextFieldMatCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatCodeActionPerformed(evt);
            }
        });
        jTextFieldMatCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMatCodeKeyPressed(evt);
            }
        });

        jLabelQuantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelQuantity.setForeground(new java.awt.Color(25, 42, 86));
        jLabelQuantity.setText("Quantity");

        jButtonAdd.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(25, 42, 86));
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelMatCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMatCode, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelMatName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMatName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelQuantity)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMatCode)
                    .addComponent(jTextFieldMatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMatName)
                    .addComponent(jLabelPrice)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuantity)
                    .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMatCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonDelete.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(25, 42, 86));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(149, 165, 166));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        jLabelMatCode1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMatCode1.setForeground(new java.awt.Color(25, 42, 86));
        jLabelMatCode1.setText("SubTotal");

        jTextFieldSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSubTotalActionPerformed(evt);
            }
        });

        jLabelMatCode2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMatCode2.setForeground(new java.awt.Color(25, 42, 86));
        jLabelMatCode2.setText("Pay");

        jTextFieldBalanace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBalanaceActionPerformed(evt);
            }
        });

        jTextFieldPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPayActionPerformed(evt);
            }
        });

        jLabelMatCode3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMatCode3.setForeground(new java.awt.Color(25, 42, 86));
        jLabelMatCode3.setText("Balance");

        jButtonPay.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonPay.setForeground(new java.awt.Color(25, 42, 86));
        jButtonPay.setText("Pay Invoice");
        jButtonPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelMatCode1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabelMatCode2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldPay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabelMatCode3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldBalanace, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(jButtonPay)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMatCode1)
                    .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMatCode2)
                    .addComponent(jTextFieldBalanace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMatCode3)
                    .addComponent(jButtonPay))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonDelete)
                        .addGap(35, 35, 35)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void CheckQty(){
            String name=jTextFieldMatCode.getText();
            String query="select*from material WHERE mat_code=?";
              
             try {
                 ps = DBConnection.getConnection().prepareStatement(query);
                 ps.setString(1, name);
                 rs = ps.executeQuery();
                 
                 while(rs.next()){
                     int currentQty=rs.getInt("quantity");
                     
                     int price=Integer.parseInt(jTextFieldPrice.getText());
                     int newQty=Integer.parseInt(jTextFieldQuantity.getText());
                     
                     int total=price*newQty;
                     if(newQty>=currentQty){
                         JOptionPane.showMessageDialog(this, "Available material = "+currentQty);
                         JOptionPane.showMessageDialog(this, "Quantity is not enough");
                     }
                     else{
                         model=(DefaultTableModel)jTable1.getModel();
                         model.addRow(new Object[]
                                 {
                                   jTextFieldMatCode.getText(),
                                   jTextFieldMatName.getText(),
                                   jTextFieldPrice.getText(),
                                   jTextFieldQuantity.getText(),
                                   total,
                                 } );
                                   
                                  int sum=0;
                                  for(int i=0;i<jTable1.getRowCount();i++){
                                      sum=sum+Integer.parseInt(jTable1.getValueAt(i, 4).toString());
                         
                                 }
                         
                                  jTextFieldSubTotal.setText(Integer.toString(sum));
                         
                                  jTextFieldMatCode.setText("");
                                  jTextFieldMatName.setText("");
                                  jTextFieldPrice.setText("");
                                  jTextFieldQuantity.setText("");
                                  jTextFieldMatCode.requestFocus();
                     }
                 }
             } catch (SQLException ex) {
                 Logger.getLogger(Site_MaterialRequest.class.getName()).log(Level.SEVERE, null, ex);
             }
             
    
    }
    
    private void request(){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyy");
        LocalDateTime now=LocalDateTime.now();
        String date=dtf.format(now);
        
        String subTotal=jTextFieldSubTotal.getText();
        String pay=jTextFieldPay.getText();
        String balance=jTextFieldBalanace.getText();
        int lastinsertId=0;
        
        String query="insert into site_request (date,subtotal,pay,balance) value(?,?,?,?)";
              
             try {
                 ps = DBConnection.getConnection().prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                 ps.setString(1, date);
                 ps.setString(2, subTotal);
                 ps.setString(3, pay);
                 ps.setString(4, balance);
                 
                 ps.executeUpdate();
                 ResultSet generatedKeyResult=ps.getGeneratedKeys();
                 
                 if(generatedKeyResult.next()){
                     lastinsertId=generatedKeyResult.getInt(1);
                 }
        
                int rows=jTable1.getRowCount();
                String query1="insert into site_requestmaterial (sr_id, mat_id, price, quantity, total) value(?,?,?,?,?)"; 
                ps = DBConnection.getConnection().prepareStatement(query1);
                String mat_id="";
                String price="";
                String quentity="";
                int total=0;
                
                for(int i=0;i<jTable1.getRowCount();i++){
                    mat_id=(String)jTable1.getValueAt(i, 0);
                    price=(String)jTable1.getValueAt(i, 2);                 
                    quentity=(String)jTable1.getValueAt(i, 3);
                    total=(int)jTable1.getValueAt(i, 4);
                     
                    ps.setInt(1, lastinsertId);
                    ps.setString(2, mat_id);
                    ps.setString(3, price);
                    ps.setString(4, quentity);
                    ps.setInt(5, total);
                    ps.executeUpdate();
                }
                String query3="update material set quantity=quantity-? where mat_code=? ";
                ps = DBConnection.getConnection().prepareStatement(query3);
                
                for(int i=0;i<jTable1.getRowCount();i++){
                    mat_id=(String)jTable1.getValueAt(i, 0);            
                    quentity=(String)jTable1.getValueAt(i, 3);
                   
                    ps.setString(1, quentity);
                    ps.setString(2, mat_id);
                    ps.execute();
                }
                 String query4="update site_material set quantity=quantity+? where mat_id=? ";
                ps = DBConnection.getConnection().prepareStatement(query4);
                
                for(int i=0;i<jTable1.getRowCount();i++){
                    mat_id=(String)jTable1.getValueAt(i, 0);            
                    quentity=(String)jTable1.getValueAt(i, 3);
                   
                    ps.setString(1, quentity);
                    ps.setString(2, mat_id);
                    ps.execute();
                }
                
                ps.addBatch();
                JOptionPane.showMessageDialog(this, "Record saved");
                
    } catch (SQLException ex) {
            Logger.getLogger(Site_MaterialRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }    
    
     public void Site_PrintPayInvoice() {
        String subTotal=jTextFieldSubTotal.getText();
        String pay=jTextFieldPay.getText();
        String balance=jTextFieldBalanace.getText();
        
        try {
            new Site_PrintPayInvoice(subTotal,pay,balance,jTable1.getModel()).setVisible(true);
        } catch (PrinterException ex) {
            Logger.getLogger(Site_MaterialRequest.class.getName()).log(Level.SEVERE, null, ex);
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
        SiteDashboardForm d = new SiteDashboardForm();
        d.setVisible(true);
        d.pack();
        d.setLocationRelativeTo(null);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jTextFieldMatCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatCodeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextFieldSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSubTotalActionPerformed

    private void jTextFieldBalanaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBalanaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBalanaceActionPerformed

    private void jTextFieldPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPayActionPerformed

    private void jButtonPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPayActionPerformed
        
        int pay=Integer.parseInt(jTextFieldPay.getText());
        int subtotal=Integer.parseInt(jTextFieldSubTotal.getText());
        
        int balance=pay-subtotal;
        jTextFieldBalanace.setText(String.valueOf(balance));
        
        Site_PrintPayInvoice();
        request();
    }//GEN-LAST:event_jButtonPayActionPerformed

    private void jTextFieldMatCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMatCodeKeyPressed
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String name=jTextFieldMatCode.getText();
            String query="select*from material WHERE mat_code=?";
            try {       
                ps = DBConnection.getConnection().prepareStatement(query);
                ps.setString(1, name);
                rs = ps.executeQuery();
                if(rs.next()==false){
                   JOptionPane.showMessageDialog(this, "Material code not found");
                }
                else{
                    String MatName=rs.getString("mat_name");
                    String price=rs.getString("per_cost");
                    
                    jTextFieldMatName.setText(MatName.trim());
                    jTextFieldPrice.setText(price.trim());
                
                }
            } catch (SQLException ex) {
                Logger.getLogger(Site_MaterialRequest.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }//GEN-LAST:event_jTextFieldMatCodeKeyPressed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        
        CheckQty();
        
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
       
        model.removeRow(jTable1.getSelectedRow());
        int sum=0;
        for(int i=0;i<jTable1.getRowCount();i++){
        sum=sum+Integer.parseInt(jTable1.getValueAt(i, 4).toString());
        }
        jTextFieldSubTotal.setText(Integer.toString(sum));
                         
    }//GEN-LAST:event_jButtonDeleteActionPerformed
   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Site_MaterialRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonPay;
    private javax.swing.JLabel jLabeClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelMatCode;
    private javax.swing.JLabel jLabelMatCode1;
    private javax.swing.JLabel jLabelMatCode2;
    private javax.swing.JLabel jLabelMatCode3;
    private javax.swing.JLabel jLabelMatName;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JLabel jLabelTopic;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBalanace;
    private javax.swing.JTextField jTextFieldMatCode;
    private javax.swing.JTextField jTextFieldMatName;
    private javax.swing.JTextField jTextFieldPay;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldQuantity;
    private javax.swing.JTextField jTextFieldSubTotal;
    // End of variables declaration//GEN-END:variables
}
