public class Successor{
  TreeNode getInOrderSucc(TreeNode node){
    if(node == null)
    return null;
    if(node.right !=null)
    return leftMostNode(node.right);
    else{
      TreeNode x = n;
      TreeNode p = x.parent;
      while(p!=null && p.left = x){
        x = p;
        p = p.parent;
      }
      return p;
    }
  }

  TreeNode leftMostNode(TreeNode node){
    while(node.left !=null)
    node.left = node;
    return node;
  }
}
