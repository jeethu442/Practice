import java.util.Scanner;

public class StaticBlockAndVariable {

    static int B;
    static int H;
    static boolean flag = false;
    static{
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();

        if(B>0 && H>0)
        {
            flag = true;
        }
        else System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}
