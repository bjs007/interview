package Q5;
import Baseclass.BTnode;
import Baseclass.BinaryTree;
public class ValidateBST{

  boolean bstCheck(BTnode node){
  return  bstCheck(node,null,null);
  }

  boolean bstCheck(BTnode node,Integer min,Integer max){
    if(node == null)
    return true;
    if(min !=null && (node.data < min) )
    return false;
    if(max !=null && (node.data > max))
    return false;
    if(!bstCheck(node.left,min,node.data) || !bstCheck(node.right,node.data,max))
    return false;

    return true;
  }

  public static void main(String args[]){
    BinaryTree bt = new BinaryTree();
    BTnode node0 = bt.createNode(0);
    BTnode node1 = bt.createNode(1);
    BTnode node2 = bt.createNode(2);
    BTnode node3 = bt.createNode(3);
    BTnode node4 = bt.createNode(4);
    BTnode node5 = bt.createNode(5);
    bt.createLeftLink(node3,node1);
    bt.createRightLink(node1,node2);
    bt.createLeftLink(node1,node0);
    bt.createRightLink(node3,node5);
    bt.createLeftLink(node3,node4);
    ValidateBST vBst = new ValidateBST();
   System.out.println(vBst.bstCheck(node0));

  }
}
