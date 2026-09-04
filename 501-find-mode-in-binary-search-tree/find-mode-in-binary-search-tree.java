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
class Solution {
    private Integer prev = null;
    private int count = 0;
    private int maxCount = 0;
    private List<Integer> modes = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        // Perform in-order traversal to populate the modes list
        inorder(root);
        
        // Convert the ArrayList to a primitive int array to match the return type
        int[] res = new int[modes.size()];
        for(int i = 0; i < modes.size(); i++){
            res[i] = modes.get(i);
        }
        return res;
    }
    
    private void inorder(TreeNode node) {
        if (node == null) {
            return; 
        }
        
        // 1. Traverse left subtree
        inorder(node.left);
        
        // 2. Process the current node
        // If the current node's value matches the previous, increment count
        if (prev != null && prev == node.val) {
            count++;
        } else {
            // Otherwise, reset count for a new value
            count = 1;
        }
        
        // If we found a frequency that matches the current max, add it to our modes list
        if (count == maxCount) {
            modes.add(node.val);
        } 
        // If we found a strictly greater frequency, clear the old modes, update max, and add the new mode
        else if (count > maxCount) {
            maxCount = count;
            modes.clear();
            modes.add(node.val);
        }
        
        // Update prev pointer to current node's value for the next iteration
        prev = node.val;
        
        // 3. Traverse right subtree
        inorder(node.right);
    }
}