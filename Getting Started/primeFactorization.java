// Prime Factorization Of A Number
// 1. You are required to display the prime factorization of a number.
//     2. Take as input a number n.
//     3. Print all its prime factors from smallest to largest.
import java.util.Scanner;

public class primeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int div = 2; div*div <= n; div++) {
            while (n % div == 0) {
                n = n / div;
                System.out.print(div+" ");
            }

        }
     if (n !=1) {
        System.out.println(n);
     }
    }
}
