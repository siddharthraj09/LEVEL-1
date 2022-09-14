// 5
//                 1
//         2       3       2
// 3       4       5       4       3
//         2       3       2
//                 1
import java.util.Scanner;
// 

public class pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = 1;
        int count=1 ;
        int nsp = n / 2;
        for (int i = 0; i < n; i++) {
            int innerCount=count;
            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");

            }
            for (int k = 0; k < nst; k++) {
                
                System.out.print(innerCount+"\t");
                if(k<nst/2){
                    innerCount++;
                }
                else{
                    innerCount--;
                }
               
            }
            System.out.println();
            
            if (i < n / 2) {
                nst = nst + 2;
                nsp = nsp - 1;
                count ++;
            } else {
                nst = nst - 2;
                nsp = nsp + 1;
                count--;
            }

        }

    }
}
