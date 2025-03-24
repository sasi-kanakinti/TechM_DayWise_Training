import java.util.*;
public class Hshmap{
    public static void main(String[] args)
    {
       Map<Integer, String> m = new HashMap<>();
        m.put(101, "A");
        m.put(102, "B");
        m.put(103, "C");
        m.put(104, "D");
        System.out.println(m);
        System.out.println(m.get(102));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());
        m.remove(103);
        System.out.println(m);
    }
}