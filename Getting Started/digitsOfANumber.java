// Digits Of A Number
// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line-wise.
// Input Format
// "n" where n is any integer.
// Output Format
// d1
// d2
// d3
// ... digits of the number
import java.util.Scanner;

public class digitsOfANumber {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int count = 0;
        int temp = n;
        while(temp > 0 ){
            temp = temp/10;
            count ++;
        }

        int div = (int)Math.pow(10,count-1);
        while (div !=0){
            int q = n/div;
            System.out.println(q);
            n = n%div;
            div=div/10;
        }
    }
}
