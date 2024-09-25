import java.util.*;

public class Largest{

    public static int largestElement(int num[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE;//+infinity

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
            if(num[i]<smallest){
                smallest = num[i];
            }
        }
        System.out.println("Smallest is:"+smallest);
        return largest;
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

        int largest=largestElement(num);
        System.out.println("Largets element is :"+largest);
        
    }
}