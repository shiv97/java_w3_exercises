package rangeprin;

import java.util.Scanner;

public class Rangeprin 
{
    public static void main(String[] args) 
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter 2 numbers to print range:");
    int ini=s.nextInt();
    int fin=s.nextInt();
    for(int i=ini;i<=fin;i++)
    {
        System.out.print(" "+i);
    }
    }
    
}
