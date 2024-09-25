public class Sorting{
    
    public static void bubbleSort(int num[]){
        //total turns ::: n-1
        //comparison should be made till n-i-turns
        for(int turn=0 ; turn<num.length-1 ; turn++){
            for(int j=0 ; j<num.length-1-turn ; j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int num[] = {5, 4, 1, 3, 2};
        bubbleSort(num);
        for(int i=0 ; i<num.length ; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}