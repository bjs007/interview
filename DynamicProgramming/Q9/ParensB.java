import java.util.*;
public class ParensB {

  public static ArrayList<String> getParens(int count){
  ArrayList<String> result = new ArrayList<String>();
  getParens("",count,count,result);
      return result;
    }

 public static void getParens(String prefix,int left,int right,ArrayList<String> result){
 if(left < 0 || right<left)
 return;
  if(left ==  0 && right==0)
   result.add(prefix);
  else{
    getParens(prefix+"(",left-1,right,result);
    getParens(prefix+")",left,right-1,result);
  }
}

public static void main(String args[]){
int num = 5;
ArrayList<String> parens = getParens(num);
System.out.println(parens);
}

}
