import java.util.*;

public class Binomial{
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static double binomialCal(int n , int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);
        return (double)((n_fact)/(r_fact*nmr_fact));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        System.out.println("Enter value of r");
        int r = sc.nextInt();
        double bC = binomialCal(n,r);
        System.out.println("Binomial Coefficient is " + bC);
    }
}