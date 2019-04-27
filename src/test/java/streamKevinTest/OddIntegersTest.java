package streamKevinTest;

import org.junit.Test;
import streamsKevin.OddIntegers;

import org.junit.Assert;
import java.util.Arrays;
import java.util.List;

public class OddIntegersTest {

    @Test
    public void returnOddIntegers(){
        // Given
        OddIntegers oddIntegers = new OddIntegers();
        Integer[] oddArray = new Integer[]{1,3,5,7,9};

        List<Integer> expected = Arrays.asList(oddArray);

        // When
        List<Integer> actual = oddIntegers.oddIntegers(9);

        // Then
        Assert.assertEquals(expected, actual);

    }


}
