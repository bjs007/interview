import  java.util.*;
public class StringPermutationA{
  public static ArrayList<String> getPermutation(String str,int index){
    ArrayList<String> words;
    if(str.length() == index){
      words = new ArrayList<String>();
      words.add(new String(""));
      return words;
    }else{
      words = getPermutation(str,index + 1);
      char character = str.charAt(index);
      ArrayList<String> newWords = new ArrayList<String>();
      for(String word : words){
        newWords.addAll(getNewWords(character,word));
      }
      return newWords;
    }

  }
  public static ArrayList<String> getNewWords(char character,String word){

    ArrayList<String> list = new ArrayList<String>();
    for(int i=0; i<=word.length() ; i++){
    String part1 = word.substring(0,i);
    String part2 = word.substring(i);
    String newstring = part1 + character + part2;

      list.add(newstring);
    }
    return list;
  }

  public static void main(String args[]){
    String str = "abc";
    ArrayList<String> lists = getPermutation(str,0);
    System.out.println(lists);
  }
}
