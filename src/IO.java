import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = new String[3];
        for(int i=0;i<3;i++)
        {
           s[i] = br.readLine();
        }
        System.out.println("String :"+s[2]);
        System.out.println("Double :"+Double.parseDouble(s[1]));
        System.out.println("Integer :"+Integer.parseInt(s[0]));

    }
}


/* Sample Input

42
3.1415
Welcome to HackerRank's Java tutorials!

Sample Output

String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42

 */