import java.util.Scanner;

// Sample Input
// 2
// Sample Output
// *	
// *	*

public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nst = 1;
        int nsp = 0;
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nst; j++) {
                System.out.print("* \t");

            }
            System.out.println();
            nst = nst + 1;

        }

    }
}