import java.util.*;


public class matrix{

    public static void search(int matrix[][] , int key){
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(key == matrix[i][j]){
                    System.out.println("Element is present at index [" + i + "," + j + "]");
                    break;
                }
            }
            

        }
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        int n= matrix.length;//n=3(rows)
        int m = matrix[0].length;//m=3(cols)

        Scanner sc = new Scanner(System.in);
        //input
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.println("Enter the value for matrix [" + i + "][" + j + "]");
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("Matrix:");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }

        search(matrix , 6);
    }
}