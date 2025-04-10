package ArrayAndString;

import java.util.Scanner;

public class PermutationInMain {
   /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Permutations of \"" + input + "\":");

        // Inner recursive logic inside main method using lambda-like helper
        generate("", input);
    }

    // Helper method for recursion inside the same class
    public static void generate(String prefix, String remaining) {
        if (remaining.isEmpty()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                char ch = remaining.charAt(i);
                String before = remaining.substring(0, i);
                String after = remaining.substring(i + 1);
                generate(prefix + ch, before + after);
            }
        }
    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        char[]  arr = str.toCharArray();
        int n = arr.length;
        int total = 1;
        for (int i=2; i<=n; i++){
            total += i;
        }

        System.out.println("Permutations of \""+str+"\":");

        for (int i=0; i<total; i++)
        {
            nextPermutation(arr);
            System.out.println(new String(arr) );
        }
    }
    static void nextPermutation(char[] arr)
    {
        int i = arr.length -2;
        while(i>=0 && arr[i]>=arr[i+1])
        {
            i--;
        }

        if(i>=0)
        {
            int j = arr.length-1;
            while (arr[j]<= arr[i])
            {
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,arr.length -1);

    }
    static void swap(char[] arr, int i, int j)
    {
        char t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    static void reverse(char[] arr, int start, int end){
        while (start < end)
        {
            swap(arr,start,end);
            {
                start++;
                end--;
            }
        }
    }
}
