public class A1Q3 {
        public static int ans(int nums[]) {
            int ms = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > nums[i]) {
                        ms = Math.max(ms, nums[j] - nums[i]);
                    }
                }
            }
            return ms == Integer.MIN_VALUE ? 0 : ms;
        }
    
        public static void main(String args[]) {
            int nums[] = {7,6,4,3,1};
            int result = ans(nums);
            System.out.println("Maximum difference is " + result);
        }
    }   