import java.util.*;
public class Printperms{
public static ArrayList<String> printPerms(String s){
    ArrayList<String> results =  new ArrayList<String>();
    HashMap<Character,Integer> map = characterFrequency(s);
    printPerms(map,"",s.length(),results);
    return results;
  }

public static HashMap<Character,Integer> characterFrequency(String s){
  int len = s.length();
  HashMap<Character,Integer> map = new HashMap<Character,Integer>();
  for(int i=0;i<len;i++){
    char c = s.charAt(i);
    if(!map.containsKey(c)){
      map.put(c,0);
    }
    map.put(c,map.get(c) + 1);
  }
  return map;
}

public static void printPerms(HashMap<Character,Integer> map,String prefix,int remaining,ArrayList<String> result){
  if(remaining == 0){
    result.add(prefix);
    return;
  }

  for(Character c : map.keySet()){
    int count = map.get(c);
    if(count>0){
      map.put(c, count-1);
      printPerms(map,prefix + c,remaining - 1,result);
      map.put(c, count);

    }
  }

}

public static void main(String args[]){
  String str = "aabc";
  ArrayList<String> lists = printPerms(str);
  System.out.println(lists);
}

}
