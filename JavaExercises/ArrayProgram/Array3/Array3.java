public class ArrayMax {
    public static void main(String[] args) {
        int[] nums = {7, 3, 9, 2, 11};
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }
}
