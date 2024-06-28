package practiseData;

import java.util.ArrayList;

public class PrintSumSubArray {
    public int sumOfSubArray(ArrayList<Integer> A) {
        int n = A.size();
        int sum = 0;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                sum += A.get(j);
            }
        }
        return sum;
    }
}
