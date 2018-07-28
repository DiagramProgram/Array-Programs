public class HoneyBees { //DONE
  public static void main (String args[])  {
    new HoneyBees ();
  }
  
  public HoneyBees () {
    int bees[] = {95, 92, 93, 95, 92, 100, 89, 83, 88, 89, 88, 89, 87, 95, 95, 92, 101, 78, 79, 82, 83, 95, 88, 90, 91, 89, 85, 82, 81, 94, 94, 95, 96, 97, 98, 95, 98, 103, 95, 91, 96, 93, 82, 95, 88, 89, 90};
    System.out.println("There are " + bees.length + " bees"); //Number of Bees
    
    System.out.println ("");
    int min = bees [0];
    for (int i = 1 ; i < bees.length ; i++)
    {
      if (bees [i] < min)
        min = bees [i];
    }
    System.out.println ("The minimum weight is " + min); //Minimum weight
    
    System.out.println ("");
    int max = bees [0];
    for (int i = 1 ; i < bees.length ; i++)
    {
      if (bees [i] > max)
        max = bees [i];
    }
    System.out.println ("The maximum weight is " + max); //Maximum weight
    
    System.out.println ("");
    int av = 0;
    for (int i = 0 ; i < bees.length ; i++) {
      av += bees [i];
    }
    System.out.println ("The average is " + (av / bees.length)); //Average weight
    
    System.out.println ("");
    int ov95 = 0;
    for (int i = 0 ; i < bees.length ; i++) {
      if (bees [i] > 95)
        ov95++;
    }
    System.out.print ("There are " + ov95 + " bees over the weight of 95");//number of bees with wight over 95
    
    System.out.println ("");
    System.out.println ("");
    int undravg = 0;
    for (int i = 0 ; i < bees.length ; i++) {
      if (bees [i] < av)
        undravg++;
    }
    System.out.print ("There are " + undravg + " bees under average weight");//number of bees with wight under average weight
    
    
    System.out.println ("");
    System.out.println ("");
    for (int i = 0 ; i < bees.length ; i++) {
      System.out.print (bees [i] + " ");
    } //Prints them out horizontally
    
    
    System.out.println (" ");
    System.out.println (" ");
    for (int i = bees.length-1 ; i >= 0 ; i--) {
      System.out.print (bees [i] + " ");
    } //Prints them out backwards horizontally
    
    
    System.out.println (" ");
    System.out.println (" ");
    for (int i = 0 ; i < bees.length ; i+=2) 
      System.out.print (bees [i] + " "); //Prints every second horizontally
    
    System.out.println (" ");
    System.out.println (" ");
    for (int i = 0 ; i < bees.length ; i++) {
      if (bees [i] > 95)
        System.out.print (bees [i] + " ");
    }//Prints weight over 95
  }
}