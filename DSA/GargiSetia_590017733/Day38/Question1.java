import java.util.* ; 
class Solution {
    Queue <Integer> q = new LinkedList<>();
    public int countStudents(int[] students, int[] sandwiches) {

        // elements stored in the queue  
   for(int i =0 ; i< students.length ; i++){
    q.offer(students[i]);
    }
   int j =0 ; 
   int count =0  ; 
    while (!q.isEmpty()){
        // kid liked the sandwich
        if ( q.peek() == sandwiches[j]){
            q.poll();
            j++; 
            count =0 ; 
        }
        //kid doesnt like the sandwich 
        else{
            // move the child at the last
            q.offer(q.poll()); 
            count ++ ; 

        }
            if ( count == q.size()){
                return q.size (); 
            }
        
    }
    
return 0 ; 
    }
        
}
