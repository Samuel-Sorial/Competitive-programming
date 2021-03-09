// Solution for https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/589/week-2-march-8th-march-14th/3666/

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
 * @param {number} v
 * @param {number} d
 * @param {number} currDepth
 * @param {string} direction
 * @return {TreeNode}
 */

const addRow = function(root, v, d, currDepth, direction){

    if(d === currDepth){
        return new TreeNode(v, direction === 'left' ? root :null, direction === 'left' ? null : root)
    }
    if(root){
        root.left = addRow(root.left, v, d, currDepth+1, 'left');
        root.right = addRow(root.right, v,d, currDepth+1, 'right');

    }
    return root;
}

/**
 * @param {TreeNode} root
 * @param {number} v
 * @param {number} d
 * @return {TreeNode}
 */
var addOneRow = function(root, v, d) {
    return addRow(root, v, d, 1, 'left');
};