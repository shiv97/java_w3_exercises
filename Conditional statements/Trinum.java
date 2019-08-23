package trinum;

import java.util.Scanner;

public class Trinum 
{
    public static void main(String[] args) 
    {
    Scanner s=new Scanner(System.in);
    System.out.println("wntr number");
    int n=s.nextInt();
    for(int i=0;i<=n;i++)
    {
        int j=0;
        while(j<i)
        {
        System.out.print(j);
        j++;
        }
        System.out.println();
    }
    }
    
}
