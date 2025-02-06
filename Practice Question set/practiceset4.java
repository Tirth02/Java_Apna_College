
public class practiceset4 {

    //problem 1
    public static int averageOfNum(int a, int b, int c)
    {
        int avg = (a + b + c)/3;
        return avg;
    }

    //problem2
    public static boolean isEven(int n)
    {
        if(n % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }  
    }

    //problem 3
    public static boolean isPalindrome(int n)
    {
        int myNum = n; // 331
        int rev = 0;
        while(n > 0)
        {
            int rem = n % 10; // 1, 3, 3
            rev = 10*rev + rem; //1, 10+3=13, 130+3
            n /= 10; // 33, 3, 0
        }
        System.out.println("Reverse no is "+rev + ". Original no is "+myNum);
        if(rev == myNum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // problem 5
    public static int sumOfDigit(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            int rem = n % 10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        //System.out.println(averageOfNum(3, 5, 10));
        //System.out.println(isEven(28));
        //System.out.println(isPalindrome(101));
        System.out.println("Sum of all digit of 482 = "+sumOfDigit(482));
    }
}
