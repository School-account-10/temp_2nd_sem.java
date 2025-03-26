import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class eventlist{
    public static void main(String[] args) {
        JFrame wholelist = new JFrame();
        wholelist.setVisible(true);
        wholelist.setSize(750,540);
        wholelist.setTitle("Events List");
        wholelist.setAlwaysOnTop(true);
        wholelist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon progIcon = new ImageIcon("pictures/program_icon.png");  
        wholelist.setIconImage(progIcon.getImage());  
        wholelist.getContentPane().setBackground(new Color(128, 0, 128));   
    }
}