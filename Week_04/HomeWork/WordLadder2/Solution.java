package HomeWork.WordLadder2;

import java.util.*;

/**
 * 126.单词接龙2
 * 需要自己构建queue的list实现bfs, 在每一层queue的list进行叠加回溯, 注意的点是每层要统一添加,否则前面会使得后面的visit无法添加
 */
public class Solution {

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        HashSet<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return result;
        HashSet<String> visited = new HashSet<>();
        Deque<List<String>> queue = new LinkedList<>();

        ArrayList<String> beginList = new ArrayList<>();
        beginList.add(beginWord);
        queue.add(beginList);

        boolean flag = false;
        while (queue.size() > 0 && !flag) {
            int size = queue.size();
            //此处需要格外注意: 要统一在最后进行添加, 不然会使得第一次添加的后续添加出问题
            Set<String> subVisit = new HashSet<>();
            for (int i = 0; i < size; i++) {
                List<String> path = queue.poll();
                String word = path.get(path.size() - 1);
                char[] chars = word.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char temp = chars[j];
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        chars[j] = ch;
                        if (temp == ch) {
                            continue;
                        }
                        String str = new String(chars);
                        if (wordSet.contains(str) && !visited.contains(str)) {
                            List<String> pathList = new ArrayList<>(path);
                            pathList.add(str);
                            if (str.equals(endWord)) {
                                flag = true;
                                result.add(pathList);
                            }
                            queue.add(pathList);
                            subVisit.add(str);
                        }
                    }
                    chars[j] = temp;
                }


            }
            //统一添加该层的list
            visited.addAll(subVisit);
        }
        return result;
    }

}