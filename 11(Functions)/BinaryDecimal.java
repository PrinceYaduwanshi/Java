import java.util.*;

public class BinaryDecimal{
    
    public static void binDec(int binNum){
        int power=0;
        int decNum =0;

        while(binNum>0){
            int lastDigit = binNum%10;
            if(lastDigit == 0 || lastDigit ==1){
                decNum += lastDigit * (int)Math.pow(2, power);
                power ++;
                binNum/=10;
                
            }else{
                System.out.println("Not a binary Number");
                break;
                
            }
            
        }
        System.out.println("Decimal Number is: "+decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int binNum = sc.nextInt();
        binDec(binNum);

    }
}