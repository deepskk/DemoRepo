package ArrayAndString;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter elements in array:");
        for(int i=0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int i=0;
        while (i<arr.length-1)
        {
            if(arr[i]>arr[i+1])
            {
                arr[i] = arr[i] + arr[i+1];
                arr[i+1] = arr[i] - arr[i+1];
                arr[i] = arr[i] - arr[i+1];
                i=0;
            }
            else {
                i++;
            }
        }

        System.out.println("Sorted Array: \n"+Arrays.toString(arr));

        System.out.println("Missing elements: ");
        for (int j=0; j<arr.length-1;j++)
        {
            for (int k=arr[j]+1; k<arr[j+1]; k++)
            {
                System.out.print(k+" ");
            }
        }


    }
}
