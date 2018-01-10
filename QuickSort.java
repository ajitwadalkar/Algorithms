package my_package;
public class QuickSort {

    private static int IntArr[] = {12, 1, 23, 42, 12, 21, 64, 21, 67, 34};
    public static void main(String[] args) {
        PrintArray P = new PrintArray();
        System.out.println("Array before sorting:");
        P.PrintIntArray(IntArr);
        quickSort(IntArr, 0, IntArr.length-1);
        System.out.println("Array after sorting:");
        P.PrintIntArray(IntArr);
    }

    public static void quickSort(int[] array, int low, int high){
        if(low<high)
        {
            int q = PartitionArray(array, low, high);
            quickSort(array, low, q-1);
            quickSort(array, q+1, high);
        }
    }

    public  static int PartitionArray(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j < high; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[high] = temp;
        arr[i+1] = pivot;
        return i+1;
    }
}
