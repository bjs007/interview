package Q2;
import Baseclass.BTnode;
import Baseclass.BinaryTree;
public class MinimalTree{

public BTnode minimalTree(int arr[]){
return minimalTree(0,arr.length-1,arr);
}

public BTnode minimalTree(int start,int end,int arr[]){

if (end < start)
return null;
int mid = (start + end)/2;
BTnode node = new BTnode(arr[mid]);
node.left = minimalTree(start, mid-1,arr);
node.right = minimalTree(mid+1,end,arr);
return node;
}
public static void main(String args[]){
  int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  MinimalTree mt = new MinimalTree();
  BTnode btNode = mt.minimalTree(array);
  BinaryTree binaryTree = new BinaryTree();
  binaryTree.inOrder(btNode);

}
}
