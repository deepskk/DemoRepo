package Basic;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            for (int j=0; j<(n-i)-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<(2*i)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
