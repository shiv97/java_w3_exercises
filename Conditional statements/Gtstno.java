package gtstno;

import java.util.Scanner;

public class Gtstno 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter three numbers:");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        if (n1 > n2)
        if (n1 > n3)
           System.out.println("The greatest number is: " + n1);
        if ((n2 > n1)&&(n2 > n3))
           System.out.println("The greatest number is: " + n2);
        if ((n3 > n1)&&(n3 > n2))
           System.out.println("The greatest number is: " + n3);
    }
    
}
