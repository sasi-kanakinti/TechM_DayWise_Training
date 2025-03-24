interface Greeting {
    void sayHello(String name);
}
 
public class Main10  {
    public static void main(String[] args) {
        Greeting greet = (name) -> {
            System.out.println("Hello, " + name + "!");
            System.out.println("Welcome to Java 8 Lambdas!");
        };
        greet.sayHello("Sai Chaitanya");
    }
}