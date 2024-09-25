import java.util.*;

public class Reverse{
    
    public static void reversearray(int num[]){
        int first=0,last=num.length-1;
        while(first<last){
            int temp=num[first];
            num[first]=num[last];
            num[last]=temp;

            first++;
            last--;
        }

        
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

        reversearray(num);
        System.out.println("Reversed array is:");
        for (int i=0 ; i<num.length ; i++){
            System.out.print(num[i]+" ");
        }
    }
}