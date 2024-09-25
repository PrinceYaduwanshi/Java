public class SortedArray {
    
    public static boolean sortArr(int arr[] , int i){
        if ( i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;    
        }
        return sortArr(arr, i+1);

    }
    
    public static void main(String[] args) {
        int arr[]= {1, 2, 34, 4, 5, 6};
        System.out.println(sortArr(arr, 0));
        
    }
}
