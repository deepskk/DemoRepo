package Basic;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();

        int temp = n,sum=0;
        while(temp != 0)
        {
            int rem = temp%10;
            sum = sum*10 +rem;
            temp /= 10;
        }
        if(sum == n)
        {
            System.out.println("number is Palindrome.");
        }else {
            System.out.println("number is not palindrome.");
        }

    }
}
