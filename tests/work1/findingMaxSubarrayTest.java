package work1;

import org.junit.Test;
import static org.junit.Assert.*;

public class findingMaxSubarrayTest {

    findingMaxSubarray array = new findingMaxSubarray();

    @Test
    public void finding() throws Exception {
        assertArrayEquals(new int[]{5, 1, 3, -3, 8}, array.finding(new int[]{5, 1, 3, -3, 8, -2}));
        assertArrayEquals(new int[]{8, 10, 13}, array.finding(new int[]{-100, 5, -6, 8, 10, 13, -20, 7}));
        assertArrayEquals(new int[]{100}, array.finding(new int[]{100, -9, 2, -3, 5}));
        assertArrayEquals(new int[]{1, 2, 3}, array.finding(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{11}, array.finding(new int[]{-1, 2, 3, -9, 11}));
        assertArrayEquals(new int[]{}, array.finding(new int[]{-1, -2, -35, -9, -1001}));
    }

}