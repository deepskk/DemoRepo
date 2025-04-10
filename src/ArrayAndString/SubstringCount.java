package ArrayAndString;

import java.util.Scanner;

public class SubstringCount {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        System.out.println("enter sub String: ");
        String subString = sc.nextLine();

        int count=0;
        for (int i=0; i<=s.length()-subString.length();i++)
        {
            boolean match = true;
            for (int j=0;j<subString.length();j++)
            {
                if(s.charAt(i+j) != subString.charAt(j))
                {
                    match =false;
                    break;
                }
            }
            if (match)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
