package perfcube;

import java.util.Scanner;

public class Perfcube 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        for(int i=2;i<=(n/2);i++)
        {
            if(n%i==0)
            {
                if((i*i*i)==n)
                f=1;
            }
        }
        if(f==1)
            System.out.println("Perfect Cube");
        else
            System.out.println("Not A perfect cube");
       
    }
}
