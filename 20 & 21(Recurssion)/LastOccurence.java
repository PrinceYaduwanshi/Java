public class LastOccurence {

    public static int Lastoccur(int arr[] , int key , int idx){
        if( idx == arr.length){
            return -1;
        }
        int isFound = Lastoccur(arr, key, idx+1);
        if(isFound == -1 && arr[idx] == key){
            return idx;
        }
        return isFound;
    }

    public static void main(String args[]){
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5 ;
        System.out.println(Lastoccur(arr , key , 0));

    }
}
