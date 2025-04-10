package ArrayAndString;

import java.util.Scanner;

public class CountVowelsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String here: ");
        String s = sc.nextLine();
        int count=0;
        for(int i=0; i<s.length();i++)
        {
//            char ch = Character.toLowerCase(s.charAt(i));
            char ch = s.charAt(i);
            if(ch >= 65 && ch<=90)
            {
                ch = (char) ((int)ch + 32);
            }
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
