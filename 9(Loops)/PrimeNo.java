import java.util.*;

public class PrimeNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factor=0;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0){
                factor++;
            }
    }
    if(factor == 0){
        System.out.println("Prime Number");
    }else{
        System.out.println("Not a Prime Number");
    }
}
}