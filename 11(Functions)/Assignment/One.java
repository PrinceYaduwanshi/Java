import java.util.*;

public class One{
    public static double average(int a , int b , int c){
        double avg = (a+b+c)/3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double avg = average(a,b,c);
        System.out.println("Average of three numbers is " + avg);
    }
}