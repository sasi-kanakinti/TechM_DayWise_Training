public class Control
{
    public static void main(String[] args) {
        int d=0;
        switch (d) {
            case 0:
                System.err.println("Sunday");
                break;
            case 1:
                System.err.println("Monday");
                break;
            case 2:
                System.err.println("Tuesday");
                break;
                case 3:
                System.err.println("Wednesday");
                break;
                case 4:
                System.err.println("Thursday");
                break;
                case 5:
                System.err.println("Friday");
                break;
            default:
                System.err.println("Saturday");
                break;
        }
    }
}