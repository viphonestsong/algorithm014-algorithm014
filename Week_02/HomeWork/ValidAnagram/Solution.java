package HomeWork.ValidAnagram;


/**
 * 242.有效的字母异位词
 * 方法一: sort排序
 * 方法二: 哈希表, 比较数组
 */
class Solution {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean anagram = isAnagram(s, t);
        System.out.println(anagram);
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

}