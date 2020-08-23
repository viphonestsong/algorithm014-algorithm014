package HomeWork.GroupAnagrams;

import java.util.*;


/**
 * 字母异位词分组
 * 同字母异位词判断, 进行异位词分组
 * 自己实现hash或者使用JDK自带sort排序
 * LeetCode Mapkey构建方法 : A + 分隔符 + b ...
 */
public class Solution {

    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> lists = groupAnagrams(arr);
        System.out.println(lists);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
