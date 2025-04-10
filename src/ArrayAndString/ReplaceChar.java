package ArrayAndString;

import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String s = sc.nextLine();
        System.out.println("enter character to replace:");
        char oldChar = sc.next().charAt(0);
        System.out.println("enter new character:");
        char newChar = sc.next().charAt(0);

        String result = "";
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==oldChar)
            {
                result += newChar;
            }else {
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
