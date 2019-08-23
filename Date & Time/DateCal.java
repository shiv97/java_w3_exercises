package datecal;
import java.util.Calendar;
public class DateCal 
{
    public static void main(String[] args) 
    {
     int year = 2019;
     int month = 10;
     int date = 17;
     Calendar cl = Calendar.getInstance();
     cl.clear();
     System.out.println();
     cl.set(Calendar.YEAR, year);
     cl.set(Calendar.MONTH, month);
     cl.set(Calendar.DATE, date);
     System.out.println(cl.getTime());
     System.out.println();	
    }    
}
