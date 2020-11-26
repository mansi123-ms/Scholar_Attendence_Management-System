package supporting_classes;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class UILook {
    public static void changeLook(JFrame jf){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new UILook().setIcon(jf);
            
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
        }
    }
    
    public void setIcon(JFrame jf)
    {
        jf.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/applogo.png")));
    }

}
