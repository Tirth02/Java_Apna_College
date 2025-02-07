package AdvancePatterns;

public class diamondPattern {

    public static void pattern(int n)
    {
        for(int i = 1; i <= n;i++)
        {
            //for spaces
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }

            // for stars
            for(int j = 1; j <= 2*i-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // for inverted triangle
        for(int i = n; i > 0; i--)
        {
            //for spaces
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }

            // for stars
            for(int j = 1; j <= 2*i-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
