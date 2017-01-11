package Baseclass;
public class BTnode{
  int data;
public   BTnode left;
public   BTnode right;
public   BTnode(int data){
    this.data = data;
    this.left = null;
    this.right = null;
  }

public   void setRightChild(BTnode rightChild){
    if(rightChild != null)
    this.right = rightChild;
  }
public   void setLeftChild(BTnode leftChild){
    if(leftChild !=null)
    this.left = leftChild;
  }
}
