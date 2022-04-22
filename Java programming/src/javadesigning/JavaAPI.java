package javadesigning;
import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;    
public class JavaAPI {
    public static void main(String[] args) {
    	Calendar myCalendar=Calendar.getInstance();
    	myCalendar.add(Calendar.DATE,100);
    	Date myDate=myCalendar.getTime();
    	DateFormat myDateFormat=DateFormat.getDateInstance(DateFormat.FULL);
    	String myString=myDateFormat.format(myDate);
    	System.out.println(myString);
    }
}
