import java.util.*;
import java.util.stream.*;
 
@SuppressWarnings("unused")
public class Main112 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        numbers.stream().map(n -> n + 10).forEach(System.out::println); // ->20 30 40 50 60
        long count = numbers.stream().count(); // Count elements -> 
        int sum = numbers.stream().reduce(0, Integer::sum); // Sum of elements
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0); // Check if all are even
 
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
 
        // ✅ Increment each element by 1 using forEach
       // numbers.stream().map(n -> n + 1).forEach(System.out::println);
 
        System.out.println("Are all even? " + allEven);
    }
}