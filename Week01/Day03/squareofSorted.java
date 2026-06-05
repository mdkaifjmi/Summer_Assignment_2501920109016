class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0, right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int ls = nums[left] * nums[left];
            int rs = nums[right] * nums[right];

            if (ls > rs) {
                result[pos--] = ls;
                left++;
            } else {
                result[pos--] = rs;
                right--;
            }
        }

        return result;
    }
}