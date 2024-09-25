import java.util.*;

public class LinearSearch{

    public static int linearSearch(int num[] , int target){
        for(int i = 0 ; i<num.length ; i++){
            if(num[i] == target){
                return i;
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

        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int idx=linearSearch(num,target);

        if(idx== -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index "+idx);
        }

        
    }
}