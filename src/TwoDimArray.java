import java.util.Scanner;

public class TwoDimArray {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        Scanner scan = new Scanner(System.in);
        for (int k = 0; k < 6; k++) {
            for (int l = 0; l < 6; l++) {
                arr[k][l] = scan.nextInt();
            }
        }
        int sum = -1000000;
        int s;
        scanner.close();
        for(int i =0;i<=3;i++)
        {
            for(int j=0;j<=3;j++)
            {
                s = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(s>sum) sum = s;
            }
        }
        System.out.println(sum);
    }
}




//print the hourglass with largest sum of 6*6 array