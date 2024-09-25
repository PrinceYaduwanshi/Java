public class Three{
    
    public static void insertionDesc(int arr[]){
        int n = arr.length;
        for(int i = 1 ; i<n-1 ; i++){
            int currElement = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<currElement){
                arr[prev+1] = arr[prev];
                prev--;

            }
            arr[prev+1] = currElement;
        }
    }
    
    public static void main(String[] args) {
        int arr[]={6,2,1,8,7,4,5,3,1};
        insertionDesc(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}