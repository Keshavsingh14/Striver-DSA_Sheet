


// Q-> 1... PRINT THE LARGEST NUMBER IN THE ARRAY.


public class largestElement{
    public static void main(String args[]){
        int arr[] = {10, 12, 16, 19, 22};
        System.out.println("Largest element is"+find(arr));
    }
    public static int find(int arr[]){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}