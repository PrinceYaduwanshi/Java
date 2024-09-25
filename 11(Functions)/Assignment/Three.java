import java.util.*;

public class Three{

    public static void isPalindrome(int num){
        int rev = 0;
        int copy = num;
        for(int i = num ; i!=0 ; i=i/10){
            int lastDigit = i%10;
            rev = (rev*10)+lastDigit;

        }
        if(num == rev){
            System.out.println("The number is a palindrome");
        }else{
            System.out.println("The number is not a palindrome");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        isPalindrome(num);

    }
}