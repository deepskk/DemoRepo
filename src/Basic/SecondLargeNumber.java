package Basic;

import java.util.Scanner;

public class SecondLargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number ");
        int first = sc.nextInt();
        System.out.println("Second number ");
        int second = sc.nextInt();

        if(first > second)
        {
            System.out.println(second);
        }else {
            System.out.println(first);
        }
    }
}
