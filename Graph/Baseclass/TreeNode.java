public class TreeNode{
  public int data;
  public TreeNode left;
  public TreeNode right;
  public TreeNode parent;
  public TreeNode(int data){
    this.data = data;
    this.left = null
    this.right = null;
  }
  public void setLeftChild(TreeNode node1,TreeNode node2){
    node1.left = node2;
    node2.parent = node1;
  }
  public void setRightChild(TreeNode node1,TreeNode node2){
    node1.right = node2;
    node2.parent = node1;
  }

}
