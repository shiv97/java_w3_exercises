package swapeleli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Swapeleli 
{
   
    public static void main(String[] args) 
    {
      
        List<Integer> al = new ArrayList<>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(1); 
        al.add(2); 
        System.out.println("list before modification"+al);
        Collections.swap(al, 0, 2);
        System.out.println("Modified ArrayList : " + al); 
    } 
}

    

