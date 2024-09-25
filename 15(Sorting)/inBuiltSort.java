import java.util.Arrays;
import java.util.Collections;

public class inBuiltSort{
    public static void main(String[] args) {
        //object of integer class
        Integer arr1[] = {5, 4, 9, 4, 7};
        // Arrays.sort(arr1 , Collections.reverseOrder());
        // for(int i=0 ; i<arr1.length ; i++){
        //     System.out.print(arr1[i] + " ");
        // }
        // System.out.println();
        Arrays.sort(arr1 , 0,3, Collections.reverseOrder());
        for(int i=0 ; i<arr1.length ; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        int arr[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr);
         for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}