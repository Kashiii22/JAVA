public class Insertion {
    public static void insertion(int nums[]){
        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];
            int prev = i - 1;
            while(prev >= 0 && nums[prev] > curr){
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
    }

    public static void main(String args[]){
        int nums[] = {4, 2, 8, 5, 1};
        insertion(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
