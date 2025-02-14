package ArraysPart2;

public class trappingRainwater {
    
    public static int trapWater(int numbers[])
    {
        int leftMax[] = new int[numbers.length];//[4,4,4,6,6,6,6]
        int RightMax[] = new int[numbers.length];// [5,5,5,6,6,6,6]
        int maxLeft = Integer.MIN_VALUE; // 4,4,4,6,6,6,6
        int maxRight = Integer.MIN_VALUE;//5,5,5,6,6,6,6

        // For Left Max boundary array;
        for(int i = 0; i < numbers.length; i++)
        {
            if(i == 0)
            {
                maxLeft = numbers[i];
            }
            else
            {
                if(numbers[i] > maxLeft)
                {
                    maxLeft = numbers[i];
                }
            }
            leftMax[i] = maxLeft;
        }

        //for Right Max boundary
        for(int i = numbers.length-1; i >= 0; i--)
        {
            if(i== numbers.length -1)
            {
                maxRight = numbers[i];
            }
            else
            {
                if(numbers[i] > maxRight)
                {
                    maxRight = numbers[i];
                }
            }
            RightMax[i] = maxRight;
        }
        
        // main method
        int trappedwater = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            int waterLevel = Math.min(leftMax[i], RightMax[i]);
            trappedwater += waterLevel - numbers[i];
        }
        return trappedwater;
    }
    
    
    public static void main(String[] args) {
        int numbers[] = {4,2,0,6,3,2,5};
        int trappedwater = trapWater(numbers);
        System.out.println("Trapped water for above array is "+trappedwater);
    }
}
