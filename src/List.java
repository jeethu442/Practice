import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args)
    {
        ArrayList<Integer> L = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++)
        {
         L.add(sc.nextInt());
        }
        int Q = sc.nextInt();
        for(int j=0;j<Q;j++)
        {
            String s = sc.next();
            if(s.equals("Insert"))
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                L.add(x,y);
            }
            else
            {
                L.remove(sc.nextInt());
            }
        }
        for(int i : L) {
            System.out.print(i + " ");
        }
    }
}
