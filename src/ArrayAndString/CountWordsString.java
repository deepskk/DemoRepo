package ArrayAndString;

import java.util.Scanner;

public class CountWordsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String here: ");
        String s = sc.nextLine();

        String[] words = s.trim().split("\\s+");
        // "\\s+" meaning one or two spaces or tap or newlines.

        System.out.println("Total number of words: "+words.length);
    }
}
