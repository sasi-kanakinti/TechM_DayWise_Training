public class CmdPrompt
{
    public static void main(String[] args) {
        
        System.out.println("Hello world from Main method");
        // String nString =main("Bavana");
        System.out.println(main("AITS"));
        System.out.println("CLD Length: " + args.length);

        System.err.println("CLD - 0th position: " + args[0]);
        System.err.println("CLD - 1st position: " + args[1]);
        System.err.println("CLD - 2nd position: " + args[2]);
    }
    public static String main(String name){
 
        return "Hello " + name;
    }
}