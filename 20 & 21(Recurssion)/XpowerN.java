public class XpowerN {

    public static int powercalc(int x , int n){
        if( n == 0){
            return 1;
        }
        // int pm1 = powercalc(x, n-1);
        // int power = x * pm1;
        return x * powercalc(x, n-1);
    }

    public static long optimizedPower(long x , long n){
        if(n == 0){
            return 1;
        }
        long halfSq = optimizedPower(x, n/2);
        long halfPowerSq = halfSq * halfSq ;
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        int x =3;
        System.out.println(powercalc(x, 4));
        System.out.println(optimizedPower(2, 5));
    }
}
