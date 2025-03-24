import java.util.*;
public class set {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>(10);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.size();
        s.remove(3);
        s.contains(3); //false
        System.out.println(s);
        s.removeAll(Arrays.asList(2, 4));
        System.out.println(s);
        s.retainAll(Arrays.asList(1, 5));
        System.out.println(s);
        s.clear();
        System.out.println(s);
    }
}
