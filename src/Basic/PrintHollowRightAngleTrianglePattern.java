package Basic;

import java.util.Scanner;

public class PrintHollowRightAngleTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++)
        {
            for(int j = 0;j<=i; j++)
            {
                if(i==0 || i==n-1)
                {
                    System.out.print("*");
                } else if (j<=0 || j>=i) {
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
