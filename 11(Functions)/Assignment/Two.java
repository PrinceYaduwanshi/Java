import java.util.*;

public class Two{
    
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean result = isEven(num);
        System.out.println(result);

    }
}