package arrcont;

import java.util.Arrays;
import java.util.Scanner;

public class ArrCont 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array :: ");
      int size = sc.nextInt();
      int myArray[] = new int[size];
      System.out.println("Enter elements of the array :: ");
      for(int i=0; i<size; i++) 
      {
         myArray[i] = sc.nextInt();
      }
      int sum=0;
      System.out.print(Arrays.toString(myArray));
      System.out.println();
      System.out.println("enter element to be searched:");
      int srch=sc.nextInt();
      int present=0;
      for(int i=0;i<size;i++)
      {
          if(srch==myArray[i])
          {
              System.out.println("element present in array at index:"+i);
              present=1;
          }
      }
      if(present!=1)
      {
          System.out.println("element not present in array");
      }
    }
    
}
/*
for (int n : arr) {
         if (item == n) {
            return true;
         }
      }
*/