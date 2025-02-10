package Arrays;

public class printSubarray {

    public static void prinSubArrays(int numbers[])
    {   
        int ts = 0;
        for(int i = 0; i < numbers.length; i++) // number of subarrays formula -> n(n+1)/2
        {
            int start = i;
            for(int j = i; j <numbers.length;j++)
            {
                int end = j;
                System.out.print("[");
                for(int k = start; k <= end;k++)
                {
                    System.out.print(numbers[k]+",");
                }
                ts++;
                System.out.println("]");
            }
            System.out.println();
        }
        System.out.println("Total subarrays = "+ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        prinSubArrays(numbers);
    }
}
