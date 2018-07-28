public class CommonSense { //DONE
  public static void main (String args[])  {
    new CommonSense ();
  }
  public CommonSense () {
    System.out.println("Roman Numerals:");
    String romnum[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    for (int i = 0 ; i < romnum.length ; i++)
      System.out.print (romnum [i] + " ");
    System.out.println ("");
    System.out.println("");
    
    System.out.println("Fibonacci Sequence:");
    int fibsec[] = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
    for (int i = 0 ; i < fibsec.length ; i++)
      System.out.print (fibsec [i] + " ");
    System.out.println ("");
    System.out.println("");
    
    System.out.println("Rainbow Colours:");
    String rainb[] = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
    for (int i = 0 ; i < rainb.length ; i++)
      System.out.print (rainb [i] + " ");
    System.out.println ("");
    System.out.println("");
    
    System.out.println("Counting Words:");
    String countwrds[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
    for (int i = 0 ; i < countwrds.length ; i++)
      System.out.print (countwrds [i] + " ");
    System.out.println ("");
    System.out.println("");
    
    System.out.println("Head & Shoulders Words:");
    String headshoulders[] = {"Head", "Shoulders", "Kneees", "Toes", "Eyes", "Ears", "Mouth", "Nose"};
    for (int i = 0 ; i < headshoulders.length ; i++)
      System.out.print (headshoulders [i] + " ");
    System.out.println ("");
    System.out.println("");
    
    System.out.println("Period start times:");
    String periodtimes[] = {"8:15", "9:40", "10:59", "12:14", "1:33"};
    for (int i = 0 ; i < periodtimes.length ; i++)
      System.out.print (periodtimes [i] + " ");
    System.out.println ("");
    System.out.println("");
    
    System.out.println("Powers:");
    int pow[] = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
    for (int i = 0 ; i < pow.length ; i++)
      System.out.print (pow [i] + " ");
    System.out.println ("");
    System.out.println("");
    
    System.out.println("Start of Alphabet:");
    char alph[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
    for (int i = 0 ; i < alph.length ; i++)
      System.out.print (alph [i] + " ");
    System.out.println("");
  }
}