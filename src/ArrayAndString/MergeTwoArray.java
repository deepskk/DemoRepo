package ArrayAndString;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of First array: ");
        int arr[] = new int[sc.nextInt()];

        System.out.println("Enter elements in array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter size of Second array: ");
        int[] b = new int[sc.nextInt() + arr.length];
        int index = 0;
        for(int i=0;i<arr.length;i++)
        {
            b[i] = arr[i];
            index++;

        }
        System.out.println("Enter elements in array: ");
        for(int i=index;i<b.length;i++)
        {
            b[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(b));

    }
}
