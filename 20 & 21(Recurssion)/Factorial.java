public class Factorial {

    public  static int printFact(int n){
        if( n == 0){
            return 1;
        }
        
        int fact = n*printFact(n-1);
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(printFact(10));
    }
}
