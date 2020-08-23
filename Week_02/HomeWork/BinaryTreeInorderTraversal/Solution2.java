package HomeWork.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的前序遍历
 * 简单,递归,顺序换下
 */
public class Solution2 {

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (null == root) return list;
        order(root, list);
        return list;
    }

    private void order(TreeNode root, ArrayList<Integer> list) {
        list.add(root.val);
        if (root.left != null) {
            order(root.left, list);
        }
        if (root.right != null) {
            order(root.right, list);
        }
    }

}
