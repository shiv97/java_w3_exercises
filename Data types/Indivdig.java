package indivdig;

import java.util.Scanner;

public class Indivdig 
{
    public static void main(String[] args) 
    {
        Scanner i = new Scanner(System.in);
        System.out.print("enter number:");
        int m=i.nextInt();
        System.out.println("reverse of this number:");
        while(m>0)
        {
            int n=m%10;
            System.out.print(" "+n);
            m=m/10;
        }
    }
}
