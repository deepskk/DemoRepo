package ArrayAndString;

import java.util.Scanner;

public class ToUpperCaseManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        String result = "";

        for(int i=0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z')
            {
                ch= (char) (ch-32);
            }
            result+=ch;
        }
        System.out.println(result);
    }
}
