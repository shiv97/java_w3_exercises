package celfar;

import java.util.Scanner;

public class CelFar 
{
    public static void main(String[] args) 
    {
    Scanner i = new Scanner(System.in);
        System.out.print("enter Fahrenheit: ");
        double fahrenheit = i.nextDouble();
        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
    
}
