package DailyWork.ClimbingStairs;

/**
 * 斐波那契数列
 * 目前所学用递归求解会超时, 只需要循环相加即可
 */
public class Solution {

    public int climbStairs(int n) {
        if (n < 3)  return n;
        int f1 =1,f2 =2,f3=3;
        for (int i = 0; i < n - 2; i++) {
            f3 = f1 +f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

}

