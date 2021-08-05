import java.util.Arrays;
import java.util.Collections;

public class abcd {

    public static void main(String args[]) {

        int[] arr = {0, 3, 0, 4, 5, 0};
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            if (arr[i]==0)
            {
               for(int j=i;j<len-1;j++)
               {
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }

            }
        }
/*for(int k=0;k<len;k++)
{
    System.out.println(arr[k]);
}
    }
}
 */
//0,3,0,4,5,0
