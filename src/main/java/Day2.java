import java.util.Arrays;
import java.util.List;

public class Day2 {

    public int[] runOptcode(int[] intInput) {

        for (int value : intInput) {
            int output;
            int firstInput;
            int secondInput;
            int result;

            switch (value) {
                case 1:
                    System.out.println(Arrays.toString(intInput));
                    int optcode1Index = Common.getArrayIndex(intInput, value);

                    firstInput = intInput[optcode1Index + 1];
                    secondInput = intInput[optcode1Index + 2];
                    output = intInput[optcode1Index + 3];
                    result = intInput[firstInput] + intInput[secondInput];
                    intInput[output] = result;
                    break;
                case 2:
                    System.out.println(Arrays.toString(intInput));

                    int optcode2Index = Common.getArrayIndex(intInput, value);

                    firstInput = intInput[optcode2Index + 1];
                    secondInput = intInput[optcode2Index + 2];
                    output = intInput[optcode2Index + 3];
                    result = intInput[firstInput] * intInput[secondInput];
                    intInput[output] = result;
                    break;
                case 99:
                    break;
            }
        }
        return intInput;
    }

    public static void main(String[] args) {
        String input = "1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,10,1,19,1,5,19,23,1,23,5,27,1,27,13,31,1,31,5,35,1,9,35,39,2,13,39,43,1,43,10,47,1,47,13,51,2,10,51,55,1,55,5,59,1,59,5,63,1,63,13,67,1,13,67,71,1,71,10,75,1,6,75,79,1,6,79,83,2,10,83,87,1,87,5,91,1,5,91,95,2,95,10,99,1,9,99,103,1,103,13,107,2,10,107,111,2,13,111,115,1,6,115,119,1,119,10,123,2,9,123,127,2,127,9,131,1,131,10,135,1,135,2,139,1,10,139,0,99,2,0,14,0";
        FileLoader f = new FileLoader();
        int[] intInput = f.toIntArray(input, ",");
        Day2 d2 = new Day2();
        int[] processedProgramme = d2.runOptcode(intInput);

        System.out.println("Result " + processedProgramme[0]);
    }
}
