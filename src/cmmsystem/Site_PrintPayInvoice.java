/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmmsystem;

import java.awt.print.PrinterException;
import javax.swing.table.TableModel;

public class Site_PrintPayInvoice extends javax.swing.JFrame {

    /**
     * Creates new form Site_PrintPayInvoice
     */
    public Site_PrintPayInvoice() {
        initComponents();
    }

    String lsubTotal;
    String lpay;
    String lbalance;
    public Site_PrintPayInvoice(String subTotal, String pay, String balance, TableModel model) throws PrinterException {
        initComponents();
        
        this.lsubTotal=subTotal;
        this.lpay=pay;
        this.lbalance=balance;
        
        jTextFieldprint.setText(jTextFieldprint.getText()+"*******************************************\n" );
        jTextFieldprint.setText(jTextFieldprint.getText()+"**************PAY INVOICE******************\n" );
        jTextFieldprint.setText(jTextFieldprint.getText()+"\n" ); 
        jTextFieldprint.setText(jTextFieldprint.getText()+"Material"+"\t"+"price"+"\t"+"Total\n" );
        for(int i=0;i< model.getRowCount(); i++){
            
            String material=(String)model.getValueAt(i, 1);
            String price=(String)model.getValueAt(i, 2); 
            int total=(int)model.getValueAt(i, 4);
            jTextFieldprint.setText(jTextFieldprint.getText()+material+"\t"+price+"\t"+total+"\n" );
               
        }
        jTextFieldprint.setText(jTextFieldprint.getText()+"\n" );
        jTextFieldprint.setText(jTextFieldprint.getText()+"\n" );
        jTextFieldprint.setText(jTextFieldprint.getText()+"          Sub Total   :"+subTotal+  "\n" );
        jTextFieldprint.setText(jTextFieldprint.getText()+"          Pay         :"+pay+  "\n" );
        jTextFieldprint.setText(jTextFieldprint.getText()+"          Balance     :"+balance+  "\n" );
        jTextFieldprint.setText(jTextFieldprint.getText()+"\n" );
        jTextFieldprint.setText(jTextFieldprint.getText()+"\n" );
        jTextFieldprint.setText(jTextFieldprint.getText()+"*******************************************\n" );
        jTextFieldprint.setText(jTextFieldprint.getText()+"*******************************************\n" );
        jTextFieldprint.setText(jTextFieldprint.getText()+"***********Thank You Come Again!***********\n" );
        
        jTextFieldprint.print();
        
        
    }   
    
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextFieldprint = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldprint.setColumns(20);
        jTextFieldprint.setRows(5);
        jTextFieldprint.setPreferredSize(new java.awt.Dimension(200, 100));
        jScrollPane1.setViewportView(jTextFieldprint);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Site_PrintPayInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Site_PrintPayInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Site_PrintPayInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Site_PrintPayInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Site_PrintPayInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextFieldprint;
    // End of variables declaration//GEN-END:variables
}
