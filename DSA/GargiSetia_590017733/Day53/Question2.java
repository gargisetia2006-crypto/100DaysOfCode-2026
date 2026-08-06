class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();

        if (p.length() > s.length()) {
            return list;
        }

        int[] a = new int[26];
        int[] b = new int[26];

        for (char ch : p.toCharArray()) {
            a[ch - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {

            b[s.charAt(i) - 'a']++;

            if (i >= k) {
                b[s.charAt(i - k) - 'a']--;
            }

            if (Arrays.equals(a, b)) {
                list.add(i - k + 1);
            }
        }

        return list;
    }
}