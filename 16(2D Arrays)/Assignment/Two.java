public class Two{
    public static void main(String args[]){
        int arr[][] = {{1, 4, 9},
                        {11, 4, 3},
                        {2, 2, 3}};

        int sum=0;
        for(int i=1,j=0 ; j<arr[0].length ; j++ ){
            sum = sum + arr[i][j];
        }                    
        System.out.println(sum);
    }
}