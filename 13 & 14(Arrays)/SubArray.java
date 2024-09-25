import java.util.*;


//BRUTE FORCE WITH O(n^3)

public class SubArray{
    
    public static void subarray(int num[]){
        int tot_subarray=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0 ; i<num.length ; i++){
            int start=i;
            for(int j=i ; j<num.length ; j++){
                int end=j;
                int sum=0;
                for(int k = start ; k<=end ; k++){
                    System.out.print(num[k]+" ");
                    sum=sum+num[k];
                   
                }
                tot_subarray++;
                System.out.print("  Sum is:"+sum);
                if(maxSum<sum){
                    maxSum=sum;
                }
                System.out.println();
            }
            
            System.out.println();
            
        }
        System.out.println("Max sum of sub array is:"+maxSum);
        System.out.println("Total SubArrays are:"+tot_subarray);
        
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

        subarray(num);
        
    }
}