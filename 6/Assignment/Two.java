import java.util.*;

public class Two{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Square Side");
        int side = sc.nextInt();
        double area = (side*side);
        System.out.println("Area of Square is "+area);
    }
}