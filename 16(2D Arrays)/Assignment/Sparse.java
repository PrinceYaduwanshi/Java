import java.util.*;

public class Sparse{

    public static void inputMatrix(int arr[][]){
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                System.out.println("Enter element at position [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void addMatrix(int arr1[][] , int arr2[][]){
        int rows1 = arr1.length;
        int cols1 = arr1[0].length;

        int rows2 = arr2.length;
        int cols2 = arr2[0].length;

        
        int sumarr[][] = new int[rows1][cols1];
        if(rows1 == rows2 && cols1 == cols2){
             
            for(int i = 0 ; i<rows1 ; i++){
                for(int j=0 ; j<cols1 ; j++){
                    sumarr[i][j] = arr1[i][j] + arr2[i][j];
                }
            }    
        }
        SparseMatrix(sumarr);
        
    }

    public static void SparseMatrix(int arr[][]){
        int row= arr.length;
        int col=arr[0].length;


        System.out.println("Rows\tColumns\t Value");
        int count=0;
        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<col ; j++){
                if(arr[i][j] != 0){
                    System.out.print( i + "\t" + j + "\t" + arr[i][j] + "\n");
                    count++;
                }
                
            }
        }
        System.out.println("Total non-zero elements: "+count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows");
        int n = sc.nextInt();
        System.out.println("Enter no. of columns");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        inputMatrix(arr);

        System.out.println("Enter no. of rows for 2nd Matrix");
        int x = sc.nextInt();
        System.out.println("Enter no. of columns for 2nd Matrix");
        int y = sc.nextInt();
        int arr2[][] = new int[x][y];
        inputMatrix(arr2);
        
        addMatrix(arr , arr2);


    }
}