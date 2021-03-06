/**
 *
 * @param {Number} val
 * @param {TreeNode} left
 * @param {TreeNode} right
 */
function TreeNode(val, left, right) {
  this.val = val === undefined ? 0 : val;
  this.left = left === undefined ? null : left;
  this.right = right === undefined ? null : right;
}

/**
 *
 * @param {TreeNode} root
 * @param {Number} level
 * @param {Array<Array<Number>>} levelsArray
 * @returns {Array<Array<Number>>}
 */
function levelTraverse(root, level, levelsArray) {
  if (!root) {
    return;
  }
  if (level >= levelsArray.length) {
    levelsArray.push([]);
  }
  levelsArray[level].push(root.val);
  levelTraverse(root.left, level + 1, levelsArray);
  levelTraverse(root.right, level + 1, levelsArray);
}

/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var averageOfLevels = function (root) {
  const levelsArray = [];
  levelTraverse(root, 0, levelsArray);
  return levelsArray.map(
    (numbers) =>
      numbers.reduce((sum, current) => sum + current) / numbers.length
  );
};
