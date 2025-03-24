import java.util.*;
public class Ardeq {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.offer(2);
        d.addFirst(3);
        d.addLast(4);
        d.removeFirst();
        d.removeLast();
        d.offerFirst(10);
        d.offerLast(20);
        d.peekFirst();
        d.peekLast();
        d.pollFirst();
        d.pollLast();
    }
}
