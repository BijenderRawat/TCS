class RoundTable {
    public int solve(int A) {
        long ans = 2;
        for (int i = 2; i <= A; i++) {
            ans *= i;
            ans = ans % 1000000007;
        }
        return (int) ans;
    }
}