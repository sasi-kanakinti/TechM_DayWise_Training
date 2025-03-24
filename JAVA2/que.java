import java.util.*;
import java.util.LinkedList;
public class que {
    public static void main(String[] args) {
        @SuppressWarnings({ "rawtypes", "unchecked" })
        Queue<Integer> q = new LinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.element());
        q.remove();
        System.out.println(q.element());
        System.out.println(q.contains(3));
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}
