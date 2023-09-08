class ArmstrongNumber {
    public int solve(int A) {
        int temp = A;
        int nod = 0;
        int result = 0;
        while (temp != 0) {
            temp /= 10;
            nod++;
        }
        temp = A;
        while (A != 0) {
            result += Math.pow(A % 10, nod);
            A /= 10;
        }
        if (result == temp)
            return 1;
        return 0;
    }
}
