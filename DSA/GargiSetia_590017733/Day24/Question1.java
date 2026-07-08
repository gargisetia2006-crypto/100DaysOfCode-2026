class Solution {

    public static int nextnum(int n){

        int sum =0 ;
        while(n > 0){
            int r = n % 10;
            sum = sum +  r * r ;
            n = n /  10 ; 

        }
        return sum ; 
    }
    public boolean isHappy(int n) {
    
    int slow =n ;
    int fast =n ;


while(true){
    slow = nextnum(slow);
     fast = nextnum(nextnum(fast));


    if(fast ==1 )
      return true ;


    if (slow == fast)
    return false ; 
}
    }
}