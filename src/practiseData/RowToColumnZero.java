package practiseData;

import java.util.ArrayList;

public class RowToColumnZero {
    public ArrayList<ArrayList<Integer>> rowToColumnZero
            (ArrayList<ArrayList<Integer>> A) {

        int n = A.size();
        int m = A.get(0).size();
        ArrayList<Boolean> zeroRows = new ArrayList<>();
        ArrayList<Boolean> zeroCols = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (A.get(row).get(col) == 0) {
                    zeroRows.get(row) = true;
                    zeroCols.get(col) = true;
                }
            }
        }
        for (int row = 0; row < n; row++) {
            if (zeroRows.get(row)) {
                for (int col = 0; col < m; col++) {
                    A.get(row).get(col) = 0;
                }
            }
        }
        for (int col = 0; col < m; col++) {
            if (zeroCols.get(col)) {
                for (int row = 0; row < n; row++) {
                    A.get(row).get(col) = 0;
                }
            }
        }
        return A;    }

}
