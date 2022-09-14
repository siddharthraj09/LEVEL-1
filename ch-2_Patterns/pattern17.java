// 7
//                         *
//                         *       *
//                         *       *       *
// *       *       *       *       *       *       *
//                         *       *       *
//                         *       *
//                         *
import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       
        int n = scn.nextInt();
        int nst = 1;
        int nsp = n/2;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < nsp; j++) {
                if(i == n/2)
                System.out.print("*\t");
                else{
                    System.out.print("\t");

                }

            }
            for (int k = 0; k < nst; k++) {
                System.out.print("*\t");
            }
            System.out.println();
            if(i<n/2){
            nst = nst +1;
            }
            else{
                nst = nst -1;

            }

        }

    }
}
