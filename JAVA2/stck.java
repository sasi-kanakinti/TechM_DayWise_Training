import java.util.*;
public class stck{
        public static void main(String args[]){
        @SuppressWarnings({ "unchecked", "rawtypes" })
        Stack<Integer> lis = new Stack();
        lis.add(1);
        lis.add(2);
        lis.add(3);
        lis.add(4);
        lis.add(5);
        lis.pop();
        System.out.println(lis);
        lis.size();
        System.out.println(lis.elementAt(0));
        lis.remove(0);
        lis.elementAt(1);
        lis.indexOf(4);//3
        System.out.println(lis.contains(3));
        System.out.println(lis.search(2));
       
      
    }
}
 