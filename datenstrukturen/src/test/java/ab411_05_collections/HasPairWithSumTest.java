package ab411_05_collections;

import ch.gibb.algorithmen.ab411_05_collections.HasPairWithSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HasPairWithSumTest {

    @Test
    void testHasPairWithSum() {
        int sum = 8;
        int[] set1 = {1,2,3,9};
        int[] set2 = {1,2,4,4};
        int[] set3 = {1,2,4,6};

        boolean res1 = HasPairWithSum.hasPairWithSum(set1, sum);
        boolean res2 = HasPairWithSum.hasPairWithSum(set2, sum);
        boolean res3 = HasPairWithSum.hasPairWithSum(set3, sum);

        assertEquals(res1, false, "Res1 failed");
        assertEquals(res2, true, "Res2 failed");
        assertEquals(res3, true, "Res3 failed");
    }
}
