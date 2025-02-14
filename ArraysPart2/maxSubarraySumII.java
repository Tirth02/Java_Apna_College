package ArraysPart2;

public class maxSubarraySumII {

    public static void maxSumOfSubarray(int numbers[])
    {
        int prefixArray[] = new int[numbers.length];
        prefixArray[0] = numbers[0];

        for(int i = 1; i < numbers.length; i++)
        {
            prefixArray[i] = numbers[i] + prefixArray[i-1];
        }

        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < prefixArray.length; i++)
        {
            int start = i;
            for(int j = i; j < prefixArray.length; j++)
            {
                int end = j;
                currsum = start == 0 ? prefixArray[end] : prefixArray[end] - prefixArray[start-1];
                if(currsum >maxsum )
                {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max sum = "+maxsum);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1, 5,-3};
        maxSumOfSubarray(numbers);
    }
}
