package practiseData;

import java.util.ArrayList;

public class MaxSumOfSubArrayK {
    public int maxSumOfSubArrayK(ArrayList<Integer> A, int k) {
        int start = 0, end = k-1, ans = Integer.MIN_VALUE, n=A.size();
        while(end<n) {
            int sum = 0;
            for(int i=start; i<=end; i++) {
                sum += A.get(i);
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
