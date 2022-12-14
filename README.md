# java_invert_binary_tree

Given the `root`
 of a binary tree, invert the tree, and return *its root*.

## Examples

**Example 1:**

![https://assets.leetcode.com/uploads/2021/03/14/invert1-tree.jpg](https://assets.leetcode.com/uploads/2021/03/14/invert1-tree.jpg)

```
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]

```

**Example 2:**

![https://assets.leetcode.com/uploads/2021/03/14/invert2-tree.jpg](https://assets.leetcode.com/uploads/2021/03/14/invert2-tree.jpg)

```
Input: root = [2,1,3]
Output: [2,3,1]

```

**Example 3:**

```
Input: root = []
Output: []

```

**Constraints:**

- The number of nodes in the tree is in the range `[0, 100]`.
- `-100 <= Node.val <= 100`

## 解析

題目給定一個二元樹的 root 

實作一個演算法把數中所有原本左邊的結點換成右邊的結點

已知每個結點都由左結點與右邊結點組成

所以 要反轉整個樹的左右結點等於 把root 的左右結點互換 + 原本左子樹做反轉 + 原本右子樹做反轉

## 程式碼
```java
class Solution {
  /**
   * Definition for a binary tree node.
   * public class TreeNode {
   *     int val;
   *     TreeNode left;
   *     TreeNode right;
   *     TreeNode() {}
   *     TreeNode(int val) { this.val = val; }
   *     TreeNode(int val, TreeNode left, TreeNode right) {
   *         this.val = val;
   *         this.left = left;
   *         this.right = right;
   *     }
   * }
   */
  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return root;
    }
    TreeNode left = root.left;
    TreeNode right = root.right;
    root.left = invertTree(right);
    root.right = invertTree(left);
    return root;
  }
}
```
## 困難點

1. 看出每個轉換結點的遞迴關係

## Solve Point

- [x]  Understand what problem would like to solve
- [x]  Analysis Complexity