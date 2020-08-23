package HomeWork.NAryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;


/**
 * N叉树的前序遍历
 * 不难,递归就完事儿了
 */
public class Solution {


    public List<Integer> preorder(Node root) {
        if (null == root) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        orderNode(root, list);
        return list;
    }

    private void orderNode(Node root, List<Integer> list) {
        list.add(root.val);
        for (Node child : root.children) {
            orderNode(child, list);
        }

    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}

