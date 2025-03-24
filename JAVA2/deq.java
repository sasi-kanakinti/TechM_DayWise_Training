import java.util.*;
import java.util.LinkedList;
public class deq {
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
            d.offer(1);
            d.offerFirst(2);
            d.offerLast(3);
            System.out.println(d);
            d.pollFirst();
            d.pollLast();
            d.peekFirst();
            d.peekLast();
    }
}
