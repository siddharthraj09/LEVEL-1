
// 5
// *
//         *
//                 *
//                         *
//                                 *
import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        // int nst = ((2*n)-3)/2;
        // int nst =1;

        // int nsp = 0;
        // for (int i = 0; i < n; i++) {

        // for (int j = 0; j < nsp; j++) {
        // System.out.print("\t");

        // }
        // for (int k = 0; k < nst; k++) {
        // System.out.print("*\t");
        // }

        // System.out.println();

        // nsp=nsp+1;

        // }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }

    }
}