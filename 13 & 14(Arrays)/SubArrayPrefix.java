import java.util.*;


//PREFIX SUM with  O(n^2)

public class SubArray{
    
    public static void subarrayprefix(int num[]){
        int tot_subarray=0;
        int maxSum=Integer.MIN_VALUE;


        // prefix array 
        int prefix[] = new int[num.length];

        prefix[0]=num[0];
        for(int i=1 ; i<num.length ; i++){
            prefix[i]=prefix[i-1]+num[i];
        }

        for(int i=0 ; i<num.length ; i++){
            int start=i;
            for(int j=i ; j<num.length ; j++){
                int end=j;
                int sum=0;
                
                sum = start == 0 ? prefix[end]:prefix[end]-prefix[start-1];

                if(maxSum<sum){
                    maxSum=sum;
                }
                
            }
            
            
        }
        System.out.println("Max sum of sub array is:"+maxSum);
        
        
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

        subarrayprefix(num);
        
    }
}