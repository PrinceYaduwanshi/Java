import java.util.*;

public class Circle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        // if float not defined then taken as double as default so we add (f )infront of it 
        System.out.println(area);
    }
}