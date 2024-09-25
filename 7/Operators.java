public class Operators{
    public static void main(String args[]){
        int a,c;
        a=c=10;
        int b,d;
        b=d=5;
        // Binary Operators
        System.out.println("a+b = "+(a+b));
        System.out.println("a-b = "+(a-b));
        System.out.println("a*b = "+(a*b));
        System.out.println("a/b = "+(a/b));
        System.out.println("a%b = "+(a%b));

        System.out.println("Pre-Increment Operator:"+(++a));
        System.out.println(a);
        System.out.println("Post-Increment Operator:"+(c++));
        System.out.println(c);
        System.out.println("Pre-Decrement Operator:"+(--b));
        System.out.println(b);
        System.out.println("Post-Decrement Operator:"+(d--));
        System.out.println(d);
    
    }
}