package striind;
import java.util.Arrays;
import java.util.Scanner;
public class StriInd 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      String myArray = sc.next();
      System.out.println("string: "+myArray);
      int idx=myArray.charAt(0);
      int ix=myArray.charAt(3);
       System.out.println("The character at position 0 is " +(char)idx);
        System.out.println("The character at position 3 is " +(char)ix);
    }
    
}
