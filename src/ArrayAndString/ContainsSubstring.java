package ArrayAndString;

import java.util.Scanner;

public class ContainsSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String s = sc.nextLine();

        System.out.println("enter sub string to check in main string: ");
        String subString = sc.nextLine();

        boolean found =false;

        for (int i=0; i <= s.length() - subString.length(); i++)
        {
            boolean match = true;
            for (int j=0; j< subString.length();j++)
            {
                if(s.charAt(i+j)!=subString.charAt(j))
                {
                    match = false;
                    break;
                }
            }
            if (match)
            {
                found = true;
                break;
            }
        }
        if(found)
        {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
