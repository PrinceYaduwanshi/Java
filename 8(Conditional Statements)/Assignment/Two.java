import java.util.*;

public class Two{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter body temp in Fahrenheit");
        double temp = sc.nextDouble();
        if( temp > 100){
            System.out.println("You have a fever");
        }else{
            System.out.println("You are normal");
        }
    }
}