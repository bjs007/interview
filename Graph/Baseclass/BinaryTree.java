package Baseclass;
public  class BinaryTree{
  public BTnode createNode(int data){
    return new BTnode(data);
  }

public  void createLeftLink(BTnode nodeA,BTnode nodeB){
    nodeA.setLeftChild(nodeB);
  }
public  void createRightLink(BTnode nodeA,BTnode nodeB){
    nodeA.setRightChild(nodeB);
  }

public  void inOrder(BTnode node){
    if(node ==null)
    return;
    inOrder(node.left);
    System.out.println(node.data);
    inOrder(node.right);
  }

  public  void preOrder(BTnode node){
      if(node ==null)
      return;

      System.out.println(node.data);
      inOrder(node.left);
      inOrder(node.right);
    }

    public  void postOrder(BTnode node){
        if(node ==null)
        return;

        inOrder(node.left);
        inOrder(node.right);
        System.out.println(node.data);
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
   bt.createLeftLink(node2,node5);
   bt.inOrder(node0);
 }
}
