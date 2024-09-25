public class Fibonacci {

    public static int fibonacciSeries(int n){
        if( n == 0 || n==1){
            return n;
        }
        
        int fibo = fibonacciSeries(n-1) + fibonacciSeries(n-2);
        
        return fibo;
    }

    public static void main(String[] args) {
        for(int i = 0 ; i<=5 ; i++){
            System.out.print(fibonacciSeries(i) + " ");
        }
    }
}
