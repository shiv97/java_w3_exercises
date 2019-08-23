package stringlent;

import java.util.Scanner;

public class StringLent 
{
    public static void main(String[] args) 
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter string:");
      String str1 = s.next();  
      int len = str1.length();
      System.out.println("The string length of '"+str1+"' is: "+len);
    }
    
}
