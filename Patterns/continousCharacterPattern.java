package Patterns;

import java.util.Scanner;

public class continousCharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range for which you want to print pattern");
        int n = sc.nextInt();
        char ch = 'A';
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}
