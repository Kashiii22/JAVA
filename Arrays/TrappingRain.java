
import java.util.*;
public class TrappingRain {
    public static int water(int nums[]){
        int leftMax[]= new int[nums.length];
        leftMax[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            leftMax[i] = Math.max(nums[i], leftMax[i - 1]);
        }
        
        int rightMax[] = new int[nums.length];
        rightMax[nums.length - 1] = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(nums[i], rightMax[i + 1]);
        }
        
        int trappedWater = 0;
        for(int i = 0; i < nums.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - nums[i];
        }
        
        return trappedWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = water(nums);
        System.out.println("Trapped water is: " + ans);
        sc.close();
    }
}
