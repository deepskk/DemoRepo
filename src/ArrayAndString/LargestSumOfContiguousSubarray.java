package ArrayAndString;

import java.util.Scanner;

public class LargestSumOfContiguousSubarray {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int[] arr = new int[sc.nextInt()];
        for(int i=0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int currentSum = arr[0];
        int maxSoFar = arr[0];

        for (int i=0; i<arr.length; i++)
        {
            currentSum = Math.max(arr[i],currentSum+arr[i]);
            maxSoFar = Math.max(maxSoFar,currentSum);
        }
        System.out.println("Largest Sum Of Contiguous Sub Array:"+maxSoFar);
    }
}
