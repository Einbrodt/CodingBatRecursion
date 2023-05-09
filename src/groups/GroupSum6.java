package groups;

public class GroupSum6 {

    public static boolean groupSum6(int start, int[] nums, int target) {
        if (nums.length <= start) return target == 0;
        if (groupSum6(start + 1, nums, target - nums[start])) return true;
        if (groupSum6(start + 1, nums, target)) return true;
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {5,6,2};
        System.out.println(groupSum6(0, nums, 8)); //→ true
        System.out.println(groupSum6(0, nums, 9)); //→ false
        System.out.println(groupSum6(0, nums, 7)); //→ false
    }
}
