import java.time.format.DateTimeFormatter;
import java.time.*;
 
public class MainTime {
    public static void main(String[] args) {
        ZonedDateTime dateTimeInIndia = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Date and time in India: " + dateTimeInIndia+" ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedTime = dateTimeInIndia.format(formatter);
        System.out.println("Formatted Time and Date: "+formattedTime);
    }
}