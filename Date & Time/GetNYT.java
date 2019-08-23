package getnyt;

import java.util.Calendar;
import java.util.TimeZone;

public class GetNYT 
{
    public static void main(String[] args) 
    {
        Calendar clNYk = Calendar.getInstance();
        clNYk.setTimeZone(TimeZone.getTimeZone("America/New_York"));
	System.out.println(); 
        System.out.println(clNYk.getTime());
    }
    
}
