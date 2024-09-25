import java.util.*;

public class continueSt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if(n%10==0){
                System.out.println("Please do not enter a multiple of 10");
                continue;
            }
            System.out.println("You entered: "+n);
        }while(true);
    }

}