package HomeWork.WordLadder;

import java.util.*;

/**
 * 词语接龙: BFS:  借助队列来实现BFS, 将能转换的单词入列, 循环每层直到找到最近的解
 */
public class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        Deque<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(beginWord);
        visited.add(beginWord);
        char[] beginChars = beginWord.toCharArray();
        int count = 0;
        while (queue.size() > 0) {
            int size = queue.size();
            ++count;
            for (int i = 0; i < size; i++) {
                String poll = queue.poll();
                for (String s : wordList) {
                    if (visited.contains(s)) {
                        continue;
                    }
                    if (!canConvert(poll, s)) {
                        continue;
                    }
                    if (s.equals(endWord)) {
                        return count + 1;
                    }
                    visited.add(s);
                    queue.offer(s);
                }
            }
        }
        return 0;
    }

    public boolean canConvert(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int count = 0;
        for (int i = 0; i < s1.length(); ++i) {
            if (s1.charAt(i) != s2.charAt(i)) {
                ++count;
                if (count > 1) {
                    return false;
                }
            }
        }
        return count == 1;
    }

}
