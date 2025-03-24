import java.util.*;
import java.util.stream.*;
 
public class StreamShortCircuitExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sai", "John", "Alex", "Bob");
 
        Optional<String> firstName = names.stream().findFirst(); // Get first element
        boolean hasShortName = names.stream().anyMatch(name -> name.length() < 3); // Check if any name has < 3 letters
 
        List<String> limitedNames = names.stream()
                                         .limit(2) // Take only first 2 elements
                                         .collect(Collectors.toList());
 
        System.out.println("First Name: " + firstName.orElse("Not Found"));
        System.out.println("Has Short Name? " + hasShortName);
        System.out.println("Limited Names: " + limitedNames);
    }
}