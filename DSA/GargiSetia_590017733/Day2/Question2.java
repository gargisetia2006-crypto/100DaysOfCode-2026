package DSA.GargiSetia_590017733.Day2;
import java.util.*;

public class Question2{


public static void main(String [] args ){
    Scanner  sc = new Scanner(System.in);
    System.out.println("enter  the number of elements in the array ");
    int n = sc.nextInt();
    int arr[]= new int[n];
    for (int i =0 ; i< n ; i++){
        System.out.println("enter the element at the index "+i );
        arr[i]=sc.nextInt();
    
    }
    
    int max = Integer.MIN_VALUE;
    for (int i =0 ; i< n ; i++){
        if(arr[i]>max){
            max = arr[i];
        }
        
    }

    System.out.println("The maximum element in the array is: " + max);
    sc.close();

}
}