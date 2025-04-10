package Basic;

import java.util.Scanner;

public class NumberPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();

//        for(int i = 0 ; i < n ;i++){
//            for(int j =  0 ; j < (n-i)-1;j++){
//                System.out.print(" ");
//            }
//
//            for(int j = 0 ;j< 2*i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for(int i=0; i<n; i++)
//        {
//            int count = 0;
//            for(int j=0; j<=n+(n-1); j++)
//            {
//                if(j>=(n-1)-i && j<=(n-1)+i)
//                {
//                    if(j<=n) {
//                        count++;
//                        System.out.print(count);
//                    }else {
//                        count--;
//                        System.out.print(count);
//                    }
//                }else System.out.print(" ");
//            }
//            System.out.println();
//        }


        for(int i=0; i<n; i++)
        {


            for(int j=0; j<(n-i)-1 ; j++)
            {
                System.out.print(" ");

            }
            int count = 0;
            for (int j=0; j<2*i + 1; j++)
            {
                if(j<=i)
                {
                    count++;
                    System.out.print(count);
                }else{
                    count--;
                    System.out.print(count);
                }
            }
            System.out.println();
        }
    }
}
