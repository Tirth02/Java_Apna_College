import java.util.Scanner;

public class javabasics{
    public static void main(String[] args) {
        // System.out.println("Hello this is first java statement to print");

        // calculator using switch
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation you want to perform...");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case '+':
                    System.out.println(num1+num2);
                    break;
            case '-':
                    System.out.println(num1-num2);
                    break;
            case '*':
                    System.out.println(num1*num2);
                    break;
            case '/':
                    System.out.println(num1/num2);
                    break;
            case '%':
                    System.out.println(num1%num2);
                    break;
            default:
                    System.out.println("Enter appropriate operation");
        }
        for(int i =4;i>0; i--)
        {
            for(int j=1; j <= i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}