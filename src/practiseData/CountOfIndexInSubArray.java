package practiseData;

import java.util.ArrayList;

public class CountOfIndexInSubArray {
    public int countOfIndexInSubArray(ArrayList<Integer> A) {
        int n = A.size();
        int count = 0;
        for (int i=0; i<n; i++) {
            count = ((i+1)*(n-i));
            return count;
        }
        return count;
    }
}
