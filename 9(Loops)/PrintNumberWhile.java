import java.util.*;

public class WhileLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int sum = 0;
        int counter = 1;
        while (counter <= n) {
            System.out.print(counter+" ");
            sum += counter;
            counter++;
        }
        System.out.println("\n");
        System.out.println("Sum of n number is:"+sum);
    }
}