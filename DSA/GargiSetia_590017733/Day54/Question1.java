class Solution {
    public int maxFrequencyElements(int[] nums) {

    HashMap<Integer, Integer> map = new HashMap<>();

for (int num : nums) {
    if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
    } else {
        map.put(num, 1);
    }
}

int maxfreq =0 ; 
for (int freq  : map.values()){
    maxfreq = Math.max(maxfreq  , freq ); 
}

// Step 2: Print all elements with that frequency
int count =0 ; 
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if (entry.getValue() == maxfreq) {
        count = count + maxfreq  ; 
        
    }
}
return count ; 
        
    }
}