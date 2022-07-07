//Leetcode Link: https://leetcode.com/problems/invert-binary-tree/
//Youtube Solution

//**************** Java Solution ***********************

class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if (root == null){
            return null;
        }
        
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        
        root.left = right;
        root.right = left;
        return root;
        
    }
}
