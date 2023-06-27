package sorting;

public class insertionSort {
    static void sort(int arr[], int n){
        for(int i=0; i<=n-1; i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("After insertion Sorting the array: ");
        for(int i=0; i< n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5,3,1,7,6,9};
        int n = arr.length;
        sort(arr, n);
    }
}
