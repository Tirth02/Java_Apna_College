package Sorting;

public class bubbleSort {

    public static void bubbleSortMethod(int arr[])
    {
        for(int turn = 0; turn < arr.length-1; turn++)
        {
            int swap = 0;
            for(int j = 0; j < arr.length-turn-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0)
            {
                return;
            }
        }
    }

    public static void printArr(int arr[])
    {
        for(int i = 0; i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        bubbleSortMethod(arr);
        printArr(arr);

        //If there is a case for best case like - [1,2,3,4,5] then we can make use of variable swaps for 1 ith iteration and increment if swap done and after 1 ith iteration if swap is not incremented then directly return from both the loops.
    }
}
