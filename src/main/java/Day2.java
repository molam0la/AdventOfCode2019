import java.util.Arrays;

public class Day2 {

    public int[] runOpcode(int[] intInput) {

        for (int i = 0; i < intInput.length; i++) {

            int output;
            int firstInput;
            int secondInput;
            int result;

            switch (intInput[i]) {
                case 1:
                    firstInput = intInput[i + 1];
                    secondInput = intInput[i + 2];
                    output = intInput[i + 3];
                    result = intInput[firstInput] + intInput[secondInput];
                    intInput[output] = result;
                    i += 3;
                    break;
                case 2:
                    firstInput = intInput[i + 1];
                    secondInput = intInput[i + 2];
                    output = intInput[i + 3];
                    result = intInput[firstInput] * intInput[secondInput];
                    intInput[output] = result;
                    i += 3;
                    break;
                case 99:
                    return intInput;
            }
        }
        return intInput;
    }

    public int[] findVerbAndNoun() {
        int[] newArray = new int[150];
        for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100; y++) {
                newArray = new int[]{1, x, y, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 10, 1, 19, 1, 5, 19, 23, 1, 23, 5, 27, 1, 27, 13, 31, 1, 31, 5, 35, 1, 9, 35, 39, 2, 13, 39, 43, 1, 43, 10, 47, 1, 47, 13, 51, 2, 10, 51, 55, 1, 55, 5, 59, 1, 59, 5, 63, 1, 63, 13, 67, 1, 13, 67, 71, 1, 71, 10, 75, 1, 6, 75, 79, 1, 6, 79, 83, 2, 10, 83, 87, 1, 87, 5, 91, 1, 5, 91, 95, 2, 95, 10, 99, 1, 9, 99, 103, 1, 103, 13, 107, 2, 10, 107, 111, 2, 13, 111, 115, 1, 6, 115, 119, 1, 119, 10, 123, 2, 9, 123, 127, 2, 127, 9, 131, 1, 131, 10, 135, 1, 135, 2, 139, 1, 10, 139, 0, 99, 2, 0, 14, 0};
                runOpcode(newArray);
                if (newArray[0] == 19690720) {
                    return newArray;
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        String input = "1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,10,1,19,1,5,19,23,1,23,5,27,1,27,13,31,1,31,5,35,1,9,35,39,2,13,39,43,1,43,10,47,1,47,13,51,2,10,51,55,1,55,5,59,1,59,5,63,1,63,13,67,1,13,67,71,1,71,10,75,1,6,75,79,1,6,79,83,2,10,83,87,1,87,5,91,1,5,91,95,2,95,10,99,1,9,99,103,1,103,13,107,2,10,107,111,2,13,111,115,1,6,115,119,1,119,10,123,2,9,123,127,2,127,9,131,1,131,10,135,1,135,2,139,1,10,139,0,99,2,0,14,0";
        FileLoader f = new FileLoader();
        int[] intInput = f.toIntArray(input, ",");
        Day2 d2 = new Day2();
        int[] partA = d2.runOpcode(intInput);
        int[] partB = d2.findVerbAndNoun();

        System.out.println("Result partA " + partA[0]);
        System.out.println("Result partB " + partB[1] + "" + partB[2]);

    }
}
