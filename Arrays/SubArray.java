// package Arrays;
// import java.util.*;
// public class SubArray {
//     public static void SubArrays(int nums[]){
//         for(int i=0; i<nums.length; i++){
//             int start=i;
//             for(int j=i; j<nums.length; j++){
//                 int end=j;
//                 for(int k=start;k<end;k++){
//                     System.out.print(nums[k]+" ");
//                 }
//                 System.out.println(" ");
//         }
//         System.out.println(" ");
//     }
// }
    
    
//     public static void main(String[] args){
// int nums[]={2,4,6,8,10};
//         SubArrays(nums);
//     }
// }

package Arrays;
import java.util.*;
public class SubArray {
//     public static void maxSubArraySum(int nums[]){
//         int maxSum=Integer.MIN_VALUE;
//         for(int i=0; i<nums.length; i++){
//             int start=i;
//             for(int j=i; j<nums.length; j++){
//                 int end=j;
//                 int currSum=0;
//                 for(int k=start;k<=end;k++){
//                     currSum+=nums[k];
//                 }
//                 if(currSum>maxSum){
//                     maxSum=currSum;
//               }
//         }
//     }
//     System.out.println(maxSum);
  
// }
public static void kadanes(int nums[]){
    int ms=Integer.MIN_VALUE;
    int cs=0;
    for(int i=0;i<nums.length;i++){
        cs+=nums[i];
        if(cs<0){
            cs=0;
            
        }
        ms=Math.max(cs,ms);
    }
    System.out.println(ms);

}
    
    
    public static void main(String[] args){
// int nums[]={2,4,6,8,10};
int nums1[]={5,4,-1,7,8};  
        kadanes(nums1);
    }
}
