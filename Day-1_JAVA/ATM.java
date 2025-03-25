import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the amount to withdraw: ");
            int amount = sc.nextInt();
            if (amount % 100 != 0)
            {
                System.out.println("Amount must be a multiple of 100");
                return;
            }
            int[] notes = {2000, 500, 100};
            int[] noteCount = new int[3];
            for (int i = 0; i < notes.length; i++)
            {
                noteCount[i] = amount / notes[i];
                amount %= notes[i];
            }
            System.out.println("Withdrawal Notes: ");
            for (int i = 0; i < notes.length; i++)
            {
                System.out.println(noteCount[i] + " x " + notes[i]);
            }
        } 
        finally 
        {
            sc.close();
        }
    }
}