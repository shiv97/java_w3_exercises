package negpos;

import java.util.Scanner;

public class NegPos 
{
    public static void main(String[] args) 
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number:");
    int t=s.nextInt();
    if(t>0)
    {
        System.out.println("it is a positive number");
    }
    else
    {
        System.out.println("negative number");
    }
    }
    
}
