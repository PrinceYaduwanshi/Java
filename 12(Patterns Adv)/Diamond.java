import java.util.*;

public class Diamond{

    public static void diamondfun(int tot_rows){
        // 1st half
        for(int i=1 ; i<=tot_rows ; i++){
            // spaces
            for(int j=1 ; j<=(tot_rows-i) ; j++){
                System.out.print(" ");
            }
            // for stars 
            for(int k=1 ; k<=(2*i-1) ; k++){
                System.out.print("*");
            }
            System.out.println();
            
        }

        // 2nd half
        for(int i=tot_rows ; i>=1 ; i--){
           // spaces
            for(int j=1 ; j<=(tot_rows-i) ; j++){
                System.out.print(" ");
            }
            // for stars 
            for(int k=1 ; k<=(2*i-1) ; k++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int tot_rows = sc.nextInt();
        diamondfun(tot_rows);
    }
}

