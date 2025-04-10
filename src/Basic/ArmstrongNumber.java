package Basic;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int temp =n,leng=0,sum=0;
        while(n != 0)
        {
            n=n/10;
            leng ++ ;
        }
        n = temp;
        while(n>0)
        {
            int r = n%10;
            int j = 1,arm = 1;

            while (j<=leng)
            {
                arm = arm * r;
                j++;
            }
           sum = sum + arm;
            n = n/10;
        }
        if (sum == temp)
        {
            System.out.println("YES");
        }

    }
}
