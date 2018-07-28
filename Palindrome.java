public class Palindrome { //DONE
  public static void main (String args[])  {
    new Palindrome ();
  }
  
  public Palindrome () {
    char a1[] = {'R', 'A', 'D', 'A', 'R'};
    char a2[] = {'A', 'M', 'A', 'N', 'A', 'P', 'L', 'A', 'N', 'A', 'C', 'A', 'N', 'A', 'L', 'P', 'A', 'N', 'A', 'M', 'A'}; // A man, a plan, a canal: Panama
    char a3[] = {'H', 'A', 'N', 'N', 'A', 'H'};
    char a4[]={'C','A','T','A'};
    char a5[]={'A','B','C','A'};
    char a6[]={'A'};
    
    checkIt (a1);
    checkIt (a2);
    checkIt (a3);
    checkIt (a4);
    checkIt (a5);
    checkIt (a6);
  }
  
  public void checkIt(char a[]) {
    int first = 0;
    int last = a.length-1;
    int middle = (first + last)/2;
    int j;
    
    for (j = first; j <= middle; j++) {
      if (a [first] == a [last]) {
        first++;
        last--;
      }
      else {
        System.out.println ("False");
      break;
      }
    }
    if (j == middle + 1)
      System.out.println ("True");
  }
}


/*
   *public void checkIt(char a[]) {
    int first = 0;
    int last = a.length-1;
    int middle = (first + last)/2;
    int j;
    
    for (j = first; j <= middle; j++) {
      if (a [first] == a [last]) {
        first++;
        last--;
      }
      else 
        break;
    }
    if (j == middle + 1)
      System.out.println ("True");
    else 
      System.out.println ("False");
  } 
   */