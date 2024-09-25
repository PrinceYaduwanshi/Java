import java.util.*;

public class Four{

    public static boolean anagrams(String str1 , String str2){
        if(str1.length() == str2.length()){
            int len = str1.length();
            int i=0;
                
                for(int j=0 ; j<len ; j++){
                    char ch = str1.charAt(i);
                    if(ch == str2.charAt(j)){
                        i++;

                    }else{
                        break;
                    }
                    return true;
                }
            
            
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(anagrams(str1 , str2));

    }
}