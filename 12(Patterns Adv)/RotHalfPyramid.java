import java.util.*;

public class RotHalfPyramid{

    public static void RotInvHalfPyramid(int tot_rows){
        for(int i=1 ; i<=tot_rows ; i++){
            // for spaces
            for(int j=1 ; j<=tot_rows-i ; j++){
                System.out.print(" ");
            }
                // for stars
                for(int k=1 ; k<=i ; k++){
                    System.out.print("*");
                }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Rows:");
        int tot_rows = sc.nextInt();
        RotInvHalfPyramid(tot_rows);

    }
}