import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Day3Test {

    Day3 d3;
    String testWires1;
    String testWires2;
    int[][] grid;

    @Before
    public void setUp() throws Exception {

        d3 = new Day3();
        testWires1 = "R8,U5,L5,D3";
        testWires2 = "U7,R6,D4,L4";

    }

    @Test
    public void testConvertingWireCodeIntoListOfStrings() {
        System.out.println(d3.convertWire(testWires1).get(0));

    }

}