public class Sorting { //DONE
  public static void main (String args[])  {
    new Sorting ();
  }
  
  public Sorting () {
    int num[] = {16, 1, 516, 2048, 2, 64, 128, 256, 1024, 32, 4, 8}; //.length is 12 --> 1 2 3 4 5 6 7 8 9 10 11 12
    
    for (int i = 0 ; i < num.length ; i++)
      System.out.print (num [i] + " ");
    
    for (int left = num.length; left > 0 ; left--) {
      int max = 0;
      for (int i = 1 ; i < left ; i++) {
        if (num [max] < num [i])
          max = i;
      }
      int temp = num [max];
      num [max] = num [left - 1];
      num [left - 1] = temp;
    }
    
    System.out.println("");
    for (int i = 0 ; i < num.length ; i++)
      System.out.print (num [i] + " ");
    
    
    System.out.println("");
    System.out.println("");
    String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    
    for (int i = 0 ; i < months.length ; i++)
      System.out.print (months [i] + " ");
    
    System.out.println("");
    int n = months.length;
    for (int i = 0 ; i < n - 1 ; i++) {
      for (int j = 0 ; j < n - 1 - i ; j++) {
        if (months[j + 1].compareTo(months[j]) < 0) {
          String temp = months [j];
          months [j] = months [j + 1];
          months [j + 1] = temp;
        }
      }
    }
    for (int i = 0 ; i < months.length ; i++)
      System.out.print (months [i] + " ");
    System.out.println("");
    
    System.out.println("");
    char letters[]={'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
    
    for (int i = 0 ; i < letters.length ; i++)
      System.out.print (letters [i] + " ");
    
    for (int left = letters.length; left > 0 ; left--) {
      int max = 0;
      for (int i = 1 ; i < left ; i++) {
        if (letters [max] < letters [i])
          max = i;
      }
      char temp = letters [max];
      letters [max] = letters [left - 1];
      letters [left - 1] = temp;
    }
    System.out.println("");
    for (int i = 0 ; i < letters.length ; i++)
      System.out.print (letters [i] + " ");
    
    
    
    
    
    System.out.println("");
    double moreNums[] ={3.45, 6.54, 7.89, 9.87, 2.34, 1.23, 5.78, 4.32, 6.45, 8.96, 9.07, 3.67, 0.34, 1.46, 1.47}; 
    
    System.out.println("");
    for (int i = 0 ; i < moreNums.length ; i++)
      System.out.print (moreNums [i] + " ");
    
    n = moreNums.length;
    for (int i = 0 ; i < n - 1 ; i++) {
      for (int j = 0 ; j < n - 1 - i ; j++) {
        if (moreNums[j + 1] < (moreNums[j])) {
          Double temp = moreNums [j];
          moreNums [j] = moreNums [j + 1];
          moreNums [j + 1] = temp;
        }
      }
    }
    System.out.println("");
    for (int i = 0 ; i < moreNums.length ; i++)
      System.out.print (moreNums [i] + " ");
    
    
    
    
    System.out.println("");
    String names []={"Sunflower", "Peashooter", "Cherry Bomb", "Wall-nut", "Potato Mine", "Snow Pea", "Chomper", "Repeater", "Puff-Shroom", "Lily-Pad", "Squash", "Threepeater", "Tangle Kelp", "Jalapeno"};
    int sun[] = {50, 100, 150, 50, 25, 175, 150, 200, 0, 25, 50, 325, 25, 125};
    
    
    for (int left = names.length; left > 0 ; left--) {
     int max = 0;
     for (int i = 1 ; i < left ; i++) {
     if (names[max].compareTo(names [i]) < 0)
     max = i;
     }
     String temp = names [max];
     names [max] = names [left - 1];
     names [left - 1] = temp;
     
     int tempp = sun [max];
     sun [max] = sun [left - 1];
     sun [left - 1] = tempp;
     }
    System.out.println("");
    for (int i = 0 ; i < names.length ; i++)
      System.out.print (names [i] + ", ");
    System.out.println("");
    for (int i = 0 ; i < sun.length ; i++)
      System.out.print (sun [i] + " ");
    
    
    System.out.println("");
    
    
    for (int left = sun.length; left > 0 ; left--) {
      int max = 0;
      for (int i = 1 ; i < left ; i++) {
        if (sun [max] < sun [i])
          max = i;
      }
      int temp = sun [max];
      sun [max] = sun [left - 1];
      sun [left - 1] = temp;
      
      String temp1 = names [max];
      names [max] = names [left - 1];
      names [left - 1] = temp1;
    }
    
    System.out.println("");
    
    for (int i = 0 ; i < sun.length ; i++)
      System.out.print (sun [i] + " ");
    System.out.println("");
    for (int i = 0 ; i < names.length ; i++)
      System.out.print (names [i] + ", ");
    
  }
}