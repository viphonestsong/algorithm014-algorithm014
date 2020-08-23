package DailyWork.ContainerWithMostWater;

/**
 * 11.盛最多水的容器
 * 解决办法：双指针左右夹逼
 */
public class Solution1 {

    public int maxArea(int[] height) {

        int max = 0;
        if (null == height || height.length <= 0) return max;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            max = Math.max(Math.min(height[left], height[right]) * (right - left), max);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

}
