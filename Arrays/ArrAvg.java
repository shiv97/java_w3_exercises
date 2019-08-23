package arravg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrAvg 
{
   public static void main(String a[])
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
      for(int i=0;i<size;i++)
      {
         sum=sum+myArray[i];
      }
      double avg=(sum/size);
      System.out.println("the average of the given array is:" +avg);
    }
}

   