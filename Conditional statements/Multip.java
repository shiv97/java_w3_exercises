package multip;

import java.util.Scanner;

public class Multip 
{
    public static void main(String[] args) 
    {
    int j,n;
   System.out.print("Input the number(Table to be calculated): ");
    System.out.print("Input number of terms : ");
    Scanner i = new Scanner(System.in);
    n = i.nextInt();
    j=i.nextInt();
    System.out.println ("\n");
    for(j=1;j<=(n+1);j++)
    {    
     System.out.println(n+" X "+j+" = " +n*j);
    }
   }
}
    
