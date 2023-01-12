class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list=new ArrayList<>();
        helper(root1,list);
        helper(root2,list);
        Collections.sort(list);
        return list;
    }
    void helper(TreeNode node,List<Integer> list){
        if(node==null) return ;
       
        helper(node.left,list);
         list.add(node.val);
        helper(node.right,list);
    }
}
// https://leetcode.com/problems/all-elements-in-two-binary-search-trees/