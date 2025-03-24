// Generic Class with a Type Parameter <T>
class Box<T> {
    private T value;  // T can be any type
 
    public void setValue(T value) {
        this.value = value;
    }
 
    public T getValue() {
        return value;
    }
}
 
public class Generi {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();  // Works for Integer
        intBox.setValue(100);
        System.out.println(intBox.getValue()); // Output: 100
 
        Box<String> strBox = new Box<>();  // Works for String
        strBox.setValue("Hello Generics");
        System.out.println(strBox.getValue()); // Output: Hello Generics
    }
}