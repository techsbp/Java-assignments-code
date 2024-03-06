package Assignment.java;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int Num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int product = Num * i;
            System.out.println(Num+"*"+i+"="+product);
        }
    }
}
