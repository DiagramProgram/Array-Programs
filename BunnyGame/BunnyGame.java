import javax.swing.*; //DONE
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class BunnyGame extends Applet implements ActionListener {
  int field[] [] = {{0, 2, 2, 2, 2, 0, 0}, {0, 1, 1, 0, 2, 0, 0}, {0, 1, 0, 0, 2, 2, 0}, {0, 1, 0, 0, 0, 2, 0}, {0, 1, 0, 0, 0, 2, 2}, {0, 2, 2, 2, 2, 2, 2}};
    int row = 6;
  int col = 7;
  int x = 0;
  int y = 0;
  int mush = 0;
  JLabel mushrooms;
  JLabel pics[] = new JLabel [row * col];
  
  public void init () {
    resize (500, 460);
    setBackground (Color.orange);
    Panel grid = new Panel (new GridLayout (row, col));
    int m = 0;
    for (int i = 0 ; i < row ; i++) {
      for (int j = 0 ; j < col ; j++) {
        pics [m] = new JLabel (createImageIcon ("p" + field [i] [j] + ".jpg"));
        pics [m].setPreferredSize (new Dimension (68, 68));
        grid.add (pics [m]);
        m++;
      }
    }
    add (grid);
    JButton up = new JButton ("up");
    up.setActionCommand ("up");
    up.addActionListener (this);
    add (up);
    JButton left = new JButton ("left");
    left.setActionCommand ("left");
    left.addActionListener (this);
    add (left);
    JButton down = new JButton ("down");
    down.setActionCommand ("down");
    down.addActionListener (this);
    add (down);
    JButton right = new JButton ("right");
    right.setActionCommand ("right");
    right.addActionListener (this);
    add (right);
    mushrooms = new JLabel ("Mushrooms: 000");
    add (mushrooms);
    pics [x * col + y].setIcon (createImageIcon ("p3.jpg"));
  }
  public void actionPerformed (ActionEvent e) {
    if (e.getActionCommand ().equals ("up")) {
      if (x - 1 < 0)
        showStatus ("Off the board!!");
      else {
        if (field [x - 1] [y] == 2) {
          showStatus ("OK! There is mushroom!");
          mush++;
          field [x - 1] [y] = 0;
          mushrooms.setText ("Mushrooms: " + mush);
        }
        else if (field [x - 1] [y] == 1) {
          showStatus ("OK! There is a baby mushroom!");
          field [x - 1] [y] = 2;
        }
        pics [x * col + y].setIcon (createImageIcon ("p" + field [x] [y] + ".jpg"));
        x--;
        pics [x * col + y].setIcon (createImageIcon ("p3.jpg"));
      }
    }
    else if (e.getActionCommand ().equals ("down")) {
      if (x + 1 < 0)
        showStatus ("Off the board!!");
      else {
        if (field [x + 1] [y] == 2) {
          showStatus ("OK! There is mushroom!");
          mush++;
          field [x + 1] [y] = 0;
          mushrooms.setText ("Mushrooms: " + mush);
        }
        else if (field [x + 1] [y] == 1) {
          showStatus ("OK! There is a baby mushroom!");
          field [x + 1] [y] = 2;
        }
        pics [x * col + y].setIcon (createImageIcon ("p" + field [x] [y] + ".jpg"));
        x++;
        pics [x * col + y].setIcon (createImageIcon ("p3.jpg"));
      }
    }
    else if (e.getActionCommand ().equals ("right")) {
      if (y + 1 < 0)
        showStatus ("Off the board!!");
      else {
        if (field [x] [y + 1] == 2) {
          showStatus ("OK! There is mushroom!");
          mush++;
          field [x] [y + 1] = 0;
          mushrooms.setText ("Mushrooms: " + mush);
        }
        else if (field [x] [y + 1] == 1) {
          showStatus ("OK! There is a baby mushroom!");
          field [x] [y + 1] = 2;
        }
        pics [x * col + y].setIcon (createImageIcon ("p" + field [x] [y] + ".jpg"));
        y++;
        pics [x * col + y].setIcon (createImageIcon ("p3.jpg"));
      }
    }
    else if (e.getActionCommand ().equals ("left")) {
      if (y - 1 < 0)
        showStatus ("Off the board!!");
      else {
        if (field [x] [y - 1] == 2) {
          showStatus ("OK! There is mushroom!");
          mush++;
          field [x] [y - 1] = 0;
          mushrooms.setText ("Mushrooms: " + mush);
        }
        else if (field [x] [y - 1] == 1) {
          showStatus ("OK! There is a baby mushroom!");
          field [x] [y - 1] = 2;
        }
        pics [x * col + y].setIcon (createImageIcon ("p" + field [x] [y] + ".jpg"));
        y--;
        pics [x * col + y].setIcon (createImageIcon ("p3.jpg"));
      }
    }
    if (mush == 21)
      showStatus ("You win!!");
  }
  
  protected static ImageIcon createImageIcon (String path) {
    java.net.URL imgURL = BunnyGame.class.getResource (path);
    if (imgURL != null)
      return new ImageIcon (imgURL);
    else
      return null;
  }
}