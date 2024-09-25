public class binaryStrings {
    
    public static void printStrings(int n, int lastPlace , String str){

        if(n == 0){
            System.out.println(str);
            return;
        }

        printStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            printStrings(n-1, 1, str+"1");
        }

        // if(lastPlace == 0){
        //     printStrings(n-1, 0 , str.append("0"));
        //     printStrings(n-1, 1 , str.append("1"));
        // }else{
        //     printStrings(n-1, 0, str.append("0"));
        // }
        
    }
    
    public static void main(String[] args) {
        printStrings(5, 0, "");
    }
}
