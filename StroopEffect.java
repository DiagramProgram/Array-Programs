import java.awt.event.*; //DONE
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;

public class StroopEffect extends Applet implements ActionListener {
  String names[]={"Black", "Blue", "Cyan", "Pink", "Red", "Gray", "Yellow", "Green"};
  Color colours[]={Color.black, Color.blue, Color.cyan, Color.magenta, Color.RED, Color.gray, Color.yellow, Color.green};
  JLabel names1;
  int num1;
  int num2;
  
  public void init() { 
    resize (300, 200);
    setBackground(Color.white);
    JLabel title = new JLabel ("Call out the COLOUR, not the word.");
    names1 = new JLabel ("Yellow");
    names1.setForeground(Color.green);
    names1.setFont (new Font ("Arial", Font.BOLD, 50));
    JLabel blank = new JLabel ("                                                                                      ");
    JButton clue = new JButton ("New Clue");
    clue.addActionListener(this);
    clue.setBackground( Color.lightGray);
    add (title);
    add (names1);
    add (blank);
    add (clue);
  }
  
  public void randomNumberGen() {
    num1 = (int) (Math.random () * 8);
    num2 = (int) (Math.random () * 8);
    while (num1 == num2)
      num2 = (int) (Math.random () * 8);
  }
  
  public void actionPerformed (ActionEvent e) {
    randomNumberGen();
    names1.setForeground(colours[num1]);
    names1.setText(names[num2]);
  }
}

