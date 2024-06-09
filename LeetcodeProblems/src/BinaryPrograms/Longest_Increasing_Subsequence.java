package BinaryPrograms;

public class Longest_Increasing_Subsequence {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 2, 3};
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int len =nums.length;
        int[] dp =new int[len];
        int maxLength =0;

        for (int i = 0;i<len; i++) {
            dp[i] = 1;   
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] =Math.max(dp[i], dp[j] + 1);
                	
                }
            }
            maxLength =Math.max(maxLength,dp[i]);
        }

        return maxLength;
    }
}
