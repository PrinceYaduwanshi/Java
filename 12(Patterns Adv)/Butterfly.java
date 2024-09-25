import java.util.*;

public class Butterfly{

    public static void butterflyfun(int tot_rows){
        // 1st half
        for(int i=1 ; i<=tot_rows ; i++){
            // stars before sapce
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");   
            }
            // spaces 2*(n-i)
            for(int k=1 ; k<=2*(tot_rows-i) ; k++){
                System.out.print(" ");
            }
            // stars after sapce
            for(int l=1 ; l<=i ; l++){
                System.out.print("*");
            }
            System.out.println();
            
        }

        // 2nd half
        for(int i=tot_rows-1 ; i>=1 ; i--){
            // stars before sapce
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");   
            }
            // spaces 2*(n-i)
            for(int k=1 ; k<=2*(tot_rows-i) ; k++){
                System.out.print(" ");
            }
            // stars after sapce
            for(int l=1 ; l<=i ; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int tot_rows = sc.nextInt();
        butterflyfun(tot_rows);
    }
}