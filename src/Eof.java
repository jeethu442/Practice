import java.util.Scanner;

public class Eof {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line = 0;
        while(scan.hasNext())
        {
            System.out.println(++line+" "+scan.nextLine());
        }
    }
}











// For each line, print the line number, followed by a single space, and then the line content received as input.