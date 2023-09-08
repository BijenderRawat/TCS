import java.util.ArrayList;

class ChipsFactory {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int c = 0;
        for (int i : A) {
            if (i == 0)
                c++;
            else
                ans.add(i);
        }
        while (c > 0) {
            ans.add(0);
            c--;
        }
        return ans;
    }
}