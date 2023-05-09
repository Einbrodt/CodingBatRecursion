package arrays;

public class Array11 {
    public static int array11(int[] nums, int index) {
        if (nums.length <= index) return 0;
        if (nums[index] == 11) return 1 + array11(nums, index + 1);
        return array11(nums, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = {11, 11};
        int[] nums2 = {1, 2, 11};
        System.out.println(array11(nums, 0)); // → 2);
        System.out.println(array11(nums2, 0)); // 1
    }
}
