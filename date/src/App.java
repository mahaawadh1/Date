import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) {

        Date now = new Date();
        System.out.println("Current date and time: " + now);

        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_MONTH, 5); // Adding 5 days

        Date futureDate = calendar.getTime();
        System.out.println("Date after 5 days: " + futureDate);

        Date date1 = new Date(); // 15th Feb 2023
        Date date2 = new Date(); // 20th Feb 2023

        boolean isBefore = date1.before(date2);
        System.out.println("Is date1 before date2? " + isBefore);

    }
}