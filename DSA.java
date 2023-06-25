import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main solution = new Main();
        
        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]
        
        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2)); // Output: [0]
    }

    private void moveZeroes(int[] nums1) {
    }
}