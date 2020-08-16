package DailyWork.LRUCache;

import java.util.HashMap;

/**
 * 146.LRU缓存机制-Medium
 * <p>
 * 正规解法：哈希表 + 双向链表
 * 链表操作思路：先想好要处理的节点，然后关注点再该节点进行处理，处理完一个节点再处理下一个节点
 * 题解要点：
 * get方法 - 查询并更新链表最新值
 * put方法 - 添加情况分为已存在和未存在，已存在时直接移动位置更新值减少消耗，添加后处理缓存大小
 */
public class LRUCache2 {

    HashMap<Integer, Node> cacheMap;
    Node head;
    Node tail;
    int size;
    int capacity;

    public LRUCache2(int capacity) {
        cacheMap = new HashMap<>();
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        this.capacity = capacity;
        this.size = 0;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = cacheMap.get(key);
        if (null == node) {
            return -1;
        }
        removeNode(node);
        addFirst(node);
        return node.val;
    }

    public void put(int key, int value) {
        Node node = cacheMap.get(key);
        //添加情况:如已存在直接更新值,减少重新创建Node的消耗
        if (null == node) {
            Node addNode = new Node(key, value);
            addFirst(addNode);
            size++;
            cacheMap.put(key, addNode);
        } else {
            node.val = value;
            removeNode(node);
            addFirst(node);
        }
        if (size > capacity) {
            Node toDel = tail.prev;
            removeNode(toDel);
            cacheMap.remove(toDel.key);
            size--;
        }
    }

    private void addFirst(Node node) {
        Node nextNode = head.next;
        head.next = node;
        nextNode.prev = node;
        node.next = nextNode;
        node.prev = head;
    }

    private void removeNode(Node node) {
        Node preNode = node.prev;
        Node nextNode = node.next;
        preNode.next = nextNode;
        nextNode.prev = preNode;
    }

    class Node {
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

}
