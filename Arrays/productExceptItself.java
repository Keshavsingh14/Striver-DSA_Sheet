import java.util.*;
public class productExceptItself {
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4};

        //LEFT ARRAY
        int left[] = new int[arr.length];
        int product = 1;
        left[0] = product;
        for(int i=1; i< arr.length; i++){
            product = product * arr[i - 1];
            left[i] = product;
        }
       // System.out.println(Arrays.toString(left));

        //RIGHT ARRAY

        int right[] = new int[arr.length];
        product = 1;
        right[arr.length-1] = product;
        for(int i=arr.length-2; i>=0; i--){
            product = product * arr[i + 1];
            right[i] = product;
        }

        //NOW MULTIPLY BOTH OF THEM..

        for(int i=0; i< right.length; i++){
            right[i] = right[i] * left[i];
        }
        System.out.println(Arrays.toString(right));
    }
}
