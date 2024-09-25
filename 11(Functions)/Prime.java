import java.util.*;

public class Prime{

// public static boolean isPrime(int n){
//     // corner cases or base conditions
//     if( n ==2){
//         return true;
//     }
//     boolean isPrime = true;
//     for (int i = 2; i <=n-1; i++) {
//         if(n%i==0){
//             isPrime = false;
//             break; //or we can change it with return 
//         }
//     }
//     return isPrime;
// }

    public static boolean isPrime(int n){
        if (n == 2) {
            return true;
        }
        for(int i=2 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the umber");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}