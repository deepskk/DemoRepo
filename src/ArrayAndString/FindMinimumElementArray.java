package ArrayAndString;

import java.util.Scanner;

public class FindMinimumElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int a[]=new int [size];
        System.out.println("Enter "+size+" elements in array:");
        int minValue= Integer.MAX_VALUE;

        for(int i=0; i<size; i++)
        {
            a[i]= sc.nextInt();
            if(a[i] < minValue)
            {
                minValue = a[i];
            }
        }
        System.out.println("Minimum Element in array: "+minValue);


    }
}
