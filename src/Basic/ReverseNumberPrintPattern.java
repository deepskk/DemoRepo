package Basic;

import java.util.Scanner;

public class ReverseNumberPrintPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        for (int i=n; i>0;i--)
        {
            System.out.print(i+" ");
        }
    }
}
