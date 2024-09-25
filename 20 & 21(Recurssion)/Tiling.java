public class Tiling {
    
    public static int placeTile(int n){
        if(n ==0 || n==1){
            return 1;
        }
        
        // vertical choice
        int verticalTile = placeTile(n-1);

        // horizontal choice
        int horizontalTile = placeTile(n-2);

        int totalways = verticalTile + horizontalTile;
        return  totalways;
    }
    
    public static void main(String args[]){
        System.out.println(placeTile(4));
    }
}
