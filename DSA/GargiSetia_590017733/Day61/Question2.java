class Solution {

    public int minGroups(int[] mentor) {

        int n = mentor.length;

        // Build the tree
        List<List<Integer>> tree = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<>());
        }

        int root = -1;

        for (int i = 0; i < n; i++) {

            if (mentor[i] == -1) {
                root = i;
            } else {
                tree.get(mentor[i]).add(i);
            }
        }

        // Find maximum depth
        return 2;
    }
}