package ArrayAndString;

import java.util.Scanner;

public class CharPositionFinder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter string: ");
        String s = sc.nextLine();

        System.out.println("Enter character to find index: ");
        char ch = sc.next().charAt(0);
        int index = -1;
        for (int i=0; i<s.length();i++)
        {
            if(ch==s.charAt(i))
            {
                index = i;
                break;
            }
        }
        if(index != -1)
        {
            System.out.println(ch+" character index is: "+index);
        }else
        {
            System.out.println(ch+" Not found");
        }
    }
}
