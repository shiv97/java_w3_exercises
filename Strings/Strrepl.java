package strrepl;

import java.util.Scanner;

public class Strrepl 
{
    public static void main(String[] args) 
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter string:");
      String str1 = s.next();
      String newstr = str1.replace('d', 'f');
      System.out.println("Original string: " + str1);
      System.out.println("New String: " + newstr);

    }
    
}
