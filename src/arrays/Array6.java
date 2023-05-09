package arrays;

public class Array6 {

    public static boolean array6(int[] nums, int index) {
        if (index >= nums.length) return false;
        if (nums[index] == 6) return true;
        return array6(nums, index + 1);

    }

    public static void main(String[] args) {
        int[] nums = {1, 6, 4};
        int[] nums2 = {1, 4};
        System.out.println(array6(nums, 0)); //  → true);
        System.out.println(array6(nums2, 0)); // false
    }
}
