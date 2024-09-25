import java.util.*;

public class HollowRectangle{
    
    public static void hollow_rec(int tot_rows , int tot_cols){
        // outer loop for rows
        for(int i=1 ; i<=tot_rows ; i++){
            // inner loop for columns
            for(int j=1 ; j<=tot_cols ; j++){
                // cell - (i,j)
                if(i==1 || i==tot_rows || j==1 || j==tot_cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int tot_rows = sc.nextInt();
        System.out.println("Enter no of columns:");
        int tot_cols = sc.nextInt();
        hollow_rec(tot_rows,tot_cols);

    }
}