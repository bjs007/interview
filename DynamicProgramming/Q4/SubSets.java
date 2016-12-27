import java.util.ArrayList;
public class SubSets{
  public static ArrayList<ArrayList<Integer>> getSets(ArrayList<Integer> arr,int index){
  ArrayList<ArrayList<Integer>> subSets;
  if(arr.size() == index) {
    subSets = new ArrayList<ArrayList<Integer>>();
    subSets.add(new ArrayList<Integer>());
  }else{
    subSets = getSets(arr,index + 1);
    Integer element = arr.get(index);
    ArrayList<ArrayList<Integer>> newSets = new ArrayList<ArrayList<Integer>>();
    for(ArrayList<Integer> set : subSets){
      ArrayList<Integer> newSet = new ArrayList<Integer>();
      newSet.addAll(set);
      newSet.add(element);
      newSets.add(newSet);
    }
    subSets.addAll(newSets);

  }
  return subSets;
  }

  public static void main(String args[]){

    ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			list.add(i);
		}
		ArrayList<ArrayList<Integer>> subsets = getSets(list, 0);
		System.out.println(subsets.toString());
  }
}
