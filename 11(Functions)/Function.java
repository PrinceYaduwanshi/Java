import java.util.*;

public class Function{
    public static void printHello(){
        System.out.println("Hello");
        return ;
    }

    public static int sumCalc(int a , int b){
       
        return (a+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();   
        int sum=sumCalc(a,b);
        System.out.println(sum);
    }
}