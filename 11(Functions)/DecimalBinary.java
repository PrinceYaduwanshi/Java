import java.util.*;

public class DecimalBinary{

    public static void DecimaltoBinary(int n){
        int power=0;
        int binNum = 0;

        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem * (int)Math.pow(10,power));
            n = n/2;
            power ++;

        }
        System.out.println("Binary Form:"+binNum);   
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number:");
        int n = sc.nextInt();
        DecimaltoBinary(n);

        
    }
}