package ArrayAndString;

import java.util.Scanner;

public class StringLengthManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s =sc.nextLine();

        int count=0;

            while (true) {
                try {
                s.charAt(count);
                count++;
                }catch (Exception e )
                {
                    break;
                }
            }


        System.out.println("length is "+count);
    }
}
