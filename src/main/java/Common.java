public class Common {

    static int getArrayIndex(int[] arr, int value) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                k = i;
                break;
            }
        }
        return k;
    }
}
