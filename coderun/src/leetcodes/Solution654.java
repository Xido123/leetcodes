package leetcodes;

import java.util.HashMap;

public class Solution654 {


      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        HashMap map = new HashMap();
        int max = nums[0];
        int imax = -1;
        if(nums.length == 0)return null;
        if(nums.length ==1){
            return new TreeNode(nums[0]);
        }
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                imax = i;
                System.out.println(imax);
            }
        }
        if(imax == 0){
            int [] R = new int[nums.length-1];
            System.out.println(R.length);
            for(int i=1;i<nums.length;i++){
                System.out.println(nums[i]);
                R[i-1] = nums[i];

            }
            System.out.println(max);
            TreeNode node = new TreeNode(max);
            node.right = constructMaximumBinaryTree(R);
            return node ;
        }
        if(imax == nums.length-1){
            int [] L = new int[nums.length-1];
            for(int i=0;i<nums.length-1;i++){
                L[i] = nums[i];
            }
            TreeNode node = new TreeNode(max);
            node.right = constructMaximumBinaryTree(L);
            return node ;
        }
        if(imax>0&&imax<nums.length){
            int []L = new int[imax];
            int []R = new int [nums.length-imax-1];

            TreeNode node = new TreeNode(max);
            node.left = constructMaximumBinaryTree(L);
            node.right = constructMaximumBinaryTree(R);
            return node ;
        }
        return null;
    }
}
