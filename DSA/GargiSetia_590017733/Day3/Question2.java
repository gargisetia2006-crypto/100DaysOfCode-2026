package DSA.GargiSetia_590017733.Day3;
import java.util.* ;
public class Question2{

public static int findcount(int arr[] , int target ){
    int count =0 ;

    for(int i =0 ; i<arr.length ; i++){
        if (arr[i]==target){
            count++;
        }
    }
    return count ;


}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in) ;
    int n = sc.nextInt() ;
    int arr[] = new int[n] ;
    for(int i=0 ; i<n ; i++){
        arr[i]=sc.nextInt() ;
    }
    int target = sc.nextInt() ;
    int ans = findcount(arr , target) ;
    System.out.println(ans);
    sc.close();

}
}
