import java.util.ArrayList;

class OddEvenRule {
    public int solve(ArrayList<Integer> A, int B, int C) {
        int counteven = 0, countodd = 0;
        for (int i : A) {
            if (i % 2 == 0)
                counteven++;
            else
                countodd++;
        }
        if (B % 2 == 0)
            return countodd * C;
        return counteven * C;
    }
}
