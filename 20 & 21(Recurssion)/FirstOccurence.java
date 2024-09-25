public class FirstOccurence {
    
    public static int Firstoccur(int arr[] , int key , int idx){
        if( idx == arr.length){
            return -1 ;
        }
        
        if(arr[idx] == key){
            return idx;
        }
        return Firstoccur(arr, key, idx+1);
    }
    
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5 ;
        System.out.println(Firstoccur(arr , key , 0));
    }
}
