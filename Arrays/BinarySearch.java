package Arrays;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int start = 0;
        int target = sc.nextInt();
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Element not found");
    }
}
