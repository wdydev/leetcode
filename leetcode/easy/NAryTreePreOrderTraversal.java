package leetcode.easy;

import java.util.LinkedList;
import java.util.List;

public class NAryTreePreOrderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    List<Integer> result;

    public List<Integer> preorder(Node root) {
        result = new LinkedList<>();
        helper(root);
        return result;
    }

    private void helper(Node root) {
        if (root == null) {
            return;
        }

        result.add(root.val);

        for (Node n : root.children) {
            helper(n);
        }
    }
}
