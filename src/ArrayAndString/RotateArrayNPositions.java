package ArrayAndString;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayNPositions {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter elements in array:");
        for(int i=0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: "+ Arrays.toString(arr));

        System.out.println("Enter position for rotate");
        int n = sc.nextInt();
        //one Right Rotate
        int[] b = new int[arr.length];
        for(int i=0; i<b.length; i++)
        {
            b[(i+n)%arr.length] = arr[i];
        }
        System.out.println(Arrays.toString(b));
        //one Left Rotate
//        for(int i=0; i<arr.length; i++)
//        {
//            b[(i-n - arr.length)%arr.length]= arr[i];
//        }
//        System.out.println(Arrays.toString(b));

        //two
//        int[] b = new int[arr.length];
//        for(int i=0; i<=n; i++)
//        {
//            b[i] = arr[i];
//        }
//        int c[] = new int[arr.length];
//        int t = arr.length - n -1;
//        int t1 = n;
//        for(int i = 0;i<t;i++)
//        {
//            c[i] = arr[++n];
//        }
//        n = t1;
//
//        t1 = 0;
//        for(int i=0; i<arr.length;i++)
//        {
//            if(i<=n)
//            {
//                arr[i] = b[i];
//            }else {
//                arr[i] = c[t1++];
//            }
//        }
//        System.out.println(Arrays.toString(arr));

    }
}
