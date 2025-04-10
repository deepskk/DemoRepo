package ArrayAndString;

import java.util.Scanner;

public class EndsWithCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.nextLine();
        System.out.println("enter suffix for check ends with string..");
        String check = sc.nextLine();

        boolean ends = true;
        if(check.length() > s.length())
        {
            ends = false;
        }
        else {
            int startIndex = s.length() - check.length();
            for(int i=0; i<check.length();i++)
            {
                if(s.charAt(startIndex+i)!= check.charAt(i))
                {
                    ends = false;
                    break;
                }
            }
        }
        if (ends)
        {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
