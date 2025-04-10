package Basic;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int reverseNumber = 0;
        while (n>0)
        {
            reverseNumber = reverseNumber * 10  + (n%10);
            n /= 10;
        }
        System.out.println("Reverse Number is: "+reverseNumber);
    }
}
