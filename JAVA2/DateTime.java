
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class DateTime {
    public static void main(String[] args) {
        LocalDate customDate = LocalDate.of(2024, 12, 25); // Christmas 2024
        LocalTime customTime = LocalTime.of(10, 30, 15);   // 10:30:15 AM
        LocalDateTime customDateTime = LocalDateTime.of(2024, 12, 25, 10, 30);
        System.out.println("Custom Date: " + customDate);
        System.out.println("Custom Time: " + customTime);
        System.out.println("Custom DateTime: " + customDateTime);
    }
    
}