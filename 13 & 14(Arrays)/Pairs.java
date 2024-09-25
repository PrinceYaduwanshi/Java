import java.util.*;

public class Pairs{
    
    public static void arraypair(int num[]){
        int total_pairs=0;
        for(int i = 0 ; i<num.length ; i++){
            int curr = num[i];
            for(int j=i+1 ; j<num.length ; j++){
                System.out.print("(" + curr + "," + num[j] + ") ");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: "+total_pairs);
        
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

        arraypair(num);
    }
}