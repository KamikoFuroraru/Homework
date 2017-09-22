package work1;

import java.util.Arrays;

public class findingMaxSubarray {
    public int[] finding(int[] elements) {
        int maxSum = -1;
        int actualSum = 0;
        int leftIndex = 0;
        int rightIndex = -1;
        int actualLeftIndex = 0;

        for (int i = 0; i <= elements.length - 1; i++) {
            actualSum += elements[i];
            if (actualSum > maxSum) {
                maxSum = actualSum;
                leftIndex = actualLeftIndex;
                rightIndex = i;
            } else if (actualSum < 0) {
                actualSum = 0;
                actualLeftIndex = i + 1;
            }
        }
        return Arrays.copyOfRange(elements, leftIndex, rightIndex + 1);
    }
}