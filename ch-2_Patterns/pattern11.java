// 4

// 1
// 2       3
// 4       5       6
// 7       8       9       10
import java.util.Scanner;
 
public class pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nst = 1;
        int nsp = 0;
        int count =1;
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nst; j++) {
                System.out.print(count+"\t");
                count++;

            }
            System.out.println();
            nst = nst + 1;

        }

    }
}
