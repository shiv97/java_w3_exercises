package overflw;

import java.util.Scanner;

public class Overflw 
{
    public static void main(String[] args) 
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter 2 numbers");
      int s1=s.nextInt();
      int s2=s.nextInt();
      if((s1>80)||(s2>80))
      {
          System.out.println("Overflow");
      }
      else
      {
          int s3=s2+s1;
          System.out.println("sum="+s3);
      }
    }
    
}
