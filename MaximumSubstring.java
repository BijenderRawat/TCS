class MaximumSubstring {
    public int solve(String A, int B) {
        int ans = 0, c = 0;
        for (int i = 0; i < A.length(); i++) {
            if (i % B == 0) {
                ans = Math.max(ans, c);
                c = 0;
            }
            if (A.charAt(i) == 'a')
                c++;
        }
        ans = Math.max(ans, c);
        return ans;
    }
}
