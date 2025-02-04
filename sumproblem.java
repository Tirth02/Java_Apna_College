import java.util.*;

public class sumproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        System.out.println("Enter radius for calculating area...");
        float radius = sc.nextInt();
        // int sum = num1 + num2;
        // System.out.println("sum is "+sum);
        // int prod = num1 * num2;
        // System.out.println("product is "+prod);
        float area = 3.14f * radius * radius;
        System.out.println("Area is " + area);
        // Type casting (narrowing conversion, explicit conversion)
        int typeCastedArea = (int)area;
        System.out.println("Type casted area is "+typeCastedArea);
        char ch = 'a';
        int number = ch;
        System.out.println(number);

    }
}
