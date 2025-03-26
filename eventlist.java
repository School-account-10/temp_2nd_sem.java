import java.awt.BorderLayout;
import java.awt.Color;
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
    JLabel txt = new JLabel("Damn im a txt string");
    txt.setLayout(new BorderLayout());
    this.add(txt, BorderLayout.CENTER);
    this.setVisible(true);
    this.setSize(750, 540);
    this.setTitle("Events List");

    this.setAlwaysOnTop(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ImageIcon progIcon = new ImageIcon("pictures/program_icon.png");
    this.setIconImage(progIcon.getImage());
    this.getContentPane().setBackground(new Color(123, 50, 250));
    this.add(txt);
  }
}
