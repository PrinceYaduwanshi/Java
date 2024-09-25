
public class countingsort{
    
    public static void Counting(int arr[]){
        int largest_element_ofarray = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest_element_ofarray = Math.max(largest_element_ofarray , arr[i]);

        }

        int count[]= new int[largest_element_ofarray+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;

        }

        int j=0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        Counting(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}