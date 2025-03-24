import java.util.*;
public class map{
    public static void main(String[] args)
    {
       Map<Integer,String> m =new TreeMap<>();
        m.put(101, "Apple");
        m.put(103, "Banana");
        m.put(102, "Mango");
        m.put(101, "Orange");
        System.out.println("Map: " + m);
        m.remove(101);
        System.out.println("Updated Map: " + m);
        System.out.println(m.get(102));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());
        System.out.println(m.size());
    }
}