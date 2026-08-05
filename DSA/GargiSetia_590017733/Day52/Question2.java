class Solution {
    public String[] getFolderNames(String[] names) {
        String[] ans = new String[names.length];
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            // Name does not exist
            if (!map.containsKey(name)) {
                ans[i] = name;
                map.put(name, 1);

            } else {
                int k = map.get(name);
                String newName = name + "(" + k + ")";
                while (map.containsKey(newName)) {
                    k++;
                    newName = name + "(" + k + ")";
                }
                ans[i] = newName;
                // Reserve the new name
                map.put(newName, 1);
                // Next duplicate should start from k + 1
                map.put(name, k + 1);
            }
        }
        return ans;
    }
}