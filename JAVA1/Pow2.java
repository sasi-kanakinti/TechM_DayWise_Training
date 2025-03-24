import java.util.*;
public class Pow2 {
     public static void main(String[]args)
    {
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     int c=Integer.bitCount(a);
     if(c==1){
        System.out.println("it is power of 2");
     }  
     else{
        System.out.println("not");
     }    
     s.close();
    }
}