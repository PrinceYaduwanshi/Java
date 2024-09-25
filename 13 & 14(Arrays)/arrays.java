import java.util.*; 

public class arrays{
    
    public static void main(String[] args) {
        // creating arrays
        int num[] = {1 , 2 , 3};
        int marks[] = new int[50];

       //input of elements 
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // output
        System.out.println("marks[0] = " + marks[0]);
        System.out.println("marks[1] = " + marks[1]);
        System.out.println("marks[2] = " + marks[2]);
        
        // update
        marks[0] = 100;
        System.out.println("updated marks " + marks[0]);
        System.out.println("Length of array "+marks.length);
    }
}