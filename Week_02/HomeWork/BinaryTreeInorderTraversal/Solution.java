package HomeWork.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序遍历
 * 简单,递归就完事儿了
 */

public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (null == root) return list;
        inorder(root, list);
        return list;
    }

    private void inorder(TreeNode root, ArrayList<Integer> list) {
        if (root.left != null) {
            inorder(root.left, list);
        }
        list.add(root.val);
        if (root.right != null) {
            inorder(root.right, list);
        }
    }
}