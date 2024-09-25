import java.util.*;

public class Number{
    
    public static void NumPyramid(int tot_row){
        for (int i = 1 ; i<=tot_row ; i++){
            //  for spaces
             for(int j = 1 ; j<=(tot_row-i) ; j++){
                System.out.print(" ");
             }
            // for numbers
            for (int j = 1 ; j<=i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int tot_row = sc.nextInt();
        NumPyramid(tot_row);
    }
}