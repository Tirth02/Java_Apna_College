package Arrays;

import java.util.Scanner;

public class arrayBasics {

    public static void update(int count[])
    {
        for(int i = 0; i < count.length;i++)
        {
            count[i] = count[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = new int[10];
        // int marks[] = {98,96,87}; another way to declare array
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy : "+ marks[0]);
        System.out.println("chem : "+ marks[1]);
        System.out.println("math : "+ marks[2]);

        marks[2] = 100;
        System.out.println("math : "+marks[2]);

        System.out.println("Length of marks array is "+marks.length);

        // Arrays are call by reference
        int players[] = {10,20,40};
        update(players);
        for(int i = 0; i < players.length;i++)
        {
            System.out.print(players[i] +" ");
        }
        System.out.println();

    }
}
