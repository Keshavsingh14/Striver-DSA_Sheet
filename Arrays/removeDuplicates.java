


//Q-> 4 REMOVE DUPLICATES IN-PLACE FROM SORTED ARRAY.


public class removeDuplicates {
    public static void main(String args[]){
        int arr[] = {1, 2, 2, 3, 3, 4};
        System.out.println("After Removing Duplicates: "+remove(arr));
    }
    public static int remove(int[] arr){
        int i = 0;
        for(int j =1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}


//IN HERE WE ARE RETURNING THE LENGTH OF THE NEW ARRAY..