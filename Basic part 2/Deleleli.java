package deleleli;
import java.util.List; 
import java.util.ArrayList; 
  
public class Deleleli 
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
        al.remove(1); 
        al.remove(1); 
        System.out.println("Modified ArrayList : " + al); 
    } 
}
