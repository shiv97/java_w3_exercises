package strconcat;

import java.util.Scanner;

public class StrConcat 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string:");
        String str1 = s.next();
        System.out.println("enter the other string");
        String str2 = s.next();
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 
        String str3 = str1.concat(str2);
        System.out.println("The concatenated string: " + str3);
    }
    
}
