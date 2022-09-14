// 4
// 1                                               1
// 1       2                               2       1
// 1       2       3               3       2       1
// 1       2       3       4       3       2       1
import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       
        int n = scn.nextInt();
        int nst = 1;
        int nsp = (2*n)-3;
        for (int i = 0; i < n; i++) {
            int count=1;

            for (int k = 0; k < nst; k++) {
                System.out.print(count+"\t");
                count++;
            }
            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");

            }
            if(i == n-1){
                nst--;
               count--;
            }
            for (int k = 0; k < nst; k++) {
                count--;
                System.out.print(count+"\t");
                
            }
           
            System.out.println();

            nst = nst+1;
            nsp=nsp-2;

        }

    }
}
