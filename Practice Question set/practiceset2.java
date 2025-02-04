import java.util.Scanner;

public class practiceset2 {
    public static void main(String[] args) {
        // question1
        // System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if(num > 0)
        // {
        //     System.out.println("Number you entered is positive");
        // }
        // else
        // {
        //     System.out.println("Number you entered is negative");
        // }

        // question 2
        // System.out.println("Enter your body temperature");
        // double temp = sc.nextDouble();
        // if(temp > 100)
        // {
        //     System.out.println("You have fever");
        // }
        // else
        // {
        //     System.out.println("You don't have fever");
        // }

        // question 3
        // System.out.println("Enter day number");
        // int daynum = sc.nextInt();
        // switch (daynum) {
        //     case 1:
        //         System.out.println("It is Monday");
        //         break;
        //     case 2:
        //         System.out.println("It is Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("It is Wednesday");
        //         break;  
        //     case 4:
        //         System.out.println("It is Thursday");
        //         break;  
        //     case 5:
        //         System.out.println("It is Friday");
        //         break;
        //     case 6:
        //         System.out.println("It is Saturday");
        //         break;
        //     case 7:
        //         System.out.println("It is Sunday");
        //         break;
        //     default:
        //         System.out.println("Enter correct number of day");
        //         break;
        // }

        // question 5 
        System.out.println("Enter year you want to check for leap year");
        int year = sc.nextInt();
        if(year % 4 ==0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    System.out.println("It is Leap year");
                }
                else
                {
                    System.out.println("It is not a Leap year");
                }
            }
            else
            {
                System.out.println("It is a Leap year");
            }
        }
        else
        {
            System.out.println("It is not a Leap year");
        }
    }
}
