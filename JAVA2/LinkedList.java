// import java.util.*;
 
public class LinkedList 
{
    public static void main(String args[])
    {
        java.util.LinkedList<String> ll = new java.util.LinkedList<String>();
         ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
 
        System.out.println(ll);
 
        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
 
        System.out.println(ll);
    }
}