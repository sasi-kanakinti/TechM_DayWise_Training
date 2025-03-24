import java.time.LocalDate;

public class LocalDateExample {
    // Main method to demonstrate LocalDate usage
    public static void main(String[] args) {
        LocalDate today = java.time.LocalDate.now();
        System.out.println("Today: " + today);
        LocalDate nextWeek = today.plusWeeks(1);  // Add 1 week
        System.out.println("Next Week: " + nextWeek);
        LocalDate previousMonth = today.minusMonths(1);  // Subtract 1 month
        System.out.println("Today: " + today);
        System.out.println("Previous Month: " + previousMonth);
    }
}