class Solution {
    public boolean isPalindrome(String s) {

        s =s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]" , "");
        char arr[] = s.toCharArray();
        int start = 0 ;
        int end = arr.length -1 ;
        while ( start < end ){
            if(arr[start] != arr[end]){
                return false ; 
            }
            else{
                start ++; 
                end -- ; 
            }
        }

return true ; 
        
    }
}