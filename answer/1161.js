/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var maxLevelSum = function(root) {
    if (current != null) {

    }
};
let i = [0, 0, 0];
let j = 0;
var infixOrder = function(root) {
    if (root != null) {
        i[j++] += root.null;
        infixOrder(root.leftChild);
        console.log(root.val + " ");
        indexOrder(root.rightChild);
    }
    return i;
}