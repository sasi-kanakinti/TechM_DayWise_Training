import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Original DateTime: " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDate);
    }
}