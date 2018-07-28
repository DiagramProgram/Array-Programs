import java.awt.*; //DONE
import java.awt.event.*; 
import java.applet.*;
import javax.swing.*;

public class LightsOut extends Applet implements ActionListener {
  JButton [][] a;
  JLabel moves;
  int[][] state;
  int m = 0;
  
  public void init() {
    setBackground(Color.DARK_GRAY);
    resize (500, 300);
    
    Panel f = new Panel (new GridLayout (1, 2));
    
    Panel p = new Panel (new GridLayout (5, 5, 0, 0));
    a = new JButton [5][5];
    state = new int [5][5];
    for (int y = 0; y<5; y++) {
      for (int x = 0 ; x < 5; x++) {
        a [x][y] = new JButton ("");
        a [x][y].addActionListener (this);
        a [x][y].setActionCommand (x+""+y);
        a [x][y].setBackground (Color.BLUE);
        a[x][y].setPreferredSize(new Dimension (50, 50));
        state [x][y] = 0;
        p.add (a [x][y]);
      }
    }
    Panel s = new Panel (new GridLayout (3, 1));
    JButton reset = new JButton ("Reset");
    reset.addActionListener (this);
    reset.setActionCommand ("reset");
    reset.setBackground (Color.GRAY);
    reset.setForeground(Color.WHITE);
    
    moves = new JLabel ("     Moves: " + m);
    moves.setFont(new Font("Arial", Font.BOLD, 35));
    moves.setForeground(Color.WHITE);
    
    JButton quit = new JButton ("Quit");
    quit.addActionListener (this);
    quit.setActionCommand ("quit");
    quit.setBackground (Color.GRAY);
    quit.setForeground(Color.WHITE);
    
    s.add (reset);
    s.add (moves);
    s.add (quit);
    
    f.add (p);
    f.add (s);
    
    add (f);
  }
  
  public void actionPerformed (ActionEvent e) {
    if (e.getActionCommand ().equals ("reset")) {
      for (int w = 0; w<5; w++) {
        for (int  z= 0 ; z < 5; z++) {
          state [z][w] = 0;
          a[z][w].setBackground(Color.BLUE);
        }
      }
      m=0;
      moves.setText("     Moves: " + m);
    }
    
    else if (e.getActionCommand().equals("quit")) {
      System.exit(ABORT);
    }
    
    else {
      String pos = (e.getActionCommand());
      int i = (int) (pos.charAt(0)-48); 
      int j = (int) (pos.charAt(1)-48);
      
      if (state [i][j]==0) {
        state [i][j]=1;
        a[i][j].setBackground(Color.WHITE);
      }
      else {
        state [i][j]=0;
        a[i][j].setBackground(Color.BLUE);
      }
      
      if ((j+1)<5) {
        if (state [i][j+1]==0) {
          state [i][j+1]=1;
          a[i][j+1].setBackground(Color.WHITE);
        }
        else {
          state [i][j+1]=0;
          a[i][j+1].setBackground(Color.BLUE);
        }
      }
      
      if (j-1>-1) {
        if (state [i][j-1]==0) {
          state [i][j-1]=1;
          a[i][j-1].setBackground(Color.WHITE);
        }
        else {
          state [i][j-1]=0;
          a[i][j-1].setBackground(Color.BLUE);
        }
      }
      
      if ((i+1)<5) {
        if (state [i+1][j]==0) {
          state [i+1][j]=1;
          a[i+1][j].setBackground(Color.WHITE);
        }
        else {
          state [i+1][j]=0;
          a[i+1][j].setBackground(Color.BLUE);
        }
      }
      
      if ((i-1)>-1) {
        if (state [i-1][j]==0) {
          state [i-1][j]=1;
          a[i-1][j].setBackground(Color.WHITE);
        }
        else {
          state [i-1][j]=0;
          a[i-1][j].setBackground(Color.BLUE);
        }
      }
      
      m++;
      moves.setText("     Moves: " + m);
    }
  }
}