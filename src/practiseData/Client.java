package practiseData;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        IntegerPrinter integerPrinter = new IntegerPrinter(5);
        integerPrinter.print();

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3,4));
        PrintSumSubArray printSumSubArray = new PrintSumSubArray();
        int result = printSumSubArray.sumOfSubArray(A);
        System.out.println(result);

        CountOfIndexInSubArray countOfIndexInSubArray = new CountOfIndexInSubArray();
        int count = countOfIndexInSubArray.countOfIndexInSubArray(A);
        System.out.println(count);
    }
}