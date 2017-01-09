public class BTnode{
  int data;
  BTnode left;
  BTnode right;
  BTnode(int data){
    this.data = data;
    this.left = null;
    this.right = null;
  }

  void setRightChild(BTnode rightChild){
    if(rightChild != null)
    this.right = rightChild;
  }
  void setLeftChild(BTnode leftChild){
    if(leftChild !=null)
    this.left = leftChild;
  }
}
