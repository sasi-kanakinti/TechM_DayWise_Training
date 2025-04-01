import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

class MemoryLeak {
    private static List<Object> leakList = new ArrayList<>();

    public static void createLeak() {
        for (int i = 0; i < 10000; i++) {
            leakList.add(new byte[1024 * 1024]);
        }
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Initial Free Memory: " + runtime.freeMemory());
        createLeak();
        System.out.println("After Leak Free Memory: " + runtime.freeMemory());

        WeakReference<List<Object>> weakRef = new WeakReference<>(leakList);
        leakList = null; 
        System.gc();

        if (weakRef.get() == null) {
            System.out.println("leakList has been garbage collected.");
        } else {
            System.out.println("leakList is still in memory.");
        }

        System.out.println("After GC Free Memory: " + runtime.freeMemory());
    }
}
