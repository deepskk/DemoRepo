package ArrayAndString;

import java.util.Scanner;

public class SplitStringToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s =sc.nextLine();

        s = s+ " ";
        String word = "";
        System.out.println("Words in string: ");
        for(int i=0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                word += ch;
            }else if(!word.equals(""))
            {
                System.out.println(word);
                word="";
            }
        }
    }
}
