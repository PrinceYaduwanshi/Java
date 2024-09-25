import java.util.*;


public class strings{

    public static void printLetters(String fullName){
        for(int i=0 ; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // char arr[]={'A', 'B', 'C', 'D'};
        // String str="ABCD";
        // String str2 = new String("XYZ");

        Scanner sc = new Scanner(System.in);
        String firstname,lastname;
        firstname = sc.nextLine();
        lastname = sc.nextLine();
        String fullname = firstname +" "+lastname;
        System.out.println(fullname+" is this");
        printLetters(fullname);
        // System.out.println(name);
        // System.out.println(name.length());


    }
}