package nprint;

import java.util.Scanner;
//basic part 1- ex no. 44
 class Nprint
{
    public static void main(String[] args)
    {
	    Scanner myob=new Scanner(System.in);
	    int n= myob.nextInt();
	    for(int i=0;i<n;i++)
        {
            int j=i;
            while(j<n)
            {
            System.out.print(n);
            j=j+1;
            }
            System.out.print("+");
        }
    }
}
