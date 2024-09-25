public class Four{
   
    public static void countingDesc(int arr[]){
        int n=arr.length;
        int largest_element = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            largest_element=Math.max(largest_element , arr[i]);
        }

        int count[] = new int[largest_element+1];
        for (int i = 0; i < n ; i++){
            count[arr[i]]++;
        }
        
        int j=0;
        for(int i=count.length-1 ; i>=0 ; i--){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
   
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        countingDesc(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}