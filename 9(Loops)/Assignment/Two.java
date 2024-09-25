import java.util.*;

public class Two{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice,number;
        int evenSum=0,oddSum=0;
        do{
            System.out.println("Enter the number");
            number=sc.nextInt();
            if(number%2==0){
                evenSum+=number;
            }else{
                oddSum+=number;
            }

            System.out.println("Want to continue.\n1 for Yes\n2 for No");
            choice=sc.nextInt();
        }while(choice==1);

        System.out.println("Sum of even integers:"+evenSum);
        System.out.println("Sum of odd integers:"+oddSum);
    }
}