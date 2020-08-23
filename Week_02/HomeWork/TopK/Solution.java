package HomeWork.TopK;


import java.util.*;

/**
 * 前 K 个高频元素
 * 1.构建HashMap,数数
 * 2.构建大顶堆,进行插入,同时维护k的大小
 * 3.不断取顶堆元素,填充返回数组
 */
public class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        // 遍历map，用最小堆保存频率最大的k个元素
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);
            }
        });
        for (Integer key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else if (map.get(key) > map.get(pq.peek())) {
                pq.remove();
                pq.add(key);
            }
        }
        int[] res = new int[k];
        for(int i =0;i<k;i++){
            res[i] = pq.remove();
        }
        return  res;
    }
}
