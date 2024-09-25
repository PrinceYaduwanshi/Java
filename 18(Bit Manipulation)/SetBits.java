public class SetBits{
    public static void main(String[] args) {
        int n = 3;
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) {//check lSD
                count++;
            }
        n = n >> 1;     
        }
        System.out.println(count);
    }
}