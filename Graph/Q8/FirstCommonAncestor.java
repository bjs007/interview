package Q8;
import Baseclass.BTnode;
import Baseclass.BinaryTree;

public class FirstCommonAncestor{

public BTnode firstCommonAncestor(BTnode node,BTnode nodeA,BTnode nodeB){
  if(node == null || nodeA == null || nodeB == null)
  return null;
  if(!reachable(root,nodeA)|| !reachable(root,nodeB))
  return null;
  return firstParent(root,nodeA,nodeB);
}

public BTnode firstParent(BTnode node,BTnode nodeA,BTnode nodeB){
  if(node == null || nodeA == null || nodeB == null)
  return null;
  boolean AOnLeftSide = reachable(node.left,nodeA);
  boolean BOnLeftSide = reachable(node.left,nodeB);
  if(AOnLeftSide != BOnRightSide)
  return node;
  if(AOnLeftSide)
   return firstParent(node.left,nodeA,nodeB);
  else
   return firstParent(node.right,nodeA,nodeB);
}
public boolean reachable(BTnode root,BTnode node){
  if(root==null)
  return false;
  if(root == node)
  return true;
  else
  return reachable(root.left,node) || reachable(root.right,node);
}
}
