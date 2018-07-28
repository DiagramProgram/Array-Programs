public class MoviePosters { //DONE
  public static void main (String args[]) {
    new MoviePosters ();
  }
  
  public MoviePosters () {
    String first[] = {"Sam", "Zoe", "Sigourney", "Stephen", "Michelle", "Laz", "Wes", "Dileep", "Joel", "Giovanni", "CCH"};
    String last[] = {"Worthington", "Saldana", "Weaver", "Lang", "Rodriguez", "Alonzo", "Studi", "Rao", "Moore", "Ribisi", "Pounder"};
    
    System.out.println ("Avatar starring....");
    for (int i = 0 ; i < first.length ; i++) {
      System.out.print (first [i] + " ");
      System.out.println (last [i] + " ");
    }
    
    System.out.println ("");
    System.out.println ("Avatar starring....");
    for (int i = 0 ; i < first.length ; i++) {
      int j = i+1;
      System.out.print (j + ". " + first [i] + " ");
      System.out.println (last [i] + " ");
    }
    
    String min = first [0]; // Finds first name that would be alphabetically first
    for (int i = 0 ; i < first.length ; i++) {
      if (min.compareTo (first [i]) > 0)
        min = first [i];
    }
    System.out.println ("\nThe earliest first name is: " + min);
    
    
    String max = first [0]; // Finds first name that would be alphabetically last
    for (int i = 0 ; i < first.length ; i++) {
      if (max.compareTo (first [i]) < 0)
        max = first [i];
    }
    System.out.println ("\nThe latest first name is: " + max);
    
    
    String min1 = last [0]; // Finds last name that would be alphabetically first
    for (int i = 0 ; i < last.length ; i++) {
      if (min1.compareTo (last [i]) > 0)
        min1 = last [i];
    }
    System.out.println ("\nThe earliest last name is: " + min1);
    
    
    String max1 = last [0]; // Finds last name that would be alphabetically last
    for (int i = 0 ; i < last.length ; i++) {
      if (max1.compareTo (last [i]) < 0)
        max1 = last [i];
    }
    System.out.println ("\nThe latest first name is: " + max1);
    
    
    System.out.print ("\n");
    System.out.println ("Avatar starring....");
    for (int i = 0; i < first.length; i++) {
      System.out.print (first [i] + " " + last [i] + ", ");
      if ((i+1)%3 == 0)
        System.out.print ("\n");
    }
  }
}