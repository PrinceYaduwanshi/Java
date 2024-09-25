public class OddEven{

    public static void OddEvenCheck(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
    }

    public static void main(String[] args) {
        OddEvenCheck(9);
        OddEvenCheck(12);
    }
}