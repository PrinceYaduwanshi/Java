import java.util.*;

public class largestinmatrix{

    public static void largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
         for(int i=0 ; i<matrix.length ; i++){
            for (int j=0 ; j<matrix[0].length ; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element in the matrix is: "+largest);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//rows
        int m = sc.nextInt();//cols

        int matrix[][] = new int[n][m];

        for(int i=0 ; i<matrix.length ; i++){
            for (int j=0 ; j<matrix[0].length ; j++){
                System.out.println("Enter value of ("+i+","+j+")");
                matrix[i][j] = sc.nextInt();
            }
        }

        //print matrix
         for(int i=0 ; i<matrix.length ; i++){
            for (int j=0 ; j<matrix[0].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        largest(matrix);

    }
}