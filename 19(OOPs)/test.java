import Sample.Calculator;

//SAMPLE FOR USING USER DEFINED PACKAGE
public class test {
    public static void main(String[] args) {
    Calculator calc = new Calculator();
    int sum = calc.add( 5 , 9);
    System.out.println("Sum is " + sum);

    int diff = calc.subtract( 5 , 9);
    System.out.println("Diff is " + diff);
    }
}
