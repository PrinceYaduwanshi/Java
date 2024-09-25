import java.util.*;

public class breakStatement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a Number");
            int n = sc.nextInt();
            if( n%10 ==0 ){
                System.out.println("multiple of 10 is entered");
                break;
            }
            System.out.print(n+" ");
        }while(true);
    }
}