import java.util.* ; 
class Question2{
    public static void main ( String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String s = sc.nextLine();
        Map < Character, Integer > mapp = new HashMap<>();
        int len  = s.length() ;
        for (int i =0 ; i<len ; i++){
            if (mapp.containsKey(s.charAt(i))){
                mapp.put(s.charAt(i) , mapp.get(s.charAt(i))+1 );
            }
            else{
                mapp.put(s.charAt(i) , 1 );
            }
        }

        // now we check map size if even the print chat with size else ignore him 
        if(mapp.size() % 2 ==0){
            System.out.println("CHAT WITH HER");
        }
        else{
            System.out.println("IGNORE HIM!");

        }


         sc.close();
    }
}
// time complexity - o(n) map operations on avg 0(1) and every element is traversed once
// space -o(1) - kyuki yha max 26 element constnt -- cnstnt h 