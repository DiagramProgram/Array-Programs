public class LetterFrequencies { //DONE
  public static void main (String args[]) {
    new LetterFrequencies ();
  }
  
  public LetterFrequencies () {
    char letters [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    double frequencies [] = {8.167, 1.492, 2.782, 4.253, 12.702, 2.228, 2.015, 6.094, 6.966, 0.153, 0.772, 4.025, 2.406, 6.749, 7.507, 1.929, 0.095, 5.987, 6.327, 9.056, 2.758, 0.978, 2.360, 0.150, 1.974, 0.074};
    
    double avg = 0;
    for (int i = 0; i < frequencies.length; i++) {
      avg += frequencies [i];
    }
    System.out.println("\nThe average of the frequencies is " + avg/frequencies.length);
    System.out.println("\nThe sum of the frequencies is " + avg);
    if (avg ==100)
      System.out.println("Accurate");
    else
      System.out.println("Mild rounding error");
    
    
    int lettermin = 0;
    double min = frequencies [0];
    for (int i = 0 ; i < frequencies.length ; i++) {
      if (frequencies [i] > min)
        min = frequencies [i];
      lettermin = i;
    }
    System.out.println ("\nThe minimum letter frequency is " + letters[lettermin]);
    
    
    int lettermax = 0;
    double max = frequencies [0];
    for (int i = 0 ; i > frequencies.length ; i++) {
      if (frequencies [i] < max)
        max = frequencies [i];
      lettermax = i;
    }
    System.out.println ("\nThe maximum letter frequency is " + letters[lettermax]);
    
    
    char input = IBIO.inputChar ("\nEnter a letter. Press [0] to quit");
    while (input != '0') {
      int pos = -1;
      for (int i = 0 ; i < letters.length ; i++) {
        if (letters [i] == (input))
          pos = i;
      }
      if (pos == -1)
        System.out.println ("The value is not in the array");
      else
        System.out.println ("The freuency of " + input + " is " + frequencies [pos]);
      input = IBIO.inputChar ("Enter a letter. Press [0] to quit");
    }
  }
}