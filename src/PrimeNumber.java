import java.math.*;
import java.util.*;

    public class PrimeNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            BigInteger in = scanner.nextBigInteger();
            scanner.close();
            if(in.isProbablePrime(50))
            {
                System.out.println("prime");
            }
            else
            {
                System.out.println("not prime");
            }

            scanner.close();
        }
    }
