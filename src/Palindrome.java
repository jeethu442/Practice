import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean flag = true;
        for(int i=0;i<(A.length()/2);i++)
        {
            if(A.charAt(i) != A.charAt((A.length()-1)-i))
            {
                flag = false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}



/*
check palindrome or not and print yes/no
 */