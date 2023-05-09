package arrays;

public class Array220 {
    public static boolean array220(int[] nums, int index) {
        if (index >= nums.length - 1) return false;
        return (nums[index + 1] == 10 * nums[index] || array220(nums, index + 1));
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 20};
        int[] nums2 = {3, 30};
        int[] nums3 = {3};
        System.out.println(array220(nums, 0));
        System.out.println(array220(nums2, 0));
        System.out.println(array220(nums3, 0));
    }
}
