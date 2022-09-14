// 7
// *       *       *       *       *       *       *
//         *                               *
//                 *               *
//                         *
//                 *       *       *
//         *       *       *       *       *
// *       *       *       *       *       *       *
import java.util.Scanner;

public class pattern18 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = n;
        int nsp = 0;
        for (int i = 0; i < n; i++) {

            for (int k = 0; k < nsp; k++) {
                System.out.print("\t");
            }
            for (int j = 0; j < nst; j++) {
                if (i > 0 && i < n / 2 && j > 0 && j < nst - 1) {

                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }

            }

            System.out.println();
            if (i < n / 2) {
                nsp = nsp + 1;
                nst = nst - 2;
            } else {
                nst = nst + 2;
                nsp = nsp - 1;
            }

        }

    }

}
