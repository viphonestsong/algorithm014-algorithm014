package HomeWork.AssignCookies;

import java.util.Arrays;

/**
 * 455.发饼干
 */
public class Solution {

    public static void main(String[] args) {
        int[] g = new int[]{10, 9, 8, 7};
        int[] s = new int[]{5, 6, 7, 8};
        int contentChildren = findContentChildren(g, s);
        System.out.println(contentChildren);


    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;

        int idx = 0;
        for (int i = 0; i < g.length; i++) {
            while (idx < s.length) {
                if (g[i] <= s[idx]) {
                    result++;
                    idx++;
                    break;
                }
                idx++;
            }
            if (idx == s.length) {
                return result;
            }
        }
        return result;
    }

}
