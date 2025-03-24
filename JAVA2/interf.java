interface A {
    void show();
}
 
interface B {
    void show();
}
 
class C implements A, B { // ✅ No conflict, C must override show()
    public void show() {
        System.out.println("Class C resolves the conflict.");
    }
}
 
public class interf {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}