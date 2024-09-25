public class Inheritance{
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.swim();
        // shark.eats();
        Dog doberman = new Dog();
        doberman.bark();
        doberman.legs = 4;
        doberman.eats();
    }
}

// BASE CLASS
class Animal{
    String color;
    void eats(){
        System.out.print("Base class \t");
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breaths");
    }
}
// CHILD CLASS
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims");
    }
    
}

class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    void bark(){
        System.out.print("From derived class 2 \t");
        System.out.println("Barks");
    }
}