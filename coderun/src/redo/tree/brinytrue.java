package redo.tree;

import java.lang.reflect.Array;
import java.util.Stack;

public class brinytrue {
/**
 * 二叉树的遍历练习
 *
 */
    Node head = null;

    public brinytrue(Node head) {
        this.head = head;
    }

    private static class Node{
        Object val ;
        Node leftChild;
        Node rightChild;

        public Node(Object val) {
            this.val = val;
        }
    }

    /**
     * 二叉树的前序遍历
     * 先访问根节点 然后前序遍历左子树，再前序遍历右子树
      */

    public static void preOrderTraveral(Node head){
        if(head == null)
            return;
    System.out.println(head.val+" ");
    preOrderTraveral(head.leftChild);
    preOrderTraveral(head.rightChild);
    }
    /**
     * 二叉树的中序遍历
     * 二叉树的中序遍历
     */
    public static void midOrderTraveral(Node head){
        if(head == null)
            return;
        preOrderTraveral(head.leftChild);
        System.out.println(head.val+ " ");
        preOrderTraveral(head.rightChild);

    }
    /**
     * 二叉树的后序遍历
     * 二叉树的后序遍历
     */
    public static void postOrderTraveral(Node head){
        if(head == null){
            return;
        }
        postOrderTraveral(head.leftChild);
        postOrderTraveral(head.rightChild);
        System.out.println(head.val+" ");
    }
    /**
     * 二叉树的前中后序遍历的非递归实现
     * 二叉树的 前中后序遍历的非递归实现
     * 二叉树的前中后序遍历的非递归实现
     * 1 首先申请一个新的栈 记为stack
     * 2 声明一个节点treenode 让其指向node的节点
     * 3 如果treenode 的不为空，将treenode 的值打印 并将treenode入栈
     * 让后让treenode指向treenode的右节点
     *
     * 重复步骤3 知道treenode为空
     *
     * 然后出栈 让tree弄得
     * 执行tree弄得
     * 的有孩子 重复步骤3 直到stack为空
     *
     */
    public static void preOrderTraceralWithStack(Node head){
       Stack<Node> stack = new Stack<>();
       Node cur = head;
       stack.push(cur);
       while(cur != null&& stack.isEmpty()){
           Node temp =  stack.pop();
      System.out.println(cur.val+" ");
           cur = cur.leftChild;
           cur = cur.rightChild;
       }
       while (!stack.isEmpty()){

       }
    }



}
