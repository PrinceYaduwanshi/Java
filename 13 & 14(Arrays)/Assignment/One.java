// BRUTE FORCE O(n^2)

public class One{
    
    public static boolean duplicateCheck(int num[]){
        for(int i=0 ; i<num.length ; i++){
            for(int j=i+1 ; j<num.length ; j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int num[]={1, 2, 3, 4};
        boolean result = duplicateCheck(num);
        System.out.println(result);

        int num2[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result2 = duplicateCheck(num2);
        System.out.println(result2);

    }
}