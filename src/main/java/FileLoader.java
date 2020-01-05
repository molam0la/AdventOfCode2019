import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FileLoader {

    List<String> loadInputFromFile(String filePath) {
        List<String> allLines = null;
        File file = Paths.get((filePath)).toFile();

        try (FileReader fileReader = new FileReader(file)) {

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            allLines = bufferedReader.lines()
                    .collect(toList());
        } catch (IOException ignored) {
        }
        return allLines;
    }

    List<Integer> convertInputToInterger(List<String> allLines) {
        List<Integer> allLinesInt = new ArrayList<>();
        for (String a : allLines) {
            allLinesInt.add(Integer.parseInt(a));
        }
        return allLinesInt;
    }

    public int[] toIntArray(String input, String delimiter) {

        return  Arrays.stream(input.split(delimiter))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
