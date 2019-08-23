package sumavg;

import java.util.Scanner;

public class Sumavg
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter five numbers:");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        int n4=s.nextInt();
        int n5=s.nextInt();
        int sum=n1+n2+n3+n4+n5;
        System.out.println("the sum of 5 elements is:"+sum);
        double avg=(sum/5);
        System.out.println("the average of 5 elements is:"+avg);
    }
    
}
