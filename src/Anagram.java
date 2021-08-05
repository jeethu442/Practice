import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
        static boolean isAnagram(String a, String b) {
            // Complete the function
            char[] achar = a.toUpperCase().toCharArray();
            char[] bchar = b.toUpperCase().toCharArray();
            Arrays.sort(achar);
            Arrays.sort(bchar);
            for(int i=0;i<a.length();i++)
            {
                if (achar[i]!=bchar[i])
                    return false;
            }
            return true;
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }
