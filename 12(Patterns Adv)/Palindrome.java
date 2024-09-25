import java.util.*;

public class Palindrome{

    public static void PalindromePattern(int tot_rows){
        for(int i = 1 ; i<=tot_rows ; i++){
            // for spaces
            for (int j=1 ; j<=(tot_rows-i) ; j++){
                System.out.print(" ");
            }
            // for numbers before 1
            for(int k=i ; k>1 ; k--){
                System.out.print(k);
            }

            System.out.print("1");

            // for numbers after 1 
            for (int k=2 ; k<=i ; k++){
                System.out.print(k);
            }

            System.out.println();

        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int tot_rows = sc.nextInt();
        PalindromePattern(tot_rows);
    }
}