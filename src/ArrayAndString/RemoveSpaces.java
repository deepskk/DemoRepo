package ArrayAndString;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();

        int start = 0;
        int end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }
        String res = "";
        for (int i = start; i <= end; i++) {
            res += s.charAt(i);
        }
        System.out.println("Remove leading and trailing spaces in string: '" + res + "'");
    }
}

