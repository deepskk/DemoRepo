package ArrayAndString;

import java.util.Scanner;

public class StartsWithChecks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        System.out.println("enter string to check (is this start with ?)");
        String checkString = sc.nextLine();

        boolean starts = true;
        if(checkString.length() > s.length())
        {
            starts =false;
        }else {
            for(int i=0; i<checkString.length();i++)
            {
                if(s.charAt(i)!=checkString.charAt(i))
                {
                    starts = false;
                    break;
                }
            }
        }
        if(starts)
        {
            System.out.println("Yes start with "+checkString);
        }
        else {
            System.out.println("Not start with "+checkString);
        }

    }
}
