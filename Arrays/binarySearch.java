package Arrays;

public class binarySearch {

    public static int binarySearchMethod(int numbers[], int key)
    {
        int start = 0, end = numbers.length - 1;
        while(start <= end)
        {
            int mid = (start+end)/2;

            if(numbers[mid] == key)
            {
                return mid;
            }
            else if(key > numbers[mid])
            {
                start = mid +1;
            }
            else
            {
                end = mid - 1;
            }
        } 
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,20, 34, 56,78, 85,91};
        System.out.println("Key is present at : "+binarySearchMethod(numbers, 20));
    }
}
