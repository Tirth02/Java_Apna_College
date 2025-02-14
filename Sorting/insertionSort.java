package Sorting;

public class insertionSort {

    public static void insertionSortMethod(int arr[])
    {
        for(int i =1; i < arr.length;i++)
        {
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
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
        int arr[] = {6,1,7,4,2,9,8,5,3};
        insertionSortMethod(arr);
        printArr(arr);
    }
}
