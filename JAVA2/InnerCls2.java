
class Outer {
 
    private String message = "Hello from Outer Class";
 
    void outerMethod() {
 
        System.out.println("Inside outerMethod");
 
        class Inner {

            void innerMethod() {
                System.out.println("Inside innerMethod");
                System.out.println("Outer class message: " + message);
            }
        } 

        Inner y = new Inner();
 
        y.innerMethod();
    }
}
 

public class InnerCls2 {
    public static void main(String[] args) {
 
        Outer x = new Outer();
        x.outerMethod();
    }
}