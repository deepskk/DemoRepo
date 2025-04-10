import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int s = sc.nextInt();
        int a [] = new int[s];

        System.out.println("Enter "+s+" elements in array.");
        for(int i=0; i<s; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i =0; i<s-1; i++)
        {
            if(a[i] > a[i+1])
            {
                int temp = a[i];
                a[i]= a[i+1];
                a[i+1] = temp;
                i = -1;
            }

        }

       /* System.out.println(Arrays.toString(a));
        System.out.println("Entered array: ");
        for(int i=0; i<s; i++)
        {
            System.out.print(a[i]+" ");
        }

        System.out.println("Missing elements: ");
        for(int i=0; i<s-1; i++) {
            //    System.out.println(a[i]+"\t"+(a[i+1]-1));
            //1 1 1 1 1
//            if(a[i] != (a[i+1] - 1))
//            {
            if (a[i] + 1 < a[i + 1]) {

                int j = a[i] + 1;
                while (j < a[i + 1]) {
                    System.out.println(j);
                    j++;

                }
            }
        }*/

        System.out.println("Occurrence elements:");
        int count=1,index=0;
        for(int i = index ; i<s-1 ; i++)
        {
          for(int j = index+1; j<s; j++)
          {
              if(a[index] == a[j])
              {
                  count++;
                  index++;
              }
          }
            System.out.println(a[index]+" oc"+count);
            count =1;
        }

    }
}
