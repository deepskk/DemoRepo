package ArrayAndString;

import javax.naming.InsufficientResourcesException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DuplicateElementsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter elements in array.");
        for(int i=0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length;i++)
        {
            for (int j=i+1; j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    boolean f = false;
                    for (int k=0; k<i; k++)
                    {
                        if(arr[k] == arr[i])
                        {
                            f = true;
                            break;
                        }
                    }
                    if(!f)
                    {
                        System.out.print(arr[i]+" ");
                    }
                }
            }
        }
        /*
        //Remove duplicates and print
        for (int i=0; i<arr.length;i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                boolean flag = false;
                for (int k=0; k<i;k++)
                {
                    if (arr[k]==arr[i])
                    {
                        flag = true;
                        break;
                    }
                }
                if(!flag)
                {
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }

         */
    }
}
