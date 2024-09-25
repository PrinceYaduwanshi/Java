import java.util.*;

public class Triangle01{

    public static void Triangle(int tot_rows){
        for(int i=1;i<=tot_rows;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of rows: ");
        int tot_rows = sc.nextInt();
        Triangle(tot_rows);

    }
    
}