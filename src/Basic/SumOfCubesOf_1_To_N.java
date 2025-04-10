package Basic;

import java.util.Scanner;

public class SumOfCubesOf_1_To_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i=1; i<=n; i++)
        {
            sum = sum + i*i*i;
        }
        System.out.println(sum);
    }
}
