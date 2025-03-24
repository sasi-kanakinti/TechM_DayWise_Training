import java.util.*;
public class sorset{
    public static void main(String[] args)
    {
        SortedSet<Integer> s = new TreeSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        System.out.println("Sorted Set: " + s);
        s.remove(10);
       
        System.out.println(        s.size());
        System.out.println(        s.first()        );
        System.out.println( s.last());
        System.out.println();
    }
}