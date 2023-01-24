package JavaOtherPrograms;

//Prime number is a number that is divisible only by 1 and itself.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        int x;
        int count = 0;// Division Counter
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x = scan.nextInt();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++; // Increment
            }
        }
        if (count == 2) { // Exact 2 if no, is prime.
            System.out.println(x + " is a prime number.");
        } else {
            System.out.println(x + " is NOT a prime number.");
        }
    }
}
