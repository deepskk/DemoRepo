package ArrayAndString;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int s = sc.nextInt();

        int a[] = new int[s];
        System.out.println("Enter "+s+" elements in array: ");
        for(int i=0; i<s; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<s/2;i++)
        {
            int temp = a[i];
            a[i] = a[(s-i)-1];
            a[(s-i)-1] = temp;
        }
        for (int i=0; i<s; i++)
            System.out.print(a[i]+" ");
    }
}
