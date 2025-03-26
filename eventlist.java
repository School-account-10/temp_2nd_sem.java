import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Eventlist extends JFrame {

  Eventlist() {
    JLabel txt = new JLabel();
    txt.setText("Damn im a txt string");
    ImageIcon poster1 = new ImageIcon("pictures\\placeholderImg.png"); /// change place holder
    ImageIcon poster2 = new ImageIcon("pictures\\placeholderImg.png");
    ImageIcon poster3 = new ImageIcon("pictures\\placeholderImg.png"); // might make a scrollable thingi
    txt.setIcon(poster1); /// change this the name i ment 
    /// txt.setHorizontalTextPosition(JLabel.CENTER); //changes pos of txt
    //// txt.setVerticalTextPosition(JLabel.TOP); /// changes pos of txt
    ///txt.setForeground(new Color(15, 88, 125));
    /// txt.setFont(new Font("MV Boli", Font.PLAIN,20 ));
    /// dont mind this part its just the colors and the pos of the txt 
    txt.setBackground(Color.black);
    txt.setOpaque(true);
    txt.setIconTextGap(40);
    this.add(txt, BorderLayout.CENTER);
    
    this.setVisible(true);
    this.setSize(750, 540);
    this.setTitle("Events List");

    this.setAlwaysOnTop(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ImageIcon progIcon = new ImageIcon("pictures/program_icon.png");
    this.setIconImage(progIcon.getImage());
    this.getContentPane().setBackground(new Color(123, 50, 250));
    
   
    
  }
}
