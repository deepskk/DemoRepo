package Basic;

import java.util.Scanner;

public class PrimeNumbersUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();

        System.out.println("Prime numbers up to "+ n+" :");

        for(int i=2; i<=n; i++)
        {
            boolean isPrime = true;
            int m = i/2;
            for(int j = 2; j<=m;j++)
            {
                if(i%j==0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.print(i+" ");
            }
        }
    }
}
