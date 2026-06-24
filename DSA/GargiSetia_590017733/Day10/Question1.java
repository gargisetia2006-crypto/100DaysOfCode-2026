class Solution {

public static boolean match (String haystack, String needle , int i , int j ){
    if ( j == needle.length()){
        return true ;
    }

    if(j != needle.length() && i == haystack.length()){
        return  false ;

    }

    if(haystack.charAt(i) != needle.charAt(j)){
        return false ;
    }
    return match(haystack , needle , i+1 , j+1 ) ; 
}


    public static int search(String haystack, String needle , int start){
        // start khtm hogye 
        if (start > haystack.length()- needle.length()){
            return -1 ;
        }

        // agr first go m milgya 
        if(match(haystack , needle , start , 0 )){
            return start ;
        }
        // agr ni mla first go m 
        //start ko shift krk call lgado

        return search(haystack , needle , start+1);

    }
    public int strStr(String haystack, String needle) {
return search( haystack ,needle , 0 ); 
        
    }
}