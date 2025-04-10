package ArrayAndString;

import java.util.Scanner;

public class JoinArrayOfStringsIntoOneString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        String[] a = new String[sc.nextInt()];
        sc.nextLine();
        System.out.println("enter string one bye one...");
        for(int i=0; i<a.length;i++)
        {
            a[i] = sc.nextLine();
        }
        String res="";
        for(int i=0; i<a.length; i++)
        {
            res += a[i];
        }
        System.out.println(res);
    }
}
