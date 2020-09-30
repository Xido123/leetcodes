package leetcodes;

import java.util.ArrayList;

public class Solution938 {
    public int rangeSumBST(TreeNode root, int L, int R) {
        ArrayList<Integer> list = new ArrayList<Integer> ();
        list  = preOrder(root,list);
        int sum =0;
        for(int i:list){
            if(i>=L&&i<=R)
                sum+=i;
        }
        return sum;
    }
    public ArrayList<Integer> preOrder (TreeNode root,ArrayList<Integer> list){
        if(root == null) {
            list.add(0);
            return list;
        }
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
        return list;
    }
  public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }



}
