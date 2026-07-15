class Solution {
    public int[] finalPrices(int[] prices) {

        Stack<Integer> stack = new Stack<>();

        for (int i = prices.length - 1; i >= 0; i--) {

            int curr = prices[i];

            while (!stack.isEmpty() && stack.peek() > curr) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                prices[i] = curr - stack.peek();
            }

            stack.push(curr);
        }

        return prices;
    }
}