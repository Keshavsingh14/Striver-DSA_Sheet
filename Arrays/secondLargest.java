


//Q-> 2.... PRINT THE SECOND LARGEST NUMBER IN THE ARRAY



public class secondLargest {
    public static void main(String args[]){
        int arr[] = {5,16, 18, 55, 44, 87};
        System.out.println("Second largest number is:"+find(arr));
    }
    public static int find(int arr[]){
        int largest = arr[0];
        int slargest = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
}
