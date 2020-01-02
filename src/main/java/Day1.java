import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.List;
import java.util.stream.Collectors;

public class Day1 {

    static List<Integer> loadInput() {
        FileLoader f = new FileLoader();
        String filePath = "/Users/sandra/Documents/Dev/AdventOfCode2019/src/main/resources/input/day1.txt";
        return f.convertInputToInterger(f.loadInputFromFile(filePath));
    }

    public int calculateBaseFuel(List<Integer> input) {
        return input.stream().mapToInt(this::calculateFuel).sum();
    }

    private int calculateFuel(int mass) {
        int fuel = Math.floorDiv(mass, 3) - 2;
        if (fuel > 0) {
            fuel = fuel + calculateFuel(fuel);
        } else {
            fuel = 0;
        }
        return fuel;
    }

    public static void main(String[] args) {
        Day1 d1 = new Day1();
        System.out.println(d1.calculateBaseFuel(loadInput()));
    }

}


