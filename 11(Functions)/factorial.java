import java.util.*;

public class factorial{

    public static int factorialNum(int n){
    //    recursion 
        if(n == 0 || n==1){
            return 1;
        }
        return n*factorialNum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int fact=factorialNum(n);
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}