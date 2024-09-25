import java.util.*;

public class BinarySearch{
//enter sorted array only
    public static int binary(int num[] , int key){
        int start=0, end=num.length-1;
        while(start <= end){
            int mid = (start + end) / 2;

            // comparisons
            if(num[mid] == key){
                return mid;
            }
            if(num[mid] < key){//right
                start = mid+1;

            }else{//left
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array");
        int length=sc.nextInt();
        int num[]=new int[length];
    
        System.out.println("Enter array elements");

        for(int i=0 ; i<num.length ; i++){
            num[i]= sc.nextInt();
        }
        System.out.println("Entert target element");
        int key = sc.nextInt();
        int index = binary(num , key );
        if(index != -1){
            System.out.println("Element found at index " + index);
        }else{
            System.out.println("Element not found::"+index);
        }
        
    }
}