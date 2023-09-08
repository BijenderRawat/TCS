class ProductsOfDigits {
    public int solve(int A) {
        int ans = A % 10;
        if (ans == 0)
            return 0;
        A = A / 10;
        while (A > 0) {
            ans = ans * (A % 10);
            A = A / 10;
        }
        return ans;
    }
}
