// Print All Primes Till N
// 1. You've to print all prime numbers between a range. 
// 2. Take as input "low", the lower limit of range.
// 3. Take as input "high", the higher limit of range.
// 4. For the range print all the primes numbers between low and high (both included).
// Input Format
// low 
// high
// Output Format
// n1
// n2
// .. all primes between low and high (both included)
import java.util.Scanner;

public class printAllPrimeTillN {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    //int t = scn.nextInt();
    int low = scn.nextInt();
    int high = scn.nextInt();
    for (int i = low; i <= high; i++) {
        //int n =scn.nextInt();
        if(isPrime(i)){
            System.out.println("Number is Prime : " + i);
        }
        // else{
        //     System.out.println("not prime");
        // }

    }
}
public static boolean isPrime(int val){
    for (int i = 2; i*i <=val; i++) {
        if(val % i == 0){
            return false;
        }
        
    }
    return true;
}
}
