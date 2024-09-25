public class FuncOverload{
    public static int sum(int a , int b){
        return a+b;
    }
    public static float sum(float a , float b , float c){
        return a+b+c;
    }
    public static void main(String agrs[]){
        System.out.println(sum(2,3));
        System.out.println(sum(4,5,6));
    }
}