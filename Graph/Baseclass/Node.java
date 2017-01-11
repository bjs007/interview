package Baseclass;
import java.util.*;
public class Node{
  int data;
  ArrayList<Node> childs;
public   Node(int data){
    this.data = data;
    childs = new ArrayList<Node>();
  }

  public ArrayList<Node> getChilds() {
		return childs;
	}
}
