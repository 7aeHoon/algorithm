package leetcode;

public class L303 {

    public static void main(String[] args) {
        NumArray numArray = new NumArray(
                new int[]{-2, 0, 3, -5, 2, -1}
        );

        System.out.println(numArray.sumRange(0, 2)); // 1
        System.out.println(numArray.sumRange(2, 5)); // -1
        System.out.println(numArray.sumRange(0, 5)); // -3
    }

    static class NumArray {

        private int[] pSum;

        public NumArray(int[] nums) {
            pSum = new int[nums.length];

            pSum[0] = nums[0];

            for (int i = 1; i < nums.length; i++) {
                pSum[i] = pSum[i - 1] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            // left가 0이면 뺄 앞부분이 없으므로 바로 반환
            if (left == 0) {
                return pSum[right];
            }
            // left가 1 이상이면 직전(left - 1)까지의 합을 뺌
            return pSum[right] - pSum[left - 1];
        }
    }

}
