package HomeWork.UglyNumber;

/**
 * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
 *
 */
public class Solution {

    public static void main(String[] args) {
        int i = nthUglyNumber(5);
        System.out.println(i);
    }

    public static int nthUglyNumber(int n) {
        int i = 0, j = 0, k = 0, p = 1;
        int[] dp = new int[n];
        dp[0] = 1;
        while (p < n) {
            dp[p] = Math.min(dp[i] * 2, Math.min(dp[j] * 3, dp[k] * 5));
            if (dp[p] == dp[i] * 2) i++;
            if (dp[p] == dp[j] * 3) j++;
            if (dp[p] == dp[k] * 5) k++;
            p++;
        }
        return dp[n - 1];
    }

}
