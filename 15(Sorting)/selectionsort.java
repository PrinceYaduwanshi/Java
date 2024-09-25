public class selectionsort{
    
    public static void SelectionSort(int num[]){
       for(int i = 0 ; i<num.length-1 ; i++){
          int minPos=i;
          for(int j = i+1 ; j<num.length ; j++){
            if(num[j]<num[minPos]){
                minPos =j;
            }
          }
          int temp = num[minPos];
          num[minPos] = num[i];
          num[i] = temp;
       } 
    }
    
    public static void main(String[] args) {
        int arr[]={5, 4, 1, 3, 2};
        SelectionSort(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}