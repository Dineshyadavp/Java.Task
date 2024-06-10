import java.util.*;
public class Calendar {
    public static void main(String[] args)
    {
     int year = 2024;
     int month = 4; 
     int date = 10;

     Calendar cal = Calendar.getInstance();
     cal.clear();
     System.out.println();
     cal.set(Calendar.YEAR, year);
     cal.set(Calendar.MONTH, month);
     cal.set(Calendar.DATE, date);

     System.out.println(cal.getTime());
     System.out.println();
	 }
}
