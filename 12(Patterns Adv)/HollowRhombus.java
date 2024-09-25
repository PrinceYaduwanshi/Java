import java.util.*;

public class HollowRhombus{
    
    public static void rhombus(int tot_rows){
        for(int i = 1 ; i<=tot_rows ; i++){
            // for spaces
            for(int j = 1 ; j<=tot_rows-i ; j++){
                System.out.print(" ");
            }
            // for border rhombus
            for(int k = 1 ; k<=tot_rows; k++){
                if( i==1 || k==1 || i==tot_rows || k==tot_rows){
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
        System.out.println("Enter no. of rows");
        int tot_rows = sc.nextInt();
        rhombus(tot_rows);
    }
}