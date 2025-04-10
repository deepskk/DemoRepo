package ArrayAndString;

import java.util.Scanner;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String here: ");
        String s = sc.nextLine();

        boolean flag = true;
        for(int i=0; i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                flag = false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("String is palindrome...");
        }else {
            System.out.println("String is not palindrome...");
        }

    }
}
