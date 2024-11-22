import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // Add 1 at the start and end of each row
                } else {
                    // Add the sum of two elements from the previous row
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        Arrays solution = new Arrays();
        System.out.println(solution.generate(5));
    }
}
