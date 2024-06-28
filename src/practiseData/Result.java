package practiseData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Result {
        /*
         * Complete the 'miniMaxSum' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void miniMaxSum(List<Integer> arr) {
            Collections.sort(arr);
            long minSum = 0;
            long maxSum = 0;
            // Write your code here
            minSum = (arr.get(0) + arr.get(1) + arr.get(2) + arr.get(3));
            maxSum = (arr.get(1) + arr.get(2) + arr.get(3) + arr.get(4));
            System.out.println(minSum + " " + maxSum);
        }
    }