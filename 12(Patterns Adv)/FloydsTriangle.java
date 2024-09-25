import java.util.*;

public class FloydsTriangle{
    
    public static void Floyds(int tot_rows){
        int f=1;
        for (int i=1 ; i<=tot_rows ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(f+" ");
                f++;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int tot_rows = sc.nextInt();
        Floyds(tot_rows);

    }
}