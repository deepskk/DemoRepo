package ArrayAndString;

import java.util.Scanner;

public class ReplaceSubstringManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String s = sc.nextLine();

        System.out.println("enter old String to replace: ");
        String oldString = sc.nextLine();
        System.out.println("enter new String to replace: ");
        String newString = sc.nextLine();

        int i=0;
        String res = "";
        while(i<=s.length()-oldString.length() )
        {
            boolean match=true;
            for (int j=0; j<oldString.length();j++)
            {
                if(s.charAt(i+j) != oldString.charAt(j))
                {
                    match= false;
                    break;
                }
            }

            if (match)
            {
                res +=newString;
                i += oldString.length();
            }else {
                res += s.charAt(i);
                i++;
            }
        }
        while (i<s.length())
        {
            res +=s.charAt(i);
            i++;
        }
        System.out.println("After Replacement: "+res);
    }
}
