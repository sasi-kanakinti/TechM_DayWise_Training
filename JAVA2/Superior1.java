import java.util.Scanner;

public class Superior1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            boolean leader=true;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    leader=false;
                    break;
                }
            }
            if(leader)
                {
                    System.out.print(arr[i]+" ");
                }
        }
        sc.close();
    }
}



// Time complexity: O(n^2)
// Space complexity: O(1)