import java.util.*;

public class PrimeRange{

    public static boolean isPrime(int num){
        if(num ==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(num) ; i++){
            if(num%i == 0){
                return false;
            }

        }
        return true;
    }

    public static void primesinRange(int start , int end){
        for(int i=start ;  i<=end ;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start range");
        int start_range = sc.nextInt();
        System.out.println("Enter end range");
        int end_range = sc.nextInt();
        primesinRange(start_range , end_range);
    }
}