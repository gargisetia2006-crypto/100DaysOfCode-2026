class Solution {
    public String predictPartyVictory(String senate) {

        // make 2 queues 
        Queue<Integer> radiant = new LinkedList<>();
         Queue<Integer> dire = new LinkedList<>();


         // add the indices in the queues 
         for (int i  =0 ; i  < senate.length() ; i  ++){
            char ch = senate.charAt(i);
            if ( ch =='R'){
                radiant.offer(i);
            }
            else{
                dire.offer(i);
            }
            

         }
         // now we check who is small 


      while ( !radiant.isEmpty() && ! dire.isEmpty()){
         int r = radiant.poll();
         int d  = dire.poll();
         if (r < d ){ // radiant pehle tha

            radiant.offer( r + senate.length());
         }
         else {
           
            dire.offer( d + senate.length());
         }
      }

      if(radiant.isEmpty()){
        return "Dire" ; 
      }
      else{
        return "Radiant";
      }

        
    }
}