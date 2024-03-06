package Assignment.java;

import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {

        String word;
        String reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        word = sc.nextLine();
        int len = word.length();
        for (int i = len - 1; i >= 0 ; i--) {
            reverse = reverse + word.charAt(i);
        }
        if(word.equals(reverse)){
            System.out.println(word+" is a palindrome");

        }else{
            System.out.println(word+" Not a palindrome");
        }
    }
}
