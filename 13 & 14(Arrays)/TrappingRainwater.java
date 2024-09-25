import java.util.*;

public class TrappingRainwater{
    public static int TrapWater(int height[]){
        // calculate left max boundary-->> array
        // moves from left side
        int n=height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i=1 ; i<n ; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        // calculate rightmax boundary-->>array
        // moves from right side
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i =n-2 ; i>=0 ; i--){
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }

        // loop
        int trap_water=0;
        for(int i=0 ; i<n ; i++){
            //water_level = min(left max , right max) 
            int water_level=Math.min(leftMax[i],rightMax[i]);

            // trapped water = (water_level - bar_height)*1(width)
            trap_water = trap_water+(water_level-height[i])*1;
        }
        
        return trap_water;
    }

    public static void main(String args[]){
        int height[]={4, 2, 0, 6, 3, 2, 5};
        int total_water=TrapWater(height);
        System.out.println(total_water);
    }
}