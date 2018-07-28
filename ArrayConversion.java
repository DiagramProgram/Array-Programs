public class ArrayConversion { //DONE
  public static void main (String args[]) {
    new ArrayConversion ();
  }
  
  public ArrayConversion () {
    String array[] = {"Apple", "Peach", "Banana", "Grape", "Strawberry", "Mango", "Pear",};
    System.out.println ("Printing out the array");
    for (int i = 0 ; i < array.length ; i++)
      System.out.print (array [i] + " ");
    
    System.out.println ();
    System.out.println ("The Minimum");
    String min = array [0];
    for (int i = 0 ; i < array.length ; i++) {
      if (min.compareTo (array [i]) > 0)
        min = array [i];
    }
    System.out.println ("The minimum value is " + min);
    
    System.out.println ();
    System.out.println ("The Maximum");
    String max = array [0];
    for (int i = 0 ; i < array.length ; i++) {
      if (max.compareTo (array [i]) > 0)
        max = array [i];
    }
    System.out.println ("The maximum value is " + max);
    
    
    System.out.println ();
    System.out.println ("The Sum");
    String s = "";
    for (int i = 0 ; i < array.length ; i++) {
      s += array [i];
    }
    System.out.println ("The sum is " + s);
    
    
    System.out.println ();
    System.out.println ("Linear Search");
    String findMe = IBIO.inputString ("What do you want to find in the array? ");
    int pos = -1;
    for (int i = 0 ; i < array.length ; i++) {
      if (array [i].equalsIgnoreCase (findMe))
        pos = i;
    }
    if (pos == -1)
      System.out.println ("The value is not in the array");
    else
      System.out.println ("The value is at position " + pos);
  }
} 