package sorting;

public class bubbleSort {
    public static void sort(int arr[], int n){
        for(int i=n-1; i>=0; i--){
            for(int j =0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {3,5,7,1,2,6,7};
        int n = arr.length;
        sort(arr, n);
    }
}
