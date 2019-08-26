package palindromeno;

import java.util.Scanner;

public class Palindromeno 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        int sum = 0;
        int check=n;
        while(n>0)
	   {    
             r = n % 10;   
             sum = (sum*10)+r;    
             n = n/10;    
           }   //end while
        if(check==sum)
        {
            System.out.println("is a palindrome no.");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
    
}
