import java.util.HashMap;

public class Solution {
  public TreeNode createBinaryTree(String[] inputs) {
    TreeNode result = null, cur;
    HashMap<Integer, TreeNode> hash = new HashMap<>();
    int size = inputs.length;
    for (int idx = 0; idx < size; idx++) {
      int num = 0;
      String val = inputs[idx];
      if (!val.equals("null")) {
        num = Integer.parseInt(val);
      }
      if (idx == 0) {
        result = new TreeNode(num);
        hash.put(num, result);
      }
      if (hash.containsKey(num)) {
        cur = hash.get(num);
      } else {
        cur = new TreeNode(num);
        hash.put(num, cur);
      }
      if (2*idx+1 < size) {
        if (!inputs[2*idx+1].equals("null")) {
          int leftVal = Integer.parseInt(inputs[2*idx+1]);
          if (hash.containsKey(leftVal)) {
            cur.left = hash.get(leftVal);
          } else {
            cur.left = new TreeNode(leftVal);
            hash.put(leftVal, cur.left);
          }
        }
      }
      if (2*idx+2 < size) {
        if (!inputs[2*idx+2].equals("null")) {
          int rightVal = Integer.parseInt(inputs[2*idx+2]);
          if (hash.containsKey(rightVal)) {
            cur.right = hash.get(rightVal);
          } else {
            cur.right = new TreeNode(rightVal);
            hash.put(rightVal, cur.right);
          }
        }
      }
    }
    return result;
  }
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
  public boolean isSampleTree(TreeNode tree1, TreeNode tree2) {
    if (tree1 == null) {
      return tree2 == null;
    }
    if (tree2 != null) {
      if (tree1.val != tree2.val) {
        return false;
      }
      return isSampleTree(tree1.left, tree2.left) && isSampleTree(tree2.right, tree2.right);
    }
    return false;
  }
}
