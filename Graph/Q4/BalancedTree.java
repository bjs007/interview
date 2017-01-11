package Q4;
import Baseclass.BTnode;
import Baseclass.BinaryTree;

public class BalancedTree{
public boolean isBalanced(BTnode node){
  if(checkHeight(node) < 0)
  return false;
  else
  return true;
}
public  int checkHeight(BTnode node){
    if(node == null) //if there is no further child return height 0
    return -1;
    int leftHeight = checkHeight(node.left) + 1; // height of any node is +1 the height of child node
    int rightHeight = checkHeight(node.right) + 1;
    if(leftHeight == Integer.MIN_VALUE || rightHeight == Integer.MIN_VALUE ) //if the leftHeight or rightHeight is -1 then there is height difference of more than 2 below the current node
    return -1;
    if(Math.abs(leftHeight - rightHeight)> 1) // if the height difference is more than 1 then return -1
    return Integer.MIN_VALUE ;
    return Math.max(leftHeight,rightHeight); // in other case return the max height
    }

    public static void main(String args[]){
      BinaryTree bt = new BinaryTree();
      BTnode node0 = bt.createNode(0);
      BTnode node1 = bt.createNode(1);
      BTnode node2 = bt.createNode(2);
      BTnode node3 = bt.createNode(3);
      BTnode node4 = bt.createNode(4);
      BTnode node5 = bt.createNode(5);
      bt.createLeftLink(node0,node1);
      bt.createRightLink(node0,node2);
      bt.createLeftLink(node1,node3);
      bt.createRightLink(node1,node4);
      bt.createLeftLink(node3,node5);

      BalancedTree balancedTree = new BalancedTree();

      System.out.println(balancedTree.isBalanced(node0));
    }
}
