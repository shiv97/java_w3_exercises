package pkgcase;

import java.util.Scanner;

public class Case 
{
    public static void main(String[] args) 
    {
       Scanner s=new Scanner(System.in);
      System.out.println("enter string:");
      String str1 = s.next();
      //String newstr = str1.replace('d', 'f');
      String newstr = str1.toLowerCase();
      System.out.println("Original string: " + str1);
      System.out.println("New String: " + newstr);
    }
    
}
