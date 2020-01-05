import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class Day3Test {

    Day3 d3;
    String testWires1;
    String testWires2;

    @Before
    public void setUp() {

        d3 = new Day3();
        testWires1 = "R8,U5,L5,D3";
        testWires2 = "U7,R6,D4,L4";
    }

    @Test
    public void testConvertingWireCodeIntoListOfStrings() {
        Set<Point> wire1Points = d3.runWire(d3.convertWire(testWires1));
        System.out.println(wire1Points);

        Set<Point> wire2Points = d3.runWire(d3.convertWire(testWires2));
        System.out.println(wire2Points);

        Integer minimumDistance = wire1Points.stream()
                .filter(wire2Points::contains) // Filter so we only have points which are both in wire1 and wire2 (intersections) - this uses the Point.equals method to check if points are the same
                .map(point -> Math.abs(point.getX()) + Math.abs(point.getY())) // Map each point to the manhattan distance from the origin
                .min(Integer::compareTo) // Get the minimum manhattan distance
                .orElse(0);

        System.out.println(minimumDistance);
    }
}