import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Label;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Eventlist extends JFrame {

  Eventlist() {
    //instances of jlabel
    JLabel txt1 = new JLabel();
    JLabel txt2 = new JLabel();
    JLabel txt3 = new JLabel();

    //instances of jpannel / containers
    JPanel box1 = new JPanel();
    JPanel box2 = new JPanel();
    JPanel box3 = new JPanel();

   //posters and images 
   ImageIcon poster1 = new ImageIcon("pictures\\placeholderImg.png"); /// change place holder
   ImageIcon poster2 = new ImageIcon("pictures\\placeholderImg.png");
   ImageIcon poster3 = new ImageIcon("pictures\\placeholderImg.png"); // might make a scrollable thingi
   ImageIcon progIcon = new ImageIcon("pictures/program_icon.png"); // icons

    //borders
    Border Firstborder = BorderFactory.createLineBorder(Color.CYAN,4);

    //box1
    box1.setBackground(Color.GREEN);
    box1.setBounds(0,0,250,250);
    txt1.setText("poster 1");
    txt1.setIcon(poster1);
    
    
    //box2
    box2.setBackground(Color.red);
    box2.setBounds(250,0,250,250);
    txt2.setText("poster 2");
    txt2.setIcon(poster2);

    //box3
    box3.setBackground(Color.yellow);
    box3.setBounds(460,0,250,250);
    txt3.setText("poster 3");
    txt3.setIcon(poster3);
    

    //window settings
    this.setVisible(true);
    this.setSize(750, 750);
    this.setTitle("Events List");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // so it actually closes when told to

    //icon on top 
    this.setIconImage(progIcon.getImage()); // icon on top
    //color of background
    this.getContentPane().setBackground(new Color(123, 50, 250)); // color of the whole window

    // layout
    this.setLayout(null);
    
    // add boxes/containers
    this.add(box1);
    this.add(box2);
    this.add(box3);

    //add box1 content
    box1.add(txt1);
    box1.add(txt1);
    // add box 2 content 
    box2.add(txt2);
    box2.add(txt2);

    // add box 3 content 
    box3.add(txt3);
    box3.add(txt3);

  }
}
