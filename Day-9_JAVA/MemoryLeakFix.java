import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

class MemoryLeakFix {
    private static List<WeakReference<Object>> leakList = new ArrayList<>();
    
    public static void createLeak() {
        for (int i = 0; i < 1000; i++) {
            leakList.add(new WeakReference<>(new byte[1024 * 1024]));
        }
    }
    
    public static void main(String[] args) {
        createLeak();
        System.gc();
        System.out.println("Memory cleaned");
    }
}