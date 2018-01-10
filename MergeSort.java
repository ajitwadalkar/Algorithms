package my_package;

public class MergeSort {
    private static int IntArr[] = {12, 1, 23, 42, 12, 21, 64, 21, 67, 34};
    public static void main(String[] args) {
        PrintArray P = new PrintArray();
        System.out.println("Array before sorting:");
        P.PrintIntArray(IntArr);
        Sorting(IntArr, 0, IntArr.length-1);
        System.out.println("Array after sorting:");
        P.PrintIntArray(IntArr);
    }

    public static void Sorting(int arr[], int low, int high)
    {
        if (low < high)
        {
            int mid = (low+high)/2;
            Sorting(arr, low, mid);
            Sorting(arr , mid+1, high);
            Merging(arr, low, mid, high);
        }
    }

    public static void Merging(int arr[], int low, int mid, int high)
    {
        int arr1Size = mid - low + 1;
        int arr2Size = high - mid;
        int Left[] = new int [arr1Size];
        int Right[] = new int [arr2Size];
        for (int i=0; i<arr1Size; ++i)
            Left[i] = arr[low + i];
        for (int j=0; j<arr2Size; ++j)
            Right[j] = arr[mid + 1+ j];

        int i = 0, j = 0;
        int k = low;
        while (i < arr1Size && j < arr2Size)
        {
            if (Left[i] <= Right[j])
            {
                arr[k] = Left[i];
                i++;
            }
            else
            {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < arr1Size)
        {
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j < arr2Size)
        {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }
}
