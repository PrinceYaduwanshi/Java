public class insertionsort{

    public static void Insertion(int arr[]){
        for(int i=1 ; i<arr.length ; i++){
            int currElement = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] > currElement){
                arr[prev+1] = arr[prev];
                prev--;

            }
            arr[prev+1] = currElement;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        Insertion(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}