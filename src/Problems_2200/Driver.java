package Problems_2200;

import common.TreeNode;

public class Driver {
    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(10, t1, t2);

        Solution s = new Solution();

        boolean a = s.checkTree(t3);

        System.out.println(a);


    }
}
