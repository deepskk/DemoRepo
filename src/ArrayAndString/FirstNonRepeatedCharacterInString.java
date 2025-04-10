package ArrayAndString;

import java.util.Scanner;

public class FirstNonRepeatedCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String here: ");
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(s.indexOf(ch)==s.lastIndexOf(ch))
            {
                System.out.println("First non repeated word: "+ch);
                return;
            }
        }
        System.out.println("No unique character...");
    }
}
