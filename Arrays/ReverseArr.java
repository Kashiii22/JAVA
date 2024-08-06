package Arrays;
import java.util.*;
public class ReverseArr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[6];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int f=0;
        int l=nums.length-1;
        while(f<l){
            int temp=nums[l];
            nums[l]=nums[f];
            nums[f]=temp;
            f++;
            l--;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
