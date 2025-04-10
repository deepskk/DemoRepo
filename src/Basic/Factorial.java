package Basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for factorial: ");
        int n = sc.nextInt();

//        int fact = 1;
//        for(int i=1; i<=n; i++)
//        {
//            fact *= i;
//        }
//        System.out.println("Factorial of "+n+" is "+fact);

        System.out.println(Fact(n));

    }
    public static int Fact(int n)
    {
        if(n == 1 || n==0)
        {
            return 1;
        }else {
            return n*Fact(n-1);
        }







/*
🧠 How Recursion Works (Stack Behavior)
When you call Fact(5), here’s what happens behind the scenes:

text
Copy
Edit
Fact(5)
 -> return 5 * Fact(4)
        -> return 4 * Fact(3)
              -> return 3 * Fact(2)
                    -> return 2 * Fact(1)
                          -> return 1     ← base case (n == 1)
Each call waits for the next one to return a value.

Now the return values go backward (like stacking plates and unstacking):

text
Copy
Edit
Fact(1) = 1
Fact(2) = 2 * 1 = 2
Fact(3) = 3 * 2 = 6
Fact(4) = 4 * 6 = 24
Fact(5) = 5 * 24 = 120
 */
    }
}
