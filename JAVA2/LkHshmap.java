import java.util.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
 
@SuppressWarnings("unused")
public class LkHshmap{
    public static void main(String[] args)
    {
       Map<Integer, String> m = new LinkedHashMap<>();
       m.put(101, "A");
       m.putIfAbsent(102, "B");
       System.out.println(m);
       m.get(102);
       m.keySet();
       m.values();
       m.entrySet();
       m.replace(101,"Amigos");
       System.out.println(m);
       m.remove(102);
       System.out.println(m);
       m.clear();
       System.out.println(m);
    }
}