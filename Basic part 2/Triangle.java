package triangle;

import java.util.Scanner;

public class Triangle 
{
    public static void main(String[] args) 
    {
  Scanner in = new Scanner(System.in);
  System.out.print("enter length of side 1: ");
  int s1 = in .nextInt();
  System.out.print("side2: ");
  int s2 = in .nextInt();
  System.out.print("side3: ");
  int s3 = in .nextInt();
  if(s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2)
     {
     System.out.println("the given sides form a triangle");
     }
  else
     {
      System.out.println("they do not form a triangle");
     }  
    }
}
