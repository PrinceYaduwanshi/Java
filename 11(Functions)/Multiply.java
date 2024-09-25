import java.util.*;

public class Multiply{
    public static int MultiplyNum(int a , int b){
        return a * b ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Num:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Num:");
        int b = sc.nextInt();
        int prod = MultiplyNum(a,b);
        System.out.println("Product of "+a+" and "+b+" is "+prod);

    }
}