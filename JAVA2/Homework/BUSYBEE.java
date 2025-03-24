import java.util.*;
public class BUSYBEE
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        List<Pair> pairs = new ArrayList<>();
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                if((double)(a[i] + a[j]) / 2.0 >= k)
                    pairs.add(new Pair(a[i], a[j]));
        Collections.sort(pairs);
        for(Pair p : pairs)
            System.out.println("(" + p.x + ", " + p.y + ")");
    }
}

class Pair implements Comparable<Pair>
{
    int x, y;
    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int compareTo(Pair p)
    {
        if(x == p.x)
            return y - p.y;
        return x - p.x;
    }
}
