public class PlantsZombies { //Done
  public static void main (String args[])  {
    new PlantsZombies ();
  }
  
  public PlantsZombies () {
    System.out.println ("Plants VS. Zombies");
    
    String plants [] = new String [19];
    plants [0] = "Sunflower";
    plants [1] = "Chomper";
    plants [2] = "Pea Shooter";
    for (int i = 3; i < plants.length; i++)
      plants[i] = "";
    int val = 3;
    
    int sunlight [] = new int [19];
    sunlight [0] = 50;
    sunlight [1] = 150;
    sunlight [2] = 100; 
    int val2 = 3;
    
    while (true) {
      System.out.println("");
      System.out.println("Menu:");
      System.out.println("  - Add (a)");
      System.out.println("  - Delete (b)");
      System.out.println("  - Average (c)");
      System.out.println("  - Quit (d)");
      char input = IBIO.inputChar ("Would you like to do?");
      
      if (input == 'a') {
        String plantname = IBIO.inputString ("\nEnter a new plant:");
        int plantsun = IBIO.inputInt ("Enter it's sunlight value:");
        plants [val] = plantname;
        val++;
        sunlight [val2] = plantsun;
        val2++;
        
        System.out.println("");
        System.out.println("Updated list of plants and their sunlight values");
        for (int i = 0; i < val; i++) {
          System.out.println(plants [i] + ": " + sunlight [i] + "  ");
        }
      } else if (input == 'b') {
        String plantremove = IBIO.inputString ("\nWhich plant would you like to delete? ");
        int pos = -1;
        int o;
        for (o = 0 ; o < plants.length ; o++) {
          if (plants[o].equalsIgnoreCase(plantremove))
            pos = o;
        }
        if (pos == -1)
          System.out.println ("The value is not in the array");
        else {
          System.out.println (plantremove + " has been removed from the array");
          val--;
          val2--;
          for (int i = pos ; i < val ; i++) {
            plants [i] = plants [i + 1];
            sunlight [i] = sunlight [i + 1];
          }
        }
      } else if (input == 'c') {
        int average = 0;
        for (int i = 0 ; i < sunlight.length ; i++) {
          average += sunlight [i];
        }
        int avgtot = average / sunlight.length;
        System.out.println("\nThe average sunlight value is " + avgtot);
      } else if (input == 'd') {
        break;
      } else {
        System.out.println("Sorry that is not valid input");
      }
    }
  }
}