package Basic;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for fibonacci series: ");
        int n = sc.nextInt();

        int f = 0,s=1;
        for(int i=1; i<=n; i++)
        {
            System.out.print(f+" ");
            int t = f + s;
            f = s;
            s = t;
        }

    }
}
