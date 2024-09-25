import java.util.*;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:\t");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:\t");
        int b = sc.nextInt();
        System.out.println("Enter operator (+,-,*,/):\t");
        char choice = sc.next().charAt(0);

        switch(choice){
            case '+' : System.out.println("Sum is:"+(a+b));
                    break;
            case '-' : System.out.println("Difference is:"+(a-b));
                    break;          
            case '*' : System.out.println("Producct is:"+(a*b));
                    break;
            case '/' : System.out.println("Quotient is:"+(a/b));
                    break;
            case '%' : System.out.println("Remainder is:"+(a%b));
                    break;
            default:System.out.println("Invalid Choice");
        }
    }
}