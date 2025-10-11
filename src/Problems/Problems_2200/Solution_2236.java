package Problems.Problems_2200;

import common.TreeNode;

class Solution_2236 {
    public boolean checkTree(TreeNode root) {

        int a = root.val;

        return root.val == root.left.val + root.right.val;

    }
}