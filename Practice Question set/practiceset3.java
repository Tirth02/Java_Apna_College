import java.util.Scanner;

public class practiceset3 {
    public static void main(String[] args) {
        // // Question2
        // Scanner sc = new Scanner(System.in);
        // int num, choice, evenSum = 0, oddSum=0;
        // do
        // {
        //     System.out.println("Enter the number");
        //     num = sc.nextInt();

        //     if(num % 2 == 0)
        //     {
        //         evenSum += num;
        //     }
        //     else
        //     {
        //         oddSum += num;
        //     }

        //     System.out.println("Do you want to continue? Press 1 for yes or 0 for no ");
        //     System.out.println("Enter your choice 0 or 1?");
        //     choice = sc.nextInt();
        // }
        // while(choice == 1);
        // System.out.println("Sum of Even numbers is "+evenSum);
        // System.out.println("Sum of Odd number is "+oddSum);

        //Question 3 (factorial problem)
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number to know it's factorial");
        // int n = sc.nextInt();
        // int mul = 1;
        // if(n == 0)
        // {
        //     System.out.println("Factorial of 0 is "+1);
        //     return;
        // }
        // while(n > 0)
        // {
        //     mul *= n;
        //     n--;
        // }
        // System.out.println("Factorial of number is"+mul);

        // Question 4 (Multiplication table of entered number)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to display table");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n + " x " + i + " = "+n*i);
        }
    }
}
