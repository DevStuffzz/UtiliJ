import utilij.time.Date;
import utilij.time.DateFormat;
import utilij.time.Month;

public class UtiliJDocumentation {
    public static void main(String[] args)  {
        
        //Create a date that holds a month, day, and year
        // There is a method of telling if the day you put is too much for the month
        Date date = new Date(Month.January, 4, 2015);;
        
        
        // Create a Date Format (DD/MM/YY, MM/DD/YY)
        DateFormat format = new DateFormat();
        
        // Takes your Date Format and prints your date using your Date Format
        date.printDate(format);
    }
}
