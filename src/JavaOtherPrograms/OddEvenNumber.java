package JavaOtherPrograms;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String args[]) {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        x = scan.nextInt();
        if (x % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }
}
