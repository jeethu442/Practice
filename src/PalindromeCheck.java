public class PalindromeCheck {
    public static void main(String[] args){
        String s = "abcbba";
        char[] c = s.toCharArray();
        int l = c.length;
        int e = c.length-1;
        for(int i=0;i<=l/2;i++){
            if(c[i]!=c[e]){
                System.out.println("No");
                break;
            }
            e--;
        }
    }
}
