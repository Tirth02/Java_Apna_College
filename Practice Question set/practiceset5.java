public class practiceset5 {
    public static void main(String[] args) {
        // Question 1 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

        int nums[] = {1, 1, 3, 3, 4, 3, 2, 4, 2,2};
        boolean flag = false;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    flag = true;
                }
            }
        }
        System.out.println(flag);

        //Question 2 - Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.
        
        // Question 5
        // Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets.
        int arr[][] = new int[3][];
        int numbers[] = {-1, 0,  1, 2, -1, -4};
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = i + 1; j < numbers.length;j++)
            {
                for(int k = j+1; k < numbers.length; k++)
                {
                    if((i+j+k==0) && (i!=j)&&(j!=k)&&(i!=k))
                    {
                        
                    }
                }
            }
        }
    }
}
