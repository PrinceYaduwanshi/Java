import java.util.*;

public class Four{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The table for"+n+"is");
        for(int i=1 ; i<=10 ; i++){
            System.out.println(n+" * "+i+"="+n*i);
        }
    }
}