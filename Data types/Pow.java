package pow;

import java.util.Scanner;

public class Pow 
{
    public static void main(String[] args) 
    {
        Scanner i = new Scanner(System.in);
        System.out.print("enter number: ");
        double n = i.nextDouble();
        System.out.println("Square:" +(n*n));
        System.out.println("Cube:" +(n * n * n));
        double N=n*n;
        System.out.println("Fourth power:"+(N*N));
    }
    
}
