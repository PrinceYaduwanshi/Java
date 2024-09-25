public class SuperKey {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);

    }
}


class Animal{
    String color = "brown";
    Animal(){
        System.out.println("Animal constructor created");
    }
}

class Horse extends Animal{
    Horse(){
        super.color = "dark brown";
        System.out.println("Horse constructor created");
    }
}