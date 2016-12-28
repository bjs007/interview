import  java.util.*;
public class StringPermutationB{
  public static ArrayList<String> getPermutation(String remainder){
    int len = remainder.length();
    ArrayList<String> results = new ArrayList<String>();
    if(len == 0){
      results.add(new String(""));
      return  results;
    }

    for(int i=0;i<len;i++){
      String before = remainder.substring(0,i);
      String after = remainder.substring(i+1,len);
      ArrayList<String> words = getPermutation(before + after);
      for(String word: words){
        results.add(remainder.charAt(i) + word);
      }
    }
    return results;
}


  public static void main(String args[]){
    String str = "abc";
    ArrayList<String> lists = getPermutation(str);
    System.out.println(lists);
  }
}
