package Functions;

import java.util.Scanner;

public class functionBasics {
    public static void prinHelloWorld(){
        System.out.println("Hello World");
    }

    public static int calculateSum(int num1, int num2) // parameters or formal parameters
    {
        int sum = num1 + num2;
        return sum;
    }
    public static int multiply(int num1, int num2)
    {
        int product = num1 * num2;
        return product;
    }

    public static int factorial(int n)
    {
        int fact = 1;
        for(int i = 1; i <=n; i++)
        {
            fact *= i;
        }
        return fact;
    }
    public static int binomialCoefficient(int n,int r)
    {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int binCoeff = n_fact / (r_fact*nmr_fact);
        return binCoeff;
    }
    public static void main(String[] args) {
        // prinHelloWorld();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = calculateSum(a, b); // arguments or actual parameters
        int prod = multiply(a, b);
        System.out.println("Sum is "+total);
        System.out.println("a * b = "+prod);
        System.out.println(binomialCoefficient(a, b));  
    }
}
