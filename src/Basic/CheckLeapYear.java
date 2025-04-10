package Basic;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
//        if( n%4==0 &&  n%100!=0 || n%400==0)
//        {
//            System.out.println(n+" is leap year.");
//        }else {
//            System.out.println(n+" is not leap year.");
//        }
        boolean isLeap = true;
        if(n%4==0){
            if(n%100==0)
            {
                if(n%400==0)
                {
                    isLeap = true;
                }else isLeap = false;
            }else isLeap = true;

        }else isLeap = false;

        if(isLeap)
        {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
