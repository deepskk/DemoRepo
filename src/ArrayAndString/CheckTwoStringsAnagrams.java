package ArrayAndString;

import java.util.Scanner;

public class CheckTwoStringsAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine().replaceAll("\\s+","").toLowerCase();
        System.out.println("Enter second string:");
        String s2 = sc.nextLine().replaceAll("\\s+","").toLowerCase();
        if(s1.length() != s2.length())
        {
            System.out.println("Not anagram...");
            return;
        }
        for(int i=0; i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            int index = s2.indexOf(ch);
            if(index != -1)
            {
                s2 = s2.substring(0,index) + s2.substring(index+1);
            }else {
                System.out.println("Not a anagram...");
                return;
            }
        }
        System.out.println("Anagram...");
    }
}
