import java.util.*;
import java.util.stream.*;
 
public class Main110 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sai", "John", "Alex", "Sai", "Bob");
 
        List<String> result = names.stream()
            .filter(name -> name.length() > 3) // Only names with more than 3 letters --> John , Alex
            .distinct() // Remove duplicates  --> John , Alex
            .map(String::toUpperCase) // Convert to uppercase --> JOHN , ALEX
            .sorted() // Sort in natural order  --> ALEX , JOHN
            .peek(System.out::println) // Debugging: Print elements --> ALEX
                                                                     // JOHN
            .collect(Collectors.toList()); // Convert back to list
 
        System.out.println("Final result: " + result);
    }
}