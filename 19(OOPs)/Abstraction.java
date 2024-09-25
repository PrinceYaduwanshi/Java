public class Abstraction{
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        // Horse h1 = new Horse();
        // h1.eat();
        // h1.walk();
        // Chick c1 = new Chick();
        // c1.eat();
        // c1.walk();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("eats");
    }
    Animal(){
        System.out.println("Animal construcor is created");
    }

    abstract void walk();
    
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
    Horse(){
        System.out.println("Horse construcor is created");
    }
}

class Mustang extends Horse{
    
    Mustang(){
        System.out.println("Mustang construcor is created");
    }
}

class Chick extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}