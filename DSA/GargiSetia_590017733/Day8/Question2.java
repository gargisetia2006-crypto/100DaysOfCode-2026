
import java.util.* ;


public class Question2 {
    public static void main ( String [] args ){
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the string ");
         String s1 =  sc.nextLine();

         char arr [] = s1.toCharArray();
         int end = arr.length-1 ; 
         int start =0 ; 


         while ( start < end ){
         char temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp ;
         start++;
         end -- ; 
         }
            s1 = new String(arr);
            System.out.println(s1);






         sc.close();

    }


    
}
