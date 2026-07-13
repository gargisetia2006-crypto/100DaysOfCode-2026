class Solution {
    public void reverseString(char[] s) {

        // ye vala is using two pointer 
        // int l =0;
        // int r = s.length-1;
        // while( l < r ){
        //     char temp = s[l];
        //     s[l]= s[r];
        //     s[r] = temp ;
        //     r--;
        //     l++;
        // }


        // using stack 
        Stack<Character>st = new Stack<>();
        for(int i =0 ; i < s.length ; i++){
            st.push(s[i]);
        }

        int j =0; 
         while(!st.isEmpty()){
            s[j++]= st.pop();
         }
           


        
        
    }
}

