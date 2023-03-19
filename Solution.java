class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] freq = new int[100_001];
        Arrays.fill(freq, 0);
        int max = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int cur = getSum(i);
            freq[cur]++;
            max = Math.max(max, freq[cur]);
        }
        return max;
    }
    
    static int getSum(int x) {
        int res = 0;
        while (x > 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }
}
