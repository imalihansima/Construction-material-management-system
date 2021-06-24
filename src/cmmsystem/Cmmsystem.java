package cmmsystem;

import javax.swing.JFrame;

public class Cmmsystem {

      public static void main(String[] args) {
        
           java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                   loginForm frame = new loginForm();
                   frame.setVisible(true);
              }
        });
    }         
   
}
    

