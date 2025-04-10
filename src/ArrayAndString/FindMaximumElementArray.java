package ArrayAndString;

import java.util.Scanner;

public class FindMaximumElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int a[]=new int [size];
        System.out.println("Enter "+size+" elements in array:");
        int maxValue= Integer.MIN_VALUE;
        int secondLargest=0;
        for(int i=0; i<size; i++)
        {
            a[i]= sc.nextInt();
            if(a[i] > maxValue)
            {
                maxValue = a[i];
            }

        }
        System.out.println("Maximum Element in array: "+maxValue);



    }
}
