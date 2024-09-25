public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
    }
}

interface chessPlayer{
    void moves(); //by default abstract and public 
}

class Queen implements  chessPlayer{
    public void moves() {
        System.out.println("Queen can move in any direction");
    }
}

class Rook implements  chessPlayer{
    public void moves() {
        System.out.println("Rook can move up down left rigth");
    }
}

class King implements  chessPlayer{
    public void moves() {
        System.out.println("king can move one step");
    }
}

interface Herbivore{
    void eatGrass();
}

interface Carnivore{
    void eatMeat();
}

class Bear implements Herbivore , Carnivore{
    public void eatGrass() {
        System.out.println("Herbivore called");
        System.out.println("Bear eats grass");
    }
    public void eatMeat() {
        System.out.println("carnivore called");
        System.out.println("Bear eats meat");
    }
    
}