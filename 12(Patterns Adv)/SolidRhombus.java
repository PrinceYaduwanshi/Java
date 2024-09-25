import java.util.*;

public class SolidRhombus{

    public static void rhombus(int tot_rows){
        for (int i=1 ; i<=tot_rows ; i++){
            // for spaces
            for (int j=1 ; j<=tot_rows-i ; j++){
                System.out.print(" ");
            }
            // for stars
            for(int k=1 ; k<=tot_rows ; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int tot_rows = sc.nextInt();
        rhombus(tot_rows);
    }
}