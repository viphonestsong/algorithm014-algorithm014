package DailyWork.ContainerWithMostWater;


/**
 * 11.盛最多水的容器
 * 解决办法：暴力解法
 */
public class Solution2 {

    /*public static void main(String[] args) {
        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }*/

    public static int maxArea(int[] height) {
        int max = 0;
        if (null == height || height.length <= 0) return max;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = 1; j < height.length; j++) {
                max = Math.max((j-i) * Math.min(height[j],height[i]), max);
            }
        }
        return max;
    }

}
