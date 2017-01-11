package Q3;
import Baseclass.BTnode;
import Baseclass.BinaryTree;
import java.util.*;
public class ListOfDepths{
  ArrayList<ArrayList<BTnode>> listOfDepths(BTnode node){
    ArrayList<BTnode> currentLevel = new ArrayList<BTnode>();
    ArrayList<ArrayList<BTnode>> list = new ArrayList<ArrayList<BTnode>>();
    currentLevel.add(node);
    listOfDepths(currentLevel,list);
    return  list;
  }

  void listOfDepths(ArrayList<BTnode> currentLevel,ArrayList<ArrayList<BTnode>> list){
    if(currentLevel.size() == 0)
    return;
    list.add(currentLevel);
    ArrayList<BTnode> newLevel = new ArrayList<BTnode>();
    for(BTnode node : currentLevel){
       if(node.left != null)
       newLevel.add(node.left);
       if(node.right != null)
       newLevel.add(node.right);
    }
  listOfDepths(newLevel,list);
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
    ListOfDepths lod = new ListOfDepths();
    ArrayList<ArrayList<BTnode>> lists = lod.listOfDepths(node0);
    for(ArrayList<BTnode> list:lists){
      for(BTnode node : list)
      System.out.print(node.data + " ");
        System.out.println();
    }

  }
}
