import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static junit.framework.TestCase.assertEquals;

public class Day3Test {

    Day3 d3;
    String testWires1;
    String testWires2;
    Set<Point> wire1Points;
    Set<Point> wire2Points;

    @Before
    public void setUp() {
        d3 = new Day3();
    }

    @Test
    public void testCalculatingMinimumDistanceSample1() {
        testWires1 = "R8,U5,L5,D3";
        testWires2 = "U7,R6,D4,L4";
        wire1Points = d3.runWire(d3.convertWire(testWires1));
        System.out.println(wire1Points);
        wire2Points = d3.runWire(d3.convertWire(testWires2));
        System.out.println(wire2Points);

        int minimumDistance = d3.calculateManhattanDistance(wire1Points, wire2Points);
        assertEquals(6, minimumDistance);
    }

}