import java.util.Scanner;

public class loop2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s=a;
            for(int j=0;j<n;j++)
            {

                s = s+(int)Math.pow(2,j)*b;
                System.out.print(s+" ");
            }
            System.out.println();
        }
        in.close();
    }
}


/*
Sample Input

2 //no of entries
0 2 10 //a b n
5 3 5

Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

series: (a+2^0*b), (a+2^0*b + 2^1*b), (a+2^0*b + 2^1*b+ ...2^(n-1)*b)
 */