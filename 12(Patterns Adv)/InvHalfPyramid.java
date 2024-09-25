import java.util.*;

public class InvHalfPyramid{
    
    public static void InvHalf_Pyramid(int tot_rows){
        for(int i=1 ; i<=tot_rows ; i++){
            for(int j=1 ; j<=tot_rows-i+1 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int tot_rows = sc.nextInt();
        InvHalf_Pyramid(tot_rows);

    }
}