public class mergeSort{

    public static void mergesort(int arr[] , int startIdx , int endIdx){
        
        if(startIdx >= endIdx){
            return;
        }
        
        int mid = startIdx + (endIdx - startIdx)/2;//(si+ei)/2

        mergesort(arr, startIdx, mid);//left part sorting
        mergesort(arr, mid+1, endIdx);//right part soritng

        mergeArr(arr , startIdx , mid , endIdx);

    }

    public static void mergeArr(int arr[] , int startIdx , int mid , int endIdx) {
        // left(0,3)=4 ||| right(4,6)=3
        // that is total element is 7 so (ei - si + 1) ==> (6-0+1)
        int temp[] = new int[endIdx-startIdx+1];
        int i = startIdx; //iterartor for left part
        int j = mid+1; //iterartor for right part
        int k=0;//for temp array
        while(i <= mid && j<=endIdx){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; 
            }else{
                temp[k] = arr[j];
                j++; 
            }
            k++;
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= endIdx){
            temp[k++] = arr[j++];
        }

        for(k=0 , i=startIdx ; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8, -2};
        mergesort(arr, 0, arr.length-1);
        printArr(arr);
    }
}