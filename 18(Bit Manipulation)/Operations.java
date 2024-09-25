public class Operations{

    public static void get_i_bit(int n , int i){
        int bitmask = (1 << i);
        if((n & bitmask) == 0){
            System.out.println(i+"-th bit is 0");
        }else{
            System.out.println(i+"-th bit is 1");
        }

    }

    public static void set_i_bit(int n , int i){
        int bitmask = (1 << i);
        System.out.println( n | bitmask);

    }

    public static int clear_i_bit(int n , int i){
        int bitmask = ~(1 << i);
        System.out.println( n & bitmask);
        return n & bitmask;

    }

    public static void update_i_bit(int n , int i , int newBit){
    //     // if( newBit == 0){
    //     //     clear_i_bit(n , i);
    //     // }else{
    //     //     set_i_bit(n , i);
    //     // }
        n = clear_i_bit(n, i);
        int bitmask = newBit<<i;
        System.out.println( n | bitmask);

    }

    public static void clearLast_i_bit(int n , int i){
        int bitmask = ((-1) << i);
        System.out.println( n & bitmask);
        

    }

    

    public static void clear_range_bits(int n , int i , int j){
        int a = ((~0) << (j+1));
        int b = (1 << i)-1;
        int bitmask = a | b;
        System.out.println( n & bitmask);

    }

    public static void main(String[] args) {
        get_i_bit(10 ,3);
        set_i_bit(10 , 1);
        clear_i_bit(10 ,1);
        update_i_bit(10, 1, 1);
        clearLast_i_bit(15 , 2);
        clear_range_bits(10, 2, 4);
    }
}