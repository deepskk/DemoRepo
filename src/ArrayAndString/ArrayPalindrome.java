package ArrayAndString;

import java.util.Scanner;

public class ArrayPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of First array: ");
        int arr[] = new int[sc.nextInt()];

        System.out.println("Print elements in array: ");
        boolean isPalindrome = false;
        System.out.println(arr.length/2);
        for(int i=0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
            if(arr.length%2==0)
            {
                if(i>=arr.length/2)
                {
                    if(arr[i] == arr[(arr.length-1)-i])
                    {
                        isPalindrome = true;
                    }else {
                        isPalindrome = false;
                        break;
                    }
                }
            }else {
                if(i>arr.length/2)
                {
                    if(arr[i] == arr[(arr.length-1)-i])
                    {
                        isPalindrome = true;
                    }else {
                        isPalindrome = false;
                        break;
                    }
                }
            }
        }
        if (isPalindrome)
        {
            System.out.println("Yes Palindrome");
        }else System.out.println("Not a palindrome number please enter again.");

    }
}
