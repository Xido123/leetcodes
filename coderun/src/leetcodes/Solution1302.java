package leetcodes;

import java.util.*;

public class Solution1302 {
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
         TreeNode(int x) { val = x; }
     }
    public static int deepestLeavesSum(TreeNode root) {

        return 1;
    }
  public static void main(String[] args) {
    //
      TreeNode node = new TreeNode(3);
      node.left = new TreeNode(2);
      node.right = new TreeNode(4);
      node.left.left = new TreeNode(2);
      node.left.right = new TreeNode(2);

      node.right.right = new TreeNode(2);
      node.right.right.right = new TreeNode(2);
    System.out.println(deepestLeavesSum(node));
  }
}
