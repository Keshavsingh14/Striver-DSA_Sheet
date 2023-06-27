


//Q-> 5. LEFT ROTATE AN ARRAY BY ONE PLACE...


import java.util.Arrays;
public class leftrotateByOneplace {
    public static void main(String[] args){
        int arr[] = {2,3,4,5,6,7};
        int n = arr.length;
        rotate(arr, n);
        System.out.println("After left rotating it: "+Arrays.toString(arr));
    }
    public static void rotate(int arr[], int n){
        int temp = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
}
