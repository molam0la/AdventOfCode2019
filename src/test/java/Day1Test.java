import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class Day1Test {

    Day1 d1;
    FileLoader f;

    @Before
    public void setUp() throws Exception {
        d1 = new Day1();
        f = new FileLoader();
    }

    @Test
    public void checkIfInputIsLoaded() {
        assertEquals("74099", d1.loadInput().get(0).toString());
    }


    @Test
    public void calculateExtraFuelPerModule() {
        List<Integer> modules = new ArrayList<>();
        modules.add(100756);
        assertEquals(50346, d1.calculateBaseFuel(modules));

    }
}

