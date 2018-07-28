import javax.swing.*; //DONE
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AlphabetAdaptations extends Applet implements ActionListener {
  JTextField text;
  
  public void init () {
    text = new JTextField (40);
    JButton a[] = new JButton [26];
    Panel g = new Panel (new GridLayout (2, 13));
    JButton b[] = new JButton [10];
    for (int i = 0 ; i < a.length ; i++) {
      a [i] = new JButton ("" + (char) (i + 97));
      a [i].addActionListener (this);
      a [i].setActionCommand ("" + (char) (i + 97));
      a[i].setBackground(Color.green);
      g.add (a [i]);
    }
    
    Panel p = new Panel (new GridLayout (1, 10));
    for (int i = 0 ; i < b.length ; i++) {
      a [i] = new JButton ("" + (char) (i + 48));
      a [i].addActionListener (this);
      a [i].setActionCommand ("" + (char) (i + 48));
      a[i].setBackground(Color.yellow);
      p.add (a [i]);
    }
    
    JButton space = new JButton ("Space" + (char) (32));
    space.addActionListener (this);
    space.setActionCommand (" " + (char) (32));
    add (text);
    //add (space);
    add (p);
    add (g);
    add (space);
    resize (600, 100);
  }
  
  public void actionPerformed (ActionEvent e) {
    text.setText (text.getText () + e.getActionCommand ());
  }
  
  
}