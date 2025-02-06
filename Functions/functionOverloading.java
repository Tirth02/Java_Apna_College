package Functions;

public class functionOverloading {

    // public static int sum(int a, int b)
    // {
        
    // }

    // public static float sum(int a, int b)
    // {

    // }
    // Upper both are not function overloading(It will show error).

    //Overloading using Parameters.
    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static int sum (int a, int b, int c)
    {
        return a+b+c;
    }

    //Function overloading using dataType
    public static int mul(int a, int b)
    {
        return a*b;
    }
    public static float mul(float a, float b)
    {
        return a * b;
    }
    public static void main(String[] args) {
        
        //Multiple functions with the same name but different parameter is called Function Overloading.

        // Function overloading depends on parameters not on return type 

        System.out.println(sum(8,2));
        System.out.println(sum(2, 7, 1));

        System.out.println(mul(8,2));
        System.out.println(mul(8.2f,1.8f));
    }
}
