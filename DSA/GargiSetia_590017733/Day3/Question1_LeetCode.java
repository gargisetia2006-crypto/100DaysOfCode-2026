package DSA.GargiSetia_590017733.Day3;
class Solution {
    public int[] plusOne(int[] digits) {
        

        for(int i= digits.length-1 ; i>=0; i--){
            if(digits[i] <9){
                digits[i]++;
                return digits ;
            }

            else{
                digits[i]=0;
            }

        }

        //agr khi return n hua mtlb sb 99 the 
        int result [] = new int [digits.length+1];
        result[0]=1;
        return result ;
   
}
}