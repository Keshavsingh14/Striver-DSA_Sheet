


//  Q-> 3...CHECK IF THE ARRAY IS SORTED



public class checkIfArrayIsSorted {
    public static void main(String args[]){
        int arr[] = {1, 3, 5, 6, 7, 8, 8};
        System.out.println("The array is sorted: " + (iSorted(arr)));
    }
    public static boolean iSorted(int arr[]){
    for(int i=1; i< arr.length;){
        if(arr[i] >= arr[i-1]){
            return true;
        }
        else{
            return false;
        }
    }
    return true;
}
}
