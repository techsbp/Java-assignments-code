package Assignment.java;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1st number: ");
        int Num1 = sc.nextInt();
        System.out.print("Enter a 2nd number: ");
        int Num2= sc.nextInt();
        int gcd =0 ;
        for (int i = 1; i <= Num1 && i <= Num2; i++) {
            if (Num1%i == 0 && Num2%i ==0)
                gcd = i;
        }


            System.out.println(gcd+" is G.C.D. of two number");
    }
}
