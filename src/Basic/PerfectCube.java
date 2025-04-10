package Basic;

import java.util.Scanner;

public class PerfectCube {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number ");
            int n = sc.nextInt();
            boolean isPerfectCube = false;
            for(int i=1; i<=n/3;i++)
            {
                int PCube = i*i*i;
                if(PCube == n)
                {
                    isPerfectCube = true;
                    break;
                }
            }
            if(isPerfectCube)
            {
                System.out.println("yes");
            }else System.out.println("no");
        }
    }
}
