import java.util.Scanner;

public class practicequestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // question1
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // float avg = (a+b+c)/3;
        // System.out.println("Average of 3 numbers is "+avg);

        // question 2
        // int side = sc.nextInt();
        // int squareArea = side * side;
        // System.out.println("Area of square is "+ squareArea);

        // question 3
        float pencilPrice = sc.nextFloat();
        float EraserPrice = sc.nextFloat();
        float penPrice = sc.nextFloat(); 
        float GST = (pencilPrice + EraserPrice + penPrice) * 0.18f;
        float Total = pencilPrice+penPrice+EraserPrice + GST;
        System.out.println("Item : Price");
        System.out.println("Pencil : "+pencilPrice);
        System.out.println("Pen : "+penPrice);
        System.out.println("Eraser : "+EraserPrice);
        System.out.println("GST(18%) : "+ GST);
        System.out.println("Total : "+ Total);
    }
}
