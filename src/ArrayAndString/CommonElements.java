package ArrayAndString;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array: ");
        int a[] = new int[sc.nextInt()];
        System.out.println("Enter elements in array: ");
        for(int i = 0 ; i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("First Array: ");
        System.out.println(Arrays.toString(a));

        System.out.println("Enter size of Second array: ");
        int b[] = new int[sc.nextInt()];
        System.out.println("Enter elements in array: ");
        for(int i = 0 ; i<b.length;i++)
        {
            b[i] = sc.nextInt();
        }
        System.out.println("Second Array: ");
        System.out.println(Arrays.toString(b));

        System.out.println("Matched elements in two array: ");

        for(int i=0; i<a.length;i++)
        {
            for(int j=0; j<b.length;j++)
            {
                if(a[i]==a[j])
                {
                    boolean isAlreadyPrinted = false;
                    for (int k=0; k<i;k++)
                    {
                        if(a[k] == a[i])
                        {
                            isAlreadyPrinted = true;
                            break;
                        }
                    }
                    if(!isAlreadyPrinted)
                    {
                        System.out.print(a[i]+ " ");
                    }
                    break;
                }
            }
        }

    }
}
