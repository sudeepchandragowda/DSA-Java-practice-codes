package practiseData;

import java.util.ArrayList;

public class AllSubArraysOfSizeK {
    public void allSubArraysOfSizeK(ArrayList<Integer> A, int k) {
        int n = A.size();
        int s = 0;
        int e = k-1;
        while (e<n && s<=n-k) {
            System.out.println(s + " " + e);
            s++;
            e++;
        }
    }
}
