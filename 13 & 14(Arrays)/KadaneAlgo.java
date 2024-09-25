import java.util.*;


//KADANE ALGORITHM with O(n)

public class KadaneAlgo{
    
    public static void subarraysum(int num[]){
        int tot_subarray=0;
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
         for (int i=0 ; i<num.length ; i++){
            currentSum = currentSum + num[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum = Math.max(currentSum , maxSum);

         }
       System.out.println("Max Sum is :"+maxSum);
        
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

        subarraysum(num);
        
    }
}