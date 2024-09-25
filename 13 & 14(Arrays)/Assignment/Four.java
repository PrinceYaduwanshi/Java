public class Four{
    
    public static int trapWater(int num[]){
        int n=num.length;

        // left side wall
        int leftMax[]= new int[n];
        leftMax[0]=num[0];
        for(int i=1 ; i<n ; i++){
            leftMax[i] = Math.max(leftMax[i-1],num[i]);    
        }

        // right max wall
        int rightMax[]= new int[n];
        rightMax[n-1]=num[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            rightMax[i]=Math.max(rightMax[i+1],num[i]);
        }

        int trap_water=0;
        for(int i=0 ; i<n ; i++){
            int water_level = Math.min(leftMax[i] , rightMax[i]);
            trap_water=trap_water+(water_level - num[i]);
        }

        return trap_water;
        
    }
    
    public static void main(String[] args) {
        int height[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trapWater(height));
    }
}