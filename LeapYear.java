class LeapYear {
    public int solve(int A) {
        boolean leap = false;
        if (A % 4 == 0) {
            if (A % 100 == 0) {
                if (A % 400 == 0)
                    leap = true;
            } else
                leap = true;
        }
        if (leap)
            return 1;
        return 0;
    }
}