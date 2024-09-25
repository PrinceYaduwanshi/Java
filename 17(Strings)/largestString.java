import java.util.*;
//time complexity of 0(n * string length)
//n is array length

public class largestString{
    public static void main(String[] args) {
        String fruits[]={"apple" , "banana" , "mango"};
        String max = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if(max.compareToIgnoreCase(fruits[i]) < 0 ){
                max = fruits[i]; 
            }
        }
        System.out.println(max);
    }
}