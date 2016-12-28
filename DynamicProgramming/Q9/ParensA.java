import java.util.*;
public class ParensA {

  public static HashSet<String> getParens(int remaining){
    HashSet<String> parens;
    if(remaining==1){
      parens = new HashSet<String>();
      parens.add("()");
      return parens;
    }
 HashSet<String> prevParens = getParens(remaining - 1);
    parens = new HashSet<String>();
    for(String paren : prevParens){
      for(int i=0;i <paren.length();i++){
        if(paren.charAt(i)=='('){
        String  s = insertAt(paren,i);
        parens.add(s);}
      }
      parens.add("()"+paren);
    }

    return parens;
  }
public static String insertAt(String str,int i){
  return str.substring(0,i+1) + "()" + str.substring(i+1);
}
public static void main(String args[]){
int num = 3;
HashSet<String> braces = getParens(3);
for(String  str: braces){
  System.out.println(str);
}
}
}
