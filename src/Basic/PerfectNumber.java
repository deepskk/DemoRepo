package Basic;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int sum =0;
        for(int i=1; i<=n/2; i++)
        {
            if(n%i==0)
            {
                sum = sum +i;
            }
        }

        if(sum == n)
        {
            System.out.println("yes");
        }else System.out.println("no");
    }
}
