package practiseData;

import java.util.ArrayList;

public class CountOfIndexInSubArray {
    public int countOfIndexInSubArray(ArrayList<Integer> A) {
        int n = A.size();
        int count = 0;
        int contribution = 0;
        int sum = 0;
        for (int i=0; i<n; i++) {
            count = ((i+1)*(n-i)); // Occurrence
            contribution = (count * A.get(i));
            sum = sum + contribution;
        }
        return sum;
    }
}

// Using contribution method, sum of all the sub arrays can be identified
