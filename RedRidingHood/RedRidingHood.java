import javax.swing.*; //DONE
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class RedRidingHood extends Applet implements ActionListener {
  Panel p_card; //to hold all of the screens
  Panel card1, card2;
  CardLayout cdLayout = new CardLayout();
  int counter = 1;
  String[] story = new String[] {"Once upon a time, Little Red Riding Hood went to visit her sick grandmother.", "She walked through the woods and over the bridges.", "After a while, she met a wolf who tricked her into picking flowers for her grandmother.", "The wolf ran ahead and ater her sick grandmother, then he disguised himself.", "When red arrived, she was puzzled. She said, \"Grandmother, what big ears you have!\"", "Then, Red said, \"Grandmother, what sharp teeth you have!\" and the wolf ate her.", "Full, the wolf went to sleep and snored loudly. A nearby woodcutter heard him.", "When the woodcutter came to investigate, he noticed a scarf coming out of the wolf's mouth.", "The scarf was the grandmother's knitting in the wolf's stomach", "The woodcutter pulled Little Red Riding Hood and her grandmother free", "The wolf was put in prison and everyone lived happily ever after. The End."};
  JLabel sub;
  JLabel pic;
  
  public void init() {
    p_card = new Panel ();
    p_card.setLayout(cdLayout);
    screen1 ();
    screen2 ();
    setLayout(new BorderLayout ());
    add ("Center", p_card);
  }
  
  public void screen1 () {
    card1 = new Panel ();
    card1.setBackground (Color.white);
    JLabel title = new JLabel ("Little Red Riding Hood");
    title.setFont (new Font ("Arial", Font.BOLD, 40));
    title.setForeground (Color.red);
    JLabel pic = new JLabel (createImageIcon ("redlogo.jpg"));
    //JLabel bla = new JLabel ("                                                                   ");
    JButton begin = new JButton ("Begin");
    card1.add (title);
    card1.add (pic);
    card1.add (begin);
    begin.addActionListener (this);
    begin.setActionCommand ("2");
    p_card.add ("1", card1);
  }
  
  public void screen2 () {
    card2 = new Panel ();
    card2.setBackground (Color.white);
    pic = new JLabel (createImageIcon ("red1.jpg"));
    sub = new JLabel ("");
    sub = new JLabel ("Once upon a time, Little Red Riding Hood went to visit her sick grandmother.");
    JButton next = new JButton (">>");
    card2.add (pic);
    card2.add (sub);
    card2.add (next);
    next.setActionCommand ("nextline");
    next.addActionListener (this);
    p_card.add ("2", card2);
  }
  
  public void actionPerformed (ActionEvent e) {
    String var = e.getActionCommand ();
    cdLayout.show (p_card, var);
    
    if (e.getActionCommand ().equals ("nextline")) {
      if (counter == 1){
        pic.setIcon (createImageIcon ("red1.jpg"));
        sub.setText(story[0]);
      } else if (counter == 2){
        pic.setIcon (createImageIcon ("red2.jpg"));
        sub.setText(story[1]);
      } else if (counter == 3){
        pic.setIcon (createImageIcon ("red3.jpg"));
        sub.setText(story[2]);
      } else if (counter == 4){
        pic.setIcon (createImageIcon ("red4.jpg"));
        sub.setText(story[3]);
      } else if (counter == 5){
        pic.setIcon (createImageIcon ("red5.jpg"));
        sub.setText(story[4]);
      } else if (counter == 6){
        pic.setIcon (createImageIcon ("red6.jpg"));
        sub.setText(story[5]);
      } else if (counter == 7){
        pic.setIcon (createImageIcon ("red7.jpg"));
        sub.setText(story[6]);
      } else if (counter == 8){
        pic.setIcon (createImageIcon ("red8.jpg"));
        sub.setText(story[7]);
      } else if (counter == 9){
        pic.setIcon (createImageIcon ("red9.jpg"));
        sub.setText(story[8]);
      } else if (counter == 10){
        pic.setIcon (createImageIcon ("red10.jpg"));
        sub.setText(story[9]);
      } else if (counter == 11){
        pic.setIcon (createImageIcon ("red11.jpg"));
        counter = 0;
        sub.setText(story[10]);
      }
    }
    counter ++;
  }
  
  public static ImageIcon createImageIcon (String path) {
    java.net.URL imgURL = RedRidingHood.class.getResource (path);
    if (imgURL != null)
      return new ImageIcon (imgURL);
    else {
      System.err.println("Couldn't find file: " + path);
      return null;
    }
  }
}