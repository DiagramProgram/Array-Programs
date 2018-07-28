public class ApartmentBuilding { //DONE
  public static void main (String args[])  {
    new ApartmentBuilding ();
  }
  
  public ApartmentBuilding () {
    int apart[] = {100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124};
    System.out.println ("Fire Alarm Testing - Every apartment");
    for (int i = 0 ; i < apart.length ; i++)
      System.out.println (apart [i] + " ");
    
    System.out.println ("");
    System.out.println ("Voter's List - Every apartment");
    for (int i = 0 ; i < apart.length ; i++) 
      System.out.print (apart [i] + " ");
    System.out.println("");
    
    System.out.println ("");
    System.out.println ("Light Replacement - Every second even numbered apartment");
    for (int i = 0 ; i < apart.length ; i+=2) 
      System.out.print (apart [i] + " ");
    
    System.out.println ("");
    System.out.println ("");
    System.out.println ("Fridge Replacement - Every third apartment");
    for (int i = 0 ; i < apart.length ; i+=3) 
      System.out.print (apart [i] + " ");
    
    System.out.println ("");
    System.out.println ("");
    System.out.println ("Carpet Cleaning - Every fouth apartment over 103");
    for (int i = 4 ; i < apart.length ; i+=4) 
      System.out.print (apart [i] + " ");
    
    System.out.println ("");
    System.out.println ("");
    System.out.println ("Air Conditioning Check - Every apartment over 115");
    for (int i = 16 ; i < apart.length ; i++) 
      System.out.print (apart [i] + " ");
  }
}