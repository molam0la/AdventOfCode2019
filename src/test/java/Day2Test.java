import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class Day2Test {

    Day2 d2;
    FileLoader f;
    int[] intInput;
    String stringInput;

    @Before
    public void setUp() throws Exception {
        d2 = new Day2();
        f = new FileLoader();
        stringInput = "1,9,10,3,2,3,11,0,99,30,40,50";
        intInput = f.toIntArray(stringInput, ",");
    }

    @Test
    public void testConvertingToIntInput() {
        assertEquals(1, intInput[0]);
    }

    @Test
    public void testOptcode1LargeSample() {
        assertEquals(70, d2.runOptcode(intInput)[3]);
    }

    @Test
    public void testOptcode1SmallSample() {
        stringInput = "1,0,0,0,99";
        intInput = f.toIntArray(stringInput, ",");
        assertEquals(2, d2.runOptcode(intInput)[0]);
    }

    @Test
    public void testOptcode2LargeSample() {
        assertEquals(3500, d2.runOptcode(intInput)[0]);
        int[] expectedResult = {3500, 9, 10, 70, 2, 3, 11, 0, 99, 30, 40, 50};
        int[] actualResult = d2.runOptcode(intInput);
        assertTrue(Arrays.equals(expectedResult, actualResult));
    }

    @Test
    public void testOptcode2SmallSample() {
        stringInput = "2,3,0,3,99";
        intInput = f.toIntArray(stringInput, ",");
        assertEquals(6, d2.runOptcode(intInput)[3]);
    }

    @Test
    public void testOptcode99SmallSample() {
        stringInput = "2,4,4,5,99,0";
        intInput = f.toIntArray(stringInput, ",");
        assertEquals(9801, d2.runOptcode(intInput)[5]);
    }

    @Test
    public void testOptcode99Double() {
        stringInput = "1,1,1,4,99,5,6,0,99";
        intInput = f.toIntArray(stringInput, ",");
        int[] expectedResult = {30, 1, 1, 4, 2, 5, 6, 0, 99};
        int[] actualResult = d2.runOptcode(intInput);
        assertTrue(Arrays.equals(expectedResult, actualResult));
    }


    @Test
    public void testAllOptcodesTogether() {
        int[] expectedResult = {3500, 9, 10, 70, 2, 3, 11, 0, 99, 30, 40, 50};
        int[] actualResult = d2.runOptcode(intInput);
        assertTrue(Arrays.equals(expectedResult, actualResult));
    }
}
