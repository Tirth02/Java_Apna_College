package Functions;

public class binToDec {
    public static void binaryToDec(int binNum)
    {
        int dec = 0;
        int power = 0;
        int myNum = binNum;

        while(binNum > 0)
        {
            int lastDigit = binNum%10;
            dec += lastDigit*(int)Math.pow(2, power);
            power++;
            binNum /= 10;
        }
        System.out.println("Decimal of "+ myNum +" = " + dec);
    } 
    public static void decToBin(int n)
    {
        int bin = 0;
        int pow = 0;
        int myNum = n;
        while(n > 0)
        {
            int rem = n % 2;
            bin = bin + rem*(int)Math.pow(10, pow);
            pow++;
            n = n/2;
        }
        System.out.println("Binary of "+myNum+" = "+ bin);
    }
    public static void main(String[] args) {    
        // binaryToDec(110);
        decToBin(11);
    }
}
