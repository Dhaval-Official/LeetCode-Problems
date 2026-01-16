package Problems.All;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution_0144 {
    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<Integer>();
        Stack<TreeNode> treeLine= new Stack<TreeNode>();
        if (root == null) {
            return ans;
        }
        // System.out.println(treeLine.peek().val);
        ans.add(root.val);
        treeLine.add(root);
        TreeNode head = root;


        while(root != null) {

            if(root.left == null && root.right == null && treeLine.peek() == head) {
                break;
            }

            // System.out.print(root.val+" ");
            if(root.left != null) {
                root = root.left;
                ans.add(root.val);
                treeLine.add(root);
                continue;
            } else if(root.right != null) {
                root = root.right;
                ans.add(root.val);
                treeLine.add(root);
                continue;
            }

            treeLine.pop();
            root = treeLine.peek();
            if(root.left == null) {
                root.right = null;
            } else {
                root.left = null;
            }
        }


        // System.out.println();
        // System.out.print("Stack--> ");
        // while(!(treeLine.isEmpty())) {
        // System.out.print(treeLine.pop().val);
        // }
        // System.out.println();
        // System.out.println("current node "+root.val);

        return ans;
    }
}
