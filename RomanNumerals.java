public class RomanNumerals { //DONE
  public static void main (String args[])  {
    new RomanNumerals ();
  }
  
  public RomanNumerals () {
    
    char n1[] = {'I', 'I'}; //2
    char n2[] = {'I', 'X'}; //9
    char n3[] = {'V', 'I', 'I'}; //7
    char n4[] = {'C', 'X', 'I', 'I', 'I'}; //113
    char n5[] = {'L', 'I', 'V'}; //54
    char n6[] = {'X', 'X', 'X', 'V', 'I', 'I', 'I'}; //38
    char n7[] = {'X', 'C', 'I', 'X'}; //99
    char n8[] = {'D', 'C', 'L', 'X', 'X', 'V', 'I', 'I', 'I'}; //678
    
    convertIt(n1);
    convertIt(n2);
    convertIt(n3);
    convertIt(n4);
    convertIt(n5);
    convertIt(n6);
    convertIt(n7);
    convertIt(n8);
  }
  
  public void convertIt (char n[]) {
    int tot = 0;
    for (int i = 0 ; i < n.length ; i++) {
      if (n[i] == 'I')
        tot ++;
      else if (n[i] == 'V')
        tot = tot + 5;
      else if (n[i] == 'X')
        tot = tot + 10;
      else if (n[i] == 'L')
        tot = tot + 50;
      else if (n[i] == 'C')
        tot = tot + 100;
      else if (n[i] == 'D')
        tot = tot + 500;
      else if (n[i] == 'M')
        tot = tot + 1000;
      
      if (i!=(n.length-1)) {
        if (n[i] == 'I' && n[i+1] == 'V' || n[i] == 'I' && n[i+1] == 'X')
          tot = tot - 2;
        else if (n[i] == 'X' && n[i+1] == 'L' || n[i] == 'X' && n[i+1] == 'C')
          tot -= 20;
        else if (n[i] == 'C' && n[i+1] == 'D' || n[i] == 'C' && n[i+1] == 'M')
          tot -= 200;
      }
    } System.out.println(tot);
  }
}