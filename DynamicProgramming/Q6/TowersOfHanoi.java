import java.util.*;
class Tower{
  Stack<Integer> disks;
  int index;
  Tower(int n){
    disks = new Stack<Integer>();
    index = n;
  }
public int index(){
  return index;
}
public void add(int d){
  if(!disks.isEmpty() && disks.peek() <= d){
    System.out.println("Error placing the disk" + d);
  }else{
    disks.push(d);
  }
}

public void moveTopTo(Tower destination){
  int top = disks.pop();
  destination.add(top);
}

public void print() {
		System.out.println("Contents of Tower " + index() + ": " + disks.toString());
	}

public void moveDisks(int n,Tower destination,Tower buffer){
  if(n>0){
    String tag = "move_" + n + "_disks_from_" + this.index + "_to_" + destination.index + "_with_buffer_" + buffer.index;
  			System.out.println("<" + tag + ">");
  			moveDisks(n - 1, buffer, destination);
  			System.out.println("<move_top_from_" + this.index + "_to_" + destination.index + ">");
  			System.out.println("<before>");
  			System.out.println("<source_print>");
  			this.print();
  			System.out.println("</source_print>");
  			System.out.println("<destination_print>");
  			destination.print();
  			System.out.println("</destination_print>");
  			System.out.println("</before>");
  			moveTopTo(destination);
  			System.out.println("<after>");
  			System.out.println("<source_print>");
  			this.print();
  			System.out.println("</source_print>");
  			System.out.println("<destination_print>");
  			destination.print();
  			System.out.println("</destination_print>");
  			System.out.println("</after>");
  			System.out.println("</move_top_from_" + this.index + "_to_" + destination.index + ">");
  			buffer.moveDisks(n - 1, destination, this);
  			System.out.println("</" + tag + ">");
  }
}

}

public class TowersOfHanoi{
public  static void main(String args[]){
  int n = 3;
  Tower[] towers = new Tower[n];
  for(int i=0;i<3;i++){
    towers[i] = new Tower(i);
  }
  for(int i = n -1 ;i>=0;i--){
    towers[0].add(i);
  }

  towers[0].moveDisks(n,towers[2],towers[1]);
}

}
