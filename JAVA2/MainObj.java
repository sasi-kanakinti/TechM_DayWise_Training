interface MyInterface {
    void show();
}
 
public class MainObj {
    public static void main(String[] args) {
        MyInterface obj = () -> System.out.println("Hello, Lambda!");
        obj.show();
    }
}