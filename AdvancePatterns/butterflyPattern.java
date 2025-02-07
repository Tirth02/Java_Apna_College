package AdvancePatterns;

public class butterflyPattern {

    public static void pattern(int n)
    {
        for(int i =1; i <= n; i++)
        {
            if(i <= n/2)
            {
                for(int j = 1; j <= n; j++)
                {
                    if( j <= i || j >= n-i+1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }   
            }
            else
            {
                for(int j = 1; j <= n ;j++) // i =6
                {
                    if(j >= i || j <= n-i+1) //  >= 6 | 1 <= 3
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
