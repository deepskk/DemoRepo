package Basic;

import java.util.Scanner;

public class SumOfNumber {
    public static  void  main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=1; i<=num;i++)
        {
            sum += i;
        }
        System.out.println("sum of 1 to "+num+" is: "+sum);
    }
}
