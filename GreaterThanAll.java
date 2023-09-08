import java.util.ArrayList;

class GreaterThanAll {
    public int solve(ArrayList<Integer> A) {
        int max = A.get(0);
        int count = 1;
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > max) {
                count++;
                max = A.get(i);
            }
        }
        return count;
    }
}
