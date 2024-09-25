import java.util.*;

public class Five{
    
    public static int digitSum(int num){
        int sum = 0;
        for(int i = num ; i>0 ; i/=10){
            int lastDigit = i%10;
            sum = sum + lastDigit;

        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Sum of digits of number is "+digitSum(n));

    }
}