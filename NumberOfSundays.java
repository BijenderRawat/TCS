class NumberOfSundays {
    public int solve(String A, int B) {
        String[] arr = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int i = 0;
        for (; i < arr.length; i++)
            if (arr[i].compareTo(A) == 0)
                break;
        B = B + i;
        return (int) Math.floor(B / 7);
    }
}
