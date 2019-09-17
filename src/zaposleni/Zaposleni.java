
package zaposleni;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;




public class Zaposleni {


    
    public static void main(String[] args) {
    
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                 if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                 }
            }
         } catch (Exception e){};
        
        Aplikacija ap = new Aplikacija();
        ap.setVisible(true);
        ap.setResizable(false);
        ap.setDefaultCloseOperation(Aplikacija.EXIT_ON_CLOSE);
        ap.setLocation(350, 300);
        
    }
}
