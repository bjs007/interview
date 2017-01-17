package Q9;
import Baseclass.BTnode;
import java.util.*;

public class BSTSequence {
ArrayList<LinkedList<Integer>> allSequences(BTnode node){
	ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
 if(node == null){
	 result.add(new LinkedList<Integer>());
	 return result;
 }

 LinkedList<Integer> prefix = new LinkedList<Integer>();
 prefix.add(node.data);
 ArrayList<LinkedList<Integer>> leftSeq = allSequences(node.left);
 ArrayList<LinkedList<Integer>> rightSeq = allSequences(node.right);

 for(LinkedList<Integer> left: leftSeq){
	 for(LinkedList<Integer> right: rightSeq){
		 ArrayList<LinkedList<Integer>> weaved = new ArrayList<LinkedList<Integer>>();
		 weaveLists(left,right,weaved,prefix);
		 result.addAll(weaved) ;
	 }
 }
 return result;
}

void weaveLists(LinkedList<Integer> first,LinkedList<Integer> second,ArrayList<LinkedList<Integer>> results,LinkedList<Integer> prefix){
	if(first.size() ==0 || second.size()==0){
		LinkedList<Integer> result = (LinkedList) prefix.clone();
		result.addAll(first);
		result.addAll(second);
		results.add(result);
		return;
	}
	int headFirst = first.removeFirst();
	prefix.addLast(headFirst);
	weaveLists(first,second,results,prefix);
	prefix.removeLast();
	first.addFirst(headFirst);

	int headSecond = second.removeFirst();
	prefix.addLast(headSecond);
	weaveLists(first,second,results,prefix);
	prefix.removeLast();
	second.addFirst(headSecond);
}

public static void main(String args[]){
	BTnode node50 = new BTnode(50);
	BTnode node20 = new BTnode(20);
	BTnode node60 = new BTnode(60);
	node50.setLeftChild(node20);
	node50.setRightChild(node60);

/*
	Node1 node10 = new Node1(10);
	Node1 node25 = new Node1(25);
	Node1 node70 = new Node1(70);

	node20.setLeftChild(node10);
	node20.setRightChild(node25);
	node60.setLeftChild(node70);


	Node1 node5 = new Node1(5);
	Node1 node15 = new Node1(15);
	Node1 node65 = new Node1(65);
	Node1 node80 = new Node1(80);

	node10.setLeftChild(node5);
	node10.setRightChild(node15);
	node70.setLeftChild(node65);
	node70.setRightChild(node80);
	*/
	BSTSequence bstsequence = new BSTSequence();
	ArrayList<LinkedList<Integer>> result = bstsequence.allSequences(node50);
	for(LinkedList<Integer> list: result)
		System.out.println(list);
}

}
