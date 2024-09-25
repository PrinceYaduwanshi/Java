import java.util.*;

public class InvertedStar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of lines");
        int n = sc.nextInt();
        for(int i = 1; i<=n ; i++){
            for(int j=1 ; j<=(n-i+1) ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // ***2nd Method***
        // for(int i = n ; i>0 ; i--){
        //     for(int j=1 ; j<=i ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
}