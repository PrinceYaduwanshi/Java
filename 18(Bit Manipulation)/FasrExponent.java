public class FastExponenet{
    public static void main(String[] args){
        int a = 5;
        int n=3;
        int ans = 1;
        while(n > 0){//convert power n to binary bits 
            if( (n & 1) != 0){ // checks the LSD
                ans = ans *a;
            }
            a = a*a;
            n = n>>1;
        }  
        System.out.println(ans);   
    }
}