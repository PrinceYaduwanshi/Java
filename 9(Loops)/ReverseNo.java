import java.util.*;

public class ReverseNo{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rev=0;
// using for loop
        for( int i=n; i>0 ; i=i/10){
            int lastdigit = i%10;
            rev = (rev*10 )+ lastdigit;
        }
        
        // while(n>0){
        //     int lastDigit = n%10;
        //     // System.out.print(lastDigit);
        //     rev=(rev*10)+lastDigit;
        //     n = n/10;
        // }
        System.out.println(rev);
    }
}