import java.util.*;

public class StackOfBoxes{
public static int createStack(ArrayList<Box> boxes){
  Collections.sort(boxes,new BoxComparator());
  int maxHeight = 0;
  for(int i=0;i<boxes.size();i++){
    int height = createStack(boxes,i);
    maxHeight = Math.max(maxHeight, height );
  }
  return maxHeight;
}
public static int createStack(ArrayList<Box> boxes,int bottomIndex){
Box bottomBox = boxes.get(bottomIndex);
int maxHeight = 0;
for(int i=bottomIndex + 1;i<boxes.size();i++){
  Box box = boxes.get(i);
  if(box.canBeAbove(bottomBox)){
  int height = createStack(boxes, i);
  maxHeight = Math.max(height , maxHeight);
  }
}
maxHeight += bottomBox.height;
  return maxHeight;
}

public static int createStack1(ArrayList<Box> boxes){
  Collections.sort(boxes,new BoxComparator());
  int[] stackMap = new int[boxes.size()];
  int maxHeight = 0;
  for(int i=0;i<boxes.size();i++){
    int height = createStack1(boxes,i,stackMap);
    maxHeight = Math.max(maxHeight, height );
  }
  return maxHeight;
}
public static int createStack1(ArrayList<Box> boxes,int bottomIndex,int[] stackMap){
  if(stackMap[bottomIndex] > 0)
  return stackMap[bottomIndex];
Box bottomBox = boxes.get(bottomIndex);
int maxHeight = 0;
for(int i=bottomIndex + 1;i<boxes.size();i++){
  Box box = boxes.get(i);
  if(box.canBeAbove(bottomBox)){
  int height = createStack1(boxes, i,stackMap);
  maxHeight = Math.max(height , maxHeight);
  }
}
maxHeight += bottomBox.height;
stackMap[bottomIndex] = maxHeight;
  return maxHeight;
}

public static void main(String[] args) {
		Box[] boxList = { new Box(6, 4, 4), new Box(8, 6, 2), new Box(5, 3, 3), new Box(7, 8, 3), new Box(4, 2, 2), new Box(9, 7, 3)};
		ArrayList<Box> boxes = new ArrayList<Box>();
		for (Box b : boxList) {
			boxes.add(b);
		}

		int height = createStack1(boxes);
		System.out.println(height);

}
}
