package pell_no;
public class Pell_no 
{
    public static void main(String[] args) 
    {
    int n,pred=1,suc=0,pell;
    System.out.println("First 20 Pell numbers: ");
    for(n=1; n<=20; n++)
     {
      pell= pred + 2*suc;
      System.out.print(pell+" ");
      pred = suc;
      suc = pell;
    }
    }
}
