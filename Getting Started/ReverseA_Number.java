import java.util.Scanner;

// 1. You've to display the digits of a number in reverse.
// 2. Take as input "n", the number for which digits have to be display in reverse.
// 3. Print the digits of the number line-wise, but in reverse order.
// Sample Input
// 65784383
// Sample Output
// 3
// 8
// 3
// 4
// 8
// 7
// 5
public class ReverseA_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        
        while(n > 0 ){
            int rem=n % 10;
            System.out.println(rem);
            n/=10;
         
        }
       
    }
}
