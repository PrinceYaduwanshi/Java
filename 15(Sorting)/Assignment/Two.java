public class Two{
    public static void selectionDesc(int arr[]){
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){
            int maxIdx = i;
            for(int j=i+1 ; j<n ; j++){
                if(arr[j] > arr[maxIdx]){
                    maxIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
    }

    public static void main(String args[]){
        int arr[]={6,2,1,8,7,4,5,3,1};
        selectionDesc(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}