import java.security.PublicKey;
import java.util.Scanner;

public class StringOps{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.next();
        System.out.println("Upper case: " + text.toUpperCase());
        System.out.println("Lower case: " + text.toLowerCase());
        System.out.println("Replace: " + text.replace('e','t'));
        System.out.println("substring: "+text.substring(2,4));
        System.out.println("substring: " + text.substring(2));
        System.out.println("char at pos 1: "+text.charAt(1));
        System.out.println("Content equals check: "+text.contentEquals("jeethu"));
        System.out.println("compare: "+text.compareTo("jeethu"));
        System.out.println("compare: "+text.compareTo("Jeethu"));
        System.out.println("compare ignore case: "+text.compareToIgnoreCase("JEETHU"));
    }
}
