package Loops;
import java.util.*;

public class loopsbasics {
    public static void main(String[] args) {
    //     int cnt = 1;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the end point for your range...");
    //     int n = sc.nextInt();
    //     int sum = 0;
    //     while(cnt <= n)
    //     {
    //         // System.out.print(cnt+" ");
    //         sum += cnt;
    //         cnt++;
    //     }
    //     System.out.println("Sum is " + sum);

        //Reverse a number
        // int n = 10899;
        // int rev = 0;
        // while(n > 0)
        // {
        //     int rem = n % 10;
        //     rev = rev * 10 + rem;
        //     n /= 10;
        // }
        // System.out.println("Reverse of a number is "+rev);
        
        // Multiple of 10
        // Scanner sc = new Scanner(System.in);
        // do
        // {
        //     System.out.println("Enter a number");
        //     int n = sc.nextInt();
        //     if(n%10 == 0)
        //     {
        //         break;
        //     }
        //     System.out.println(n);
        // }
        // while(true);
        // System.out.println("Your chance to enter input is over");

        // Prime number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n == 2)
        {
            System.out.println("Number is prime");
        }
        else
        {
            
            for(int i = 2; i < Math.sqrt(n); i++)
            {
                if(n%i==0)
                {
                    System.out.println("Number is not a prime number");
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println("Number is a prime number");
            }
        }
     }
}
