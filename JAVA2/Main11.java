interface Functional {
    int operation(int a, int b);
}
 
public class Main11 {
 
    public static void main(String[] args) {
        // Using lambda expressions to define the operations
        Functional add = (a, b) -> a + b;
        Functional multiply = (a, b) -> a * b;
 
        // Using the operations
        System.out.println(add.operation(6, 3));  // Output: 9
        System.out.println(multiply.operation(4, 5));  // Output: 20
    }
}