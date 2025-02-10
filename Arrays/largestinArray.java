package Arrays;

public class largestinArray {

    public static int getLargest(int numbers[])
    {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // Infinity
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > largest)
            {
                largest = numbers[i];
            }
            if(numbers[i] < smallest)
            {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is "+smallest);

        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("Largest value is : "+getLargest(numbers));
    }
}
