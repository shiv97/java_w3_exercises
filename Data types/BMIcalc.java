package bmicalc;

import java.util.Scanner;

public class BMIcalc 
{
    public static void main(String[] args) 
    {
    Scanner i = new Scanner(System.in);

        System.out.print("enter weight(kg): ");
        double weight = i.nextDouble();

        System.out.print("enter height(cms): ");
        double height = i.nextDouble();
        double x=weight/height;
        double y=x/height;
        double bmi=y*1000;
       // double BMI = ((weight/(height)/height )*10,000);
        System.out.print("Body Mass Index is " +bmi);
    }
    
}
