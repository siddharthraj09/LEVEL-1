// 5
// *       *       *       *       * 
// *       *       *       *         
// *       *       * 
// *       *
// *
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       
        int n = scn.nextInt();
        int nst = n;
        int nsp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nst; j++) {
                System.out.print("* \t");

            }
            System.out.println();
            nst = nst -1;

        }

    }
}
