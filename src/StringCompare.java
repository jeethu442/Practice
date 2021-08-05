import java.util.Scanner;

public class StringCompare {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for(int i=1;i<s.length()-k+1;i++)
        {
            if(smallest.compareTo(s.substring(i,i+k))>0)
                smallest = s.substring(i,i+k);
            if(largest.compareTo(s.substring(i,i+k))<0)
                largest = s.substring(i,i+k);
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
    }





/*
Given a string,s , and an integer,k , complete the function so that it finds the lexicographically smallest and largest substrings of length k.

compareTo : if same, result 0
            if small, big result positive
            if big and small result negative
 */