class Solution {
    public int compress(char[] chars) {
        

        int write =0;
        int count =0;
        int n = chars.length ;
        for(int i =0 ; i< chars.length ; i++){
            count = count +1 ;

      
      // agr last index p h mtlb aage sb khtm higya uska count to pehle hi le lia bhle nya group ho y old 
      // or agla next index se match n krti value tb hm array m write krenge 
      if( i == n-1  || chars[i+1] != chars[i]){
        chars[write++] = chars[i];


        // agr count bda h 1 se to vo bi likhna h 

        if (count > 1) {
            String s = String.valueOf(count);
            for (int j = 0; j < s.length(); j++) {
            chars[write++] = s.charAt(j);
    }
}


  count =0 ; // ye grp khtm hogya to count 0 krdia 

      }

        
        }
         return write ;
    }
}