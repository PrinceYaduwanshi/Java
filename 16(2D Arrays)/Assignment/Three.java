import java.util.*;

public class Three{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Rows");
        int n = sc.nextInt();
        System.out.println("Enter no. of Columns");
        int m = sc.nextInt();
        
        int arr[][] = new int[n][m] ;

        int arr2[][] = new int[m][n];

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.println("Enter element at position [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                arr2[j][i] = arr[i][j];
            }
        }

        // print transpose

        for(int i=0 ; i<arr2.length ; i++){
            for(int j=0 ; j<arr2[0].length ; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
