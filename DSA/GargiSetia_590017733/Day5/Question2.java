package DSA.GargiSetia_590017733.Day5;
import java.util.*;

public class Question2{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);

int n1 = sc.nextInt();
int[] a = new int[n1];

for (int i = 0; i < n1; i++) {
    a[i] = sc.nextInt();
}

int n2 = sc.nextInt();
int[] b = new int[n2];

for (int i = 0; i < n2; i++) {
    b[i] = sc.nextInt();
}

if(n1 != n2 ){
    System.out.println("false ");
    return  ; 
}
Map<Integer , Integer > map = new HashMap<>();
for (int i =0 ; i < a.length  ; i++){
    if (map.containsKey(a[i])){
        // element is already there just
        map.put(a[i], map.get(a[i])+1 );

    }
    else{
        map.put(a[i] ,1 );
    }
}

for(int i =0 ; i < b.length ; i++){
    if(map.containsKey(b[i])){
        // decrese the element by 1 
        map.put(b[i] , map.get(b[i])-1 );
        int freq = map.get(b[i]);

        if(freq ==0 ){
            map.remove(b[i]);
        }
    }
    else{
        System.out.println("unequal at a place ");
        return ; 
    }
}

// check if the map is empty or not 
if(map.isEmpty()){
    System.out.println("true");
}
else{
    System.out.println("false");
}

sc.close();
    }

}