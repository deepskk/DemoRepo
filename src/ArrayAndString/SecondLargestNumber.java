package ArrayAndString;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int a[] = new int[sc.nextInt()];

        int first = Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
            if(a[i] > first)
            {
                second = first;
                first = a[i];
            }else if(a[i] > second && a[i] != first)
            {
                second = a[i];
            }
        }
        System.out.println("Second Largest element: "+second);

    }
}
