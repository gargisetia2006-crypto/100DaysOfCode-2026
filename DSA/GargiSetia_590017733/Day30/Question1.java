import java.util.* ; 
class Solution {
    public String removeDuplicates(String s) {
    Stack<Character> st = new Stack<>();
     int len = s.length();
      for(int i =0 ; i< len ; i++){
            char ch = s.charAt(i);
             if(st.isEmpty()){ // if stack is empty push directly 
             st.push(ch);
       }
      else if(ch == st.peek()){
           st.pop();
             }
      else{
          st.push(ch);
          }
      }

      // now make the string back of the stack  
      StringBuilder sb = new StringBuilder();
     while (!st.isEmpty()) {
    sb.append(st.pop());
}



      return  sb.toString(); 
    }
}