package Assignment.java;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  nth term of a number :");
        int num = sc.nextInt();
        int num1st = 0;
        int num2nd = 1;

        for (int i = 2; i <= num; ++i) {
            System.out.print(num1st+" ,");
           int nTerms = num1st + num2nd;
            num1st = num2nd;
            num2nd = nTerms;
        }

    }
}
