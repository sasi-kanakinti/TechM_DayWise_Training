import java.util.*;
public class proQu {
  public static void main(String[] args) {
    PriorityQueue<Integer> q = new PriorityQueue<>();
    q.offer(10);
    q.offer(20);
    q.offer(30);
    q.offer(40);
    q.poll();
    q.peek();
    System.out.println(q);
  }  
}
