package my_package;

public class PrintArray {
    public static void PrintIntArray(int arr[]){
        int len = arr.length;
        System.out.print("{");
        for (int i=0; i<len; ++i)
            System.out.print(arr[i] + " ");
        System.out.print("}");
        System.out.println();
    }
}
