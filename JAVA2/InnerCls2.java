// Outer class
class Outer {
 
    // Instance variable of Outer class
    private String message = "Hello from Outer Class";
 
    // Method inside outer class
    void outerMethod() {
 
        // Print statement
        System.out.println("Inside outerMethod");
 
        // Local Inner Class (declared inside method)
        class Inner {
 
            // Method defined inside inner class
            void innerMethod() {
                // Accessing Outer class variable
                System.out.println("Inside innerMethod");
                System.out.println("Outer class message: " + message);
            }
        }
 
        // Creating object of inner class
        Inner y = new Inner();
 
        // Calling inner class method
        y.innerMethod();
    }
}
 
// Main class
public class InnerCls2 {
    public static void main(String[] args) {
 
        // Creating object of outer class
        Outer x = new Outer();
 
        // Calling outer class method, which in turn calls inner class method
        x.outerMethod();
    }
}