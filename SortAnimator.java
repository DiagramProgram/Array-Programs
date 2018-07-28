import java.awt.*; //DONE
import java.applet.*;
public class SortAnimator extends Applet {
  Button select, bubble, insert, shaker;
  int size = 10;
  int a[] = {5, 12, 52, 84, 9, 35, 63, 26, 19, 93, 44, 14, 10, 16, 72, 44, 7, 48, 73, 56};
  Button reset;
  
  public void init () {
    select = new Button ("selection sort");
    add (select);
    bubble = new Button ("bubble sort");
    add (bubble);
    insert = new Button ("insertion sort");
    add (insert);
    shaker = new Button ("shakersort");
    add (shaker);
    reset = new Button ("Reset array");
    add (reset);
  }
  
  public boolean action (Event e, Object o) {
    if (e.target == select) {
      selectsort (a);
    }
    else if (e.target == bubble) {
      bubblesort (a);
    }
    else if (e.target == insert) {
      insertsort (a);
    }
    else if (e.target == shaker) {
      shakersort (a);
    }
    else if (e.target == reset) {
      reset(a);
    }
    return true;
  }
  
  public void printarray (int a[]) {
    Graphics g = getGraphics();
    g.setColor(Color.white);
    g.fillRect(1, 1, 600, 600);
    int y = 50;
    for (int i = 0; i < a.length; i++) {
      g.setColor (new Color (100 + a[i], 15, 50 + (2*a[i])));
      g.fillRect(50, y, a[i], 10);
      y = y+12;
    }
  }
  
  public void reset(int a[]) {
    a[0]=5;
    a[1]=12;
    a[2]=52;
    a[3]=84;
    a[4]=9;
    a[5]=35;
    a[6]=63;
    a[7]=26;
    a[8]=19;
    a[9]=93;
    a[10]=44;
    a[11]=14;
    a[12]=10;
    a[13]=16;
    a[14]=72;
    a[15]=44;
    a[16]=7;
    a[17]=48;
    a[18]=73;
    a[19]=56;
    printarray(a);
  }
  
  public void insertsort(int a[]) {
    int n = a.length;
    for (int i=1; i<n; ++i) {
      int key = a[i];
      int j = i-1;
      while (j>=0 && a[j] > key) {
        a[j+1] = a[j];
        j = j-1;
      }
      a[j+1] = key;
      try {
        Thread.sleep (50);
      }
      catch (InterruptedException m) {
        ;
      }
      printarray(a);
    }
  }
  
  public void shakersort(int a[]) {
    for (int i = 0; i < a.length/2; i++) {
      boolean swapped = false;
      for (int j = i; j < a.length - i - 1; j++) {
        if (a[j] > a[j+1]) {////////
          int tmp = a[j];
          a[j] = a[j+1];
          a[j+1] = tmp;
          swapped = true;
        }
      }
      for (int j = a.length - 2 - i; j > i; j--) {
        if (a[j] < a[j-1]) {//////////////
          int tmp = a[j];
          a[j] = a[j-1];
          a[j-1] = tmp;
          swapped = true;
        }
      }
      if(!swapped) break;
      try {
        Thread.sleep (150);
      }
      catch (InterruptedException m) {
        ;
      }
      printarray(a);
    }
  }
  
  public void selectsort (int a[]) {
    for (int left = a.length - 1; left > 0 ; left--) { //SELECTION SORT
      int max = 0;
      for (int i = 1 ; i <= left ; i++) {
        if (a [max] < a [i])
          max = i;
        try {
          Thread.sleep (15);
        }
        catch (InterruptedException m) {
          ;
        }
        printarray(a);
      }
      int temp = a [max];
      a [max] = a [left];
      a [left] = temp;
    }
  }
  
  public void bubblesort (int a[]) {
    for (int i = 0 ; i < a.length - 1 ; i++) { //BUBBLE SORT
      for (int j = 0 ; j < a.length - 1 - i ; j++) {
        if (a [j + 1] < a [j]) {
          int temp = a [j];
          a [j] = a [j + 1];
          a [j + 1] = temp;
        }
        try {
          Thread.sleep (15);
        }
        catch (InterruptedException m) {
          ;
        }
        printarray(a);
      }
    }
  }
  
  public void paint (Graphics g) {
    printarray(a);
  }
}