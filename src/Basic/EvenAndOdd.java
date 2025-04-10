package Basic;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();

        System.out.println("Even numbers up to "+ n+" :");
        n = n*2;
        int sum = 0;
        for(int i =1; i<=n; i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
                sum = sum + i;
            }
        }
        System.out.println("even sum: "+sum);
        System.out.println("\nOdd numbers :");
        sum = 0;
        for(int i =1; i<=n; i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
                sum = sum + i;
            }
        }
        System.out.println("odd sum: "+sum);
    }
}

