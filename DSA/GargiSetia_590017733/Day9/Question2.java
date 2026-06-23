

import java.util.Scanner;

public class Question2 {
    public static void main ( String [] args ){
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the string ");
         String s1 =  sc.nextLine();
         s1 = s1.replaceAll(" " , "");
         System.out.println(s1);
         sc.close();

    
}
}
