package Arrays;

public class sumOfSubarray {

    public static void sumOfSubArray(int numbers[])
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length;i++)
        {
            int start = i;
            for(int j = i; j < numbers.length;j++)
            {
                int end = j;
                int sum = 0;
                System.out.print("[");
                for(int k = start; k <= end; k++)
                {
                    System.out.print(numbers[k] + "");
                    sum = sum + numbers[k];
                }
                if(sum > max)
                {
                    max = sum;
                }
                if(sum < min)
                {
                    min = sum;
                }
                System.out.println("] -> sum = "+sum);
            }
            System.out.println();
        }
        System.out.println("Maximum sum among all is "+max+" Minimum among all the sum is "+min);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        sumOfSubArray(numbers);
    }
}
