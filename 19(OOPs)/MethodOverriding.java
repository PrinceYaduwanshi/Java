public class MethodOverriding {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eats();//prints the value of its own class not parent class
    }
}

class Animal{
    void eats(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eats(){
        System.out.println("eats grass");
    }
}