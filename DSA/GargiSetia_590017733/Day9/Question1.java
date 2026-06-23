class Solution {
    public int lengthOfLastWord(String s) {
        int length = s.length()-1 ;
        int count =0 ; 

        // skip all the trailing spaces if there exist any 

        while(length >=0 && s.charAt(length) ==' '){
            length -- ; 
        }
        for (int i = length ; i >=0 ; i--){
            if (s.charAt(i)!= ' ') {
                count ++; 
            }
            else{
                break;
            }
        }
        return count ; 
        
    }
}