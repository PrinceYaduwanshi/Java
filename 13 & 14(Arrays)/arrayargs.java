import java.util.*;

public class arrayargs{

    public static void update(int marks[]){
        for(int i =0 ; i<marks.length ; i++){
            marks[i] = marks[i] + 2 ;

        }

        System.out.println("inside Update function");

        for(int i =0 ; i<marks.length ; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int marks[] = { 89 , 90 , 95};

        update(marks);

        System.out.println("Inside main function");
        for(int i = 0 ; i<marks.length ; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        
    }
}