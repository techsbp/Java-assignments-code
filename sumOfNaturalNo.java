package Assignment.java;

import java.util.Scanner;

public class sumOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int Num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= Num; ++i) {

           sum = sum + i;
        }
        System.out.print("Sum of natural number of given +ve integer "+sum);
    }
}
