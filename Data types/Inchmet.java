package inchmet;
import java.util.Scanner;
public class Inchmet 
{
    public static void main(String[] args) 
    {
        Scanner i = new Scanner(System.in);

        System.out.print("enter inch: ");
        double inch = i.nextDouble();
        double meters = inch * 0.025;
        System.out.println(inch + " inch is " + meters + " meters");
    }
    
}
